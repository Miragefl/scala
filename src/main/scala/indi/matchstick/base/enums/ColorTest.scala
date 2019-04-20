package indi.matchstick.base.enums

object ColorTest {
  def main(args: Array[String]): Unit = {
    println(Color.Green)
  }

  for (c <- Color.values) {
    println(s"${c.id}:$c")
  }
}
