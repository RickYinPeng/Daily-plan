package com.rickyin.bigdata.scala.chapter060708

/**
 * TODO
 *    1.前面当一个源码文件中出现了伴生对象和类的时候，源码文件的图标就会变为红色的那个比如: Scala07_Method1
 *    2.现在我们的图标变为了上面蓝色,下面黄色,这是为什么呢? 只有我们的伴生对象和伴生类同名的时候才会变成这样
 *    3.根据之前我们学习的伴生对象中的属性我们可以直接访问(只要你不加private),就像是Java中的 public static修饰的属性一样,所以伴生对象我们可以
 *      理解为存放静态属性的地方,而伴生类就是存放成员变量和普通方法的地方
 *    4.我们利用反编译工具将下面代码编译成Java代码,虽然在Scala中分成了两个东西,但在Java代码中却是在一个 Student 类中,伴生对象声明的都会加上static
 *      修饰
 *    5.所以伴生对象可以访问伴生类的私有属性,你想啊,他们转换成Java代码后都在一个类中肯定可以啊
 *    6.伴生对象的另外一个作用是创建伴生类对象,不过需要提供特殊的方法( apply ),实现相应的功能
 *    7.Scala自动识别apply方法,用于创建伴生类对象
 */

//伴生类(成员)
class Student {
  private val sname = "rick"
  var pass = "123"
}
//伴生对象(静态)
//伴生对象可以访问伴生类的私有属性
//创建伴生类对象
object Student {
  var ss = "asd"
  def main(args: Array[String]): Unit = {

  }
  def apply(s:String): Student = new Student()
  def test(): Unit ={

  }
}