import scala.collection.mutable.ListBuffer
import scala.io.StdIn

object Ejercicio03 {

  def main(args: Array[String]): Unit = {
    println("Comenzando a llenar lista: ")
    var lista = crearLista()
    println("Fin del llenado de la lista.")
    println("\n--------------------------------------------------------\n")

    println("Ingresa la palabra que será borrada: ")
    var palabra = StdIn.readLine()

    println("Borrando palabra(s)...")
    println("L I S T A: ")
    eliminarPalabra(palabra, lista).foreach(println)


  }

  def eliminarPalabra(palabra:String, lista:ListBuffer[String]): ListBuffer[String] = {

    for(i<-0 until lista.length) {
      lista -= palabra
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
