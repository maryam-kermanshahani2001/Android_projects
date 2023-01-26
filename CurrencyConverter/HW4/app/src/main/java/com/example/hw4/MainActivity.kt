package com.example.hw4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.view.View
import android.widget.*
import androidx.activity.viewModels
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
//import androidx.lifecycle.viewmodel.CreationExtras.Empty.map
import com.example.hw4.R
import com.example.hw4.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlin.text.Typography.dollar
import kotlin.text.Typography.euro

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MoneyViewModel by viewModels()
    private lateinit var option: Spinner
    private lateinit var result: TextView
    private lateinit var money: EditText
    private val options = arrayOf("RI", "USD", "CAND", "PON", "EUR", "DER")

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        option = binding.spinner as Spinner
        result = binding.tvResult as TextView
        money = binding.editText as EditText

        viewModel.eur.observe(this, Observer {

            binding.euroRes.text = "Euro = ${it.toString()}"

        })

        viewModel.ri.observe(this, Observer {

            binding.rialResult.text = "Rial = ${it.toString()}"

        })

        viewModel.usd.observe(this, Observer {

            binding.usdRes.text = "US Dollar = ${it.toString()}"

        })

        viewModel.cand.observe(this, Observer {

            binding.candRes.text = "Canada Dollar = ${it.toString()}"

        })

        viewModel.pon.observe(this, Observer {

            binding.pondRes.text = "Pond = ${it.toString()}"

        })

        viewModel.der.observe(this, Observer {

            binding.derRes.text = "Dirham = ${it.toString()}"

        })


        money.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (money.hasFocus()) {
                    if (s.toString().toDoubleOrNull() == null) {
                        return
                    }

                    println("---------------------------------------------------------------------")
//                    binding.rialResult.text = money.toString()
//                    binding.rialResult.text = result.text.toString()
                    println(result.text.toString())
                    calculateMoney()

                }


            }
        })
        option.adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options)
        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                result.text = options[position]
                if (!TextUtils.isEmpty(money.text.toString())) {
                    calculateMoney()

                }

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }





//        onCountrySelected()

    }

/*    private fun setFields(money: Double) {

        binding.iranResult.text = money.toString().toDouble()
    }*/

    /*  private fun calculate() {


          *//*  if (viewModel.isUserWordCorrect(playerWord)) {
              setErrorTextField(false)
              if (!viewModel.nextWord()) {
                  showFinalScoreDialog()
              }
          } else {
              setErrorTextField(true)
          }*//*
    }*/

    private fun calculateMoney() {
        val thisMoney: Double
//        val map =
//            mutableMapOf("RI" to 0.0, "USD" to 0.0, "CAND" to 0.0, "PON" to 0.0, "EUR" to 0.0, "DER" to 0.0)
//        val thisMoney = myMoney

        thisMoney = money.text.toString().toDouble()
        when (result.text.toString()) {
            "RI" -> {
                viewModel.ri.value = thisMoney
                viewModel.usd.value = thisMoney * 0.000024
                viewModel.cand.value = thisMoney * 0.000032
                viewModel.pon.value = thisMoney * 0.000019
                viewModel.eur.value = thisMoney * 0.000023
                viewModel.der.value = thisMoney * 0.000087
            }
            "USD" -> {
                viewModel.ri.value = thisMoney * 42350
                viewModel.usd.value = thisMoney
                viewModel.cand.value = thisMoney * 1.34
                viewModel.pon.value = thisMoney * 0.82
                viewModel.eur.value = thisMoney * 0.95
                viewModel.der.value = thisMoney * 3.67
            }
            "PON" -> {
                viewModel.ri.value = thisMoney * 51916
                viewModel.usd.value = thisMoney * 1.23
                viewModel.cand.value = thisMoney * 1.65
                viewModel.pon.value = thisMoney
                viewModel.eur.value = thisMoney * 0.86
                viewModel.der.value = thisMoney * 4.5
            }
            "CAN" -> {
                viewModel.ri.value = thisMoney * 31250
                viewModel.usd.value = thisMoney * 0.74
                viewModel.cand.value = thisMoney
                viewModel.pon.value = thisMoney * 0.61
                viewModel.eur.value = thisMoney * 0.71
                viewModel.der.value = thisMoney * 2.73
            }
            "EUR" -> {
                viewModel.ri.value = thisMoney * 44590
                viewModel.usd.value = thisMoney * 1.05
                viewModel.cand.value = thisMoney * 1.41
                viewModel.pon.value = thisMoney * 0.86
                viewModel.eur.value = thisMoney
                viewModel.der.value = thisMoney * 3.87
            }
            "DER" -> {
                viewModel.ri.value = thisMoney * 11529
                viewModel.usd.value = thisMoney * 0.27
                viewModel.cand.value = thisMoney * 0.37
                viewModel.pon.value = thisMoney * 0.22
                viewModel.eur.value = thisMoney * 0.26
                viewModel.der.value = thisMoney
            }

        }

    }


}


