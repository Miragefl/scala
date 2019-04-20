package indi.matchstick.base.clazz

object Onetwork {
  def main(args: Array[String]): Unit = {
    val chatter = new Network;
    val myFace = new Network;

    val fred = chatter.join("fred");
    val wilma = chatter.join("wilma");

    println(Array(100).toBuffer)
    println(new Array(100).toBuffer)

  }
}
