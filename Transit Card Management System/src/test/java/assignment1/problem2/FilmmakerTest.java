package assignment1.problem2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * This test class tests Filmmaker class.
 */
public class FilmmakerTest {

  private Filmmaker filmmaker;

  /**
   * set up Filmmaker object.
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

    filmmaker = new Filmmaker("Kobe Bryant", 41, "basketball", testAwards, testMovies, testSeries,
        testOtherMultimedia);
  }

  /**
   * test getMovies method.
   */
  @Test
  public void getMovies() {
    List<String> test = new ArrayList<String>();
    test.add("lakers");
    assertEquals(test, filmmaker.getMovies());
  }

  /**
   * test setMovies method.
   */
  @Test
  public void setMovies() {
    List<String> test = new ArrayList<String>();
    test.add("test");
    filmmaker.setMovies(test);
    assertEquals(test, filmmaker.getMovies());
  }

  /**
   * test getSeries method.
   */
  @Test
  public void getSeries() {
    List<String> test = new ArrayList<String>();
    test.add("5rings");
    assertEquals(test, filmmaker.getSeries());
  }

  /**
   * test setSeries method.
   */
  @Test
  public void setSeries() {
    List<String> test = new ArrayList<String>();
    test.add("test");
    filmmaker.setSeries(test);
    assertEquals(test, filmmaker.getSeries());
  }

  /**
   * test getOtherMultimedia method.
   */
  @Test
  public void getOtherMultimedia() {
    List<String> test = new ArrayList<String>();
    test.add("father");
    assertEquals(test, filmmaker.getOtherMultimedia());
  }

  /**
   * test setOtherMultimedia method.
   */
  @Test
  public void setOtherMultimedia() {
    List<String> test = new ArrayList<String>();
    test.add("test");
    filmmaker.setOtherMultimedia(test);
    assertEquals(test, filmmaker.getOtherMultimedia());
  }

  /**
   * test getName method.
   */
  @Test
  public void getName() {
    assertEquals("Kobe Bryant", filmmaker.getName());
  }

  /**
   * test setName method.
   */
  @Test
  public void setName() {
    filmmaker.setName("test");
    assertEquals("test", filmmaker.getName());
  }

  /**
   * test getAge method.
   */
  @Test
  public void getAge() {
    assertEquals(41, filmmaker.getAge());
  }

  /**
   * test setAge method.
   */
  @Test
  public void setAge() {
    filmmaker.setName("test");
    assertEquals("test", filmmaker.getName());
  }

  /**
   * test getGenre method.
   */
  @Test
  public void getGenre() {
    assertEquals("basketball", filmmaker.getGenre());
  }

  /**
   * test setGenre method.
   */
  @Test
  public void setGenre() {
    filmmaker.setGenre("test");
    assertEquals("test", filmmaker.getGenre());
  }

  /**
   * test getAwards method.
   */
  @Test
  public void getAwards() {
    List<String> test = new ArrayList<String>();
    test.add("MVP");
    assertEquals(test, filmmaker.getAwards());
  }

  /**
   * test setAwards method.
   */
  @Test
  public void setAwards() {
    List<String> test = new ArrayList<String>();
    test.add("test");
    filmmaker.setAwards(test);
    assertEquals(test, filmmaker.getAwards());
  }
}