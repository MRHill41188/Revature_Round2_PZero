

object seasonalMenu {

  def showMenu() {
    println(Console.BOLD+"All NFL records for single season")
    println("")
    connectionUtil.seasonalRecords()
    println("")
    gameMenu.pressAnyKeyToContinue()

  }



}
