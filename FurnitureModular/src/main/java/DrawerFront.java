import java.util.ArrayList;

/**
 * This class extends FurnitureModular.
 */
public abstract class DrawerFront extends FurnitureModular {

  private final int WIDTH = 36;
  private final int QUARTER_HEIGHT = 18;
  private final Dimension quarterDimension = new Dimension(18, 36);
  private Dimension dimension;
  private ArrayList<String> colors;

  /**
   * Constructor with following parameters.
   *
   * @param size the size of a modular as String.
   */
  public DrawerFront(String size) {
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
   * set the dimension of a modular base on size.
   *
   * @param size String
   */
  public void setDimension(String size) {
    if (size.equals("QUARTER")) {
      this.dimension = this.quarterDimension;
    }

  }

  /**
   * get the colors of a drawer front.
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