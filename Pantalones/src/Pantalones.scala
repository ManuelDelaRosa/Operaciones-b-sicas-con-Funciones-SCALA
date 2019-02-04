import scala.io.StdIn._

object Pantalones {
  def main(args: Array[String]): Unit = {
    println("Ingrese cantidad de pantalones a comprar")
     var pantalones = readInt()
     
     println("El total a pagar es $"+totalPago(pantalones))
  }//main
  def totalPago(pantalones: Int):Double={
     if (pantalones<5){
       pantalones*356.82
    }else if(pantalones>=5&&pantalones<=12){
      pantalones*(356.82*.85)
    }else {
    pantalones*(356.82*.70)
  }
  
  }
  
   
}//object