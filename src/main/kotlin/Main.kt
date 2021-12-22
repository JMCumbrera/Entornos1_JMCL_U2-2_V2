fun main() {
    println("Introduzca la edad: ")
    val edad = readLine()!!.toInt()
    print("\n")
    println("Introduzca las capas: ")
    val capas = readLine()!!.toInt()
    print("\n")

    imprimirMensaje(edad)
    imprimirVelas(edad)
    imprimirCapaSup(edad)
    imprimirCapasInf(edad,capas)
    print("\n\n")
    imprimirMensaje(edad)
}

fun imprimirVelas(edad: Int) {
    var i = 0
    var j = 0
    print(" ")
    do {
        print(",")
        i++
    } while (i < edad)
    print("\n")
    print(" ")
    do {
        print("|")
        j++
    } while (j < edad)
    print("\n")
}

fun imprimirCapaSup(edad: Int) {
    var i = 0
    val e = edad + 2
    do {
        print("=")
        i++
    } while (i < e)
    print("\n")
}

fun imprimirCapasInf(edad: Int, capas: Int) {
    for (i in 0 until capas) {
        for (j in 0..edad+1) {
            print("@")
        }
        print("\n")
    }
}

fun imprimirMensaje(edad: Int) {
    val mensaje1 = "\"-._.-\"".repeat(5)
    val espacios = " "
    val espaciosRep: Int = edad/4
    val mensaje2 = "${espacios.repeat(espaciosRep)}¡¡¡¡¡¡¡MUCHAS FELICIDADES!!!!!!!"

    print(mensaje1)
    print("\n")
    print(mensaje2)
    print("\n")
    print(mensaje1)
    print("\n\n")
}
