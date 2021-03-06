// File: Coin.java
// Responsibility : Act as Coin for this game

import java.awt.Graphics;
import java.awt.Toolkit;

/** 
 * Represents a coin
 * @version 1.0
 */
public class Coin extends DroppableItem implements Drawable {
  private double value;
  private double coinStatus;

  // User-defined Constructor
  /** 
   * constructor.
   * @param value value of coin.
   * @param fishPosition Position of fish.
   */
  public Coin(double value, Position fishPosition) {
    super(fishPosition);
    this.value = value;
    this.coinStatus = 0.0;
  }

  //Getter
  /** 
   * value getter.
   * @return value.
   */
  public double getValue() {
    return this.value;
  }

  //Setter
  /** 
   * value setter.
   * @param value value to be set.
   */
  public void setValue(double value) {
    this.value = value;
  }

  /** 
   * draw to aquarium
   * @param g Draw container.
   * @param t Object to grab image.
   */

  public void draw(Graphics g, Toolkit t) {
    if (this.getValue() == 25) {
      if (this.coinStatus < 1 || this.isBottom()) {
        g.drawImage(t.getImage("assets/images/Silver_coin.png"), (int) getCurrentPosition().getX(),
            (int) getCurrentPosition().getY(), null);
      } else if (this.coinStatus < 2) {
        g.drawImage(t.getImage("assets/images/Silver_coin_1.png"), (int) getCurrentPosition().getX(),
            (int) getCurrentPosition().getY(), null);
      } else if (this.coinStatus < 3) {
        g.drawImage(t.getImage("assets/images/Silver_coin_2.png"), (int) getCurrentPosition().getX(),
            (int) getCurrentPosition().getY(), null);
      } else {
        this.coinStatus = 0;
        g.drawImage(t.getImage("assets/images/Silver_coin_3.png"), (int) getCurrentPosition().getX(),
            (int) getCurrentPosition().getY(), null);
      }
      this.coinStatus += 0.125;
    } else if (this.getValue() == 50) {
      if (this.coinStatus < 1 || this.isBottom()) {
        g.drawImage(t.getImage("assets/images/Gold_coin.png"), (int) getCurrentPosition().getX(),
            (int) getCurrentPosition().getY(), null);
      } else if (this.coinStatus < 2) {
        g.drawImage(t.getImage("assets/images/Gold_coin_1.png"), (int) getCurrentPosition().getX(),
            (int) getCurrentPosition().getY(), null);
      } else if (this.coinStatus < 3) {
        g.drawImage(t.getImage("assets/images/Gold_coin_2.png"), (int) getCurrentPosition().getX(),
            (int) getCurrentPosition().getY(), null);
      } else {
        this.coinStatus = 0;
        g.drawImage(t.getImage("assets/images/Gold_coin_3.png"), (int) getCurrentPosition().getX(),
            (int) getCurrentPosition().getY(), null);
      }
      this.coinStatus += 0.125;
    } else {
      g.drawImage(t.getImage("assets/images/Diamond_Coin.png"), (int) getCurrentPosition().getX(),
          (int) getCurrentPosition().getY(), null);
    }
  }
}
