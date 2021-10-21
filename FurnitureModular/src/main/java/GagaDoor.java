
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * GagaDoor class represents a GagaDoor door.
 */
public class GagaDoor extends Door {

  private ArrayList<String> colors;
  private Boolean handleIncluded;
  private ArrayList<String> halfColors = new ArrayList(
      Arrays.asList("brown", "black", "bone", "oxblood"));
  private ArrayList<String> quarColors = new ArrayList(
      Arrays.asList("brown", "black", "bone", "oxblood"));
  private String typeName;

  /**
   * Constructor with following parameters.
   *
   * @param size the size of a modular.
   */
  public GagaDoor(String size) {
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
    return "GagaDoor";
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
    if (size.equals("HALF")) {
      this.colors = this.halfColors;
    } else if (size.equals("QUARTER")) {
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
    if (size.equals("HALF")) {
      this.handleIncluded = false;
    } else if (size.equals("QUARTER")) {
      this.handleIncluded = false;
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
    GagaDoor gagaDoor = (GagaDoor) o;
    return colors.equals(gagaDoor.colors) &&
        handleIncluded.equals(gagaDoor.handleIncluded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colors, handleIncluded);
  }

  @Override
  public String toString() {
    return "GagaDoor{" +
        "colors=" + colors +
        ", handleIncluded=" + handleIncluded +
        '}';
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }
}
