package learn.sowrabh
import scala.collection.mutable.ArrayBuffer

abstract class IntQue
{
   def get():Int
   def put(x:Int)
}
class BasicIntQue extends IntQue 
{
   private val buf = new ArrayBuffer[Int]
   def get():Int=buf.remove(0)
   def put(x:Int)=buf+=x
   def show()=buf.foreach(println)
}

trait Doubling extends IntQue
{
  abstract override def put(x:Int)={super.put(2*x)}
}
trait Filtering extends IntQue
{
  abstract override def put(x:Int)={if(x>0) super.put(x)}
}
trait Incrementing extends IntQue
{
  abstract override def put(x:Int)={super.put(x+1)}
}
class Que extends BasicIntQue with Doubling with Incrementing with Filtering
object Queues{

  def main(args: Array[String])
  {
    val queue=new Que
    
    queue.put(10)
    queue.put(20)
    queue.put(30)
    queue.put(-40)
    queue.put(-10)
    queue.put(-30)
    queue.show
       
  }

}