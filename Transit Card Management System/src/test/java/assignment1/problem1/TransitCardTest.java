package assignment1.problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * this test class tests TransitCard class.
 */
public class TransitCardTest {

  private CardOwner cardOwner;
  private CurrentCardBalance currentCardBalance;
  private Deposit deposit;
  private TransitCard transitCard;

  /**
   * set up cardOwner, currentCardBalance, deposit, transitCard.
   *
   * @throws Exception
   */
  @Before
  public void setUp() throws Exception {
    cardOwner = new CardOwner("John", "Smith", "johnsmith@gmail.com");
    currentCardBalance = new CurrentCardBalance(20, 56);
    deposit = new Deposit(10, 55, "John", "Smith");
    transitCard = new TransitCard(cardOwner, currentCardBalance);
  }

  /**
   * test depositMoney function.
   */
  @Test
  public void depositMoney() {
    transitCard.setCardBalance(currentCardBalance);
    transitCard.depositMoney(deposit);
    assertEquals(31, transitCard.getCardBalance().getDollars());

  }

  /**
   * test depositMoney function.
   */
  @Test
  public void depositMoney2() {
    transitCard.setCardBalance(currentCardBalance);
    transitCard.depositMoney(deposit);
    assertEquals(11, transitCard.getCardBalance().getCents());

  }

  /**
   * test getCardOwner function.
   */
  @Test
  public void getCardOwner() {
    assertEquals(cardOwner, transitCard.getCardOwner());
  }

  /**
   * test setCardOwner function.
   */
  @Test
  public void setCardOwner() {
    CardOwner testOwner = new CardOwner("Kobe", "Bryant", "kb24@gmail.com");
    transitCard.setCardOwner(testOwner);
    assertEquals(testOwner, transitCard.getCardOwner());
  }

  /**
   * test getCardBalance function.
   */
  @Test
  public void getCardBalance() {
    assertEquals(currentCardBalance, transitCard.getCardBalance());

  }

  /**
   * test setCardBalance function.
   */
  @Test
  public void setCardBalance() {
    CurrentCardBalance testBalance = new CurrentCardBalance(30, 30);
    transitCard.setCardBalance(testBalance);
    assertEquals(testBalance, transitCard.getCardBalance());
  }
}