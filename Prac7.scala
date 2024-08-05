
object Prac7 extends App{

def filterEvenNumbers(x:List[Int]):List[Int]={
  x.filter(lst=>lst%2==0)
}
def calculateSquare(x:List[Int]):List[Int]={
  x.map(lst=>lst*lst)
}
def filterPrime(x:List[Int]):List[Int]={
  x.filter(lst => {
      if (lst <= 1) false
      else (2 until math.sqrt(lst).toInt).forall(d => lst % d != 0)
    })
}



var x=List(1,2,3,4,5,6,48,61)
var p=filterEvenNumbers(x)
var q=calculateSquare(x)
var r=filterPrime(x)
println(p)
println(q)
println(r)


}
