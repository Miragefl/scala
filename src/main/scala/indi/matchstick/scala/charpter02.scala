package indi.matchstick.scala

object charpter02 {
  def main(args: Array[String]): Unit = {
    //
    def signNum(param: Int): Int = {
      if (param > 0) 1
      else if (param < 0) -1
      else 0
    }

    println(signNum(10))

    //
    def checkEmptyBlockType(): Unit = {
      println({})
      println({}.getClass)
    }

    //
    def checkAssignLegal(): Unit = {
      var x: Unit = {};
      var y = 1;
      x = y = 1;
    }

    println("==============4===============")
    def scalaForeach: Unit ={
      (1 to 10).foreach((i:Int)=> {print(i+"\t")})
    }
    scalaForeach

    println("==============5===============")
    def countdown(n: Int): Unit = {
      for (x <- 0 to n) {
        print(x + "\t")
      }
    }

    countdown(4)


  }
}
