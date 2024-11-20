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
                tvStockLine.visibility=View.GONE
                containerStock.visibility=View.GONE
                containerSale.visibility=View.VISIBLE
                containerPurchase.visibility=View.VISIBLE
                containerTexes.visibility=View.VISIBLE
            }
        }

        databinding.headerLayout.tvTitle.setText("Add Items")

        databinding.btnStock.setOnClickListener{

            databinding.apply {

                containerStock.visibility= View.VISIBLE
                tvPriceLine.visibility= View.GONE
                tvStockLine.visibility=View.VISIBLE
                containerSale.visibility=View.GONE
                containerPurchase.visibility=View.GONE
                containerTexes.visibility=View.GONE
            }
        }
    }
}