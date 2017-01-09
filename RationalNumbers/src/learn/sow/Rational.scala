package learn.sow

class Rational(n: Int, d: Int)extends Ordered[Rational] {
  private var g = gcd(n.abs, d.abs);
  implicit def intToRational(i: Int) = new Rational(i)
  var nummer: Int = n / g
  var denomi: Int = d / g
  def this(n: Int) = this(n, 1)
  require(d != 0)
  override def toString = {var s="rational number object created "; if(denomi!=1)s+nummer + "/" + denomi else s+nummer}
  
  def compare(that:Rational):Int=(this.nummer*that.denomi)-(that.nummer*this.denomi)
    
  def +(that: Rational) = new Rational(that.nummer * denomi + that.denomi * nummer, denomi * that.denomi)
  def +(that: Int) = new Rational(that * denomi + nummer, denomi)

  def -(that: Rational) = new Rational(that.denomi * nummer - that.nummer * denomi, denomi * that.denomi)
  def -(that: Int) = new Rational(nummer - that * denomi, denomi)

  def *(that: Rational) = new Rational(nummer * that.nummer, denomi * that.denomi)
  def *(that: Int) = new Rational(that * this.nummer, denomi)

  def /(that: Rational) = new Rational(nummer * that.denomi, denomi * that.nummer)
  def /(that: Int) = new Rational(nummer * that, denomi)

  def lessThan(that: Rational) = nummer * that.denomi < denomi * that.nummer
  def max(that: Rational) = if (this.lessThan(that)) that else this

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

}
