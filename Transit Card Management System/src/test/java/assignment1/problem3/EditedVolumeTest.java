package assignment1.problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * This test class tests EditedVolume class using its own object.
 */
public class EditedVolumeTest {

  private EditedVolume editedVolume;
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
    editedVolume = new EditedVolume("testTitle", authors, 2018, 10,
        "testCom", 500);
  }

  /**
   * test getPublishingCompany method.
   */
  @Test
  public void getPublishingCompany() {
    assertEquals("testCom", editedVolume.getPublishingCompany());
  }

  /**
   * test setPublishingCompany method.
   */
  @Test
  public void setPublishingCompany() {
    editedVolume.setPublishingCompany("test");
    assertEquals("test", editedVolume.getPublishingCompany());
  }

  /**
   * test getPageNumber method.
   */
  @Test
  public void getPageNumber() {
    assertEquals(500, editedVolume.getPageNumber());
  }

  /**
   * test setPageNumber method.
   */
  @Test
  public void setPageNumber() {
    editedVolume.setPageNumber(250);
    assertEquals(250, editedVolume.getPageNumber());
  }

  /**
   * test getTitle method.
   */
  @Test
  public void getTitle() {
    assertEquals("testTitle", editedVolume.getTitle());
  }

  /**
   * test setTitle method.
   */
  @Test
  public void setTitle() {
    editedVolume.setTitle("123");
    assertEquals("123", editedVolume.getTitle());
  }

  /**
   * test getAuthors method.
   */
  @Test
  public void getAuthors() {
    String[] test = new String[1];
    test[0] = "author";
    assertArrayEquals(test, editedVolume.getAuthors());
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
    editedVolume.setAuthors(test2);
    assertArrayEquals(test, editedVolume.getAuthors());
  }

  /**
   * test getPublishingYear method.
   */
  @Test
  public void getPublishingYear() {
    assertEquals(2018, editedVolume.getPublishingYear());
  }

  /**
   * test setPublishingYear method.
   */
  @Test
  public void setPublishingYear() {
    editedVolume.setPublishingYear(2019);
    assertEquals(2019, editedVolume.getPublishingYear());
  }

  /**
   * test getCitationNumbers method.
   */
  @Test
  public void getCitationNumbers() {
    assertEquals(10, editedVolume.getCitationNumbers());
  }

  /**
   * test setCitationNumbers method.
   */
  @Test
  public void setCitationNumbers() {
    editedVolume.setCitationNumbers(5);
    assertEquals(5, editedVolume.getCitationNumbers());
  }

  /**
   * test getAge method.
   */
  @Test
  public void getAge() throws ImpactEstimationException {
    assertEquals(2, editedVolume.getAge());
  }

  /**
   * test bump method.
   */
  @Test
  public void bump() throws ImpactEstimationException {
    assertEquals(100, editedVolume.bump());
  }

  /**
   * test getBI method.
   */
  @Test
  public void getBI() throws ImpactEstimationException {
    assertEquals(5.00, editedVolume.getBI(), 0.01);
  }

  /**
   * test estimateImpact method.
   */
  @Test
  public void estimateImpact() throws ImpactEstimationException {
    assertEquals(120.00, editedVolume.estimateImpact(), 0.01);
  }

  /**
   * test factor method.
   */
  @Test
  public void factor() {
    assertEquals(4, editedVolume.factor());
  }
}