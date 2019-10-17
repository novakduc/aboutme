package com.example.aboutme

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.MyActivityMainBinding
import kotlinx.android.synthetic.main.my_activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MyActivityMainBinding
    val myName = MyName("Nguyen Quoc Thanh")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.my_activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.my_activity_main)

        binding.myName = myName

        binding.doneButton.setOnClickListener {
            binding.apply {
                //                nickNameTextView.text = nicknameEdit.text
                myName?.nickname = nicknameEdit.text.toString()
                nickNameTextView.visibility = View.VISIBLE
                nicknameEdit.visibility = View.GONE
                doneButton.visibility = View.GONE
                invalidateAll()
            }

            //hide the keyboard
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(binding.doneButton.windowToken, 0)
        }
    }
}
