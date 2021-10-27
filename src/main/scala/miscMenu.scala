
object miscMenu {

  def showMenu() {
    println(Console.BOLD+"All NFL Misc records")
    println("")
    connectionUtil.miscRecords()
    println("")
   gameMenu.pressAnyKeyToContinue()

  }


}
