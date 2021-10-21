import java.util.Objects;

/**
 * This class represents the dimension of a modular.
 */
public class Dimension {

  private int height;
  private int width;
  private Integer depth;

  /**
   * Constructor with following parameters.
   *
   * @param height height of a modular.
   * @param width  width of a modular.
   * @param depth  depth of a modular.
   */
  public Dimension(int height, int width, int depth) {
    this.height = height;
    this.width = width;
    this.depth = depth;
  }

  /**
   * Constructor with following parameters.
   *
   * @param height height of a modular.
   * @param width  width of a modular.
   */
  public Dimension(int height, int width) {
    this.height = height;
    this.width = width;
    this.depth = null;
  }

  /**
   * get the height.
   *
   * @return height as integer.
   */
  public int getHeight() {
    return this.height;
  }

  /**
   * set the height.
   *
   * @param height integer.
   */
  public void setHeight(int height) {
    this.height = height;
  }

  /**
   * get the width.
   *
   * @return width as integer.
   */
  public int getWidth() {
    return this.width;
  }

  /**
   * set the width.
   *
   * @param width integer.
   */
  public void setWidth(int width) {
    this.width = width;
  }

  /**
   * get the depth.
   *
   * @return integer.
   */
  public Integer getDepth() {
    return this.depth;
  }

  /**
   * set the depth;
   *
   * @param depth integer.
   */
  public void setDepth(Integer depth) {
    this.depth = depth;
  }

  public boolean equals(Object o) {
    if (this == o) {
      return true;
    } else if (o != null && this.getClass() == o.getClass()) {
      Dimension dimension = (Dimension) o;
      return this.height == dimension.height && this.width == dimension.width && Objects
          .equals(this.depth, dimension.depth);
    } else {
      return false;
    }
  }

  public int hashCode() {
    return Objects.hash(new Object[]{this.height, this.width, this.depth});
  }

  public String toString() {
    return "Dimension{height=" + this.height + ", width=" + this.width + ", depth=" + this.depth
        + '}';
  }
}
