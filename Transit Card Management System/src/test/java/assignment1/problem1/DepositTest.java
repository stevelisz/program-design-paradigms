package assignment1.problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * this test class tests Deposit class.
 */
public class DepositTest {

  @Rule
  public final ExpectedException exception = ExpectedException.none();

  private int dollar2 = 25;
  private int cent2 = 50;
  private String firstName = "John";
  private String lastName = "Smith";
  private Deposit newDeposit2;

  /**
   * set up newDeposit2.
   * @throws Exception
   */

  @Before
  public void setUp() throws Exception {
    newDeposit2 = new Deposit(dollar2, cent2, firstName, lastName);
  }

  /**
   * test getDollars method.
   */
  @Test
  public void getDollars() {
    assertEquals(dollar2, newDeposit2.getDollars());
  }
  /**
   * test getCents method.
   */
  @Test
  public void getCents() {
    assertEquals(cent2, newDeposit2.getCents());
  }
  /**
   * test getFirstName method.
   */
  @Test
  public void getFirstName() {
    assertEquals("John", newDeposit2.getFirstName());
  }
  /**
   * test getLastName method.
   */
  @Test
  public void getLastName() {
    assertEquals("Smith", newDeposit2.getLastName());
  }

  /**
   * test setDollars method.
   */
  @Test
  public void setDollars() {
    newDeposit2.setDollars(10);
    assertEquals(10, newDeposit2.getDollars());
  }
  /**
   * exception is thrown if input is invalid.
   */
  @Test
  public void setDollar2(){
    exception.expect(IllegalArgumentException.class);
    Deposit testDeposit = new Deposit(4, 15, "John", "Smith");
  }
  /**
   * test setCents method.
   */
  @Test
  public void setCents() {
    newDeposit2.setCents(10);
    assertEquals(10, newDeposit2.getCents());
  }
  /**
   * Exception is thrown if input is invalid.
   */
  @Test
  public void setCent2(){
    exception.expect(IllegalArgumentException.class);
    Deposit testDeposit = new Deposit(25, 150, "John", "Smith");
  }
  /**
   * test setFirstName method.
   */
  @Test
  public void setFirstName() {
    newDeposit2.setFirstName("Kobe");
    assertEquals("Kobe", newDeposit2.getFirstName());
  }
  /**
   * Exception is thrown if input is invalid.
   */
  @Test
  public void setName() {
    exception.expect(IllegalArgumentException.class);
    Deposit testDeposit = new Deposit(25, 15, null, null);
  }
  /**
   * test setLastName method.
   */
  @Test
  public void setLastName() {
    newDeposit2.setLastName("Bryant");
    assertEquals("Bryant", newDeposit2.getLastName());
  }
}