package com.example.exercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener {
            calBtn()
        }

        buttonReset.setOnClickListener {
            reset()
        }
    }

    private fun calBtn(){
        val carPrice = findViewById<EditText>(R.id.editTextCarPrice)
        val downPayment = findViewById<EditText>(R.id.editTextDownPayment)
        val loanYear = findViewById<EditText>(R.id.editTextLoanPeriod)
        val intRate = findViewById<EditText>(R.id.editTextInterestRate)
        val txtCarLoan = findViewById<TextView>(R.id.textViewLoan)
        val txtInterest = findViewById<TextView>(R.id.textViewInterest)
        val txtMonthlyPayment = findViewById<TextView>(R.id.textViewMonthlyRepayment)

        val carLoan = carPrice.text.toString().toDouble() - downPayment.text.toString().toDouble()
        txtCarLoan.text = "Loan : " + carLoan.toString()
        val interest = carLoan * (intRate.text.toString().toDouble() / 100) * loanYear.text.toString().toDouble()
        txtInterest.text = "Interest : " + interest
        val monthlyPayment =  (carLoan + interest) / loanYear.text.toString().toDouble() / 12
        txtMonthlyPayment.text = "Monthly Repayment : " + monthlyPayment
    }

    private fun reset(){
        val carPrice = findViewById<EditText>(R.id.editTextCarPrice)
        val downPayment = findViewById<EditText>(R.id.editTextDownPayment)
        val loanYear = findViewById<EditText>(R.id.editTextLoanPeriod)
        val intRate = findViewById<EditText>(R.id.editTextInterestRate)
        val txtCarLoan = findViewById<TextView>(R.id.textViewLoan)
        val txtInterest = findViewById<TextView>(R.id.textViewInterest)
        val txtMonthlyPayment = findViewById<TextView>(R.id.textViewMonthlyRepayment)

        carPrice.text = null
        downPayment.text = null
        loanYear.text = null
        intRate.text = null
        val carLoan = 0
        txtCarLoan.text = "Loan : "
        val interest = 0
        txtInterest.text = "Interest : "
        val monthlyPayment =  0
        txtMonthlyPayment.text = "Monthly Repayment : "
    }
}
