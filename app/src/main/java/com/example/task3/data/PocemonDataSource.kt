package com.example.task3.data

import com.example.task3.R
import com.example.task3.R.*
import com.example.task3.model.Pocemon

class PocemonDataSource {


    open fun elements(): List<Pocemon> {


        val pocemon = mutableListOf(
            Pocemon (
                nameRu = string.poc1,
                imageResourceId = drawable.bulb,
                nameEn = string.pok1,
                info = string.info_1
            ),
            Pocemon (
                nameRu = string.poc2,
                imageResourceId = drawable.cat,
                nameEn = string.pok2,
                info = string.info_1
            ),
            Pocemon (
                nameRu = string.poc3,
                imageResourceId = drawable.charman,
                nameEn = string.pok3,
                info = string.info_1
            ),
            Pocemon (
                nameRu = string.poc4,
                imageResourceId = drawable.d,
                nameEn = string.pok4,
                info = string.info_1
            ),
            Pocemon (
                nameRu = string.poc5,
                imageResourceId = drawable.f,
                nameEn = string.pok5,
                info = string.info_1
            ),
            Pocemon (
                nameRu = string.poc6,
                imageResourceId = drawable.g,
                nameEn = string.pok6,
                info = string.info_1
            ),
            Pocemon (
                nameRu = string.poc7,
                imageResourceId = drawable.i,
                nameEn = string.pok7,
                info = string.info_1
            ),
            Pocemon (
                nameRu = string.poc8,
                imageResourceId = drawable.nooo,
                nameEn = string.pok8,
                info = string.info_1
            ),
            Pocemon (
                nameRu = string.poc9,
                imageResourceId = drawable.p,
                nameEn = string.pok9,
                info = string.info_1
            ),
            Pocemon (
                nameRu = string.poc10,
                imageResourceId = drawable.pica,
                nameEn = string.pok10,
                info = string.info_1
            ),
            Pocemon (
                nameRu = string.poc11,
                imageResourceId = drawable.s,
                nameEn = string.pok11,
                info = string.info_1
            ),
            Pocemon (
                nameRu = string.poc12,
                imageResourceId = drawable.sqvi,
                nameEn = string.pok12,
                info = string.info_1
            ),
            Pocemon (
                nameRu = string.poc13,
                imageResourceId = drawable.t,
                nameEn = string.pok13,
                info = string.info_1
            ),
            Pocemon (
                nameRu = string.poc14,
                imageResourceId = drawable.u,
                nameEn = string.pok14,
                info = string.info_1
            ),
            Pocemon (
                nameRu = string.poc15,
                imageResourceId = drawable.y,
                nameEn = string.pok15,
                info = string.info_1
            )
        )
       return pocemon;
    }


//    fun loadInfo(): List<Pocemon> {
//
//        return listOf(
//            Pocemon(R.string.poc1,R.drawable.bulb,R.string.pok1),
//            Pocemon(R.string.poc2,R.drawable.cat,R.string.pok2),
//            Pocemon(R.string.poc3,R.drawable.charman,R.string.pok3),
//            Pocemon(R.string.poc4,R.drawable.d,R.string.pok4),
//            Pocemon(R.string.poc5,R.drawable.f,R.string.pok5),
//            Pocemon(R.string.poc6,R.drawable.g,R.string.pok6),
//            Pocemon(R.string.poc7,R.drawable.i,R.string.pok7),
//            Pocemon(R.string.poc8,R.drawable.nooo,R.string.pok8),
//            Pocemon(R.string.poc9,R.drawable.p,R.string.pok9),
//            Pocemon(R.string.poc10,R.drawable.pica,R.string.pok10),
//            Pocemon(R.string.poc11,R.drawable.s,R.string.pok11),
//            Pocemon(R.string.poc12,R.drawable.sqvi,R.string.pok12),
//            Pocemon(R.string.poc13,R.drawable.t,R.string.pok13),
//            Pocemon(R.string.poc14,R.drawable.u,R.string.pok14),
//            Pocemon(R.string.poc15,R.drawable.y,R.string.pok15)
//        )
//    }
}