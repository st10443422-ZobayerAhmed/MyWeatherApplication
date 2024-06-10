package com.example.myweatherapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class mainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)

        // Initialize buttons
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val btnDetailView = findViewById<Button>(R.id.btnDetailView)

        val minTemperatureTextView = findViewById<TextView>(R.id.minTemperatureTextView)
        val maxTemperatureTextView = findViewById<TextView>(R.id.maxTemperatureTextView)
        val weatherConditionTextView = findViewById<TextView>(R.id.weatherConditionTextView)

        val days =
            arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        val minTemps = arrayOfNulls<EditText>(7)
        val maxTemps = arrayOfNulls<EditText>(7)
        val conditions = arrayOfNulls<EditText>(7)

        for (i in days.indices) {
            val minTempId = resources.getIdentifier("${days[i]}MinTemp", "id", packageName)
            val maxTempId = resources.getIdentifier("${days[i]}MaxTemp", "id", packageName)
            val conditionId = resources.getIdentifier("${days[i]}Condition", "id", packageName)

            minTemps[i] = findViewById(minTempId)
            maxTemps[i] = findViewById(maxTempId)
            conditions[i] = findViewById(conditionId)
        }

        btnAdd.setOnClickListener {
            var sum = 0.0
            var count = 0

            for (i in days.indices) {
                val minTemp = minTemps[i]?.text.toString().toDoubleOrNull()
                val maxTemp = maxTemps[i]?.text.toString().toDoubleOrNull()

                if (minTemp != null && maxTemp != null) {
                    sum += (minTemp + maxTemp) / 2
                    count++
                }
            }
        //Calculating Average
            if (count > 0) {
                val average = sum / count
                val averageTemperature = findViewById<TextView>(R.id.averageTemperature)
                averageTemperature.text = "Average Temperature: $average"
            } else {
                Toast.makeText(this, "Please enter valid temperatures", Toast.LENGTH_SHORT).show()
            }

        }

        btnDetailView.setOnClickListener {
            val intent = Intent(this, detailedViewScreen::class.java)
            // Pass data to DetailedViewActivity if needed
            startActivity(intent)
        }
        btnClear.setOnClickListener {
            Log.d("MainActivity", "Clear button clicked")
            for (i in days.indices) {
                minTemps[i]?.setText("")
                maxTemps[i]?.setText("")
                conditions[i]?.setText("")
            }
        }


            }
        }
