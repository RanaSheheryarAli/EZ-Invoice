package com.example.ezinvoice

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.ezinvoice.databinding.ActivityAddItemsBinding
import com.example.ezinvoice.databinding.CatagoryBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class Add_Items : AppCompatActivity() {


    lateinit var databinding: ActivityAddItemsBinding
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
      databinding =DataBindingUtil.setContentView(this,R.layout.activity_add_items)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        databinding.headerLayout.tvTitle.setText("Add Items")

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
//    private fun showBottomSheetDialog() {
//        // Inflate the bottom sheet layout using Data Binding
//        val bottomSheetBinding = CatagoryBottomSheetBinding.inflate(layoutInflater)
//
//        // Create the BottomSheetDialog
//        val bottomSheetDialog = BottomSheetDialog(this)
//        bottomSheetDialog.setContentView(bottomSheetBinding.root)
//
//        // Handle Submit button click
//
//        bottomSheetDialog.show()
//
//
//
//    }
}