package assignment1.problem2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * this test class tests Actor class.
 */
public class ActorTest {

  private Actor actor;

  /**
   * set up objects.
   *
   * @throws Exception if input is invalid.
   */
  @Before
  public void setUp() throws Exception {
    List<String> testAwards = new ArrayList<String>();
    List<String> testMovies = new ArrayList<String>();
    List<String> testSeries = new ArrayList<String>();
    List<String> testOtherMultimedia = new ArrayList<String>();

    testAwards.add("MVP");
    testMovies.add("lakers");
    testSeries.add("5rings");
    testOtherMultimedia.add("father");

    actor = new Actor("Kobe Bryant", 41, "basketball", testAwards, testMovies, testSeries,
        testOtherMultimedia);
  }

  /**
   * test getMovies method.
   */
  @Test
  public void getMovies() {
    List<String> test = new ArrayList<String>();
    test.add("lakers");
    assertEquals(test, actor.getMovies());
  }

  /**
   * test setMovies method.
   */
  @Test
  public void setMovies() {
    List<String> test = new ArrayList<String>();
    test.add("test");
    actor.setMovies(test);
    assertEquals(test, actor.getMovies());
  }

  /**
   * test getSeries method.
   */
  @Test
  public void getSeries() {
    List<String> test = new ArrayList<String>();
    test.add("5rings");
    assertEquals(test, actor.getSeries());
  }

  /**
   * test setSeries method.
   */
  @Test
  public void setSeries() {
    List<String> test = new ArrayList<String>();
    test.add("test");
    actor.setSeries(test);
    assertEquals(test, actor.getSeries());
  }

  /**
   * test getOtherMultimedia method.
   */
  @Test
  public void getOtherMultimedia() {
    List<String> test = new ArrayList<String>();
    test.add("father");
    assertEquals(test, actor.getOtherMultimedia());
  }

  /**
   * test setOtherMultimedia method.
   */
  @Test
  public void setOtherMultimedia() {
    List<String> test = new ArrayList<String>();
    test.add("test");
    actor.setOtherMultimedia(test);
    assertEquals(test, actor.getOtherMultimedia());
  }

  /**
   * test getName method.
   */
  @Test
  public void getName() {
    assertEquals("Kobe Bryant", actor.getName());
  }

  /**
   * test setName method.
   */
  @Test
  public void setName() {
    actor.setName("test");
    assertEquals("test", actor.getName());
  }

  /**
   * test getAge method.
   */
  @Test
  public void getAge() {
    assertEquals(41, actor.getAge());
  }

  /**
   * test setAge method.
   */
  @Test
  public void setAge() {
    actor.setName("test");
    assertEquals("test", actor.getName());
  }

  /**
   * test getGenre method.
   */
  @Test
  public void getGenre() {
    assertEquals("basketball", actor.getGenre());
  }

  /**
   * test setGenre method.
   */
  @Test
  public void setGenre() {
    actor.setGenre("test");
    assertEquals("test", actor.getGenre());
  }

  /**
   * test getAwards method.
   */
  @Test
  public void getAwards() {
    List<String> test = new ArrayList<String>();
    test.add("MVP");
    assertEquals(test, actor.getAwards());
  }

  /**
   * test setAwards method.
   */
  @Test
  public void setAwards() {
    List<String> test = new ArrayList<String>();
    test.add("test");
    actor.setAwards(test);
    assertEquals(test, actor.getAwards());
  }
}