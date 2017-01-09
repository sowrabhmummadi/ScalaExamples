package learn
import scala.collection.mutable.Map
class ChecksumAcc {
  private var sum = 0;
  def add(b: Byte) { sum += b }
  def checkSum(): Int = ~(sum & 0xFF) + 1
  
}
object ChecksumAcc {
  private var cache = Map[String, Int]()
  def calculate(s: String): Int =
    {
      if (cache.contains(s))
        cache(s);
      else {
        var acc=new ChecksumAcc
        for (c <- s) { acc.add(c.toByte) }
        val cs = acc.checkSum()
        cache = cache + (s -> cs)
        cs
      }
    }
}