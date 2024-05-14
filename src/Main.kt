import kotlin.math.pow
fun main() {
    println("Aritmetik işlem için '1' e\n10'luk rakamı binary'e dönüştürmek için '2'ye\nBinary'den 10'luk'a çevirmek için '3'e\nSözleri binary'e dönüştürmek için '4'e basınız")
    val secim: String = readln()
    when (secim) {
        "4" -> {
            println("Dönüştüreceğiniz sözü, harfi veya cümleyi giriniz:")
            val x: String = readln()
            println(stringToBinary(x))
            yeniden_baslat()
        }
        "3" -> {
            println("Binary rakamını giriniz:")
            val x: String = readlnOrNull() ?: run {
                println("Değer girmediniz")
                yeniden_baslat()
                return
            }
            println(binaryToDecimal(x))
            yeniden_baslat()
        }
        "2" -> {
            println("Dönüştürmek istediğiniz rakamı giriniz:")
            val x = readln().toIntOrNull() ?: run {
                println("Geçersiz değer girdiniz")
                yeniden_baslat()
                return
            }
            println(decimalToBinary(x))
            yeniden_baslat()
        }
        "1" -> {
            println("İlk sayıyı giriniz:")
            val x: Double = readln().toDoubleOrNull() ?: run {
                println("Geçersiz değer girdiniz")
                yeniden_baslat()
                return
            }

            println("İkinci sayıyı giriniz:")
            val y: Double = readln().toDoubleOrNull() ?: run {
                println("Geçersiz değer girdiniz")
                yeniden_baslat()
                return
            }

            println("Yapmak istediğiniz işlemi giriniz (+, -, *, /, toplamının karakökü, mod):")
            val islem: String = readln()

            when (islem) {
                "*" -> println(x * y)
                "/" -> bolme(x, y)
                "+" -> println(x + y)
                "-" -> println(x - y)
                "toplamının karakökü" -> println(Math.sqrt(x + y))
                "mod" -> println(x % y)
                else -> {
                    println("Yanlış işlem girdiniz")
                    yeniden_baslat()
                }
            }
            yeniden_baslat()
        }
        else -> {
            println("Yanlış seçim yaptınız")
            yeniden_baslat()
        }
    }
}
