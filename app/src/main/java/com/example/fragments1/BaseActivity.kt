package com.example.fragments1

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity(){
    protected fun goSite() {
        Toast.makeText(this,"Вы перешли по ссылке", Toast.LENGTH_LONG).show()

    }
    protected fun goCall(){
        Toast.makeText(this, "Вы открыли набор номера", Toast.LENGTH_LONG).show()
    }
}