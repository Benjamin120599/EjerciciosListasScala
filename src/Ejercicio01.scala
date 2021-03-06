import scala.collection.mutable.ListBuffer
import scala.io.StdIn

object Ejercicio01 {

  def main(args: Array[String]): Unit = {
    println("Comenzando a llenar lista: ")
    var lista = crearLista()
    println("Fin del llenado de la lista.")
    println("------------------------------------------------------------")
    println("Ingresa una palabra para buscar en la lista: ")
    var palabra = StdIn.readLine()

    println("Se encontró "+conteoPalabrasEnLista(palabra, lista)+" veces la palabra "+palabra+" en la lista")

  }

  def conteoPalabrasEnLista(palabra: => String, listaPalabras:ListBuffer[String]): Int = {
    var cont = 0

    for(x <- listaPalabras) {
      if(x.equals(palabra))
        cont += 1
    }
    return cont
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
