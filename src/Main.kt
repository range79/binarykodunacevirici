


fun main(){
   println("aritmetrik islem icin '1' e  \n10dalik rakami binarye donusturmek icin  '2'ye basiniz:" )
    val kesir: String = readln()
    when(kesir)
    {
        "2"->{
            print("donusturmek istedigin rakami gir:")

val x= readln().toInt()
           println( decimalToBinary(x))
           yeniden_baslat()

            }


       "1"->{
            println("ilk sayiyi giriniz")
            val x:Double?= readln().toDoubleOrNull()

            if (x==null){
                println("gecersiz islem girdiniz")
              programRestart()

                return main()
            }

            else{

                println("ikinci sayiyi giriniz")
                val y: Double? = readln().toDoubleOrNull()
                if (y==null) {
                println("deger girmediniz")
                 programRestart()

                    }
                else{

                    println("yapmak istediginiz islemi giriniz")
                    val islem:String = readln()

                    when (islem) {
                        "*" -> println(x * y)
                        "/" -> bolme(x, y)
                        "+" -> println(x + y)

                        "-" -> println(x - y)
                        "toplaminin karakoku" -> println((x + y) * (x + y))
                        "mod" -> println(x % y)
                        else -> {

                          yalnis_islem()
                        }
                    }
            yeniden_baslat()

                }
            }}





    else-> {

      yalnis_islem()

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

