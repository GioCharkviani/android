package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var displayRes: TextView
    private lateinit var mainOperation: String
    private var num1: Double = 0.0
    private var num2: Double = 0.0
    private var lastRes: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clearDisplay(view: View) {
        displayRes.text = ""
        num1 = 0.0
        num2 = 0.0
        lastRes = 0.0
        mainOperation = ""
    }

    fun addNumToTxt(btn: Button) {
        val oldTxt = displayRes.text.toString()
        if(!isNumericToX(oldTxt)) {
            val oldTxt = ""
        }

        val newTxt = btn.text.toString()
        res.text = oldTxt + newTxt
    }

    fun saveOperator(btn: Button) {
        val num1 = displayRes.text.toString().toDouble()
        val mainOperation = btn.text.toString()
        displayRes.text = mainOperation
    }

    fun doneCalc(btn: Button) {
        val num2 = displayRes.text.toString().toDouble()

        if(mainOperation == "+") {
            lastRes = num1 + num2;
        } else if(mainOperation == "-") {
            lastRes = num1 + num2;
        } else if(mainOperation == "*") {
            lastRes = num1 * num2;
        } else if(mainOperation == "/") {
            lastRes = num1 / num2;
        }

        displayRes.text = lastRes.toString()
    }

    fun isNumericToX(toCheck: String): Boolean {
        return toCheck.toDoubleOrNull() != null
    }
}