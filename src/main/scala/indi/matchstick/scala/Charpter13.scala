package indi.matchstick.scala

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object Charpter13 {

  def q1(str: String) = {
    var zip = str.zip(0 until str.length)
    println(zip)

    zip.foldLeft(scala.collection.mutable.Map[Char, List[Int]]())((map, kv) => {
      map += (kv._1 -> (map.getOrElse(kv._1, List[Int]()) ++ List[Int](kv._2)))
    })
  }

  def q2(str: String) = {
    var zip = str.zip(0 until str.length)
    println(zip)

    zip.foldLeft(Map[Char, List[Int]]())((map, kv) => {
      map ++ Map(kv._1 -> (map.getOrElse(kv._1, List[Int]()) ++ List[Int](kv._2)))
    })
  }

  def main(args: Array[String]): Unit = {
    val x = 0

    def f(y: Int) = y + 1

    val result = {
      val x = f(3)
      x * x
    } + x

    println(result)
  }

}
