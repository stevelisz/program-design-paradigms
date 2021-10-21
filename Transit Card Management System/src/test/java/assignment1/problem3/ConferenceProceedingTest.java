package assignment1.problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * This test class tests ConferenceProceeding class using ConferenceProceeding object.
 */
public class ConferenceProceedingTest {

  private ConferenceProceeding conferenceProceeding;
  private String[] authors;

  /**
   * set up objects.
   *
   * @throws Exception if input is invalid.
   */
  @Before
  public void setUp() throws Exception {
    authors = new String[2];
    authors[0] = "author1";
    authors[1] = "author2";
    conferenceProceeding = new ConferenceProceeding("testTitle", authors, 2018,
        10, "testConf", "Boston");
  }

  /**
   * test getTitle method.
   */
  @Test
  public void getTitle() {
    assertEquals("testTitle", conferenceProceeding.getTitle());
  }

  /**
   * test setTitle method.
   */
  @Test
  public void setTitle() {
    conferenceProceeding.setTitle("test");
    assertEquals("test", conferenceProceeding.getTitle());
  }

  /**
   * test getAuthors method.
   */
  @Test
  public void getAuthors() {
    String[] test = new String[2];
    test[0] = "author1";
    test[1] = "author2";
    assertArrayEquals(test, conferenceProceeding.getAuthors());
  }

  /**
   * test setAuthors method.
   */
  @Test
  public void setAuthors() {
    String[] test = new String[2];
    test[0] = "author1";
    test[1] = "author2";
    String[] test2 = new String[2];
    test2[0] = "author1";
    test2[1] = "author2";
    conferenceProceeding.setAuthors(test);
    assertArrayEquals(test2, conferenceProceeding.getAuthors());
  }

  /**
   * test getPublishingYear method.
   */
  @Test
  public void getPublishingYear() {
    assertEquals(2018, conferenceProceeding.getPublishingYear());

  }

  /**
   * test setPublishingYear method.
   */
  @Test
  public void setPublishingYear() {
    conferenceProceeding.setPublishingYear(2020);
    assertEquals(2020, conferenceProceeding.getPublishingYear());
  }

  /**
   * test getCitationNumbers method.
   */
  @Test
  public void getCitationNumbers() {
    assertEquals(10, conferenceProceeding.getCitationNumbers());

  }

  /**
   * test setCitationNumbers method.
   */
  @Test
  public void setCitationNumbers() {
    conferenceProceeding.setCitationNumbers(25);
    assertEquals(25, conferenceProceeding.getCitationNumbers());
  }

  /**
   * test getAge method.
   */
  @Test
  public void getAge() throws ImpactEstimationException {
    assertEquals(2, conferenceProceeding.getAge());
  }

  /**
   * test bump method.
   */
  @Test
  public void bump() throws ImpactEstimationException {
    assertEquals(100, conferenceProceeding.bump());
  }

  /**
   * test getBI method.
   */
  @Test
  public void getBI() throws ImpactEstimationException {
    assertEquals(5.00, conferenceProceeding.getBI(), 0.01);
  }

  /**
   * test estimateImpact method.
   */
  @Test
  public void estimateImpact() throws ImpactEstimationException {
    assertEquals(105.00, conferenceProceeding.estimateImpact(), 0.01);

  }

  /**
   * test factor method.
   */
  @Test
  public void factor() {
    assertEquals(1, conferenceProceeding.factor());
  }

  /**
   * test getConferenceName method.
   */
  @Test
  public void getConferenceName() {
    assertEquals("testConf", conferenceProceeding.getConferenceName());
  }

  /**
   * test setConferenceName method.
   */
  @Test
  public void setConferenceName() {
    conferenceProceeding.setConferenceName("test");
    assertEquals("test", conferenceProceeding.getConferenceName());
  }

  /**
   * test getConferenceLocation method.
   */
  @Test
  public void getConferenceLocation() {
    assertEquals("Boston", conferenceProceeding.getConferenceLocation());
  }

  /**
   * test setConferenceLocation method.
   */
  @Test
  public void setConferenceLocation() {
    conferenceProceeding.setConferenceLocation("Seattle");
    assertEquals("Seattle", conferenceProceeding.getConferenceLocation());
  }
}