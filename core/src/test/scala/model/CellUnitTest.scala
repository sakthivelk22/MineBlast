package model

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class CellUnitTest extends AnyFunSpec with Matchers{
    describe("Cell") {
        it("should store the boolean values"){
            val aCell = Cell(hasMine = false, isFlagged = false)
            aCell shouldBe a[Cell]
            aCell.hasMine shouldBe false
            aCell.isFlagged shouldBe false

            val anotherCell = Cell(hasMine = true, isFlagged = true)
            anotherCell shouldBe a[Cell]
            anotherCell.hasMine shouldBe true
            anotherCell.isFlagged shouldBe true
        }

        it("should be created with default parameters as false"){
            val aCell = Cell()
            aCell shouldBe a[Cell]
            aCell.hasMine shouldBe false
            aCell.isFlagged shouldBe false
        }
    }

}
