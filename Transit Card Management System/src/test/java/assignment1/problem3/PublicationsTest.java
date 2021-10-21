package assignment1.problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Text;

/**
 * This test class tests Publication class using its subclass object Textbook.
 */
public class PublicationsTest {

  private Textbook textbook;
  private String[] authors;

  /**
   * set up Textbook object.
   *
   * @throws Exception if input is not valid.
   */
  @Before
  public void setUp() throws Exception {
    authors = new String[2];
    authors[0] = "Au";
    authors[1] = "Thors";

    textbook = new Textbook("Java", authors, 1997, 20,
        "Oracle", 567);
  }

  /**
   * test getTitle method.
   */
  @Test
  public void getTitle() {
    assertEquals("Java", textbook.getTitle());
  }

  /**
   * test setTitle method.
   */
  @Test
  public void setTitle() {
    textbook.setTitle("C++");
    assertEquals("C++", textbook.getTitle());
  }

  /**
   * test getAuthors method.
   */
  @Test
  public void getAuthors() {
    String[] test = new String[2];
    test[0] = "Au";
    test[1] = "Thors";
    assertArrayEquals(test, textbook.getAuthors());
  }

  /**
   * test setAuthors method.
   */
  @Test
  public void setAuthors() {
    String[] test = new String[2];
    test[0] = "test1";
    test[1] = "test2";
    textbook.setAuthors(test);
    assertArrayEquals(test, textbook.getAuthors());

  }

  /**
   * test getPublishingYear method.
   */
  @Test
  public void getPublishingYear() {
    assertEquals(1997, textbook.getPublishingYear());
  }

  /**
   * test setPublishingYear method.
   */
  @Test
  public void setPublishingYear() {
    textbook.setPublishingYear(1986);
    assertEquals(1986, textbook.getPublishingYear());
  }

  /**
   * test getCitationNumbers method.
   */
  @Test
  public void getCitationNumbers() {
    assertEquals(20, textbook.getCitationNumbers());
  }

  /**
   * test setCitationNumbers method.
   */
  @Test
  public void setCitationNumbers() {
    textbook.setCitationNumbers(25);
    assertEquals(25, textbook.getCitationNumbers());
  }

  /**
   * test factor method.
   */
  @Test
  public void factor() {
    assertEquals(4, textbook.factor());
  }

  /**
   * test getAge method.
   */
  @Test
  public void getAge() throws ImpactEstimationException {
    assertEquals(23, textbook.getAge());
  }

  /**
   * test bump method.
   */
  @Test
  public void bump() throws ImpactEstimationException {
    assertEquals(0, textbook.bump());
  }

  /**
   * test estimateImpact method.
   */
  @Test
  public void estimateImpact() throws ImpactEstimationException {
    assertEquals(3.48, textbook.estimateImpact(), 0.01);
  }

  /**
   * test getBI method.
   */
  @Test
  public void getBI() throws ImpactEstimationException {
    assertEquals(0.87, textbook.getBI(), 0.01);
  }
}