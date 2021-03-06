import scala.collection.mutable.ListBuffer
import scala.io.StdIn

object Ejercicio02 {

  def main(args: Array[String]): Unit = {
    println("Comenzando a llenar lista: ")
    var lista = crearLista()
    println("Fin del llenado de la lista.")
    println("\n--------------------------------------------------------\n")
    println("Ingresa la palabra que será reemplazada: ")
    var palabra1 = StdIn.readLine()
    println("Ingresa la palabra por la que será reemplazada: ")
    var palabra2 = StdIn.readLine()

    println("\nI M P R E S I Ó N    D E    D A T O S \n")
    println("Lista Original: ")
    lista.foreach(println)
    println("Palabra a reemplazar: "+palabra1)
    println("Palabra por la que será reemplazada: "+palabra2)
    println("Lista Modificada: ")
    reemplazarPalabra(palabra1, palabra2, lista).foreach(println)
  }

  def reemplazarPalabra(palabra1:String, palabra2:String, lista:ListBuffer[String]): ListBuffer[String] = {

    for(x<-0 until lista.length) {
      if(lista(x).equals(palabra1))
        lista(x) = palabra2
    }
    return lista
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
