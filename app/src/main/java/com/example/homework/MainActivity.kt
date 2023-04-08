package com.example.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        GetCollection().getItem()
    }

    fun onClick(view: View) {
        val intent = Intent(this,Info::class.java)
        startActivity(intent)
    }
}
class GetCollection : AppCompatActivity(){
    fun getItem() {
        val numbers = mutableListOf( "one", "two", "three", "four")
        Log.d("TEST_ANDROID","$numbers")
        numbers.add("hello")
        Log.d("TEST_ANDROID","$numbers")
        val numbers1 = listOf("one","two")
        Log.d("TEST_ANDROID","$numbers1")
        val numbers2 = setOf(1,2,3,4,5)
        Log.d("TEST_ANDROID","$numbers2")
        val numbers3 = hashSetOf(1,2,3,4)
        Log.d("TEST_ANDROID","$numbers3")
        numbers3.add(5)
        Log.d("TEST_ANDROID","$numbers3")
        val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 4)
        Log.d("TEST_ANDROID","$numbersMap")
        val numbersMap1 = mutableMapOf("one" to 1, "two" to 2)
        Log.d("TEST_ANDROID","$numbersMap1")
        numbersMap1.put("tree", 3)
        Log.d("TEST_ANDROID","$numbersMap1")
    }

}