package indi.matchstick.base.clazzextends

import indi.matchstick.base.traits.{ConsoleLogger, ConsoleLoggerT, Logger}

abstract class Employee extends Person with Logger {
  val salary = 0.0;
}

object Employee {
  val emp = new Employee with ConsoleLoggerT;

}
