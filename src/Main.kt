

fun main(){
   println("aritmetrik islemmi veya \n10 dalik rakami binarye donusturmekmi istiyorsunuz\n" +
          "aritmetrik islem icin 'aritmetrik'\n"+
           "binary donusturucu icin 'binary' yaziniz'")
    val kesir: String = readln()
    when(kesir)
    {
        "binary"->{
            print("donusturmek istedigin rakami gir:")

val x= readln().toInt()
           println( decimalToBinary(x))
            println("3 saniye icinde program yeniden basliyicak")
            Thread.sleep(1000)
            println(2)
            Thread.sleep(1000)
            println(1)
            Thread.sleep(1000)
            println("program basliyor...")
           Thread.sleep(1000)
            println("\n\n\n\n\n\n\n\n\n\n\n\n\n")
            return main()

            }


        "aritmetrik"->{
            println("ilk sayiyi giriniz")
            val x:Double?= readln().toDoubleOrNull()

            if (x==null){
                println("gecersiz islem girdiniz")
                println("3 saniye icinde basa donuyorsunuz")
                Thread.sleep(1000)
                println(2)
                Thread.sleep(1000)
                println(1)
                Thread.sleep(1000)
                println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n")
                println("basa donduruldu")

                return main()
            }

            else{

                println("ikinci sayiyi giriniz")
                val y: Double? = readln().toDoubleOrNull()
                if (y==null){
                    println("gecersiz islem girdiniz")
                    println("3 saniye icinde basa donuyorsunuz")
                    Thread.sleep(1000)
                    println(2)
                    Thread.sleep(1000)
                    println(1)
                    Thread.sleep(1000)

                    println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n")
                    println("basa donduruldu")
                    return main()
                }else{

                    println("yapmak istediginiz islemi giriniz")
                    val islem:String = readln()

                    when (islem) {
                        "*" -> println(x * y)
                        "/" -> println(x.toDouble() / y.toDouble())
                        "+" -> println(x + y)
                        "-" -> println(x - y)
                        "toplaminin karakoku" -> println((x + y) * (x + y))
                        "mod" -> println(x % y)
                        else -> {
                            println("gecersiz islem")
                            println("3 saniye icinde basa donuyorsunuz")
                            Thread.sleep(1000)
                            println(2)
                            Thread.sleep(1000)
                            println(1)
                            Thread.sleep(1000)
                            println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n")
                            println("basa donduruldu")
                            return main()
                        }
                    }
                    println("\n\n")
                    println("sonuc 3 saniye icinde ekrandan silinicektir")
                    Thread.sleep(1000)
                    println(3)
                    Thread.sleep(1000)
                    println(2)
                    Thread.sleep(1000)
                    println(1)
                    Thread.sleep(1000)
                    println("sonuc basariyla silindi")
                    return main()

                }
            }}





    else-> {
        println("yalnis islem")
        Thread.sleep(1000)
        println("kod yeniden basliyor...")
        Thread.sleep(1000)
        println(3)
        Thread.sleep(1000)
        println(2)
        Thread.sleep(1000)
        println(1)
        Thread.sleep(1000)
        println(0)
        println("\n\n\n\n\n\n\n\n\n\n")
        return main()

    }
    }

}

fun decimalToBinary(decimal: Int): String{
    var num = decimal
    var binary = ""
    if (num == 0) {
        return "0"
    }
    while (num > 0) {
        val remainder = num % 2
        binary = remainder.toString() + binary
        num /= 2
    }
    return binary
}
