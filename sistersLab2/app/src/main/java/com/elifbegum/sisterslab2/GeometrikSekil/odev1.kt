package com.elifbegum.sisterslab2.GeometrikSekil

open class GeometrikSekil {
    open val alan: Double = 0.0
    open val cevre: Double = 0.0

    open fun alanHesapla() {
        println("GeometrikSekil'in alanı hesaplanamıyor.")
    }

    open fun cevreHesapla() {
        println("GeometrikSekil'in çevresi hesaplanamıyor.")
    }
}

class Dikdortgen(val uzunluk: Double, val genislik: Double) : GeometrikSekil() {
    override val alan = uzunluk * genislik
    override val cevre = 2 * (uzunluk + genislik)

    override fun alanHesapla() {
        println("Dikdörtgenin alanı ${alan}'dır.")
    }

    override fun cevreHesapla() {
        println("Dikdörtgenin çevresi ${cevre}'dir.")
    }
}

class Daire(val yaricap: Double) : GeometrikSekil() {
    override val alan = Math.PI * yaricap * yaricap
    override val cevre = 2 * Math.PI * yaricap

    override fun alanHesapla() {
        println("Dairenin alanı ${alan}'dır.")
    }

    override fun cevreHesapla() {
        println("Dairenin çevresi ${cevre}'dir.")
    }
}

fun main(args: Array<String>) {
    val dikdortgen = Dikdortgen(uzunluk = 10.0, genislik = 20.0)
    dikdortgen.alanHesapla()
    dikdortgen.cevreHesapla()

    val daire = Daire(yaricap = 5.0)
    daire.alanHesapla()
    daire.cevreHesapla()
}