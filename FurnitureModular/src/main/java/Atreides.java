
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * Atreides class extends Cabinet class and with many fixed properties due to its characteristics.
 */

public class Atreides extends Cabinet {

  private ArrayList<String> halfColors = new ArrayList(Arrays.asList("brown", "bone"));
  private ArrayList<String> quarColors = new ArrayList(Arrays.asList("brown", "bone"));
  private ArrayList<String> colors;
  private Mounting mounting;
  private Feet feet;
  private final Rail rail;
  private int shelfAmount;
  private int drawerAmount;
  private final int MAX_HALF_SHELF_AMOUNT = 3;
  private final int MAX_HALF_DRAWER_AMOUNT = 0;
  private final int MAX_QUARTER_SHELF_AMOUNT = 1;
  private final int MAX_QUARTER_DRAWER_AMOUNT = 0;

  /**
   * Constructor with following parameters.
   *
   * @param size the size of a modular.
   */
  public Atreides(String size) {
    super(size);
    this.rail = Rail.atreides;
    this.setColors(size);
    this.setDrawerAmount(size);
    this.setMounting(size);
    this.setFeet(size);
    this.setShelfAmount(size);
  }

  /**
   * get the colors of a modular.
   *
   * @return a ArrayList of colors.
   */

  public ArrayList<String> getColors() {
    return this.colors;
  }

  /**
   * set the colors of a modular base on the size.
   *
   * @param size String.
   */
  public void setColors(String size) {
    if (size.equals("HALF")) {
      this.colors = this.halfColors;
    } else {
      this.colors = this.quarColors;
    }

  }

  /**
   * get the mounting type of a modular.
   *
   * @return Mounting type.
   */
  public Mounting getMounting() {
    return this.mounting;
  }

  /**
   * set the mounting type of a modular base on size.
   *
   * @param size String.
   */
  public void setMounting(String size) {
    if (size.equals("HALF")) {
      this.mounting = Mounting.floorOrWall;
    } else {
      this.mounting = Mounting.floorOrWall;
    }

  }

  /**
   * check if feet is required for certain modular.
   *
   * @return Feet type.
   */
  public Feet getFeet() {
    return this.feet;
  }

  /**
   * set if feet is required for certain modular.
   *
   * @param size String.
   */
  public void setFeet(String size) {
    if (size.equals("HALF")) {
      this.feet = Feet.optional;
    } else {
      this.feet = Feet.optional;
    }

  }

  /**
   * get rail type of the modular.
   *
   * @return Rail type.
   */

  public Rail getRail() {
    return this.rail;
  }

  /**
   * get maximum shelf of a modular.
   *
   * @return amount.
   */


  @Override
  public int getShelfAmount() {
    return this.shelfAmount;
  }

  /**
   * set max shelf amount of a modular base on size.
   *
   * @param size String.
   */

  public void setShelfAmount(String size) {
    if (size.equals("HALF")) {
      this.shelfAmount = MAX_HALF_SHELF_AMOUNT;
    } else {
      this.shelfAmount = MAX_QUARTER_SHELF_AMOUNT;
    }

  }

  /**
   * get maximum drawer of a modular.
   *
   * @return amount.
   */
  @Override
  public int getDrawerAmount() {
    return this.drawerAmount;
  }

  /**
   * set max drawer amount of a modular base on size.
   *
   * @param size String.
   */
  public void setDrawerAmount(String size) {
    if (size.equals("HALF")) {
      this.drawerAmount = MAX_HALF_DRAWER_AMOUNT;
    } else {
      this.drawerAmount = MAX_QUARTER_DRAWER_AMOUNT;
    }

  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Atreides atreides = (Atreides) o;
    return shelfAmount == atreides.shelfAmount &&
        drawerAmount == atreides.drawerAmount &&
        colors.equals(atreides.colors) &&
        mounting == atreides.mounting &&
        feet == atreides.feet &&
        rail == atreides.rail;
  }

  @Override
  public int hashCode() {
    return Objects.hash(colors, mounting, feet, rail, shelfAmount, drawerAmount);
  }

  @Override
  public String toString() {
    return "Atreides{" +
        "colors=" + colors +
        ", mounting=" + mounting +
        ", feet=" + feet +
        ", rail=" + rail +
        ", shelfAmount=" + shelfAmount +
        ", drawerAmount=" + drawerAmount +
        '}';
  }

  @Override
  public String getTypeName() {
    return "Atreides";
  }
}
