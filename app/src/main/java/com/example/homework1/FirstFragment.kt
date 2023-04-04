package com.example.homework1

import android.util.Log
import androidx.fragment.app.Fragment

class FirstFragment : Fragment() {
    val a = "Test"
    var result = testA(a)

}
fun testA(a: String) {
    Log.d ("Test", "test----> $a")
}
open class Rectangle(open var width: Int = 40,open var height: Int = 40 ) {
    open fun buildRectangle() {
        val rectangle1 = Rectangle()
        rectangle1.printSize()
        rectangle1.getSquare()
        val rectangle2 = Rectangle(width=10)
        rectangle2.printSize()
        rectangle2.getSquare()
    }
    open fun printSize(){
        println("Width: $width cm " +
                "Height: $height cm ")
    }
    open fun getSquare () {
        return println("Square: " + (width + height) * 2)
    }
    class Triangle(var length: Int = 2): Rectangle() {
        override fun buildRectangle() {
            val triangle1 = Triangle()
            triangle1.width = 50
            triangle1.height = 60
            triangle1.printSize()
            triangle1.getSquare()
            val triangle2 = Triangle(length = 5)
            triangle2.printSize()
            triangle2.getSquare()
        }

        override fun printSize() {
            println("Width: $width cm " +
                    "Height: $height cm " +
                    "Length: $length cm")
        }

        override fun getSquare() {
            return println("Square: " + (width + height + length))
        }
    }
}
