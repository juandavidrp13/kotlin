package com.udea.kotlin



fun main(){

    nuevoTema("Bucles")
    showPersons("andre",person3 = "charlie")
    showPerson("marco", "migue", "gabriel","esteban")
}


fun showPersons(person1: String, person2: String = "p2 sin nombre", person3: String = "Sin nombre"){
    println(person1)
    println(person2)
    println(person3)
}

fun showPerson(vararg persons: String){
    println("Imprimiendo con for")
    for (person in persons) println(person)
    println("imprimiento con While")

    var i = 0
    while (i < 4){
        println(persons[i])
        i++
    }
}