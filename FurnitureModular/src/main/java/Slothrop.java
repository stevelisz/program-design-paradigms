

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * Slothrop class represents a slothrop door.
 */
public class Slothrop extends Door {

  private ArrayList<String> colors;
  private Boolean handleIncluded;
  private ArrayList<String> warColors = new ArrayList(Arrays.asList("brown", "black"));
  private ArrayList<String> halfColors = new ArrayList(Arrays.asList("brown", "black"));

  /**
   * Constructor with following parameters.
   *
   * @param size the size of a modular.
   */
  public Slothrop(String size) {
    super(size);
    this.setColors(size);
    this.setHandleIncluded(size);
  }

  /**
   * get the colors of a modular.
   *
   * @return a ArrayList of colors.
   */
  @Override
  public ArrayList<String> getColors() {
    return this.colors;
  }

  /**
   * set the colors of a modular base on the size.
   *
   * @param size String.
   */


  public void setColors(String size) {
    if (size.equals("WARDROBE")) {
      this.colors = this.warColors;
    } else {
      this.colors = this.halfColors;
    }

  }

  /**
   * check if handle is required for the modular.
   *
   * @return true if it's required, false otherwise.
   */
  public Boolean getHandleIncluded() {
    return this.handleIncluded;
  }

  /**
   * set if handle is required base on size.
   *
   * @param size String.
   */
  public void setHandleIncluded(String size) {
    if (size.equals("WARDROBE")) {
      this.handleIncluded = true;
    } else {
      this.handleIncluded = true;
    }

  }

  /**
   * get the name of the type.
   * @return the name
   */
  @Override
  public String getTypeName(){
    return "Slothrop";
  }

  public boolean equals(Object o) {
    if (this == o) {
      return true;
    } else if (o != null && this.getClass() == o.getClass()) {
      Slothrop slothrop = (Slothrop) o;
      return this.colors.equals(slothrop.colors) && this.handleIncluded
          .equals(slothrop.handleIncluded) && this.warColors.equals(slothrop.warColors)
          && this.halfColors.equals(slothrop.halfColors);
    } else {
      return false;
    }
  }

  public int hashCode() {
    return Objects
        .hash(new Object[]{this.colors, this.handleIncluded, this.warColors, this.halfColors});
  }

  public String toString() {
    return "Slothrop{colors=" + this.colors + ", handleIncluded=" + this.handleIncluded
        + ", warColors=" + this.warColors + ", halfColors=" + this.halfColors + '}';
  }
}
