package com.arin.UTS

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LogActivity : AppCompatActivity() {
    val KEY_EMAIL= "key.email"
    val KEY_PASSWORD= "key.email"
    lateinit var sharedPref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log)
    }

//    private fun SaveEmail(email: String){
//        val editor:SharedPreferences = sharedPref.edit()
//        editor.putString(KEY_EMAIL,email)
//        editor.apply()
//    }
}