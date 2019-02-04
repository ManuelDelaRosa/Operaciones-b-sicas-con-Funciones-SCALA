import scala.io.StdIn._

object Mes {
  def main(args: Array[String]): Unit = {
    println("ingrese un numero del 1 al 12")
    var mes=readInt()
    
    if(mes<1||mes>12){
      println("numero no valido, inserte otro numero")
      mes= readInt()
    }
    println(meses(mes))
  }//main
  
  def meses(mes:Int):String={
    if(mes==4||mes==6||mes==9||mes==11){
      "El mes "+ mes+" tiene 30 dias"
    }else if(mes==1||mes==3||mes==5||mes==7||mes==10||mes==12){
      "El mes "+ mes+" tiene 31 dias"
    }else
    "El mes "+ mes+" tiene 28 dias"
  }//meses
}//object