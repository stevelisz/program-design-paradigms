package assignment1.problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * This test class tests Article Class using subclass ConferenceProceeding and Journal objects.
 */
public class ArticleTest {

  private ConferenceProceeding conferenceProceeding;
  private Journal journal;
  private String[] authors;
  private String[] editors;

  /**
   * set up objects.
   *
   * @throws Exception if input is not valid.
   */
  @Before
  public void setUp() throws Exception {

    authors = new String[2];
    editors = new String[2];
    authors[0] = "test1";
    authors[1] = "test2";
    editors[0] = "test1";
    editors[1] = "test2";

    conferenceProceeding = new ConferenceProceeding("testTitle", authors, 2008,
        10, "testName", "Boston");
    journal = new Journal("testTitle", authors, 2008, 10,
        "NEU", editors);
  }

  /**
   * test getTitle method.
   */
  @Test
  public void getTitle() {
    assertEquals("testTitle", conferenceProceeding.getTitle());
    assertEquals("testTitle", journal.getTitle());
  }

  /**
   * test setTitle method.
   */
  @Test
  public void setTitle() {
    conferenceProceeding.setTitle("test");
    journal.setTitle("test");
    assertEquals("test", conferenceProceeding.getTitle());
    assertEquals("test", journal.getTitle());

  }

  /**
   * test getAuthors method.
   */
  @Test
  public void getAuthors() {
    String[] testAuthors = new String[2];
    testAuthors[0] = "test1";
    testAuthors[1] = "test2";
    assertArrayEquals(testAuthors, conferenceProceeding.getAuthors());
    assertArrayEquals(testAuthors, journal.getAuthors());


  }

  /**
   * test setAuthors method.
   */
  @Test
  public void setAuthors() {
    String[] testAuthors = new String[2];
    testAuthors[0] = "test1";
    testAuthors[1] = "test2";
    conferenceProceeding.setAuthors(testAuthors);
    journal.setAuthors(testAuthors);
    assertArrayEquals(testAuthors, conferenceProceeding.getAuthors());
    assertArrayEquals(testAuthors, journal.getAuthors());


  }

  /**
   * test getPublishingYear method.
   */
  @Test
  public void getPublishingYear() {
    assertEquals(2008, journal.getPublishingYear());
    assertEquals(2008, conferenceProceeding.getPublishingYear());

  }

  /**
   * test setPublishingYear method.
   */
  @Test
  public void setPublishingYear() {
    journal.setPublishingYear(2010);
    conferenceProceeding.setPublishingYear(2010);
    assertEquals(2010, journal.getPublishingYear());
    assertEquals(2010, conferenceProceeding.getPublishingYear());
  }

  /**
   * test getCitationNumbers method.
   */
  @Test
  public void getCitationNumbers() {
    assertEquals(10, journal.getCitationNumbers());
    assertEquals(10, conferenceProceeding.getCitationNumbers());

  }

  /**
   * test setCitationNumbers method.
   */
  @Test
  public void setCitationNumbers() {
    journal.setCitationNumbers(5);
    conferenceProceeding.setCitationNumbers(5);
    assertEquals(5, journal.getCitationNumbers());
    assertEquals(5, conferenceProceeding.getCitationNumbers());
  }

  /**
   * test getAge method.
   */
  @Test
  public void getAge() throws ImpactEstimationException {
    assertEquals(12, journal.getAge());
    assertEquals(12, conferenceProceeding.getAge());
  }

  /**
   * test bump method.
   */
  @Test
  public void bump() throws ImpactEstimationException {
    assertEquals(0, journal.bump());
    assertEquals(0, conferenceProceeding.bump());
    conferenceProceeding.setPublishingYear(2019);
    assertEquals(100, conferenceProceeding.bump());

  }

  /**
   * test getBI method.
   */
  @Test
  public void getBI() throws ImpactEstimationException {
    assertEquals(0.83, journal.getBI(), 0.01);
    assertEquals(0.83, conferenceProceeding.getBI(), 0.01);
  }

  /**
   * test estimateImpact method.
   */
  @Test
  public void estimateImpact() throws ImpactEstimationException {
    assertEquals(0.83, conferenceProceeding.estimateImpact(), 0.01);
    assertEquals(1.67, journal.estimateImpact(), 0.01);

    conferenceProceeding.setPublishingYear(2019);
    assertEquals(110.00, conferenceProceeding.estimateImpact(), 0.01);

  }
}