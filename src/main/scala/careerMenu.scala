

object careerMenu {

    def showMenu() {
      println(Console.BOLD+"All NFL records for player career")
      print("")
      connectionUtil.careerRecords()
      print("")
      gameMenu.pressAnyKeyToContinue()
    }
    1
  }
