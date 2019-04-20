package indi.matchstick.base

import scala.collection.mutable.ArrayBuffer;
import collection.Searching._;

object arrays {

  def main(args: Array[String]): Unit = {
    var a = for (i <- 1 to 10) yield i;
    var array = Array(0, 1, 2, 3, 4, 5, 6, 6, 9, 9, 1);
    println(array.sortWith(_ > _).toBuffer);

    val triangle = new Array[Array[Int]](10);
    for (i <- triangle.indices) {
      triangle(i) = new Array[Int](i + 1);
      println(triangle(i).toBuffer)
    }

    var searchRes = array.search(8)
    println(searchRes)

    println(array.toSet);


  }

  def loopif(): Unit = {
    var a = ArrayBuffer(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    var filterRes = for (elem <- a if elem % 2 == 0) yield elem;
    a.trimEnd(a.length - filterRes.length)
  }
}
