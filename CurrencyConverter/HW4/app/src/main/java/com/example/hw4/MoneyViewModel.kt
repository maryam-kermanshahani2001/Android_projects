package com.example.hw4

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MoneyViewModel : ViewModel() {
    /* private var _amountOfMoney = MutableLiveData(0)
     var amountOfMoney: LiveData<Int>
         get() = _amountOfMoney

     private var _currentCountry = MutableLiveData<String>()
     var currentCountry: LiveData<String>
         get() = _currentCountry
 */
    /* var ir : MutableLiveData<Double> by lazy {
         MutableLiveData<Double>()

     }
      var usd : MutableLiveData<Double> by lazy {
          MutableLiveData<Double>()

      }

      var cand : MutableLiveData<Double> by lazy {
          MutableLiveData<Double>()

      }

      var pon : MutableLiveData<Double> by lazy {
          MutableLiveData<Double>()

      }*/
    /*var eur : MutableLiveData<Double> by lazy {
        MutableLiveData<Double>()

    }*/
/*
    var der : MutableLiveData<Double> by lazy {
        MutableLiveData<Double>()

    }*/

    var ri = MutableLiveData<Double>()

    var usd = MutableLiveData<Double>()

    var cand = MutableLiveData<Double>()


    var pon = MutableLiveData<Double>()



    var eur = MutableLiveData<Double>()


    var der = MutableLiveData<Double>()

/*
    var currentWordCount = MutableLiveData(0)
    var currentWordCount: LiveData<Int>
        get() = _currentWordCount
*/


//    private String[] countryList = {''}
//    var amountOfMoney: Int
//        get() = _amountOfMoney


}