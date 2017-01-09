package learn.sowrabh

object Multiplication {

  def main(args: Array[String]) {
    multiTable()
  }
  def makeRowSequence(row: Int) =
    {
      for (col <- 1 to 10) yield {
        val prod = (row * col).toString();
        val padding = " " * (4 - prod.length())
        padding + prod
      }
    }
  def makeRow(row: Int) = makeRowSequence(row).mkString
  def multiTable() =
    {
      val tableseq = for (i <- 1 to 10) yield makeRow(i)
      println(tableseq.mkString("\n"))
    }
}