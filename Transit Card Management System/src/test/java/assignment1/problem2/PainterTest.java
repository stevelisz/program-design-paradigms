package assignment1.problem2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * This test class tests Painter class.
 */
public class PainterTest {

  private Painter painter;

  /**
   * set up Painter object.
   *
   * @throws Exception if input is invalid.
   */
  @Before
  public void setUp() throws Exception {
    List<String> testAwards = new ArrayList<>();
    testAwards.add("MVP");
    painter = new Painter("Kobe Bryant", 41, "basketball", testAwards);
  }

  /**
   * test getName method.
   */
  @Test
  public void getName() {
    assertEquals("Kobe Bryant", painter.getName());
  }

  /**
   * test getName method.
   */
  @Test
  public void setName() {
    painter.setName("test");
    assertEquals("test", painter.getName());
  }

  /**
   * test getName method.
   */
  @Test
  public void getAge() {
    assertEquals(41, painter.getAge());
  }

  /**
   * test getName method.
   */
  @Test
  public void setAge() {
    painter.setName("test");
    assertEquals("test", painter.getName());
  }

  /**
   * test getName method.
   */
  @Test
  public void getGenre() {
    assertEquals("basketball", painter.getGenre());
  }

  /**
   * test setGenre method.
   */
  @Test
  public void setGenre() {
    painter.setGenre("test");
    assertEquals("test", painter.getGenre());
  }

  /**
   * test getAwards method.
   */
  @Test
  public void getAwards() {
    List<String> test = new ArrayList<String>();
    test.add("MVP");
    assertEquals(test, painter.getAwards());
  }

  /**
   * test setAwards method.
   */
  @Test
  public void setAwards() {
    List<String> test = new ArrayList<String>();
    test.add("test");
    painter.setAwards(test);
    assertEquals(test, painter.getAwards());
  }
}