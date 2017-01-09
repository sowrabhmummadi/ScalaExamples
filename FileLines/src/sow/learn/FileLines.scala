package sow.learn
import scala.io.Source;
class DisData {

  def processFile(fileName: String, width: Int) {
    def processLines(line:String)
    {
      if(line.length>width)
      println(fileName+":"+line)
    }
    val source = Source.fromFile(fileName);
    for (line <- source.getLines) {
      processLines(line)
    }
  }
}

object FileLines {

  def main(args: Array[String]): Unit = {
    val d = new DisData
    d.processFile("C:\\My Work\\File.txt", 9)
  }

}