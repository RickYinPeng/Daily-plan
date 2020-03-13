package com.rickyin.bigdata.scala.chapter10

import scala.io.Source

/**
 * TODO 从文件中获取数据,统计数量
 */
object Scala10_WordCountFile {
  def main(args: Array[String]): Unit = {

    Source.fromFile("in/word.txt").getLines().toList

  }
}
