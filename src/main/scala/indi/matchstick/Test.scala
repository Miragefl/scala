package indi.matchstick

import java.util.Properties

import org.apache.spark.sql.{SQLContext, SparkSession}
import org.apache.spark.{SparkConf, SparkContext}

object Test {

  def main(args: Array[String]): Unit = {
    //    val conf = new SparkConf().setMaster("spark://192.168.1.248:7077").setAppName("rdd");
    //    val sc = new SparkContext(conf);
    //    val sqlContext = new SQLContext(sc);
    //    val url = "jdbc:mysql://47.111.5.179:3306/cc_user_profit?user=root&password=ccxk!123";
    //    val prop = new Properties();
    //    val df = sqlContext.read.jdbc(url, "pay_order", prop);
    //    println("第一种方法输出：" + df.count());
    //    println("1.------------->" + df.count());
    //    println("1.------------->" + df.rdd.partitions.size);
    //    println("1")
    val spark = SparkSession.builder().appName("MysqlQueryDemo").master("spark://192.168.0.233:7077").getOrCreate()
    val jdbcDF = spark.read
      .format("jdbc")
      .option("url", "jdbc:mysql://47.111.5.179:3306/cc_user_profit?useUnicode=true&characterEncoding=utf-8")
      .option("dbtable", "pay_order")
      .option("user", "root")
      .option("password", "ccxk!123")
      .option("driver", "com.mysql.jdbc.Driver")
      .load()
    jdbcDF.filter("DATE_FORMAT(create_time,'%Y%m%d')=20190410").show();

  }

}
