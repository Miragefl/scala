package indi.matchstick.base

object functions {
  def main(args: Array[String]): Unit = {
    println(add("1.99","2.11","3.55","4.44"));
  }

  def add(addNums: String*): BigDecimal = {
    var sum = BigDecimal(0);
    for (addNum <- addNums) {
      println("head:"+addNums.head)
      println("tail:"+addNums.tail)
      sum += BigDecimal(addNum);
    }
    return sum;
  }
}
