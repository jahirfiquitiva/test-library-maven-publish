package dev.jahir.mytestlibrary.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.jahir.mytestlibrary.Printer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Printer().print("Hello world!")
    }

}
