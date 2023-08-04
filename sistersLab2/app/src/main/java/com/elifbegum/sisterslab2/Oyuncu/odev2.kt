
// 2. Bir "Oyuncu" adlı üst sınıf oluşturun. Ardından "Futbolcu" ve "Basketbolcu"
// adında iki alt sınıf oluşturun. Her bir alt sınıfın kendine özgü özellikleri ve işlevleri olsun.
// Oyuncuların "oyna" işlevi olmalı.

package com.elifbegum.sisterslab2.Oyuncu
open class Oyuncu {
    val isim: String
    val numara: Int

    constructor(isim: String, numara: Int) {
        this.isim = isim
        this.numara = numara
    }

    open fun oyna() {
        println("Oyuncu oynuyor.")
    }
}

class Futbolcu(isim: String, numara: Int) : Oyuncu(isim, numara) {
    override fun oyna() {
        println("Futbolcu topu sürüyor.")
    }
}

class Basketbolcu(isim: String, numara: Int) : Oyuncu(isim, numara) {
    override fun oyna() {
        println("Basketbolcu topu atıyor.")
    }
}

fun main(args: Array<String>) {
    val futbolcu = Futbolcu("Messi", 10)
    futbolcu.oyna()

    val basketbolcu = Basketbolcu("LeBron James", 23)
    basketbolcu.oyna()
}