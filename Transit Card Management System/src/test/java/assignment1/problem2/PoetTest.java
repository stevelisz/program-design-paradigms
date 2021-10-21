package assignment1.problem2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * This test class test Poet class.
 */
public class PoetTest {

  private Poet poet;

  /**
   * set up Poet object.
   *
   * @throws Exception if input is invalid.
   */
  @Before
  public void setUp() throws Exception {
    List<String> testAwards = new ArrayList<>();
    testAwards.add("MVP");
    poet = new Poet("Kobe Bryant", 41, "basketball", testAwards);
  }

  /**
   * test getName method.
   */
  @Test
  public void getName() {
    assertEquals("Kobe Bryant", poet.getName());
  }

  /**
   * test setName method.
   */
  @Test
  public void setName() {
    poet.setName("test");
    assertEquals("test", poet.getName());
  }

  /**
   * test getAge method.
   */
  @Test
  public void getAge() {
    assertEquals(41, poet.getAge());
  }

  /**
   * test setAge method.
   */
  @Test
  public void setAge() {
    poet.setName("test");
    assertEquals("test", poet.getName());
  }

  /**
   * test getGenre method.
   */
  @Test
  public void getGenre() {
    assertEquals("basketball", poet.getGenre());
  }

  /**
   * test setGenre method.
   */
  @Test
  public void setGenre() {
    poet.setGenre("test");
    assertEquals("test", poet.getGenre());
  }

  /**
   * test getAwards method.
   */
  @Test
  public void getAwards() {
    List<String> test = new ArrayList<String>();
    test.add("MVP");
    assertEquals(test, poet.getAwards());
  }

  /**
   * test setAwards method.
   */
  @Test
  public void setAwards() {
    List<String> test = new ArrayList<String>();
    test.add("test");
    poet.setAwards(test);
    assertEquals(test, poet.getAwards());
  }
}