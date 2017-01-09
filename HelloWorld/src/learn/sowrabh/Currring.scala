package learn.sowrabh

import java.io.File
import java.io.PrintWriter

object Currring {
  def withPrintWriter(file: File)(op: PrintWriter => Unit) {
    val writer = new PrintWriter(file);
    try { op(writer) }
    finally {
      println("done")
      writer.close
    }
  }
  def main(args: Array[String]): Unit = {

    val file = new File("test.txt")
    withPrintWriter(file) {
      writer => writer.println(new java.util.Date)
    }
  }

}