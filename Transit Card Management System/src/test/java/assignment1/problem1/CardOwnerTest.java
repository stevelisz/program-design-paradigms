package assignment1.problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Test class of CardOwner class.
 */
public class CardOwnerTest {

  private String firstName;
  private String lastName;
  private String email;
  private CardOwner testOwner;

  /**
   * set up testOwner.
   *
   * @throws Exception if info is not valid.
   */
  @Before
  public void setUp() throws Exception {
    testOwner = new CardOwner(firstName, lastName, email);
  }

  /**
   * test getFirstName method.
   */
  @Test
  public void getFirstName() {
    assertEquals(firstName, testOwner.getFirstName());

  }

  /**
   * test setFirstName method.
   */
  @Test
  public void setFirstName() {
    testOwner.setFirstName("John");
    assertEquals("John", testOwner.getFirstName());
  }

  /**
   * test getLastName method.
   */
  @Test
  public void getLastName() {
    assertEquals(lastName, testOwner.getLastName());
  }

  /**
   * test setLastName method.
   */
  @Test
  public void setLastName() {
    testOwner.setLastName("Smith");
    assertEquals("Smith", testOwner.getLastName());
  }

  /**
   * test getEmail method.
   */
  @Test
  public void getEmail() {
    assertEquals(email, testOwner.getEmail());
  }

  /**
   * test setEmail method.
   */
  @Test
  public void setEmail() {
    testOwner.setEmail("johnsmith@gmail.com");
    assertEquals("johnsmith@gmail.com", testOwner.getEmail());
  }
}