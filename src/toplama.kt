fun yeniden_baslat(){
    println("Programı yeniden başlatmak istiyor musunuz? (e/h)")
    val test: String = readLine() ?: ""
    when(test){
        "y", "e", "yes", "evet" -> programRestart()
      else -> {}
    }
}

fun programRestart() {
    println("Kod 3 saniye içinde yeniden başlıyor...")
    for (i in 3 downTo 0) {
        Thread.sleep(1000)
        println(i)
    }
    println("\n\n\n\n\n\n\n\n\n\n")
    return main()
}

fun yalnis_islem(){
    println("yalnis tusa basildi")
    programRestart()
}
fun bolme(x:Double,y:Double){
    if (y==0.00){
        println("0 a bolemezsiniz")
        programRestart()
    }
    else{
        println(x/y)
    }
}