object Main {
  def main(args: Array[String]): Unit = {

    var i = 2
    var j = 2
    var k = 2
    var m = 5
    var n = 5
    var f = 12.0f
    var g = 4.0f
    var c = 'X'

    println(s"k + 12 * m = ${k + 12 * m}")
    println(s"m / j = ${m / j}")
    println(s"n % j = ${n % j}")
    println(s"m / j * j = ${m / j * j}")

    println(s"f + 10 * 5 + g = ${f + 10 * 5 + g}")

    println(s"(i + 1) * n = ${(i + 1) * n}")

    // Example of function calls
    println(s"Take Home salary is ${THSalary(50, 70)}")
    println(s"Profit is ${Profit(10)}")
    println(s"Profit is ${Profit(15)}")
    println(s"Profit is ${Profit(20)}")
    println(s"Profit is ${Profit(25)}")
    println(s"Profit is ${Profit(30)}")
  }

  // Functions for salary calculation
  def THSalary(nwh: Int, oth: Int): Int = NWHSalary(nwh) + OTSalary(oth) + ADDTax(nwh, oth)

  def NWHSalary(nwh: Int): Int = 250 * nwh

  def OTSalary(oth: Int): Int = 85 * oth

  def ADDTax(nwh: Int, oth: Int): Int = if (nwh >= 40 && oth >= 30) (NWHSalary(nwh) + OTSalary(oth)) * 12 / 100 else 0

  // Functions for profit calculation
  def Profit(Price: Int): Int = Rev(Price) - Cost(Price)

  def Rev(Price: Int): Int = Atten(Price) * Price

  def Atten(Price: Int): Int = 120 + ((15 - Price) / 5) * 20

  def Cost(Price: Int): Int = 500 + 3 * Atten(Price)
}
