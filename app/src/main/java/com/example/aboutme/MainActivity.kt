package com.example.aboutme

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var doneButton: Button
    lateinit var nickNameEdit: EditText
    lateinit var nickNameTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my_activity_main)

        doneButton = findViewById(R.id.doneButton)
        nickNameEdit = findViewById(R.id.nicknameEdit)
        nickNameTextView = findViewById(R.id.nickNameTextView)

        doneButton.setOnClickListener {
            nickNameTextView.text = nickNameEdit.text
            nickNameTextView.visibility = View.VISIBLE
            nickNameEdit.visibility = View.GONE
            doneButton.visibility = View.GONE
        }
    }
}
