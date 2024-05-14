import kotlin.math.pow

fun yeniden_baslat() {
    println("Programı yeniden başlatmak istiyor musunuz? (e/h)")
    val cevap: String = readln()
    when (cevap.lowercase()) {
        "y", "e", "yes", "evet" -> programRestart()
        else -> println("Program sonlandırıldı.")
    }
}

fun programRestart() {
    println("Kod 3 saniye içinde yeniden başlıyor...")
    for (i in 3 downTo 1) {
        println("$i...")
        Thread.sleep(1000)
    }
    println("Başlatılıyor...\n\n\n\n\n\n\n\n\n\n")
    main()
}

fun decimalToBinary(decimal: Int): String {
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

fun binaryToDecimal(binary: String): Int {
    var decimal = 0
    var power = binary.length - 1
    for (digit in binary) {
        if (digit == '1') {
            decimal += 2.0.pow(power.toDouble()).toInt()
        }
        power -= 1
    }
    return decimal
}

fun stringToBinary(text: String): String {
    val binaryResult = StringBuilder()
    for (char in text) {
        val binaryChar = Integer.toBinaryString(char.code)
        val paddedBinaryChar = binaryChar.padStart(8, '0')
        binaryResult.append(paddedBinaryChar).append(" ")
    }
    return binaryResult.toString().trim()
}

fun bolme(x: Double, y: Double) {
    if (y == 0.0) {
        println("0'a bölemezsiniz")
        yeniden_baslat()
    } else {
        println(x / y)
        yeniden_baslat()
    }
}

fun yalnis_islem() {
    println("Yanlış tuşa bastınız")
    yeniden_baslat()
}