package com.example.yourcarrier.tabs.tabsActivity

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.yourcarrier.R
import kotlinx.android.synthetic.main.activity_main.*
import java.time.LocalDate
import java.time.LocalTime

import java.time.format.DateTimeFormatter


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dtf = DateTimeFormatter.ofPattern("MMMM dd,yyyy")
        val date = LocalDate.now()
        tvDate.text= dtf.format(date)

        val dtf2 = DateTimeFormatter.ofPattern("h:mm a")
        val time = LocalTime.now()
        tvTime.text =" at ${dtf2.format(time)}"

        btnDone.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
            alertDialog.setTitle(R.string.dialog_tittle)
            alertDialog.setMessage(getString(R.string.dialog_message))
            alertDialog.setPositiveButton("Ok",DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this,"Clicked Ok",Toast.LENGTH_SHORT).show()
                
                dialog.dismiss()

            })
            alertDialog.create()


            alertDialog.show()
        }






    }
}