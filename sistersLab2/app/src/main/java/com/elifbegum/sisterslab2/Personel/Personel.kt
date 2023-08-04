package com.elifbegum.sisterslab2.Personel

class Personel(val ad: String, val soyad: String, val pozisyon: String, var maas: Int) {

    fun maasArttir(miktar: Int) {
        this.maas += miktar
    }
}