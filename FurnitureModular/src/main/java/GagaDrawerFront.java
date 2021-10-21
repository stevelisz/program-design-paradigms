
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * GagaDrawerFront class represents a GagaDrawerFront DrawerFront.
 */
public class GagaDrawerFront extends DrawerFront {

  private ArrayList<String> colors;
  private Boolean handleIncluded;
  private ArrayList<String> quarColors = new ArrayList(
      Arrays.asList("brown", "black", "bone", "oxblood"));

  /**
   * Constructor with following parameters.
   *
   * @param size the size of a modular.
   */
  public GagaDrawerFront(String size) {
    super(size);
    this.setColors(size);
    this.setHandleIncluded(size);
  }

  /**
   * get the name of the type.
   *
   * @return the name
   */
  @Override
  public String getTypeName() {
    return "GagaDrawerFront";
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
    if (size.equals("QUARTER")) {
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
    if (size.equals("QUARTER")) {
      this.handleIncluded = false;
    }

  }

  public boolean equals(Object o) {
    if (this == o) {
      return true;
    } else if (o != null && this.getClass() == o.getClass()) {
      GagaDrawerFront that = (GagaDrawerFront) o;
      return this.colors.equals(that.colors) && this.handleIncluded.equals(that.handleIncluded)
          && this.quarColors.equals(that.quarColors);
    } else {
      return false;
    }
  }

  public int hashCode() {
    return Objects.hash(this.colors, this.handleIncluded, this.quarColors);
  }

  public String toString() {
    return "GagaDrawerFront{colors=" + this.colors + ", handleIncluded=" + this.handleIncluded
        + ", quarColors=" + this.quarColors + '}';
  }
}
