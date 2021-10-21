package assignment1.problem2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * This test class tests Musician class.
 */
public class MusicianTest {

  private Musician musician;

  /**
   * set up Musician object.
   *
   * @throws Exception if input is invalid.
   */
  @Before
  public void setUp() throws Exception {
    List<String> testAwards = new ArrayList<>();
    testAwards.add("MVP");
    musician = new Musician("Kobe Bryant", 41, "basketball", testAwards);
  }

  /**
   * test getName method.
   */
  @Test
  public void getName() {
    assertEquals("Kobe Bryant", musician.getName());
  }

  /**
   * test setName method.
   */
  @Test
  public void setName() {
    musician.setName("test");
    assertEquals("test", musician.getName());
  }

  /**
   * test getAge method.
   */
  @Test
  public void getAge() {
    assertEquals(41, musician.getAge());
  }

  /**
   * test setAge method.
   */
  @Test
  public void setAge() {
    musician.setName("test");
    assertEquals("test", musician.getName());
  }

  /**
   * test getGenre method.
   */
  @Test
  public void getGenre() {
    assertEquals("basketball", musician.getGenre());
  }

  /**
   * test setGenre method.
   */
  @Test
  public void setGenre() {
    musician.setGenre("test");
    assertEquals("test", musician.getGenre());
  }

  /**
   * test getAwards method.
   */
  @Test
  public void getAwards() {
    List<String> test = new ArrayList<String>();
    test.add("MVP");
    assertEquals(test, musician.getAwards());
  }

  /**
   * test setAwards method.
   */
  @Test
  public void setAwards() {
    List<String> test = new ArrayList<String>();
    test.add("test");
    musician.setAwards(test);
    assertEquals(test, musician.getAwards());
  }
}