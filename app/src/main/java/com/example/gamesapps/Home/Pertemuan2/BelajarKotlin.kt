package com.example.gamesapps.Home.Pertemuan2
fun main() {
    println("hai rekan reksn...")
    println("selamat datang di bahassa pemrogramamn Kotlin")

    println("================")

    var angka = 15
    println("hasil dari 15 + 10 = $ {angka + 10}")

    val nilaiInt= 10000
    val nilaiDoiuble = 100.003
    val nilaiFloat = 1000.0f

    println("Nilai Integer = $nilaiInt")
    println("Nilai Double = $nilaiDoiuble")
    println("Nilai Float = $nilaiFloat")

    println("=======STRING=======")
    val huruf = 'a'
    println("ini penggunaan karakter '$huruf")

    val nilaiString = 'a'
    println("hallo $nilaiString!\nApa kabar?")

    println("=======KONDISI=======")

    val nilai = 10
    if(nilai<0)
        println("bilangan negatif")
    else {
        if(nilai%2 == 0)
            println("bilangan genap")
        else
            println("bilangan ganjil")
    }

    println("=======PERULSANGAN=======")
    val kampusKu: Array<String> = arrayOf("kampus","politekni", "caltex", "riau")
    for (kampus: String in kampusKu) {
        println(kampus)
    }



}
