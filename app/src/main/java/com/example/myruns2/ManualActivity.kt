package com.example.myruns2

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.*

class ManualActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.manualentry)


        //date picker dialog implemented

        var datePicker = findViewById<TextView>(R.id.date)

        datePicker.setOnClickListener {
            val c = Calendar.getInstance()
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)

            val popDialog = DatePickerDialog(
                this,
                DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
                    val months = month + 1
                    //datePicker.text = "$dayOfMonth/$months/$year"
                },
                year,
                month,
                day
            )
            popDialog.show()

            //time Picker

            var timePicker = findViewById<TextView>(R.id.Time)
            timePicker.setOnClickListener {
                val cal = Calendar.getInstance()
                val timeListener = TimePickerDialog.OnTimeSetListener { timePicker, hour, minute ->
                    cal.set(Calendar.HOUR_OF_DAY, hour)
                    cal.set(Calendar.MINUTE, minute)

                }
                TimePickerDialog(
                    this, timeListener, cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE),
                    true
                ).show()
            }


            //duration box
            val DurationBox: TextView = findViewById(R.id.Duration)
            DurationBox.setOnClickListener {
                val builder = AlertDialog.Builder(this)
                val inflater = layoutInflater
                val dialoglayout = inflater.inflate(R.layout.setting_comments, null)
//                val editComment = dialoglayout.findViewById<EditText>(R.id.CommentsEditText)

                with(builder) {
                    setTitle("Duration")
                    setPositiveButton("OK") { dialog, which -> }
                    setNegativeButton("Cancel") { dialog, which ->
                        Log.d("Main", "Negative Button Clicked")
                    }
                    setView(dialoglayout)
                    show()


                }


            }


            //distanceBox

            val DistanceBox: TextView = findViewById(R.id.Distance)
            DistanceBox.setOnClickListener {
                val builder = AlertDialog.Builder(this)
                val inflater = layoutInflater
                val dialoglayout = inflater.inflate(R.layout.setting_comments, null)

                with(builder) {
                    setTitle("Distance")
                    setPositiveButton("OK") { dialog, which -> }
                    setNegativeButton("Cancel") { dialog, which ->
                        Log.d("Main", "Negative Button Clicked")
                    }
                    setView(dialoglayout)
                    show()
                }
            }


            //caloriesBox

            val caloriesBox: TextView = findViewById(R.id.Calories)
            caloriesBox.setOnClickListener {
                val builder = AlertDialog.Builder(this)
                val inflater = layoutInflater
                val dialoglayout = inflater.inflate(R.layout.setting_comments, null)

                with(builder) {
                    setTitle("Calories")
                    setPositiveButton("OK") { dialog, which -> }
                    setNegativeButton("Cancel") { dialog, which ->
                        Log.d("Main", "Negative Button Clicked")
                    }
                    setView(dialoglayout)
                    show()
                }
            }


            //heart Rate

            val heartBox: TextView = findViewById(R.id.HeartRate)
            heartBox.setOnClickListener {
                val builder = AlertDialog.Builder(this)
                val inflater = layoutInflater
                val dialoglayout = inflater.inflate(R.layout.setting_comments, null)

                with(builder) {
                    setTitle("Heart Rate")
                    setPositiveButton("OK") { dialog, which -> }
                    setNegativeButton("Cancel") { dialog, which ->
                        Log.d("Main", "Negative Button Clicked")
                    }
                    setView(dialoglayout)
                    show()
                }
            }


            //commentBox


            val CommentBox: TextView = findViewById(R.id.commentStart)
            CommentBox.setOnClickListener {
                val builder = AlertDialog.Builder(this)
                val inflater = layoutInflater
                val dialoglayout = inflater.inflate(R.layout.startcomments, null)

                with(builder) {
                    setTitle("Comments")
                    setPositiveButton("OK") { dialog, which -> }
                    setNegativeButton("Cancel") { dialog, which ->
                        Log.d("Main", "Negative Button Clicked")
                    }
                    setView(dialoglayout)
                    show()
                }
            }


        }

    }
    fun dismissButton(view: View) {
        finish();
        Toast.makeText(this,"Entry Discarded", Toast.LENGTH_LONG).show()
    }

    fun saveActivity(view: View) {finish();}

}