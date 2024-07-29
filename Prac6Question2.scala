import scala.io.StdIn._

object Prac6Question2 extends App{

  var stdname=""
  var marks=0
  var tpmarks=0
  var state=false

val student1=getStudentinfo()
printStudentRecord(student1)

def getStudentinfoWithRetry():(String,Int,Int)={
  do{
    stdname=readLine("Enter name: ")
    println("Enter marks:")
    marks=readInt()
    println("Enter highest possible mark:")
    tpmarks=readInt()
    state=validateInput(stdname,marks,tpmarks)
  }
  while(!state)
  (stdname,marks,tpmarks)
}

def validateInput(x:String,y:Int,z:Int):Boolean={
    if(x.isEmpty || y<0 || z<=0){
        println("Retry... Enter correct details")
         false
    }
    else{
         true
    }
}

def getStudentinfo(): (String, Int, Int, Float, Char) = {
    val stdinfo = getStudentinfoWithRetry()
    val percentage: Float = (stdinfo._2.toFloat / stdinfo._3) * 100
    val grade: Char = {
      if (percentage >= 90) 'A'
      else if (percentage >= 75) 'B'
      else if (percentage >= 50) 'C'
      else 'D'
    }
    (stdinfo._1, stdinfo._2, stdinfo._3, percentage, grade)
  }
  
def printStudentRecord(x:(String,Int,Int,Float,Char)):Unit={
    for(y<-x.productIterator){
        println(y)
    }    
}


}