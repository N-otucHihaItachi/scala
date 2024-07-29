object Prac6Question1 extends App {
    case class product(
        name:String,
        quantity:Int,
        price:Int
    )

    val Inventory1: Map[Int,product]=Map(1->product("book",3,100),2->product("pen",10,20),3->product("pencil",15,15),4->product("box",5,200))
    val Inventory2: Map[Int,product]=Map(1->product("book",6,80),2->product("pen",5,20),3->product("pencil",9,20),4->product("box",1,150))
    printitems(Inventory1)
    itemcount(Inventory1)
    val Inventory3=merge(Inventory1,Inventory2)
    searchItem(Inventory1,2)
    

    def printitems(Inventory:Map[Int,product]):Unit={
    Inventory.keys.foreach{ key=>
        println(Inventory(key))
    }
    }

    def itemcount(Inventory:Map[Int,product]):Unit={
    var sum=0
    Inventory.keys.foreach{ key=>
        sum=sum+Inventory(key).quantity
    }
    println(sum)
    }

    def isempty(Inventory:Map[Int,product]):Unit={
    if(Inventory.isEmpty){
        println("Inventory is Empty")
    }
    else{
    var sum=0
    Inventory.keys.foreach{ key=>
        sum=sum+Inventory(key).quantity
    }
    if(sum==0){
        println("Inventory is Empty")
    }
    else{
        println("Inventory is not Empty")
    }
    }
    }

  def merge(Inventory1: Map[Int, product], Inventory2: Map[Int, product]): Map[Int, product] = {
    val mergedInventory = (Inventory1.keySet ++ Inventory2.keySet).map { key =>
      val p1 = Inventory1.getOrElse(key, product("", 0, 0))
      val p2 = Inventory2.getOrElse(key, product("", 0, 0))
      val mergedProduct = product(
        name = p1.name, 
        quantity = p1.quantity + p2.quantity,
        price = Math.max(p1.price, p2.price)
      )
      key -> mergedProduct
    }.toMap

    println("Merged Inventory:")
    printitems(mergedInventory)
    mergedInventory
  }


   def searchItem(inventory: Map[Int, product], key: Int): Unit = {
    inventory.get(key) match {
      case Some(product) =>
        println(s"ID: $key, Name: ${product.name}, Quantity: ${product.quantity}, Price: ${product.price}")
      case None =>
        println(s"Item with ID $key not found")
    }
  }
    
    
    
}

