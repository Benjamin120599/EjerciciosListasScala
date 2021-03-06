
import scala.collection.mutable.ListBuffer
import scala.io.StdIn

object Ejercicio06 {

  def main(args: Array[String]): Unit = {
    println("Comenzando a llenar lista 1: ")
    var lista1 = crearLista()
    println("Fin del llenado de la lista.")
    println("------------------------------------------------------------\n")

    println("SUMA ACUMULADA: ")
    sumaAcumulada(lista1).foreach(println)

  }

  def sumaAcumulada(lista:ListBuffer[Int]): ListBuffer[Int] = {

    var nuevaLista = new ListBuffer[Int]

    for(i<-0 until lista.length) {
      if(nuevaLista.isEmpty) {
        nuevaLista.addOne(lista(i))
      } else {
        nuevaLista.addOne(nuevaLista(i-1) + lista(i) )
      }
    }

    return nuevaLista

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
