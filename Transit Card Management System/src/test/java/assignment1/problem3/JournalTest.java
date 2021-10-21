package assignment1.problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * This test class tests Journal class using Journal object.
 */
public class JournalTest {

  private Journal journal;
  private String[] authors;
  private String[] editors;

  /**
   * set up object.
   *
   * @throws Exception if input is invalid.
   */
  @Before
  public void setUp() throws Exception {
    authors = new String[2];
    authors[0] = "author1";
    authors[1] = "author2";
    editors = new String[2];
    editors[0] = "editor1";
    editors[1] = "editor2";
    journal = new Journal("testTitle", authors, 2018,
        10, "testPub", editors);
  }

  /**
   * test getPublishingYear method.
   */
  @Test
  public void getPublishingYear() {
    assertEquals(2018, journal.getPublishingYear());

  }

  /**
   * test setPublishingYear method.
   */
  @Test
  public void setPublishingYear() {
    journal.setPublishingYear(2020);
    assertEquals(2020, journal.getPublishingYear());
  }

  /**
   * test getCitationNumbers method.
   */
  @Test
  public void getCitationNumbers() {
    assertEquals(10, journal.getCitationNumbers());

  }

  /**
   * test setCitationNumbers method.
   */
  @Test
  public void setCitationNumbers() {
    journal.setCitationNumbers(25);
    assertEquals(25, journal.getCitationNumbers());
  }

  /**
   * test getAge method.
   */
  @Test
  public void getAge() throws ImpactEstimationException {
    assertEquals(2, journal.getAge());
  }

  /**
   * test bump method.
   */
  @Test
  public void bump() throws ImpactEstimationException {
    assertEquals(100, journal.bump());
  }

  /**
   * test getBI method.
   */
  @Test
  public void getBI() throws ImpactEstimationException {
    assertEquals(5.00, journal.getBI(), 0.01);
  }

  /**
   * test estimateImpact method.
   */
  @Test
  public void estimateImpact() throws ImpactEstimationException {
    assertEquals(110.00, journal.estimateImpact(), 0.01);

  }

  /**
   * test factor method.
   */
  @Test
  public void factor() {
    assertEquals(2, journal.factor());
  }

  /**
   * test getPublisher method.
   */
  @Test
  public void getPublisher() {
    assertEquals("testPub", journal.getPublisher());
  }

  /**
   * test setPublisher method.
   */
  @Test
  public void setPublisher() {
    journal.setPublisher("test");
    assertEquals("test", journal.getPublisher());
  }

  /**
   * test getEditors method.
   */
  @Test
  public void getEditors() {
    String[] test = new String[2];
    test[0] = "editor1";
    test[1] = "editor2";
    assertArrayEquals(test, journal.getEditors());
  }

  /**
   * test setEditors method.
   */
  @Test
  public void setEditors() {
    String[] test = new String[2];
    test[0] = "editor1";
    test[1] = "editor2";
    String[] test2 = new String[2];
    test2[0] = "editor1";
    test2[1] = "editor2";
    journal.setEditors(test);
    assertArrayEquals(test2, journal.getEditors());
  }
}