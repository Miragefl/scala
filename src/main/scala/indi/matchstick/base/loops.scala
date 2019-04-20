package indi.matchstick.base

import scala.collection.mutable.ArrayBuffer

object loops {
  def main(args: Array[String]): Unit = {
    forloop(10)
    forloopdesc(10);
    var a = 0 to 10;
    println(a.filter(_ % 3 == 0));
  }

  def forloop(loopNum: Int) {
    var x = for (i <- 0 to loopNum) yield {
      i * 10;
    };
    print(x + "\t")
    println;
    return x
  }

  /**
    * 倒序遍历
    *
    * @param loopNum
    */
  def forloopdesc(loopNum: Int) {
    var y = for (i <- (0 to loopNum).reverse) yield {
      i * 10;
    };
    print(y + "\t")
    println;
    return y
  }

}
