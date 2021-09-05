package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser


class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var mAuth: FirebaseAuth
//    private lateinit var googleSignInClient: GoogleSignInClient
    private val RC_SIGN_IN = 99
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAuth = FirebaseAuth.getInstance()

//        btn_googleSignIn.setOnClickListener{signIn()}

    }

    /*override fun onStart() {
        super.onStart()
        var currentUser: FirebaseUser = mAuth.currentUser!!
        updateUi(currentUser)
    }*/

    override fun onClick(v: View?) {

    }


}