package indi.matchstick.scala

object Charpter12 {

  def q1(fun: (Int) => Int, low: Int, high: Int) = {
    for (i <- low to high) yield (i, fun(i))
  }

  def q2(arr: Array[Int]) = {
    arr.reduceLeft((x, y) => {
      if (x > y) x else y
    })
  }

  def q3(low: Int, high: Int) = {
    low to high reduceLeft ((a, b) => {
      println(a + "====" + b);
      a * b;
    })
  }

  def q4(low: Int, high: Int) = {
    (low to high).foldLeft(1)((a, b) => {
      a * b
    })
  }

  def q5(fun: (Int) => Int, inputs: Seq[Int]) = {
    inputs.reduceLeft((a, b) => {
      if (fun(a) < fun(b)) b else a
    })
  }

  def q7(fun: (Int, Int) => Int)(pair: (Int, Int)) = {
    fun(pair._1, pair._2)
  }

  def q8(strArr: Array[String], intArr: Array[Int]): Boolean = {
    strArr.corresponds(intArr)(_.length == _)
  }

  def main(args: Array[String]): Unit = {
    var array = Array("Hello", "World")
    var array2 = Array(5, 5)
    println(array.corresponds(array2)(_.length == _))

  }

}
