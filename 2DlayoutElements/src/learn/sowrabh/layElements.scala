package learn.sowrabh

import Element.elem
class Demo {
  var d: Int = 0
  def getD = { d }
}
abstract class Element {
  def contents: Array[String]
  def height: Int = contents.length
  def width: Int = if (height == 0) 0 else contents(0).length
  def above(that: Element): Element = {
    val this1 = this widen that.width
    val that1 = that widen this.width
      elem(this1.contents ++ that1.contents)

  }
  def beside(that: Element): Element =
    {
      val this1 = this.heighten(that.height)
      val that1 = that.heighten(this.height)
      elem(for ((line1, line2) <- this1.contents zip that1.contents) yield line1 + line2)
    }
  override def toString = contents.mkString("\n")
  def widen(w: Int): Element =
    {
      if (w <= width) this
      else {
        val left = elem(' ', (w - width) / 2, height)
        val right = elem(' ', w - width - left.width, height)
        left beside this beside right
      } ensuring (w <= _.width)
    }
  def heighten(h: Int): Element =
    {
      if (h <= height) this
      else {
        val top = elem(' ', width, (h - height) / 2)
        val bot = elem(' ', width, h - height - top.height)
        top above this above bot
      }
    }

}
class UniformElement(ch: Char, override val width: Int, override val height: Int) extends Element {
  private val line = ch.toString * width
  val contents = new Array[String](height)
  for (i <- 0 until height) {
    contents(i) = line
  }

}
class ArrayElements(val contents: Array[String]) extends Element {}
class LineElement(s: String) extends Element {
  val contents = Array(s)
  override def height = 1
  override def width = s.length
}
object Element {
  def elem(contents: Array[String]): Element = new ArrayElements(contents)
  def elem(chr: Char, width: Int, height: Int): Element = new UniformElement(chr, width, height)
  def elem(line: String) = new LineElement(line)
}
object layElements {
  def main(args: Array[String]) {
    println(elem(Array("hello", "Welcome")) beside elem(Array("hi")))
  }

}