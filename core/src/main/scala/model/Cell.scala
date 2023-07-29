package model

case class Cell(hasMine: Boolean, isFlagged: Boolean)

object Cell{
  def apply(): Cell = Cell(hasMine = false, isFlagged = false)
}