package com.example.leado

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import kotlinx.android.synthetic.main.fragment_login.*
import java.util.*

class LoginFragment : Fragment(),View.OnClickListener {

    private var profilePictureURI: Uri? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        user_profile_picture.setOnClickListener(this)
        back_to_login_button.setOnClickListener(this)
        no_account_button.setOnClickListener(this)
        login_button.setOnClickListener(this)
        upload_button.setOnClickListener(this)
        register_button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v){
            user_profile_picture, upload_button -> {
                //open gallery
                val intent = Intent(Intent.ACTION_PICK)
                intent.type = "image/*"
                startActivityForResult(intent, 100)
            }
            back_to_login_button -> {
                loginView()
            }
            no_account_button -> {
                registerView()
            }
            register_button ->{
                registration()
            }
            login_button -> {
                findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToHomeFragment())
            }
        }
    }
    private fun registration(){
        val email = editTextTextEmailAddress.text.toString()
        val password = editTextTextPassword.text.toString()

        if (email.isEmpty() || password.isEmpty()){
            Toast.makeText(this.context,"please enter email and password",Toast.LENGTH_SHORT).show()
            return
        }

        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password).addOnCompleteListener {
        if (!it.isSuccessful) return@addOnCompleteListener
            Log.d("REGISTRATION","user created with mail and password")
            uploadImageToDataBase()
        }.addOnFailureListener {
                Toast.makeText(this.context,it.message,Toast.LENGTH_LONG).show()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && requestCode == 100 && data != null){
            profilePictureURI = data.data
            user_profile_picture.setImageURI(profilePictureURI)
            upload_button.visibility = View.GONE
        }
    }

    private fun uploadImageToDataBase() {
        if (profilePictureURI == null) return
        val filename = UUID.randomUUID().toString()
        val reference = FirebaseStorage.getInstance().getReference("/pictures/$filename")
        reference.putFile(profilePictureURI!!).addOnSuccessListener {
            Log.d("REGISTRATION","successfully uploaded photo: ${it.metadata?.path}")
            saveUserToDataBase()
        }
    }
    private fun loginView(){
        user_profile_picture.visibility = View.GONE
        editTextTextPersonName.visibility = View.GONE
        upload_button.visibility = View.GONE
        renterPassword.visibility = View.GONE
        login_button.visibility = View.VISIBLE
        register_button.visibility = View.GONE
        back_to_login_button.visibility = View.GONE
        no_account_button.visibility = View.VISIBLE
    }
    private fun registerView(){
        user_profile_picture.visibility = View.VISIBLE
        upload_button.visibility = View.VISIBLE
        editTextTextPersonName.visibility = View.VISIBLE
        renterPassword.visibility = View.VISIBLE
        login_button.visibility = View.GONE
        register_button.visibility = View.VISIBLE
        back_to_login_button.visibility = View.VISIBLE
        no_account_button.visibility = View.GONE
    }
    private fun saveUserToDataBase(){
        val uid = FirebaseAuth.getInstance().uid
        val ref = FirebaseDatabase.getInstance().getReference("/users/$uid")
        val user = User(uid!!, editTextTextPersonName.text.toString(), profilePictureURI.toString())
        ref.setValue(user).addOnSuccessListener {
            Toast.makeText(this.context,"Done registration!",Toast.LENGTH_LONG).show()
        }.addOnFailureListener {
            Toast.makeText(this.context,it.message,Toast.LENGTH_LONG).show()
        }
    }
}
data class User(val uid: String, val username: String, val profilePictureUrl: String)