/**
 * This abstract class extends FurnitureModular abstract class.
 */
public abstract class Cabinet extends FurnitureModular {

  private final int DEPTH = 16;
  private final int WIDTH = 36;
  private final int WARDROBE_HEIGHT = 72;
  private final int HALF_HEIGHT = 36;
  private final int QUARTER_HEIGHT = 18;
  private final Dimension wardrobeDimension = new Dimension(72, 36, 16);
  private final Dimension halfDimension = new Dimension(36, 36, 16);
  private final Dimension quarterDimension = new Dimension(18, 36, 16);
  private Dimension dimension;
  private int shelfAmount;
  private int drawerAmount;
  private Rail rail;
  /**
   * Constructor with following parameters to pass.
   *
   * @param size the size of a modular as String.
   */
  public Cabinet(String size) {
    super(size);
    this.setDimension(size);
  }

  /**
   * get the dimension of a modular.
   *
   * @return the dimension of a modular.
   */
  public Dimension getDimension() {
    return this.dimension;
  }

  /**
   * Set the dimension of a modular base on the size.
   *
   * @param size
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

  public Rail getRail() {
    return rail;
  }

  /**
   * get the maximum shelf amount of a modular. will be overridden in every concrete class.
   *
   * @return the max shelf amount as Integer.
   */
  public int getShelfAmount() {
    return shelfAmount;
  }

  /**
   * get the maximum drawer amount of a modular. will be overridden in every concrete class.
   *
   * @return the max drawer amount as Integer.
   */
  public int getDrawerAmount() {
    return drawerAmount;
  }

  public String getTypeName(){
    return "Cabinet";
  }
}
