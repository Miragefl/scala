package indi.matchstick.function

import scala.math._

object function {
	def main(args: Array[String]): Unit = {
		//		delay(time())

		val num = 3.14;
		val fun = ceil _;

		println(fun(num))
		Array(3.14, 1.42, 2.0).map(fun);
		var f = (_: String).charAt(_: Int);
		//		var f: (String, Int, Int) => Range = _.charAt(_).to(_)
		var f1 = (x: Double) => 3 * x;

		println(Array(3.14, 1.42, 2.0).map(f2).toBuffer);

		var mul = (x: Int, y: Int) => x * y;
		// 柯里化函数
		var mulOneAtTimeFun = mulOneAtTime(_: Int)(_: Int);
		println(mulOneAtTime(1)(2));
		println(mulOneAtTimeFun(2, 2));

		var a = Array(2, 3)
		var b = Array(3, 4)
		println(a.corresponds(b)(_ == _))
	}

	def mulOneAtTime(x: Int)(y: Int) = x * y;

	def time(): Long = {
		println("获取时间，单位为纳秒")
		System.nanoTime
	}

	def delay(t: Long): Unit = {
		println("在 delayed 方法内")
		println("参数： " + t)
		t
	}

	def f2(x: Double): Double = {
		3 * x;
	}


}
