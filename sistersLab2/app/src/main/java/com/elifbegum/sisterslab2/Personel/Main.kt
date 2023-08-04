package com.elifbegum.sisterslab2.Personel

fun main(args: Array<String>) {
    println("Adınızı girin: ")
    val ad = readLine()!!

    println("Soyadınızı girin: ")
    val soyad = readLine()!!

    println("Pozisyonunuzu girin: ")
    val pozisyon = readLine()!!

    println("Maaşınızı girin: ")
    val maas = readLine()!!.toInt()

    val personel = Personel(ad, soyad, pozisyon, maas)

    println("Personeliniz başarıyla oluşturuldu!")
    println(personel)

    println("Maaşınızı artırmak ister misiniz? (Evet/Hayır)")
    val cevap = readLine()!!

    if (cevap == "Evet") {
        println("Artırmak istediğiniz miktarı girin: ")
        val miktar = readLine()!!.toInt()

        personel.maasArttir(miktar)

        println("Personelinizin maaşı ${personel.maas} TL olarak güncellendi.")
    }
}