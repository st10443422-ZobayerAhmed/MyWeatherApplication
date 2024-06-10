package com.example.myweatherapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class detailedViewScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view_screen)


        // Retrieve temperature and weather condition data passed from mainScreen
        // Initialize TextViews
        val detailedInfoTextView = findViewById<TextView>(R.id.detailedInfoTextView)
        val averageTemperatureTextView = findViewById<TextView>(R.id.averageTemperatureTextView)

        // Sample data for demonstration purposes
        val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        val minTemps = doubleArrayOf(20.0, 18.0, 22.0, 21.0, 23.0, 25.0, 24.0)
        val maxTemps = doubleArrayOf(30.0, 28.0, 32.0, 31.0, 33.0, 35.0, 34.0)
        val conditions = arrayOf("Sunny", "Rainy", "Cloudy", "Sunny", "Rainy", "Cloudy", "Sunny")

        var sum = 0.0
        for (i in days.indices) {
            // Ensure min and max temperatures fall within the range of 10 to 45 degrees Celsius
            val minTemp = minTemps[i].coerceIn(10.0, 45.0)
            val maxTemp = maxTemps[i].coerceIn(10.0, 45.0)

            sum += (minTemp + maxTemp) / 2
            detailedInfoTextView.append("${days[i]}: Min ${minTemp}°C, Max ${maxTemp}°C, ${conditions[i]}\n")
        }

        // Calculate average temperature
        val averageTemperature = (sum / days.size).coerceIn(10.0, 45.0)
        averageTemperatureTextView.text = "Average Temperature: ${averageTemperature}°C"

        // Button to go back to the main screen
        val btnBackToMain = findViewById<Button>(R.id.btnBackToMain)
        btnBackToMain.setOnClickListener {
            finish()
        }
    }
}