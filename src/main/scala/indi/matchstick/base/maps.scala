package indi.matchstick.base


import scala.collection.{SortedMap, mutable}

object maps {
  def main(args: Array[String]): Unit = {
    println("===============可变映射==============")
    // 无序映射
    var score = collection.mutable.Map("a" -> 1, "b" -> 2, "c" -> 3, "a" -> 4);
    println(score)
    score("a") = 2
    var score1 = score += ("d" -> 4);
    score1("a") = 3;
    println(score)
    println(score.get("a").get)
    println("===============可变映射==============")
    println("===============不可变映射==============")
    // 不可变映射 值不能改变
    val scoreStatic = Map("a" -> 1, "b" -> 2, "c" -> 3);
    // scoreStatic("a") = 2; 报错
    var score2 = scoreStatic + ("e" -> 5);
    // score1("a") = 2; 报错
    score2 += ("f" -> 6);
    println(score2);
    // 遍历
    for ((k, v) <- score2) {
      println("key:" + k + "\tvalue:" + v);
    }
    println("===============不可变映射==============")
    println("===============有序映射==============")
    var sortedMap = SortedMap("e" -> 2, "a" -> 4)
    println(sortedMap)
    println("===============有序映射==============")

    var linkedMap = mutable.LinkedHashMap("z" -> 2)

  }
}
