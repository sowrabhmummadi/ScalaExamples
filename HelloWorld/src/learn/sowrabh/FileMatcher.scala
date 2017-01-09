package learn.sowrabh

import java.io.File
import java.io.PrintWriter

object FileMatcher {

  var fileHere = (new java.io.File("d:\\")).listFiles
  def FileMatching(matcher: (String) => Boolean) =
    {
      for (file <- fileHere if matcher(file.getName())) yield file
    }
  def FileMatchers(query: String) = FileMatching(_.endsWith(query))
  def FileContains(query: String) = FileMatching(_.contains(query))
  def FileRegx(query: String) = FileMatching(_.matches(query))

  def main(args: Array[String]) {
    val f = FileContains("jpg")
    f.foreach(println)

  }

}