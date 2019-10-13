package com.android.softhk.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        done_button.setOnClickListener{
            var nickNameEdit = nickname_edit.text.toString()
            nickname_text.text = nickNameEdit
            nickname_edit.visibility = View.GONE
            done_button.visibility = View.GONE
            nickname_text.visibility = View.VISIBLE
        }

        nickname_text.setOnClickListener{
            nickname_edit.visibility = View.VISIBLE
            done_button.visibility = View.VISIBLE
            nickname_text.visibility = View.GONE
        }
    }
}
