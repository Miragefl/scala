package indi.matchstick.scala

import scala.collection.mutable.ArrayBuffer

object Charpter03 {
  def q1(n: Int) = {
    for (i <- 0 to n) yield new util.Random().nextInt(n)
  }

  def q2(arr: Array[Int]): Array[Int] = {
    val l = arr.length;
    for (i <- 0 until (if (l % 2 == 0) l else l - 1) by 2) {
      var tmp = arr(i);
      arr(i) = arr(i + 1)
      arr(i + 1) = tmp
    }
    arr
  }

  def q3(arr: Array[Int]) {
    for (i <- 0 until arr.length) yield {
      if (i % 2 == 0) {
        if (i + 1 < arr.length) arr(i + 1) else arr(i)
      }
      else {
        arr(i - 1)
      }
    }
  }

  /**
    * 3.4
    * 给定一个整数数组，产出一个新的数组，包含元数组中的所有正值，
    * 以原有顺序排列，之后的元素是所有零或负值，以原有顺序排列。
    */
  def q4(arr: Array[Int]): Array[Int] = {
    arr.filter(_ > 0).sortWith(_ > _) ++ arr.filter(_ < 0)
  }

  /**
    * 3.5
    * 计算Array[Double]的平均值
    */
  def q5(arr: Array[Double]): Double = {
    arr.sum / arr.length
  }

  /**
    * 3.6
    * 如何重新组织Array[Int]的元素将他们反序排列？对于ArrayBuffer[Int]如何处理
    */
  def q61(arr: Array[Int]): Array[Int] = {
    arr.reverse
  }

  def q62(arr: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    arr.reverse
  }

  /**
    * 3.7
    * 编写一段代码，产出数组中的所有值，去掉重复项
    */
  def q7(arr: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    //    arr.toSet
    arr distinct
  }

  /**
    * 3.8
    * 收集负数元素的下标、反序，去掉最后一个下标
    * 然后对每个下标调用a.remove(i)。
    */
  def q8(arr: ArrayBuffer[Int]) = {
    var indexes = ArrayBuffer[Int]();
    for (i <- 0 until arr.length if (arr(i) < 0)) indexes.insert(0, i)
    print(indexes)
    indexes.init foreach {
      arr remove _
    }
    arr
  }

  /**
    * 3.9创建一个由java.util.TimeZone,getAvailableIDs返回的时区集合，判断条件是他们在美洲
    *
    */
  def q9(): Unit = {
    var a = java.util.TimeZone.getAvailableIDs().filter {
      _ startsWith ("America")
    }
    print(a.toBuffer)
  }

  /**
    * 3.10
    * 引入java.awt.datatransfer._并构建一个类型为SystemFlavorMap类型的对象，
    * 然后以DataFlavor.imageFlavor为参数调用getNativesForFlavor方法，以Scala缓冲保存返回值。
    */
  import java.awt.datatransfer._
  def q10(): Unit ={
//    var a = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
//    a.getNativesForFlavor(DataFlavor.imageFlavor)
//    print(a)
  }

  def main(args: Array[String]): Unit = {
    q10()
  }
}
