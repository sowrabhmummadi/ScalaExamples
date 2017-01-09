package learn.sowrabh

class BSC {

}
object main {
  var i=5;
  var filesHere = (new java.io.File(".\\src\\learn\\sowrabh")).listFiles();
  def main(args: Array[String]) {
    // grep(".*gcd.*");
    for (file <- scalaFiles)
      println(file)
  }
  def getLines(f: java.io.File) = scala.io.Source.fromFile(f).getLines.toList
  def scalaFiles() = for {
    file <- filesHere
    if file.getName.endsWith(".scala")
  } yield i
  def grep(pattern: String) =
    for {
      file <- filesHere
      if file.getName().endsWith(".scala")
      line <- getLines(file)
      val trimmed = line.trim
      if (line.matches(pattern))
    } println(file + ":::" + trimmed)

}

//untill
//to
//filters(if conditions in for loops)