package assignment1.problem1;

/**
 * This class represents current card balance of a transit card.
 */

public class CurrentCardBalance {

  private int dollars;
  private int cents;

  /**
   * constructor that constructs following properties.
   *
   * @param dollars dollar amount of current balance.
   * @param cents   cents amount of current balance.
   */
  public CurrentCardBalance(int dollars, int cents) {
    if (!(dollars >= 0 && cents >= 0 && cents <= 99)) {
      throw new IllegalArgumentException(
          "An integer value for the dollar amount greater or equal to 0\n"
              + "An integer value for the cents amount, greater or equal to 0 and less than or\n"
              + "equal to 99.");
    }
    this.dollars = dollars;
    this.cents = cents;
  }

  /**
   * get dollar amount of current balance.
   *
   * @return dollar amount as an integer.
   */

  public int getDollars() {
    return dollars;
  }

  /**
   * get cent amount of current balance.
   *
   * @return cent amount as an integer.
   */

  public int getCents() {
    return cents;
  }

  /**
   * set dollar amount of current balance. throws exception if current dollar amount is less than
   * 0.
   *
   * @param dollars
   */

  public void setDollars(int dollars) {
    if (dollars < 0) {
      throw new IllegalArgumentException("Amount cannot be negative.");
    }
    this.dollars = dollars;
  }

  /**
   * set cent amount of current balance. throws exception if current cent amount is less than 0 or
   * greater than 99.
   *
   * @param cents
   */

  public void setCents(int cents) {
    if (cents < 0 || cents > 99) {
      throw new IllegalArgumentException("Amount cannot be larger than 99 or smaller than 0.");
    }
    this.cents = cents;
  }
}
