import scala.collection.mutable.ListBuffer
import scala.io.StdIn

object Ejercicio08 {

  def main(args: Array[String]): Unit = {

    println("Comenzando a llenar lista 1: ")
    var lista1 = crearLista()
    println("Fin del llenado de la lista.")
    println("------------------------------------------------------------\n")

    println("Lista de números Capicuas: ")
    obtenerCapicuas(lista1).foreach(println)

  }

  def obtenerCapicuas(lista:ListBuffer[Int]): ListBuffer[Int] = {
    var listaNueva = new ListBuffer[Int]
    for(i<-0 until lista.length) {
      if(lista(i) == (lista(i).toString.reverse).toInt ) {
        listaNueva.addOne(lista(i).toString.reverse.toInt)
      }
    }
    return listaNueva
  }

  def crearLista(): ListBuffer[Int] = {

    var opcion = 0
    println("Ingresa cuántas numeros deseas ingresar: ")
    var num = StdIn.readInt()

    var numeros = new ListBuffer[Int]()

    do {
      println("Ingresa el número "+(opcion+1)+": ")
      var numero = StdIn.readInt()
      numeros.addOne(numero)
      opcion+=1

    } while(opcion != num)

    return numeros

  }

}
