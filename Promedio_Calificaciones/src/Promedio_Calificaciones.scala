import scala.io.StdIn._

object Promedio_Calificaciones {
  def main(args: Array[String]): Unit = {
    
    var calificaciones = new Array[Double](5)
    
    for(i <- 0 until calificaciones.length){
      println("Ingresa la calificacion "+(i+1)+":")
      calificaciones(i) = readDouble()
    }
    println(mostrar(sacarPromedio(calificaciones)))
  }//main
  
   def sacarPromedio(calificaciones: Array[Double]): Double ={
      var promedio = 0.0
    for(i <- calificaciones){
      promedio += i
    }
     promedio/calificaciones.length
   }//sacar promedio
   
   def mostrar(promedio: Double): String={
      if (promedio >= 90){
      "Promedio: "+ promedio + " Exelente"
    } else if (promedio >= 80 && promedio < 90){
      "Promedio: "+ promedio + " Bien"
    }else if (promedio >= 70 && promedio < 80){
      "Promedio: "+ promedio + " Regular"
    }else{
      "Promedio: "+ promedio + " Terrible"
    }
   }//mostrar
     
   
}