package indi.matchstick.scala

import scala.beans.BeanProperty

object Charpter05 {
  def q1(): Unit = {
    class Counter {
      private var value = 0;

      def increment(): Int = {
        if (value == Int.MaxValue) value
        else value + 1
      }

      def current() = {
        value
      }

      def set(v: Int) = {
        value = v
      }
    }
    var counter = new Counter();
    counter.set(Int.MaxValue)
    println(counter.increment())
  }

  /*
   * 5.2
   * 编写一个BankAccount类, 假如deposit和withdraw方法,和一个只读 的balance属性
   */
  def q2(): Unit = {
    class BankAccount {
      private var _balance: Double = 0

      def deposit(n: Double) = {
        _balance += n
      }

      def withdraw(n: Double) = {
        _balance -= n
      }

      def balance() = _balance
    }
    val b = new BankAccount
    b deposit 233
    b withdraw 32
    println(b.balance)
  }

  def q3(): Unit = {
    class Time(hrs: Int, min: Int) {
      val hour = hrs
      val minute = min

      def before(time: Time) = {
        if (hour > time.hour) true
        else if (hour < time.hour) false
        else if (minute < time.minute) false
        else true
      }
    }
    var t = new Time(1, 2)
    print(t.before(new Time(1, 2)))
  }

  def q4(): Unit = {
    class Time(hour: Int, min: Int) {
      val minute = hour * 60 + min

      def before(time: Time) = {
        if (minute > time.minute) true
        else false
      }
    }
    var t = new Time(1, 2)
    print(t.before(new Time(1, 1)))
  }

  def q5(): Unit = {

    class Student {
      @BeanProperty var name: String = _;
      @BeanProperty var id: Long = _;
    }
    var s = new Student
    s setId 1
    s setName "xiaoa"
    println(s.getId + ": " + s.getName)

  }

  def q6(): Unit = {
    class Person(var age: Int) {
      if (age < 0) {
        age = 0
      } else age
    }

    var p = new Person(100);
    println(p.age)
  }

  def q7(): Unit = {
    class Person(name: String) {
      val firstname = name.split(" ")(0)
      val lastname = name.split(" ")(1)
    }

    val p = new Person("lei feng")
    println(p.firstname + "\t" + p.lastname)

  }

  def q8(): Unit = {
    class Car(val producter: String, val model: String, val year: Int = -1, var carno: String = "") {


    }
  }


  def main(args: Array[String]): Unit = {
    q7()
  }
}
