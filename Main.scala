
  object Main{
  def main(args: Array[String]): Unit = {
    println(s"Area of the Disk is ${Area(5.0)}")
    println(s"Temperature is ${CtoF(35.0)}")
    println(s"Volume of the sphere is ${Volume(5.0)}")
    println(s"Wholesale price is ${Wholesale(60)}")
    println(s"Total time is ${Tottime(4,3)}")
  }

  def Area(radius:Double):Double={
    val pi=3.14
    pi*radius*radius
  }

   def CtoF(celsius:Double):Double={
    celsius*1.8000+32.00
  }

   def Volume(radius:Double):Double={
    val pi=3.14
    (4.0/3)*pi*radius*radius*radius
  }

  def Wholesale(count:Int):Double={
    var extra=count-50
    val disprice=24.95*(0.6)*count
    val amount=if(extra>0)disprice+3.0*50+extra*0.75 else disprice+3.0*count
    amount 
  }

  def Tottime(epd:Int,tpd:Int):Int={
    val timeep=8
    val timetp=7
    epd*timeep+tpd*timetp
   }
  
  }






