package assignment1.problem1;

/**
 * This class represents deposit and it will check against profile including card owner's name.
 */

public class Deposit {

  private int dollars;
  private int cents;
  private String firstName;
  private String lastName;

  /**
   * constructor that constructs following properties.
   *
   * @param dollars   deposit dollar amount. Must be in between 5 and 50.
   * @param cents     deposit cent amount. Must be in between 0 and 99.
   * @param firstName card owner's first name. Cannot be null.
   * @param lastName  card owner's last name. Cannot be null.
   */

  public Deposit(int dollars, int cents, String firstName, String lastName) {
    if (!(dollars >= 5 && dollars <= 50 && cents >= 0 && cents <= 99)) {
      throw new IllegalArgumentException(
          "Invalid deposit amount");
    }
    this.dollars = dollars;
    this.cents = cents;

    if (firstName == null && lastName == null) {
      throw new IllegalArgumentException("Name is not valid.");
    }

    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * set deposit dollar amount.
   *
   * @param dollars
   */
  public void setDollars(int dollars) {
    this.dollars = dollars;
  }

  /**
   * set deposit cent amount.
   *
   * @param cents
   */
  public void setCents(int cents) {
    this.cents = cents;
  }

  /**
   * set card owner's first name for deposit.
   *
   * @param firstName
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * set card owner's last name for deposit.
   *
   * @param lastName
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * get deposit dollar amount.
   *
   * @return dollar amount as an integer.
   */
  public int getDollars() {
    return dollars;
  }

  /**
   * get deposit cent amount.
   *
   * @return cent amount as an integer.
   */
  public int getCents() {
    return cents;
  }

  /**
   * get first name of the card owner.
   *
   * @return first name as a string.
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * get last name of the card owner.
   *
   * @return last name as a string.
   */
  public String getLastName() {
    return lastName;
  }

}
