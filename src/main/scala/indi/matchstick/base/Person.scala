package indi.matchstick.base

class Person(param1: Int, param2: String) {

  var age: Int = param1;
  var name: String = param2;

  def init(a: Int, b: Int): Unit = {
    println("age:" + a + " name:" + b)
  }

}
