package indi.matchstick.base


object PersonTest {
  def main(args: Array[String]): Unit = {
    // 按名称调用函数
//    delayed(time());
//    // 命名参数的函数
//    println(printInt(3, 4));
//    // Scala可变参数的函数
//    printStrings("p1", "p2", "p3");
//    // Scala递归函数
//    println();
//    for (i <- 1 to 10) {
//      println("Factorial of " + i + ": = " + factorial(i));
//    }

    // Scala高阶函数
    println(apply(layout, 10));
  }

  // 按名称调用
  def time(): Long = {
    print("time方法 \t");
    System.currentTimeMillis();
  }

  def delayed(t: => Long) = {
    print("In delayed method \t");
    println("入参: " + t);
  }

  // 命名参数的函数
  def printInt(a: Int, b: Int): Int = {
    print("入参：" + a + "," + b + "\t");
    a + b;
  }

  //Scala可变参数的函数
  def printStrings(args: String*): Unit = {
    print("入参:")
    for (arg <- args) {
      print(arg + "\t")
    }
  }

  // Scala递归函数
  def factorial(n: BigInt): BigInt = {
    if (n <= 1)
      1
    else
      n * (n - 1)
  }

  // Scala高阶函数
  def layout[B](x: B) = {
    "[" + x.toString() + "]"
  };

  def apply(f: Int => String, v: Int) = f(v)


}
