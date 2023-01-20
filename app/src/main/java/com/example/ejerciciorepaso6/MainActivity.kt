package com.example.ejerciciorepaso6

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ejerciciorepaso6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button2.setText("Comenzar")
        binding.editTextTextPersonName.visibility = View.INVISIBLE
        binding.imageView.visibility = View.INVISIBLE

        binding.editTextTextPersonName.setOnClickListener {
            binding.editTextTextPersonName.setText("")
        }

        binding.button2.setOnClickListener {
            binding.editTextTextPersonName.visibility = View.VISIBLE
            binding.editTextTextPersonName.setOnFocusChangeListener(){v, focus ->
                if (!focus){
                    if(binding.editTextTextPersonName.text.toString().equals("")){
                        binding.editTextTextPersonName.setText("Introduce tu nombre")
                    }
                }

                if (binding.editTextTextPersonName.text.toString().equals("wayne") || binding.editTextTextPersonName.text.toString().equals("Wayne")) {
                    binding.imageView.visibility = View.VISIBLE
                    binding.id5.setBackgroundColor(Color.parseColor("#FFFFFF"))
                }
                else if(binding.editTextTextPersonName.text.toString().equals("joker") || binding.editTextTextPersonName.text.toString().equals("Joker")){
                    binding.imageView.visibility = View.INVISIBLE
                    binding.id5.setBackgroundColor(Color.parseColor("#00FFFF"))
                }

            }


            binding.button2.setText("Finalizar")
        }

    }
}