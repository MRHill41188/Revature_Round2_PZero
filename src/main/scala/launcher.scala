import scala.io.StdIn.readInt
import scala.sys._
import scala.util.control._


object launcher extends App {


 // def main(args: Array[String]): Unit = {

    //mainMenu()

  //}

  def mainMenu():Int = {

    println("Please Enter Your Selection")
    println(Console.BOLD+"1. Game records")
    println(Console.BOLD+"2. Seasonal records")
    println(Console.BOLD+"3. Career records")
    println(Console.BOLD+"4. Misc records")
    println(Console.BOLD+"0. Close program")
    readInt()
  }

  def selectionLoop(): Unit = {

    var selection = 0

    do {
      selection = mainMenu()
      //println(selection+  "before swtich menu")
      switchMenu(selection)
      //println(selection + "after switch")
    }while(selection != 0)

  }


  def switchMenu(selection: Int): Unit = {
      selection match{
                  case 1 => {gameMenu.showMenu()}
                  case 2 => {seasonalMenu.showMenu()}
                  case 3 => {careerMenu.showMenu()}
                  case 4 => {miscMenu.showMenu()}
                  case _ => {print(Console.BOLD+"Exiting program")}
      }

  }
  selectionLoop()
}

