package com.example.waitoecommerce.data

import android.app.ProgressDialog
import android.content.Context
import android.net.Uri
import android.widget.Toast
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.navigation.NavHostController
import com.example.wazitoecommerce.data.AuthViewModel
import com.example.wazitoecommerce.models.chestpain
import com.example.wazitoecommerce.navigation.LOGIN_URL
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.storage.FirebaseStorage

class ChestpainViewModel(var navController:NavHostController, var context: Context) {
    var authViewModel: AuthViewModel
    var progress:ProgressDialog
    init {
        authViewModel = AuthViewModel(navController, context)
        if (!authViewModel.isLoggedIn()){
            navController.navigate(LOGIN_URL)
        }
        progress = ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("Please wait...")
    }

    fun uploadInstruction(instruction:String,filePath:Uri){
        val InstructionId = System.currentTimeMillis().toString()
        val storageRef = FirebaseStorage.getInstance().getReference()
            .child("chestpain/$InstructionId")
        progress.show()
        storageRef.putFile(filePath).addOnCompleteListener{
            progress.dismiss()
            if (it.isSuccessful){
                // Save data to db
                storageRef.downloadUrl.addOnSuccessListener {
                    var imageUrl = it.toString()
                    var instruction1 = it.toString()
                    var instruction2 = it.toString()
                    var ins = chestpain(instruction, instruction1, instruction2,imageUrl,InstructionId)
                    var databaseRef = FirebaseDatabase.getInstance().getReference()
                        .child("chestpains/$InstructionId")
                    databaseRef.setValue(instruction).addOnCompleteListener {
                        if (it.isSuccessful){
                            Toast.makeText(this.context, "Success", Toast.LENGTH_SHORT).show()
                        }else{
                            Toast.makeText(this.context, "Error", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }else{
                Toast.makeText(this.context, "Upload error", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun allInstructions(
        Instruction:MutableState<chestpain>,
        Instructions:SnapshotStateList<chestpain>
    ):SnapshotStateList<chestpain>{
        progress.show()
        var ref = FirebaseDatabase.getInstance().getReference().child("chestpain")
        ref.addValueEventListener(object: ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                Instructions.clear()
                for (snap in snapshot.children){
                    var value = snap.getValue(chestpain::class.java)
                    Instruction.value = value!!
                    Instructions.add(value)
                }
                progress.dismiss()
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(context, "DB locked", Toast.LENGTH_SHORT).show()
            }
        })
        return Instructions
    }

    fun deleteInstruction(InstructionID:String){
        var ref = FirebaseDatabase.getInstance().getReference()
            .child("chestpainss/$InstructionID")
        ref.removeValue()
        Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
    }
}