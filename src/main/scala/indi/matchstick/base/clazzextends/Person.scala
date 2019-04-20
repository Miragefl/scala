package indi.matchstick.base.clazzextends

class Person {
  var name:String = "";

  override def toString = s"${getClass.getName}[name=${name}]"
}
