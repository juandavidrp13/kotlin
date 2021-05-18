package com.udea.kotlin




//Esto se ejecuto sin necesidad de tener un celular conectado ya que no requiere interfaz grafica
fun main(){
    //print("Hola Mundo de kotlin!!!")
    nuevoTema("Curso de kotlin")

    nuevoTema("Constantes y Variables")

    //Constantes
    val a = "Cosa"
    print("a = $a\n")

    // variables
    //var b = "b"
    //var b = true
    var b: Int
    b = 4
    print("b = $b\n")

    //variables null

    //la siguiente variable no puede tomar el valor de null al inicializarce
    //var objNull: String

    //Esta variable ya puede llevar el valor null al inicializarce porque tiene un ? se debe tener cuidado cuando se activa esta opción en una var
    //var objNull: String?

    //Esta var yo la puedo inicializar con el tipo de dato que yo quiera string, null, int, bool
    var objNull: Any?
    objNull = null
    print(objNull)
}


fun nuevoTema(tema: String){
    print("\n==================== $tema ====================\n")
}