import model._
object MineBlast extends App {
  private val game = new GameBoard(10)
  game.gameBoard.foreach{ row =>
    Console.out.print("| ")
    row.foreach(c => Console.out.print(s"$c | "))
    Console.out.println("")
  }
  Console.out.println("Under Construction !!!")
}
