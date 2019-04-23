package indi.matchstick.scala

import scala.reflect.internal.util.StringOps

object charpter02 {
	/**
	  * 2.1
	  * 一个数字如果为正数，则它的signum为1;
	  * 如果是负数,则signum为-1;
	  * 如果为0,则signum为0.编写一个函数来计算这个值
	  **/
	def signNum(param: Int): Int = {
		if (param > 0) 1
		else if (param < 0) -1
		else 0
	}

	println(signNum(10))

	/**
	  * 2.2
	  * 一个空的块表达式{}的值是什么？类型是什么？
	  **/
	def checkEmptyBlockType(): Unit = {
		println({})
		println({}.getClass)
	}

	/**
	  * 2.3
	  * 指出在Scala中何种情况下赋值语句x=y=1是合法的。
	  * (提示：给x找个合适的类型定义)
	  */
	def checkAssignLegal(): Unit = {
		var x: Unit = {};
		var y = 1;
		x = y = 1;
	}

	println("==============4===============")

	/*
	 * 2.4
	 * 针对下列Java循环编写一个Scala版本:
	 * for(int i=10;i>=0;i–)System.out.println(i);
	 */
	def scalaForeach: Unit = {
		//			(1 to 10).reverse.foreach((i: Int) => {
		//				print(i + "\t")
		//			})
		//			1.to(10).reverse.foreach(i => print(i + "\t"))
		//			1.to(10).reverse.foreach(print _)
		(1 to 10 reverse) foreach print;
	}

	scalaForeach

	println("==============5===============")

	/*
	  * 2.5
	  * 编写一个过程countdown(n:Int)，打印从n到0的数字
	  */
	def countdown(n: Int): Unit = {
		n match {
			case n if n >= 0 => {
				(n to 0) foreach (i => println(i + "\t"));
			}
			case n if n < 0 => {
				(0 to n) foreach (i => print(i + "\\t"));
			}
		}
	}

	countdown(4)

	/*
	   * 2.6
	   * 编写一个for循环,计算字符串中所有字母的Unicode代码的乘积。
	   * 举例来说，"Hello"中所有字符串的乘积为9415087488L
	   */
	def unicode(str: String): Long = {
		var res: Long = 1L;
		str foreach {
			res *= _.toLong
		}
		res
	}

	print(unicode("Hello"))

	/**
	  * 2.7
	  * 同样是解决前一个练习的问题，但这次不使用循环。
	  * （提示：在Scaladoc中查看StringOps）
	  */
	def computeCharsUnicodeProduct(str: String): Unit = {
		str.foldLeft(1.toLong) {
			_ * _
		}
	}

	/**
	  * 2.8
	  * 编写一个函数product(s:String)，
	  * 计算前面练习中提到的乘积
	  * 2.9
	  * 把前一个练习中的函数改成递归函数
	  */
	def product(s: String): Long = {
		if (s.length() == 1) s(0) toLong
		else {
			var a = s.tail;
			print(a + "\t");
			s(0).toLong * product(a)
		}
	}

	/**
	  * 2.10
	  * 编写函数计算xn,其中n是整数，使用如下的递归定义:
	  */
	def question10(x: Int, n: Int) {

	}

	def main(args: Array[String]): Unit = {
	}
}
