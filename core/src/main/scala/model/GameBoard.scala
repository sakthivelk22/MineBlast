package model

import scala.annotation.tailrec

class GameBoard(size: Int){
    private val boardSize = size-1

    val gameBoard: Board = if(boardSize>=0) createBoard(size = boardSize, Array.empty) else Array.empty
    @tailrec
    private def createBoard(size: Int, board: Board): Board =
        if (size>0) createBoard(size-1, board:+addRowForCell(boardSize, Array.empty)) else board:+addRowForCell(boardSize, Array.empty)

    @tailrec
    private def addRowForCell(size: Int, row: Row): Row =
        if (size>0) addRowForCell(size-1, row:+Cell()) else row:+Cell()

}
