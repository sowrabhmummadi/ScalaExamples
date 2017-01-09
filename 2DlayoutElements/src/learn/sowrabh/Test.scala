package learn.sowrabh

object Test {

  def main(args: Array[String]): Unit = {
    val a = new Frog
    val b:Philosophical=new Frog
    a.philospize
    b.philospize
  }
}
class Frog extends Philosophical with demo {
  val r = 0;
  override def toString = "green"
  override def philospize()=println("overridden");
}
trait Philosophical {
  def philospize() = println("i consume memory,therefore i am!");
}
trait demo{
  def dem()=println("demo");
}

