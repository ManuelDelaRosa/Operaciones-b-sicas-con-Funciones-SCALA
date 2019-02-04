import scala.io.StdIn._

object MasaCorporal {
  /*3. Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] /altura^2 [m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:

Valor de IMC Diagnóstico
    < 16 Criterio de ingreso en hospital
    de 16 a 17 infrapeso
    de 17 a 18 bajo peso
    de 18 a 25 peso normal (saludable)
    de 25 a 30 sobrepeso (obesidad de grado I)
    de 30 a 35 sobrepeso crónico (obesidad de grado II)
    de 35 a 40 obesidad premórbida (obesidad de grado III)
    >40 obesidad mórbida (obesidad de grado IV)*/
  def main(args: Array[String]): Unit = {
    println("Ingrese Peso Kg")
    var peso = readDouble()
    println("Ingrese estatura m")
    var estatura = readDouble()
    println(mostrar(calcularIMC(peso,estatura)))
    
  }//main
  def calcularIMC(peso:Double, estatura: Double):Double={
    
    peso /Math.pow(estatura, 2) 
    
  }//calcularICM
  
  def mostrar(IMC: Double): String={
      if (IMC >=16&&IMC<=17){
      "IMC: "+ IMC + " Infrapeso"
    } else if (IMC >=17 &&IMC<=18){
      "IMC: "+ IMC + " Bajo Peso"
    }else if (IMC >=18 &&IMC<=125){
      "IMC: "+ IMC + "  Saludable"
    }else if (IMC >=25 &&IMC<=30){
      "IMC: "+ IMC + "  Obesidad Grado 1"
    }else if (IMC >=30 &&IMC<=35){
      "IMC: "+ IMC + "  Obesidad Grado 2"
    }else if (IMC >=35 &&IMC<=40){
      "IMC: "+ IMC + "  Obesidad Grado 3"
    }else{
      "IMC: "+ IMC + " Obesidad Grado 4"
    }
   }//mostrar
}//object