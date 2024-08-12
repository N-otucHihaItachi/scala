import scala.io.StdIn._
object Prac8Q2 extends App{


val describeNumber: Int => String = n => n match {
  case x if x % 5 == 0 && x % 3 == 0 => "Divisible by both 3 & 5"
  case x if x % 5 == 0 => "Divisible by 5"
  case x if x % 3 == 0 =>  "Divisible by 3"
  case _ => "Not divisible by 3 or 5"
}

println(describeNumber(25))
println(describeNumber(9))
println(describeNumber(15))
println(describeNumber(8))
}