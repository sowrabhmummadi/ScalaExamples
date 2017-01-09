package learn.sowrabh

import java.io.FileNotFoundException
import java.io.IOException

object LongLines {
  def processFile(file: String, width: Int) =
    {
      def processLine(line: String) =
        {
          if (line.length > width)
            println(file + ":" + line.trim);
        }
      val source = scala.io.Source.fromFile(file)
      for (line <- source.getLines)
        processLine(line)
    }

}
object FileLines {

  def main(args: Array[String]) {
    try {
      LongLines.processFile("test.txt", 20)
    } catch {
      case e: FileNotFoundException =>
        println("file not found")
      case e: IOException =>
        println("problem with io")
    }
    finally
    {
      println("Done")
    }
  }

}