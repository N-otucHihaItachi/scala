object day4 {
  def main(args: Array[String]): Unit = {
    val items: Array[String] = Array("pens", "books", "bottles", "boxes")
    val quantities: Array[Int] = Array(5, 3, 8, 9)

    printItems(items, quantities)

    restock("pens", 3, items, quantities)
    printItems(items, quantities)

    sellItem("pens", 1, items, quantities)
    printItems(items, quantities)

    // Reading a string input from the user
    print("Enter an integer: ")
    val inpt = scala.io.StdIn.readLine()

    // Calling func method and printing the result
    val result = func(inpt)
    println(s"Result of func($inpt): $result")

    var name1="Benny"
    var name2="Nirosh"
    var name3="Saman"
    var name4="Kumara"

    println(formatnames(name1,1))
    println(formatnames(name2,2))
    println(formatnames(name3,3))
    println(formatnames(name4,4))

  }

  def printItems(items: Array[String], quantities: Array[Int]): Unit = {
    val size = items.length
    for (x <- 0 until size) {
      println(items(x) + ": " + quantities(x))
    }
  }

  def restock(name: String, quan: Int, items: Array[String], quantities: Array[Int]): Unit = {
    val index = items.indexOf(name)
    if (index < 0) {
      println("This item does not exist")
    } else {
      quantities(index) += quan
    }
  }

  def sellItem(name: String, quan: Int, items: Array[String], quantities: Array[Int]): Unit = {
    val index = items.indexOf(name)
    if (index < 0) {
      println("This item does not exist")
    } else {
      quantities(index) -= quan
    }
  }

  def func(arg: String): String = {
      val y = arg.toInt
      y match {
        case x if x < 0 => "Negative"
        case 0 => "Zero"
        case x if x % 2 == 0 => "Even"
        case x if x % 2 != 0 => "Odd"
      }
  } 
}

def Uppercase(x:String):String={
  x.toUpperCase()
}
def Lowercase(x:String):String={
  x.toLowerCase()
}
def formatnames(x: String, y: Int): String = {
  y match {
    case 1 => Uppercase(x) 
    case 2 => Uppercase(x.substring(0, 2)) + x.substring(2) 
    case 3 => Lowercase(x) 
    case 4 => Uppercase(x.head.toString) + x.substring(1, x.length - 1) + Uppercase(x.last.toString) 
    case _ => x 
  }
}

