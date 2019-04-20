package indi.matchstick.base.clazz

import scala.collection.mutable.ArrayBuffer

class Network {

  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member];
  }

  private val members = new ArrayBuffer[Member];

  def join(name: String): Unit = {
    val m = new Member(name);
    members += m;
    m;
  }

}
