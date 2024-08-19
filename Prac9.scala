import scala.io.StdIn
object Prac9 extends App {

  var interest:Double=>Double=(Amount:Double)=>{
    Amount match{
      case x if x<=20000=>(x/100)*2
      case x if x<=200000=>(x/100)*4
      case x if x<=2000000=>(x/100)*3.5
      case x if x>2000000=>(x/100)*6
    }
  }

  var result:Int=>String=(Num:Int)=>{
    Num match{
      case x if x<0 =>"Negative"
      case x if x==0 =>"Zero"
      case x if x%2==0 =>"Even"
      case x if x%2==1 =>"Odd"
    }
  }
  
  var toUpper:String=>String=(x:String)=>{
    x.map{(y)=>if(y.toInt>=97 && y.toInt<=122 )
        {
          (y.toInt - 32).toChar
        }
      else{
        y
      }
    }.mkString
  }
  
  var toLower:String=>String=(x:String)=>{
    x.map{(y)=>if(y.toInt>=65 && y.toInt<=90)
      {
          (y.toInt + 32).toChar
      }
      else{
        y
      }
    }.mkString
  }

  def formatnames(x: String, y: Int): String = {
  y match {
    case 1 => toUpper(x) 
    case 2 => toUpper(x.substring(0, 2)) + toLower(x.substring(2)) 
    case 3 => toLower(x) 
    case 4 => toUpper(x.head.toString) + toLower(x.substring(1, x.length - 1)) + toUpper(x.last.toString) 
    case _ => x 
  }
}
println("interest for 350000 is:")
println(interest(350000))
println("interest for 3500 is:")
println(interest(3500))
println("interest for 3500000 is:")
println(interest(3500000))
println("input a number:")
var temp=StdIn.readInt()
println(result(temp))
println("input a number:")
temp=StdIn.readInt()
println(result(temp))
println("input a number:")
temp=StdIn.readInt()
println(result(temp))
println("formatting option 1")
println(formatnames("Benny",1))
println("formatting option 2")
println(formatnames("Niroshan",2))
println("formatting option 3")
println(formatnames("Saman",3))
println("formatting option 4")
println(formatnames("Kumara",4))
}
