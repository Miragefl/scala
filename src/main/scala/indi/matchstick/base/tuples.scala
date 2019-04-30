package indi.matchstick.base

object tuples {

  def main(args: Array[String]): Unit = {
    //    val t = (1, 3.14, "Fred");
    //    val second = t _2;
    //    println(second)
    //    val (a, b, c) = t;
    //    println((a, b, c))
    //    val (e, _, f) = t;
    //    println((e, f))
    //
    //    val symbols = Array("<", "-", ">");
    //    val counts = Array(2, 10, 2);
    //    val pairs = symbols.zip(counts);
    //    println(pairs.toBuffer)
    //
    //    for ((s, n) <- pairs) {
    //      print(s * n)
    //    }


    //    println(numsFrom(10))
    //    val squares = numsFrom(1).map(x => x * x)
    //    println(squares)
    //    println(squares.tail)
    //    println(squares.take(5).force)


    val palindromicSquares = (1 to 10).view.map(x => x * x).filter(x => {
      println(x.toString + "===========" + x.toString.reverse)
      x.toString == x.toString.reverse
    })
    println(palindromicSquares.take(10).mkString(","))
  }

  def numsFrom(n: BigInt): Stream[BigInt] = {
    n #:: numsFrom(n + 1)
  }


}
