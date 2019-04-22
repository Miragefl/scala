package indi.matchstick.base.matchs

import java.io.File._

object matchTest {
  def main(args: Array[String]): Unit = {
    var sign = "";
    var ch: Char = '0';
    ch match {
      case '+' => sign = "1";
      case '-' => sign = "0";
      case _ => sign = "-1";
    }
    println(sign)

    sign = ch match {
      case _ if Character.isDigit(ch) => "2"
      case '+' => "1"
      case '-' => "0"
      case _ => "-1"
    }
    println(sign)

    val str = "pathSeparator";
    var str2 = 0
    str2 = str match {
      case `pathSeparator` => 1
      case pathSeparator => 2
    }
    println(str2)



  }
}
