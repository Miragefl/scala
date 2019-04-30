package indi.matchstick.base

import scala.collection.mutable.ArrayBuffer

object Lists {
  def main(args: Array[String]): Unit = {
    var list = List(2, 4)
    println(list.head)
    println(list.tail)
    println(list.tail.head)


    println(9 :: List(2, 4))

    println(9 :: 4 :: 2 :: Nil)

    println(9 :: (4 :: (2 :: Nil)))

    var numbers = Vector(1, 2, 3)

    var n1 = numbers :+ 4

    var n2 = 4 +: numbers
    println(n1.toBuffer)
    println(n2.toBuffer)

  }

}
