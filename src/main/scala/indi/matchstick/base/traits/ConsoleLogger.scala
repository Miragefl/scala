package indi.matchstick.base.traits

class ConsoleLogger extends Logger with Cloneable with Serializable {
  override def log(msg: String): Unit = {
    println(msg);
  }
}
