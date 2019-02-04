import scala.io.StdIn._

object Bisiesto {
  def main(args: Array[String]): Unit = {
    println("ingrese un año (ejemplo 2019) ")
    var bisiesto= readInt()
    println(calcularBisiesto(bisiesto))
    
  }//main
  def calcularBisiesto(bisiesto: Int):String={
    if(bisiesto%4==0&&bisiesto%100!=0){
      "El año "+ bisiesto+" es Bisiesto"
    }else{
      "El año "+ bisiesto+" NO es Bisiesto"
    }
    
  }
}//main