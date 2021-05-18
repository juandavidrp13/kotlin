package com.udea.kotlin

import kotlin.math.abs


fun main(){

    nuevoTema("Tema funciones")
    //sayHello()

    print("la suma es: ${sum(4,6)}\n")
    print("la resta es: ${sub(4,6)}")

    //tecnica infijo o infix
    nuevoTema("Infix")
    val numOne = 3
    val numTwo = -7
    println("$numOne + $numTwo = ${sum(numOne,numTwo)}")
    println("$numOne + $numTwo = ${sum(numOne,numTwo.activarAbs(true))}")


}

fun retornaString(): String {

    return "retorno"
}

fun sayHello(): Unit { //Esta es la palabra correspondiente a void en java, o sea que este metodo retora Unit (void o nada)
   print("hola funciones")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sub(a: Int, b: Int) = a - b

//Extencion personalizada para esta clase, a las var de tipo int les puedo aplicar este metodo
infix fun Int.activarAbs(activado: Boolean) = if (activado) abs(this) else this
