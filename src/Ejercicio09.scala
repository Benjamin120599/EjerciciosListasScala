import scala.collection.mutable.ListBuffer
import scala.io.StdIn

object Ejercicio09 {

  //NO FUNCIONA POR COMPLETO :(

  def main(args: Array[String]): Unit = {
    println("Comenzando a llenar lista 1: ")
    var lista1 = crearLista()
    println("Fin del llenado de la lista.")
    println("------------------------------------------------------------\n")

    for(l<-generarDatos(lista1)) {
      l.foreach(println)
      println("\n------------------------------")
    }

  }

  def generarDatos(lista:ListBuffer[Int]): ListBuffer[ListBuffer[Double]] = {

    var listaGenerada = new ListBuffer[ListBuffer[Double]]

    var lista1 = new ListBuffer[Double]
    var lista2 = new ListBuffer[Double]
    var lista3 = new ListBuffer[Double]

    for(i<-0 until lista.length) {
      lista1 = numerosPrimos(lista(i))
      lista2.addOne(sumatoria( lista(i) ))
      lista3.addOne(factorial(i))
    }
    lista2.addOne(promedio(lista))

    listaGenerada.addOne(lista1)
    listaGenerada.addOne(lista2)
    listaGenerada.addOne(lista3)

    return listaGenerada

  }

  def numerosPrimos(num:Int): ListBuffer[Double] = {
    var listaNumPrimos = new ListBuffer[Double]
    for(i<-1 until num) {
      if(num%i==0) {
        listaNumPrimos.addOne(i.toDouble)
      }
    }
    return listaNumPrimos
  }

  def sumatoria(num:Int): Double = {
    var listaSumatoria = new ListBuffer[Double]
    var suma = 0
    var promedio = 0
    for(i<-0 until num) {
      suma = suma + i
    }

    return suma.toDouble
  }

  def promedio(lista:ListBuffer[Int]): Double = {

    var prom = 0

    for(i<-0 until lista.length) {
      prom = prom + lista(i)
    }

    prom = prom/lista.length
    return prom
  }

  def factorial(num:Int) : Double = {
    var factorial = 1
    for(i<-0 until num) {
      factorial = factorial * i
    }

    return factorial

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
