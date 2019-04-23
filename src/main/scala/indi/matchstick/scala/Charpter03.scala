package indi.matchstick.scala

object Charpter03 {
	def q1(n: Int) = {
		for (i <- 0 to n) yield new util.Random().nextInt(n)
	}

	def q2(arr: Array[Int]): Array[Int] = {
		val l = arr.length;
		for (i <- 0 until (if (l % 2 == 0) l else l - 1) by 2) {
			var tmp = arr(i);
			arr(i) = arr(i + 1)
			arr(i + 1) = tmp
		}
		arr
	}

	def q3(arr: Array[Int]) {
		for (i <- 0 until arr.length) yield {
			if (i % 2 == 0) {
				if (i + 1 < arr.length) arr(i + 1) else arr(i)
			}
			else {
				arr(i - 1)
			}
		}
	}

	def main(args: Array[String]): Unit = {
		var arr = Array(1, 2, 4, 5, 7);
		arr distinct
		var a = for (i <- 0 until arr.length) yield {
			if (i % 2 == 0) {
				if (i + 1 < arr.length) arr(i + 1) else arr(i)
			}
			else {
				arr(i - 1)
			}
		}
		print("======" + a)
	}
}
