// File : DroppableItem.java
// Parent class for FishFood and Coin
/** 
 * Represent object that will only move downwards.
 * @version 1.0.
 */

public class DroppableItem {
  protected Position currentPosition;

  /** 
  * Constructor.
  * @param initialPosition the initial position of the item.
  */

  public DroppableItem(Position initialPosition) {
    this.currentPosition = initialPosition;
  }

  // Getter for Position
  /** 
  * currentPosition getter.
  * @return object of Position.
  */

  public Position getCurrentPosition() {
    return this.currentPosition;
  }

  // Setter for Position
  /** 
  * currentPositionSetter.
  * @param currentPosition object of Position to be set.
  */

  public void setCurrentPosition(Position currentPosition) {
    this.currentPosition = currentPosition;
  }

  /** 
  * check whether the droppable item is in bottom.
  * @return boolean.
  */

  public boolean isBottom() {
    return this.currentPosition.getY() >= 420;
  }

  // Method for vertical move
  /** 
  * move object downwards.
  */

  public void moveDown() {
    if (this.getCurrentPosition().getY() <= 420) {
      this.currentPosition.setY(this.getCurrentPosition().getY() + 1);
    }
  }
}