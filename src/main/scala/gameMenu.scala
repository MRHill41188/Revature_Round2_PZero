import scala.io.StdIn.readLine

object gameMenu {

  def showMenu(){

    println(Console.BOLD + "All NFL records for single games")
    println("")
    connectionUtil.gameRecords()
    println("")
    pressAnyKeyToContinue()

  }
  def pressAnyKeyToContinue(){

    println(Console.BOLD + "Press any enter key to continue")
    readLine()
  }

}
