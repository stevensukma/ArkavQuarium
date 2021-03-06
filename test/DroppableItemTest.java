import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DroppableItemTest {
  public Position pos;
  public DroppableItem di;

  @Before
  public void initialization() {
    pos = new Position(5.0, 5.0);
    di = new DroppableItem(pos);
  }

  @Test
  public void moveDownTest() {
    di.moveDown();
    assertEquals(di.getCurrentPosition().getY(), 6.0, 0.0);
  }
}