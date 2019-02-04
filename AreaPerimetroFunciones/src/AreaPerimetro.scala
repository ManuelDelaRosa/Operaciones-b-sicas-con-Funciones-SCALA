
import scala.io.StdIn._
import scala.util.Random
object AreaPerimetro {
  
  

  

   def areaPerimetroRectangulo (x:Double, y:Double, z:Int):Double ={
    if(z==1) x*y else 2*x+2*y
  }//perimetro cuadrado
    
      def areaCirculo (x:Double):Double ={
      Math.PI * Math.pow(x, 2) 

  }//Area circulo
      
   def perimetroCirculo (x:Double):Double ={
       Math.PI * x

  }//perimetro Circulo
   
   def areaTriangulo(b: Double, a: Double): Double = {
    (b*a)/2
  }//area Tringulo
  
  def perimetroTriangulo(a: Double, b: Double, c: Double): Double = {
    a+b+c
  }//perimetro Tringulo
    
    
       
  def main(args: Array[String]): Unit = {
    
      menu()

    
  }//main
  
   def menu(){
    var i = 0
    var op = 0
    
    while(i != 4){
      println("\n Elige una opcion: ")
      println("1) Circulo ")
      println("2) Rectangulo ")
      println("3) Triangulo ")
      println("4) SALIR ")
      i = readInt()
      
     if(i == 1){
       while(op != 3){
          println("\n Elige una opcion para calcular: ")
          println("1) Area")
          println("2) Perimetro")
           println("3) SALIR ")
          
          op = readInt()
          
          if(op == 1){
            println("Ingresa el radio: ")
            println("El área del circulo es: "+ areaCirculo(readDouble()))
            
          } else if (op == 2){
            println("Ingresa el diametro: ")
            val d= readDouble()
            println("El perimetro del circulo es: "+ perimetroCirculo(readDouble()))
            
          }
       }
       
     } else if (i == 2){
        while(op != 3){
         println("\n Elige una opcion para calcular: ")
          println("1) Area")
          println("2) Perimetro")
           println("3) SALIR ")
          
          op = readInt()
          
          
          if(op == 1){
            println("Ingresa el largo: ")
            val l = readDouble()
            println("Ingresa el alto: ")
            val a = readDouble()
            println("El Area del rectangulo es: "+ areaPerimetroRectangulo(l, a,op))
            
          } else if (op==2){
             println("Ingresa el largo: ")
            val l = readDouble()
            println("Ingresa el alto: ")
            val a = readDouble()
            println("El perimetro del rectangulo es: " +areaPerimetroRectangulo(l, a,op))
            
          }
        }
     }else if (i == 3){
        while(op != 3){
         println("\n Elige una opcion para calcular: ")
          println("1) Area")
          println("2) Perimetro")
           println("3) SALIR ")
          
          op = readInt()
          
          
          if(op == 1){
            println("Ingresa la base: ")
            val b = readDouble()
            println("Ingresa el altura: ")
            val a = readDouble()
            println("El Area del Triangulo es: "+ areaTriangulo(b, a))
            
          } else if (op==2){
             println("Ingresa el lado 1: ")
            val a = readDouble()
            println("Ingresa el lado 2: ")
            val b = readDouble()
             println("Ingresa el lado 3: ")
            val c = readDouble()
            println("El perimetro del rectangulo es: "+ perimetroTriangulo(a,b,c))
            
            
          }
        }
    
    }
   }//while figuras
 }//menu
    
}//object