package indi.matchstick.function

object function {
  def main(args: Array[String]): Unit = {
    delay(time())
  }

  def time(): Long = {
    println("获取时间，单位为纳秒")
    System.nanoTime
  }

  def delay(t: Long): Unit = {
    println("在 delayed 方法内")
    println("参数： " + t)
    t
  }


}
