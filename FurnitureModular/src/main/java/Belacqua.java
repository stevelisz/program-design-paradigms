

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * Belacqua class represents a Belacqua door.
 */
public class Belacqua extends Door {

  private ArrayList<String> colors;
  private Boolean handleIncluded;
  private ArrayList<String> warColors = new ArrayList(Arrays.asList("bone", "oxblood"));
  private ArrayList<String> halfColors = new ArrayList(Arrays.asList("bone", "oxblood"));
  private ArrayList<String> quarColors = new ArrayList(Arrays.asList("bone", "oxblood"));

  /**
   * Constructor with following parameters.
   *
   * @param size the size of a modular.
   */
  public Belacqua(String size) {
    super(size);
    this.setColors(size);
    this.setHandleIncluded(size);
  }

  /**
   * get the name of the type.
   * @return the name
   */
  @Override
  public String getTypeName(){
    return "Belacqua";
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
    } else if (size.equals("HALF")) {
      this.colors = this.halfColors;
    } else {
      this.colors = this.quarColors;
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
    } else if (size.equals("HALF")) {
      this.handleIncluded = true;
    } else {
      this.handleIncluded = true;
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
    Belacqua belacqua = (Belacqua) o;
    return colors.equals(belacqua.colors) &&
        handleIncluded.equals(belacqua.handleIncluded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colors, handleIncluded);
  }

  @Override
  public String toString() {
    return "Belacqua{" +
        "colors=" + colors +
        ", handleIncluded=" + handleIncluded +
        '}';
  }
}
