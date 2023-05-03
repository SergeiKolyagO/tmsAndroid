package task5.data

import com.example.task3.R.drawable
import com.example.task3.R.string
import task5.model.Pocemon

class PocemonDataSource {


    fun elements(): List<Pocemon> {

        return mutableListOf(
            Pocemon(
                nameRu = string.poc1,
                imageResourceId = drawable.bulb,
                nameEn = string.pok1
            ),
            Pocemon(
                nameRu = string.poc2,
                imageResourceId = drawable.cat,
                nameEn = string.pok2
            ),
            Pocemon(
                nameRu = string.poc3,
                imageResourceId = drawable.charman,
                nameEn = string.pok3
            ),
            Pocemon(
                nameRu = string.poc4,
                imageResourceId = drawable.d,
                nameEn = string.pok4
            ),
            Pocemon(
                nameRu = string.poc5,
                imageResourceId = drawable.f,
                nameEn = string.pok5
            ),
            Pocemon(
                nameRu = string.poc6,
                imageResourceId = drawable.g,
                nameEn = string.pok6,

                ),
            Pocemon(
                nameRu = string.poc7,
                imageResourceId = drawable.i,
                nameEn = string.pok7
            ),
            Pocemon(
                nameRu = string.poc8,
                imageResourceId = drawable.nooo,
                nameEn = string.pok8
            ),
            Pocemon(
                nameRu = string.poc9,
                imageResourceId = drawable.p,
                nameEn = string.pok9
            ),
            Pocemon(
                nameRu = string.poc10,
                imageResourceId = drawable.pica,
                nameEn = string.pok10
            ),
            Pocemon(
                nameRu = string.poc11,
                imageResourceId = drawable.s,
                nameEn = string.pok11
            ),
            Pocemon(
                nameRu = string.poc12,
                imageResourceId = drawable.sqvi,
                nameEn = string.pok12
            ),
            Pocemon(
                nameRu = string.poc13,
                imageResourceId = drawable.t,
                nameEn = string.pok13
            ),
            Pocemon(
                nameRu = string.poc14,
                imageResourceId = drawable.u,
                nameEn = string.pok14
            ),
            Pocemon(
                nameRu = string.poc15,
                imageResourceId = drawable.y,
                nameEn = string.pok15
            )
        )
    }
}