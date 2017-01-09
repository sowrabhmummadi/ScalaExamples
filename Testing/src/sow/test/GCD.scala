package sow.test

object GCD extends App {
  var s: Int = 0;

  def gcd(a: Int, b: Int): Int =
    {
      if (b == 0)
        a
      else
        gcd(b, a % b)

    }
var d:Int=(2>3)?2:3
}