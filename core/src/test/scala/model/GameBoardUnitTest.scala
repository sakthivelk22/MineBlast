package model

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class GameBoardUnitTest extends AnyFunSuite with Matchers{

    test("should return a empty board when initialised with invalid size"){
        val zeroGameBoard = new GameBoard(0)
        zeroGameBoard.gameBoard.isEmpty shouldBe true
        val negativeGameBoard = new GameBoard(-1)
        negativeGameBoard.gameBoard.isEmpty shouldBe true
    }

    test("should return a valid board of expected size in") {
        val gameBoard = new GameBoard(1)
        gameBoard.gameBoard.length shouldBe 1
        gameBoard.gameBoard(0).length shouldBe 1
        gameBoard.gameBoard(0)(0) shouldBe a[Cell]
        gameBoard.gameBoard(0)(0).hasMine shouldBe false
        gameBoard.gameBoard(0)(0).isFlagged shouldBe false

        val anotherGameBoard = new GameBoard(10)
        anotherGameBoard.gameBoard.length shouldBe 10
        anotherGameBoard.gameBoard(0).length shouldBe 10
        anotherGameBoard.gameBoard(9).length shouldBe 10

    }
}
