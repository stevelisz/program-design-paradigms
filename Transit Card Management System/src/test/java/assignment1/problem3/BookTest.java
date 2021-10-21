package assignment1.problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * This test class tests Book class using subclass objects, Textbook and EditedVolume.
 */
public class BookTest {

  private Textbook textbook;
  private EditedVolume editedVolume;
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
    textbook = new Textbook("testTitle", authors, 2018, 10,
        "testCom", 250);
    editedVolume = new EditedVolume("testTitle", authors, 2018,
        10, "testCom", 250);
  }

  /**
   * test getTitle method.
   */
  @Test
  public void getTitle() {
    assertEquals("testTitle", textbook.getTitle());
    assertEquals("testTitle", editedVolume.getTitle());


  }

  /**
   * test setTitle method.
   */
  @Test
  public void setTitle() {
    textbook.setTitle("test");
    editedVolume.setTitle("test");
    assertEquals("test", textbook.getTitle());
    assertEquals("test", editedVolume.getTitle());
  }

  /**
   * test getAuthors method.
   */
  @Test
  public void getAuthors() {
    String[] test = new String[2];
    test[0] = "author1";
    test[1] = "author2";

    assertArrayEquals(test, textbook.getAuthors());
    assertArrayEquals(test, editedVolume.getAuthors());


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

    textbook.setAuthors(test);
    editedVolume.setAuthors(test);

    assertArrayEquals(test2, textbook.getAuthors());
    assertArrayEquals(test2, editedVolume.getAuthors());
  }

  /**
   * test getPublishingYear method.
   */
  @Test
  public void getPublishingYear() {
    assertEquals(2018, textbook.getPublishingYear());
    assertEquals(2018, editedVolume.getPublishingYear());
  }

  /**
   * test setPublishingYear method.
   */
  @Test
  public void setPublishingYear() {

    textbook.setPublishingYear(2019);
    editedVolume.setPublishingYear(2019);

    assertEquals(2019, textbook.getPublishingYear());
    assertEquals(2019, editedVolume.getPublishingYear());

  }

  /**
   * test getCitationNumbers method.
   */
  @Test
  public void getCitationNumbers() {
    assertEquals(10, textbook.getCitationNumbers());
    assertEquals(10, editedVolume.getCitationNumbers());
  }

  /**
   * test setCitationNumbers method.
   */
  @Test
  public void setCitationNumbers() {
    textbook.setCitationNumbers(2019);
    editedVolume.setCitationNumbers(2019);

    assertEquals(2019, textbook.getCitationNumbers());
    assertEquals(2019, editedVolume.getCitationNumbers());

  }

  /**
   * test getAge method.
   */
  @Test
  public void getAge() throws ImpactEstimationException {
    assertEquals(2, textbook.getAge());
    assertEquals(2, editedVolume.getAge());

  }

  /**
   * test bump method.
   */
  @Test
  public void bump() throws ImpactEstimationException {
    assertEquals(100, textbook.bump());
    assertEquals(100, editedVolume.bump());
  }

  /**
   * test getBI method.
   */
  @Test
  public void getBI() throws ImpactEstimationException {
    assertEquals(5.00, textbook.getBI(), 0.01);
    assertEquals(5.00, editedVolume.getBI(), 0.01);

  }

  /**
   * test estimateImpact method.
   */
  @Test
  public void estimateImpact() throws ImpactEstimationException {
    assertEquals(120.00, textbook.estimateImpact(), 0.01);
    assertEquals(120.00, editedVolume.estimateImpact(), 0.01);

  }

  /**
   * test getPublishingCompany method.
   */
  @Test
  public void getPublishingCompany() {
    assertEquals("testCom", textbook.getPublishingCompany());
    assertEquals("testCom", editedVolume.getPublishingCompany());

  }

  /**
   * test setPublishingCompany method.
   */
  @Test
  public void setPublishingCompany() {
    textbook.setPublishingCompany("test");
    editedVolume.setPublishingCompany("test");
    assertEquals("test", textbook.getPublishingCompany());
    assertEquals("test", editedVolume.getPublishingCompany());
  }

  /**
   * test getPageNumber method.
   */
  @Test
  public void getPageNumber() {
    assertEquals(250, textbook.getPageNumber());
    assertEquals(250, editedVolume.getPageNumber());
  }

  /**
   * test setPageNumber method.
   */
  @Test
  public void setPageNumber() {
    textbook.setPageNumber(200);
    editedVolume.setPageNumber(200);
    assertEquals(200, textbook.getPageNumber());
    assertEquals(200, editedVolume.getPageNumber());
  }
}