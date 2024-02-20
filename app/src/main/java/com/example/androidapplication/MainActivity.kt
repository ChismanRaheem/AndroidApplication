package com.example.androidapplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.androidapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    /* A ViewBinding provides a binding class, that can be used to access our views */
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /* Initialize the binding * Here we would like to inflate a new layout */
        binding = ActivityMainBinding.inflate(layoutInflater)
        /*Here we set the setContentView to our root layout of activity_main.xml */
        setContentView(binding.root)
        binding.button.setOnClickListener {
            binding.textView2.visibility = View.VISIBLE
            Toast.makeText(this, "Click Me Button Clicked",
                Toast.LENGTH_SHORT).show()
            binding.button1.visibility = View.VISIBLE
            binding.button.visibility = View.GONE
        }
        binding.button1.setOnClickListener {
            binding.textView2.visibility = View.GONE
            Toast.makeText(this, "Reset Button Clicked", Toast.LENGTH_SHORT).show()
            binding.button1.visibility = View.GONE
            binding.button.visibility = View.VISIBLE
        }
    }

}