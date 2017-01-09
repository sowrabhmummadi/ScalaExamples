package learn
import ChecksumAcc.calculate
object Mainexe {
  def main(args: Array[String]): Unit = {
    args.foreach(arg => println(arg + ":" + calculate(arg)));
  }
}