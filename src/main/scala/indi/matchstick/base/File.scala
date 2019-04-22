package indi.matchstick.base

import scala.io.Source

object File {
	def main(args: Array[String]): Unit = {
		var source = Source.fromFile("C:\\Users\\viscum\\Desktop\\order.sql", "UTF-8");
//		println(source.mkString)
		var lineIterator = source.getLines()
//		while (lineIterator.hasNext) {
//			println(lineIterator.next);
//		}
		source = Source.fromURL("http://www.feainn.com")
		println(source.mkString)
		source.close();
	}
}
