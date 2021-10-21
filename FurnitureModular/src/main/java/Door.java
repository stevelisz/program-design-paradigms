

import java.util.ArrayList;
import java.util.Objects;

/**
 * Door class extends FurnitureModular class.
 */
public abstract class Door extends FurnitureModular {

  private final int WIDTH = 36;
  private final int WARDROBE_HEIGHT = 72;
  private final int HALF_HEIGHT = 36;
  private final int QUARTER_HEIGHT = 18;
  private final Dimension wardrobeDimension = new Dimension(72, 36);
  private final Dimension halfDimension = new Dimension(36, 36);
  private final Dimension quarterDimension = new Dimension(18, 36);
  private Dimension dimension;
  private ArrayList<String> colors;

  /**
   * Constructor with following parameters.
   *
   * @param size the size of a modular String.
   */
  public Door(String size) {
    super(size);
    this.setDimension(size);
  }

  /**
   * get the dimension of a modular.
   *
   * @return Dimension type.
   */
  public Dimension getDimension() {
    return this.dimension;
  }

  /**
   * set the dimension of a modular base on its size.
   *
   * @param size String.
   */
  public void setDimension(String size) {
    if (size.equals("WARDROBE")) {
      this.dimension = this.wardrobeDimension;
    } else if (size.equals("HALF")) {
      this.dimension = this.halfDimension;
    } else if (size.equals("QUARTER")) {
      this.dimension = this.quarterDimension;
    }

  }

  /**
   * get colors of a door.
   * @return colors.
   */
  public ArrayList<String> getColors() {
    return this.colors;
  }

  /**
   * get the name of the type.
   * @return the name
   */
  public String getTypeName(){
    return "TypeName";
  }
}
