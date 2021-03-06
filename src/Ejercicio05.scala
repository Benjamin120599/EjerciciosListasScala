import scala.collection.mutable.ListBuffer
import scala.io.StdIn

object Ejercicio05 {

  def main(args: Array[String]): Unit = {

    println("Comenzando a llenar lista 1: ")
    var lista1 = crearLista()
    println("Fin del llenado de la lista.")
    println("------------------------------------------------------------\n")

    println("Comenzando a llenar lista 2: ")
    var lista2 = crearLista()
    println("Fin del llenado de la lista.")
    println("------------------------------------------------------------\n")

    println("LISTA 1: ")
    lista1.foreach(println)

    println("\nLISTA 2: ")
    lista2.foreach(println)

    println("\nLISTA Procesada: ")

    for(l<-procesarListas(lista1, lista2)) {
      l.foreach(println)
      println("\n------------------------------")
      println("Otra lista: ")
    }

    //eliminarRepetidos(lista1).foreach(println)
    //procesarListas(lista1, lista2).foreach(println)

  }


  def procesarListas(lista1:ListBuffer[String], lista2:ListBuffer[String]): ListBuffer[ListBuffer[String]] = {
    var listaGenerada = new ListBuffer[ListBuffer[String]]

    var listaNoRepetida1 = eliminarRepetidos(lista1)
    var listaNoRepetida2 = eliminarRepetidos(lista2)

    var listaNueva1 = new ListBuffer[String]

    for(i<-0 until listaNoRepetida1.length) {
      for(j<-0 until listaNoRepetida2.length) {
        if(listaNoRepetida1(i).equals(listaNoRepetida2(j))) {
          listaNueva1.addOne(listaNoRepetida1(i))
        }
      }
    }

    var listaNueva2 = new ListBuffer[String]

    for(i<-0 until listaNoRepetida1.length) {
      if(!listaNoRepetida2.contains(listaNoRepetida1(i))) {
        listaNueva2.addOne(listaNoRepetida1(i))
      }
    }

    var listaNueva3 = new ListBuffer[String]

    for(i<-0 until listaNoRepetida2.length) {
      if(!listaNoRepetida1.contains(listaNoRepetida2(i))) {
        listaNueva3.addOne(listaNoRepetida2(i))
      }
    }

    listaGenerada.addOne(listaNueva1)
    listaGenerada.addOne(listaNueva2)
    listaGenerada.addOne(listaNueva3)

  }

  def eliminarRepetidos(lista:ListBuffer[String]): ListBuffer[String] = {
    var listaNueva = new ListBuffer[String]

    for(i<-0 until lista.length) {
      if(listaNueva.contains(lista(i))) {

      } else {
        listaNueva.addOne(lista(i))
      }
    }
    return listaNueva
  }

  def crearLista(): ListBuffer[String] = {

    var opcion = 0
    println("Ingresa cuántas palabras deseas ingresar: ")
    var num = StdIn.readInt()

    var palabras = new ListBuffer[String]()

    do {
      println("Ingresa la palabra "+(opcion+1)+": ")
      var palabra = StdIn.readLine()
      palabras.addOne(palabra)
      opcion+=1

    } while(opcion != num)

    return palabras

  }

}
