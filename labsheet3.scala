object lab3{
    def main(args: Array[String]):Unit={
        var x="Hello world"
        x=reverse(x)
        println(x)

        val lst=List("abdulr","fish","doctor")
        println(strlenfive(lst))
        println(mean(79,3))
        println(sumofeven(List(1,2,3,4,5)))
    }

    def reverse(word: String):String=if(word.isEmpty) "" else reverse(word.tail)+word.head
    
    def strlenfive(s: List[String]):List[String]=for{x<-s ; if(x.length>5)} yield x
    
    def mean(x: Int, y: Int): String = {
       val result = (x + y) / 2.0
       f"$result%.2f"
    }


    def sumofeven(lst:List[Int]):Int={
        var sum=0
        for(x<-lst ; if(x%2==0))
        {
            sum=sum+x
        }
        sum
    }
}
