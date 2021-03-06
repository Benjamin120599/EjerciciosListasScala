import scala.collection.mutable.ListBuffer
import scala.io.StdIn

object Ejercicio07 {

  def main(args: Array[String]): Unit = {
    println("Comenzando a llenar lista 1: ")
    var lista1 = crearLista()
    println("Fin del llenado de la lista.")
    println("------------------------------------------------------------\n")

    println("Lista de palabras palindromas: ")
    buscarPalindromas(lista1).foreach(println)


  }

  def buscarPalindromas(lista:ListBuffer[String]): ListBuffer[String] = {
    var listaNueva = new ListBuffer[String]
    for(i<-0 until lista.length) {
      if(lista(i).equals(lista(i).reverse)) {
        listaNueva.addOne(lista(i).reverse)
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
