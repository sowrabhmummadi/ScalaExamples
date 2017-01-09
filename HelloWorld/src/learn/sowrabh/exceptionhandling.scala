package learn.sowrabh

import java.io.File
import java.io.FileNotFoundException
import java.io.IOException
object EcepHan {

  def main(args: Array[String]) {
   println(matchInScala(true));
  }
  def exception() =
    { //try catch throw  finally
      var f = try {
        new File(".\\src\\learn")
      } catch {
        case e: FileNotFoundException =>
          println("file not found")
        case e: IOException =>
          println("IOEXCeption")
      }
    }
  def matchInScala(s: Boolean) =
    {
      s match {
        case true => "Salt"
        case false => "Pepper"        
        
      }
    }
}