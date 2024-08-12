object Prac8Q1 extends App {
  def Encryption(x:String):String={
    var temp=x.map(y=>(y+1).toChar)
    temp.mkString
  }
  def Decryption(x:String):String={
     var temp=x.map(y=>(y-1).toChar)
     temp.mkString
  }
  def Cipher(x:String,f:String=>String):String={
    f(x)
  }
  var name="aoz" 
  println(Cipher(name,Encryption))
  println(Cipher(name,Decryption))
}