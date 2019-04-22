package indi.matchstick

object Test2 {

  def main(args: Array[String]): Unit = {
    //创建一个List
    val list0 = List(1, 7, 9, 8, 0, 3, 5, 4, 6, 2)
    //将list0中每个元素乘以10后生成一个新的集合
    val list1 = list0.map(_ * 10);
    println(list1)
    //将list0中的偶数取出来生成一个新的集合
    val list2 = list0.filter(_ % 2 == 0);
    println(list2)
    //将list0排序后生成一个新的集合
    val list3 = list0.sortWith(_ < _);
    println(list3);
    //反转顺序
    val list4 = list3.reverse;
    println(list4)
    //将list0中的元素4个一组,类型为Iterator[List[Int]]
    val It1 = list0.grouped(4);
    println(It1)
    //将Iterator转换成List
    println(It1.toList)
    //将多个list压扁成一个List


    val lines = List("hello tom hello jerry", "hello jerry", "hello kitty")
    //先按空格切分，在压平


    //并行计算求和

    //化简：reduce

    //将非特定顺序的二元操作应用到所有元素

    //安装特点的顺序


    //折叠：有初始值（无特定顺序）

    //折叠：有初始值（有特定顺序）


    //聚合
    val arr = List(List(1, 2, 3), List(3, 4, 5), List(2), List(0))


    val l1 = List(5, 6, 4, 7)
    val l2 = List(1, 2, 3, 4)
    //求并集

    //求交集

    //求差集

    //		println(r3)

  }


}
