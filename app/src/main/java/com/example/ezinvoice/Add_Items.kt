package com.example.ezinvoice

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.ezinvoice.databinding.ActivityAddItemsBinding

class Add_Items : AppCompatActivity() {


    lateinit var databinding: ActivityAddItemsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
      databinding =DataBindingUtil.setContentView(this,R.layout.activity_add_items)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        databinding.btnPricing.setOnClickListener{
            databinding.apply {
                tvPriceLine.visibility= View.VISIBLE
                tvStockLine.visibility=View.INVISIBLE
                containerSale.visibility=View.VISIBLE
                containerPurchase.visibility=View.VISIBLE
                containerTexes.visibility=View.VISIBLE
            }
        }

        databinding.btnStock.setOnClickListener{
            databinding.apply {
                tvPriceLine.visibility= View.INVISIBLE
                tvStockLine.visibility=View.VISIBLE
                containerSale.visibility=View.INVISIBLE
                containerPurchase.visibility=View.INVISIBLE
                containerTexes.visibility=View.INVISIBLE
            }
        }
    }
}