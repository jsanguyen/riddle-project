import java.io._

object main {

  def main(args:Array[String]): Unit ={

    //Generate a random alphanumeral value and use the .mkstring function to strigify it. 
    val content = scala.util.Random.alphanumeric.take(500).mkString
    println(s" File Contents ->>>>>> ${content}")

    intializeFile(content, "Wrote Initial File")

    //Replaces vowels (upper and lower with empty space and returns total count. Initial content file is immutable and never changes so doesnt affect initial file.
    val vowelCount = content.replaceAll("[^aeiouAEIOU]","").length();
    println(s"Vowel Count->>>>> ${vowelCount}")

    val countNoNumerals = content.filterNot(_.isDigit).mkString
    println(s"File without numerals ->>>>> ${countNoNumerals}")
        println(s"File without numerals length ->>>>> ${countNoNumerals.length}")

    //Calling it a second time will overwrite original content by default. 
    intializeFile(countNoNumerals, "Removed Numerals")

  }

  //Pass the string and Printwrite, function writes the string into the file. 
  def intializeFile(str: String, log: String) = {

    //intitialzise a new PrintWriter so we can write into a specified file. 
    val writer = new PrintWriter(new File("file.txt" ))

    writer.write(str)

    writer.close

    println("Completed Write to File")

}

}

