package learn.sow

object execute {
  def main(args: Array[String]): Unit = {
    implicit def intToRational(x:Int)=new Rational(x)
    var r = new Rational(56);
    var r2 = new Rational(79, 1);
    println(2+ r)
  }
}