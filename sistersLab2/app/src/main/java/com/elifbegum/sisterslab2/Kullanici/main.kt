
//Bir "Kullanici" adlı sınıf oluşturun ve ad ve soyad gibi özellikleri içeren nullable özellikler tanımlayın.
// Kullanıcı adı ve soyadı null olabileceğini göz önünde bulundurarak bu özelliklere nasıl erişebilirsiniz?

package com.elifbegum.sisterslab2.Kullanici

fun main() {
    val kullanici = Kullanici("John", null)

    // Kullanıcının adını yazdırırken null kontrolü yapmak için ?. işleci kullanılır.
    println("Ad: ${kullanici.ad ?: "Bilgi Yok"}")

    // Kullanıcının soyadını yazdırırken null kontrolü yapmak için ?. işleci kullanılır.
    println("Soyad: ${kullanici.soyad ?: "Bilgi Yok"}")
}