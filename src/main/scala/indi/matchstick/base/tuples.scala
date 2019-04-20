package indi.matchstick.base

object tuples {

  def main(args: Array[String]): Unit = {
    val t = (1, 3.14, "Fred");
    val second = t _2;
    println(second)
    val (a, b, c) = t;
    println((a, b, c))
    val (e, _, f) = t;
    println((e, f))

    val symbols = Array("<", "-", ">");
    val counts = Array(2, 10, 2);
    val pairs = symbols.zip(counts);
    println(pairs.toBuffer)

    for ((s, n) <- pairs) {
      print(s * n)
    }
  }

}
