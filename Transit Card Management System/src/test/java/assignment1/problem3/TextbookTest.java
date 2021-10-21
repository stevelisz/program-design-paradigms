package assignment1.problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * This test class tests Textbook using Textbook object.
 */
public class TextbookTest {

  private Textbook textbook;
  private String[] authors;

  /**
   * set up object.
   *
   * @throws Exception if input is invalid.
   */
  @Before
  public void setUp() throws Exception {

    authors = new String[1];
    authors[0] = "author";
    textbook = new Textbook("testTitle", authors, 2018, 10,
        "testCom", 500);
  }

  /**
   * test getPublishingCompany method.
   */
  @Test
  public void getPublishingCompany() {
    assertEquals("testCom", textbook.getPublishingCompany());
  }

  /**
   * test setPublishingCompany method.
   */
  @Test
  public void setPublishingCompany() {
    textbook.setPublishingCompany("test");
    assertEquals("test", textbook.getPublishingCompany());
  }

  /**
   * test getPageNumber method.
   */
  @Test
  public void getPageNumber() {
    assertEquals(500, textbook.getPageNumber());
  }

  /**
   * test setPageNumber method.
   */
  @Test
  public void setPageNumber() {
    textbook.setPageNumber(250);
    assertEquals(250, textbook.getPageNumber());
  }

  /**
   * test getTitle method.
   */
  @Test
  public void getTitle() {
    assertEquals("testTitle", textbook.getTitle());
  }

  /**
   * test setTitle method.
   */
  @Test
  public void setTitle() {
    textbook.setTitle("123");
    assertEquals("123", textbook.getTitle());
  }

  /**
   * test getAuthors method.
   */
  @Test
  public void getAuthors() {
    String[] test = new String[1];
    test[0] = "author";
    assertArrayEquals(test, textbook.getAuthors());
  }

  /**
   * test setAuthors method.
   */
  @Test
  public void setAuthors() {
    String[] test = new String[1];
    test[0] = "author";
    String[] test2 = new String[1];
    test2[0] = "author";
    textbook.setAuthors(test2);
    assertArrayEquals(test, textbook.getAuthors());
  }

  /**
   * test getPublishingYear method.
   */
  @Test
  public void getPublishingYear() {
    assertEquals(2018, textbook.getPublishingYear());
  }

  /**
   * test setPublishingYear method.
   */
  @Test
  public void setPublishingYear() {
    textbook.setPublishingYear(2019);
    assertEquals(2019, textbook.getPublishingYear());
  }

  /**
   * test getCitationNumbers method.
   */
  @Test
  public void getCitationNumbers() {
    assertEquals(10, textbook.getCitationNumbers());
  }

  /**
   * test setCitationNumbers method.
   */
  @Test
  public void setCitationNumbers() {
    textbook.setCitationNumbers(5);
    assertEquals(5, textbook.getCitationNumbers());
  }

  /**
   * test getAge method.
   */
  @Test
  public void getAge() throws ImpactEstimationException {
    assertEquals(2, textbook.getAge());
  }

  /**
   * test bump method.
   */
  @Test
  public void bump() throws ImpactEstimationException {
    assertEquals(100, textbook.bump());
  }

  /**
   * test getBI method.
   */
  @Test
  public void getBI() throws ImpactEstimationException {
    assertEquals(5.00, textbook.getBI(), 0.01);
  }

  /**
   * test estimateImpact method.
   */
  @Test
  public void estimateImpact() throws ImpactEstimationException {
    assertEquals(120.00, textbook.estimateImpact(), 0.01);
  }

  /**
   * test factor method.
   */
  @Test
  public void factor() {
    assertEquals(4, textbook.factor());
  }
}