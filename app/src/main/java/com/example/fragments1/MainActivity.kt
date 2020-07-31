package com.example.fragments1


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSite.setOnClickListener(this)
        callNb.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        val site1 = findViewById<EditText>(R.id.eTSite).editableText.toString()

        val tel1 = findViewById<EditText>(R.id.etNumber).editableText.toString()



        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://$site1"))
        val call = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$tel1"))


        when (view?.id) {
            R.id.btnSite ->
            {goSite()
                startActivity(intent)}

            R.id.callNb ->
            {goCall()
                startActivity(call)
            }

            
            

        }


    }
}