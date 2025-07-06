import scala.io.StdIn.readLine
import java.io._

object DoubleSorter {

  def readFromKeyboard(): List[Double] = {
    println("Enter number of values:")
    val n = readLine().toInt
    println(s"Enter $n double values (space-separated or line by line):")

    var values = List[Double]()
    while (values.length < n) {
      val line = readLine()
      val nums = line.trim.split("\\s+").toList.map(_.toDouble)
      values = values ++ nums
    }

    values.take(n)
  }

  def readFromFile(filename: String): List[Double] = {
    val source = scala.io.Source.fromFile(filename)
    try {
      source.getLines().flatMap(_.trim.split("\\s+")).map(_.toDouble).toList
    } finally {
      source.close()
    }
  }

  def writeToFile(values: List[Double], filename: String): Unit = {
    val writer = new PrintWriter(new File(filename))
    try {
      for (v <- values) {
        writer.println(v)
      }
    } finally {
      writer.close()
    }
  }

  def printToScreen(values: List[Double]): Unit = {
    println("Sorted values:")
    for (v <- values) {
      print(v + " ")
    }
    println()
  }

  def main(args: Array[String]): Unit = {
    println("Input options:\n1. Keyboard\n2. File\nChoice:")
    val inputChoice = readLine().toInt

    val t1 = System.currentTimeMillis()
    val values = if (inputChoice == 1) {
      readFromKeyboard()
    } else if (inputChoice == 2) {
      println("Enter input filename:")
      val filename = readLine()
      readFromFile(filename)
    } else {
      println("Invalid input choice.")
      return
    }
    val t2 = System.currentTimeMillis()

    val t3 = System.currentTimeMillis()
    val sorted = values.sorted
    val t4 = System.currentTimeMillis()

    println("Output options:\n1. Screen\n2. File\nChoice:")
    val outputChoice = readLine().toInt

    val t5 = System.currentTimeMillis()
    if (outputChoice == 1) {
      printToScreen(sorted)
    } else if (outputChoice == 2) {
      println("Enter output filename:")
      val filename = readLine()
      writeToFile(sorted, filename)
    } else {
      println("Invalid output choice.")
      return
    }
    val t6 = System.currentTimeMillis()

    println("\n⏱️ Time (Scala):")
    println("Read:  " + (t2 - t1) + " ms")
    println("Sort:  " + (t4 - t3) + " ms")
    println("Write: " + (t6 - t5) + " ms")

    val log = new PrintWriter(new FileOutputStream("log_scala.txt", true))
    try {
      log.println("Scala Time Measurements:")
      log.println("Read:  " + (t2 - t1) + " ms")
      log.println("Sort:  " + (t4 - t3) + " ms")
      log.println("Write: " + (t6 - t5) + " ms")
      log.println("--------------------------")
    } finally {
      log.close()
    }
  }
}
