package learn.sowrabh
import scala.collection.mutable.Map
class checkSumAccumulator {
  private var sum = 0;
  def add(b: Byte) { sum += b }
  def checksum(): Int = ~(sum & 0xFF) + 1
}
object checkSumAccumulator {
  private val cache = Map[String, Int]()
  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s);
    else {
      val acc = new checkSumAccumulator
      for (c <- s) {
        println("c is:: " + c + "c in byte is::" + c.toByte)
        acc.add(c.toByte)
      }
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
}


  

class Cal(val value: Int){
  def ++(obj: Cal)=new Cal(value+obj.value);
  def **(obj: Cal)=new Cal(value*obj.value);
}
object Hello {
  def main(args: Array[String]) {
    val ar=new Array[String](1);
    ar(0)="hi";
    println(ar(1));
    //args.foreach(arg => println(arg));
   // checkSumAccumulator.calculate("Sowrabh")
  }
}