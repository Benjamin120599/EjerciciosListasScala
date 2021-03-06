import scala.collection.mutable.ListBuffer
import scala.io.StdIn

object Ejercicio04 {

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
    eliminarDatos(lista1, lista2).foreach(println)

  }

  def eliminarDatos(lista1:ListBuffer[String], lista2:ListBuffer[String]): ListBuffer[String] = {

    for(i<-0 until lista2.length) {
      var palabra = lista2(i)
      for(j<-0 until lista1.length) {
        lista1 -= palabra
      }
    }

    return lista1

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
