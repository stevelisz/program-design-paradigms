package assignment1.problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * this test class tests CurrentCardBalance class.
 */
public class CurrentCardBalanceTest {

  @Rule
  public final ExpectedException exception = ExpectedException.none();

  private int dollars;
  private int cents;
  private CurrentCardBalance currentCardBalance;

  /**
   * set up currentCardBalance.
   *
   * @throws Exception
   */

  @Before
  public void setUp() throws Exception {
    currentCardBalance = new CurrentCardBalance(dollars, cents);

  }

  /**
   * test getDollars method.
   */
  @Test
  public void getDollars() {
    assertEquals(dollars, currentCardBalance.getDollars());
  }

  /**
   * test Exception if input is invalid.
   */
  @Test
  public void dollar() {

    exception.expect(IllegalArgumentException.class);
    CurrentCardBalance testBalance = new CurrentCardBalance(-10, 0);

  }

  /**
   * test getCents method.
   */
  @Test
  public void getCents() {
    assertEquals(cents, currentCardBalance.getCents());
  }

  /**
   * test Exception if input is invalid.
   */
  @Test
  public void cents() {
    exception.expect(IllegalArgumentException.class);
    CurrentCardBalance testBalance = new CurrentCardBalance(10, -10);
  }

  /**
   * test setDollars method.
   */
  @Test
  public void setDollars() {
    currentCardBalance.setDollars(10);
    assertEquals(10, currentCardBalance.getDollars());
  }

  /**
   * test Exception if input is invalid.
   */
  @Test
  public void setDollars2() {
    exception.expect(IllegalArgumentException.class);
    currentCardBalance.setDollars(-10);
  }

  /**
   * test setCents method.
   */
  @Test
  public void setCents() {
    currentCardBalance.setCents(10);
    assertEquals(10, currentCardBalance.getCents());
  }

  /**
   * test Exception if input is invalid.
   */
  @Test
  public void setCents2() {
    exception.expect(IllegalArgumentException.class);
    currentCardBalance.setCents(-10);
  }
}