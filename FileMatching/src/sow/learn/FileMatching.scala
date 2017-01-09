package sow.learn

object FileMatching {
  var Fileshere = (new java.io.File(".\\src\\sow\\learn")).listFiles()
  def FilematchingHelper(matcher: (String) => Boolean): Array[java.io.File] = {
    for (file <- Fileshere; if (matcher(file.getName()))) yield file
  }
  def FilesEnding(query: String): Array[java.io.File] = FilematchingHelper(_.endsWith(query));
  def FilesContains(query: String): Array[java.io.File] = FilematchingHelper(_.contains(query));
  def FilesRegx(query: String): Array[java.io.File] = FilematchingHelper(_.matches(query));
  def main(args: Array[String]): Unit = {
    var f = FilesEnding("scala")
    println(f.length);
    f.foreach(println);
  }
}