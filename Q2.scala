object Q2 {
  def main(args: Array[String]): Unit = {
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    var k = 4.3f
    var g = 2.0f

    // Decrease b by 1
    b -= 1
    println(b * a + c * d)

    // Print current value of a
    println(a)
    // Increment a by 1
    a += 1

    // Expression involving g and k
    println(-2 * (g - k) + c)

    // Print current value of c
    println(c)
    // Increment c by 1
    c += 1
    println(c)

    // Example of an expression that increments c and calculates c * a
    c = c + 1
    c = c * a
    println(c)

    // Increment a by 1
    a = a + 1
  }
}
