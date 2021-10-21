/**
 * This abstract class represents Furniture Modular.
 */
public abstract class FurnitureModular {

  private String size;
  private Double price;
  private final static Double TEMP_PRICE = 0.0;

  /**
   * Constructor with following parameter, size.
   *
   * @param size
   */
  public FurnitureModular(String size) {
    if (!size.equals("WARDROBE") && !size.equals("HALF") && !size.equals("QUARTER")) {
      throw new IllegalArgumentException("Please enter a proper size.");
    } else {
      this.size = size;
    }
  }

  /**
   * get the size of a modular.
   *
   * @return size as String.
   */
  public String getSize() {
    return this.size;
  }

  /**
   * set the size of a modular.
   *
   * @param size String.
   */
  public void setSize(String size) {
    this.size = size;
  }

  /**
   * get the price of a modular.
   *
   * @return a constant which is 0 because the price is unknown yet.
   */
  public Double getPrice() {
    return TEMP_PRICE;
  }

  /**
   * set the price of a modular.
   *
   * @param price Double.
   */
  public void setPrice(Double price) {
    this.price = price;
  }
}