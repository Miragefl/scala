package indi.matchstick.scala

import java.io.File
import java.util
import java.util.{Scanner, StringTokenizer}

import scala.collection.SortedMap

object Charpter04 {


  def q1(map: Map[String, Double]): Map[String, Double] = {
    for ((k, v) <- map) yield (k, 0.9 * v)
  }

  def q2(fileName: String): scala.collection.mutable.Map[String, Int] = {
    var res = scala.collection.mutable.Map[String, Int]();
    var in = new Scanner(new File(fileName))
    while (in.hasNext()) {
      var s = new StringTokenizer(in.next())
      while (s.hasMoreTokens) {
        var key = s.nextToken();
        res(key) = res.getOrElse(key, 0) + 1
      }
    }
    res
  }

  def q3(fileName: String): Map[String, Int] = {
    var res = Map[String, Int]();
    var in = new Scanner(new File(fileName))
    while (in.hasNext()) {
      var s = new StringTokenizer(in.next())
      while (s.hasMoreTokens) {
        var key = s.nextToken();
        res += (key -> (res.getOrElse(key, 0) + 1))
      }
    }
    res
  }

  def q4(filename: String): SortedMap[String, Int] = {
    var res = SortedMap[String, Int]();
    val in = new Scanner(new File(filename))
    while (in.hasNext()) {
      val s = new StringTokenizer(in.next())
      while (s.hasMoreTokens) {
        val key = s.nextToken();
        res += (key -> (res.getOrElse(key, 0) + 1))
      }
    }
    res
  }

  import scala.collection.JavaConversions.mapAsScalaMap

  def q5(filename: String): scala.collection.mutable.Map[String, Int] = {
    //    import java.util.TreeMap

    var res: scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]
    val in = new Scanner(new File(filename))
    while (in.hasNext()) {
      val st = new StringTokenizer(in.next())
      while (st.hasMoreTokens()) {
        val key = st.nextToken()
        res(key) = res.getOrElse(key, 0) + 1
      }
    }
    res
  }

  /**
    * 4.6
    * 定义一个链式哈希映射, 将"Monday"映射到java.util.Calendar.MONDAY,
    * 以此类推假如其他日期, 展示元素是以插入的顺序被访问的
    */
  def q6(): Map[String, Int] = {
    var map = Map[String, Int]()
    val list = classOf[java.util.Calendar].getFields
    list.foreach {
      x => map += (x.getName -> x.getInt(null))
    }
    map
  }

  import scala.collection.JavaConversions.propertiesAsScalaMap;

  def q7(): Unit = {
    var props: scala.collection.Map[String, String] = System.getProperties
    //    for ((k, v) <- props) {
    //      print(k+"|"+v)
    //      println()
    //    }
    val manlen = props.map(f => f._1.length).max
    props foreach { x => println(x._1 + " " * (manlen - x._1.length + 1) + "| " + x._2) }
  }

  def q8(arr: Array[Int]): Tuple2[Int, Int] = {
    (arr.min, arr.max)
  }

  def q9(values: Array[Int], v: Int): Tuple3[Int, Int, Int] = {
    (values.count(_ < v), values.count(_ == v), values.count(_ > v))
  }

  def q10(): Unit = {
    println("Hello".zip("worl"))
  }

  def main(args: Array[String]): Unit = {
    var arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9);
    q10()
  }

}
