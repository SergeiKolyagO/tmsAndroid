package com.example.task3.data

import com.example.task3.R
import com.example.task3.R.*
import com.example.task3.model.Pocemon

class PocemonDataSource {
    fun loadInfo(): List<Pocemon> {
        return listOf(
            Pocemon(R.string.poc1,R.drawable.bulb,R.string.pok1),
            Pocemon(R.string.poc2,R.drawable.cat,R.string.pok2),
            Pocemon(R.string.poc3,R.drawable.charman,R.string.pok3),
            Pocemon(R.string.poc4,R.drawable.d,R.string.pok4),
            Pocemon(R.string.poc5,R.drawable.f,R.string.pok5),
            Pocemon(R.string.poc6,R.drawable.g,R.string.pok6),
            Pocemon(R.string.poc7,R.drawable.i,R.string.pok7),
            Pocemon(R.string.poc8,R.drawable.nooo,R.string.pok8),
            Pocemon(R.string.poc9,R.drawable.p,R.string.pok9),
            Pocemon(R.string.poc10,R.drawable.pica,R.string.pok10),
            Pocemon(R.string.poc11,R.drawable.s,R.string.pok11),
            Pocemon(R.string.poc12,R.drawable.sqvi,R.string.pok12),
            Pocemon(R.string.poc13,R.drawable.t,R.string.pok13),
            Pocemon(R.string.poc14,R.drawable.u,R.string.pok14),
            Pocemon(R.string.poc15,R.drawable.y,R.string.pok15)
        )
    }
}