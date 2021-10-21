package assignment1.problem1;

/**
 * This class represents a card owner that has fisrt name, last name, and email address properties.
 */

public class CardOwner {

  private String firstName;
  private String lastName;
  private String email;

  /**
   * constructor that constructs the following properties.
   * @param firstName first name of the card owner.
   * @param lastName  last name of the card owner.
   * @param email     email address of the card owner.
   */

  public CardOwner(String firstName, String lastName, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
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
   * set first name of the card owner
   *
   * @param firstName
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * get last name of the card owner.
   *
   * @return last name as a string.
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * set last name of the card owner.
   *
   * @param lastName
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * get email address of the card owner.
   *
   * @return email address as a string.
   */
  public String getEmail() {
    return email;
  }

  /**
   * set email address of the card owner.
   *
   * @param email
   */
  public void setEmail(String email) {
    this.email = email;
  }
}
