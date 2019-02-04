import scala.io.StdIn._

object Prestamo {
  def main(args: Array[String]): Unit = {
    println("Ingrese su nombre")
    var nombre = readLine()
    println("Ingrese historia crediticia(‘b’buena o ‘m’ mala)")
    var historia = readLine()
    println("Ingrese cantidad solicitada ")
    var prestamo = readDouble()
     println("Ingrese sueldo anual ")
    var sueldo = readDouble()
     println("Ingrese valor de otras propiedades ")
    var propiedades = readDouble()
    
    println(aprobarPrestamo(nombre,prestamo,sueldo,propiedades,historia,calcularPuntos(sueldo,propiedades,prestamo)))
    
  }//main
  
  def calcularPuntos (salario:Double, propiedades: Double,prestamo: Double):Int={
    var puntos =0
    var a=prestamo*.5
    var b=prestamo*.25
    var c=prestamo*.10
    var d= 2*prestamo
    if(salario>=a){
      puntos += 5
    }else if(salario>=b&&salario<a){
       puntos += 3
    }else if(salario>=c&&salario<b){
       puntos += 1
    }else if(propiedades>d){
      puntos +=5
    }else if(propiedades>prestamo&&propiedades<d){
       puntos +=3
    }
    return puntos
  }//puntos
  
  def aprobarPrestamo(nombre:String,prestamo:Double,sueldo:Double,propiedades:Double,historia:String,puntos:Int):String={
    if(historia.equals("b")&&puntos>6){
      "Datos:\n Nombre: "+nombre+"\n"+"Historia crediticia: "+historia+"\n"+"Prestamo: $"+prestamo+"\n"+"Sueldo anual: $"+sueldo+"\n"+"Valor de otras propiedades: $"+propiedades+"\n"+"Puntos: "+puntos+"\n"+"ACEPTADO"
    }else{
      "Datos:\n Nombre: "+nombre+"\n"+"Historia crediticia: "+historia+"\n"+"Prestamo: $"+prestamo+"\n"+"Sueldo anual: $"+sueldo+"\n"+"Valor de otras propiedades: $"+propiedades+"\n"+"Puntos: "+puntos+"\n"+"RECHAZADO"
    }
  }
}//object