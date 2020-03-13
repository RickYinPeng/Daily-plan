package com.rickyin.bigdata.scala.chapter09

/**
 * TODO 隐式转换
 *    1.不想每回都传这个参数,我就只想写 test,我们可以使用默认值的方式,但是使用了默认值之后我们就不能再去改变它的值了,如果我们的业务变化,值也需要变化
 *    2.我们可以使用隐式参数: implicit
 *    3.参数前面加了 implicit 之后,如果我们有隐式值的话我们就传进来,如果没有就使用默认的
 *    4.方法调用时,如果使用小括号会导致隐式值无法传递 如: test() 还会使用参数的默认值,而不是隐式值
 *    5.方法调用时,不使用小括号可以传递隐式值 如: test
 *    6.如果有两个隐式值,那么传递的时候就不知道传递哪个,会报错
 *    7.如果隐式值的数据类型和隐式参数的数据类型不匹配的话,会使用默认值,如果没有默认值会报错,隐式转换其实就是转换的是数据类型
 */
object Scala03_Transform2 {
  def main(args: Array[String]): Unit = {

    //隐式值
    //implicit var username:String = "wangwu"
    implicit var age: Int = 10

    //隐式参数
    def test(implicit name: String = "rickyin"): Unit = {
      println("Hello " + name)
    }

    def test1(implicit name: String): Unit = {
      println("Hello " + name)
    }
    //不想每回都传这个参数,我就只想写 test,我们可以使用默认值的方式,但是使用了默认值之后我们就不能再去改变它的值了,如果我们的业务变化,值也需要变化
    //我们可以使用隐式参数: implicit
    //参数前面加了 implicit 之后,如果我们有隐式值的话我们就传进来,如果没有就使用默认的
    test("hcy")
    test() // 方法调用时,如果使用小括号会导致隐式值无法传递
    test   // 方法调用时,不使用小括号可以传递隐式值
    //test1 报错,因为没有默认值
  }
}