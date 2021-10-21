package assignment1.problem2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * This test class tests Photographer class.
 */
public class PhotographerTest {

  private Photographer photographer;

  /**
   * set up Photographer object.
   *
   * @throws Exception if input is invalid.
   */
  @Before
  public void setUp() throws Exception {
    List<String> testAwards = new ArrayList<>();
    testAwards.add("MVP");
    photographer = new Photographer("Kobe Bryant", 41, "basketball", testAwards);
  }

  /**
   * test getName method.
   */
  @Test
  public void getName() {
    assertEquals("Kobe Bryant", photographer.getName());
  }

  /**
   * test setName method.
   */
  @Test
  public void setName() {
    photographer.setName("test");
    assertEquals("test", photographer.getName());
  }

  /**
   * test getAge method.
   */
  @Test
  public void getAge() {
    assertEquals(41, photographer.getAge());
  }

  /**
   * test setAge method.
   */
  @Test
  public void setAge() {
    photographer.setName("test");
    assertEquals("test", photographer.getName());
  }

  /**
   * test getGenre method.
   */
  @Test
  public void getGenre() {
    assertEquals("basketball", photographer.getGenre());
  }

  /**
   * test setGenre method.
   */
  @Test
  public void setGenre() {
    photographer.setGenre("test");
    assertEquals("test", photographer.getGenre());
  }

  /**
   * test getAwards method.
   */
  @Test
  public void getAwards() {
    List<String> test = new ArrayList<String>();
    test.add("MVP");
    assertEquals(test, photographer.getAwards());
  }

  /**
   * test setAwards method.
   */
  @Test
  public void setAwards() {
    List<String> test = new ArrayList<String>();
    test.add("test");
    photographer.setAwards(test);
    assertEquals(test, photographer.getAwards());
  }
}