package assignment1.problem2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * This test class tests Dancer class.
 */
public class DancerTest {

  private Dancer dancer;

  /**
   * set up Dancer object.
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

    dancer = new Dancer("Kobe Bryant", 41, "basketball", testAwards, testMovies, testSeries,
        testOtherMultimedia);
  }

  /**
   * test getMovies method.
   */
  @Test
  public void getMovies() {
    List<String> test = new ArrayList<String>();
    test.add("lakers");
    assertEquals(test, dancer.getMovies());
  }

  /**
   * test setMovies method.
   */
  @Test
  public void setMovies() {
    List<String> test = new ArrayList<String>();
    test.add("test");
    dancer.setMovies(test);
    assertEquals(test, dancer.getMovies());
  }

  /**
   * test getSeries method.
   */
  @Test
  public void getSeries() {
    List<String> test = new ArrayList<String>();
    test.add("5rings");
    assertEquals(test, dancer.getSeries());
  }

  /**
   * test setSeries method.
   */
  @Test
  public void setSeries() {
    List<String> test = new ArrayList<String>();
    test.add("test");
    dancer.setSeries(test);
    assertEquals(test, dancer.getSeries());
  }

  /**
   * test getOtherMultimedia method.
   */
  @Test
  public void getOtherMultimedia() {
    List<String> test = new ArrayList<String>();
    test.add("father");
    assertEquals(test, dancer.getOtherMultimedia());
  }

  /**
   * test setOtherMultimedia method.
   */
  @Test
  public void setOtherMultimedia() {
    List<String> test = new ArrayList<String>();
    test.add("test");
    dancer.setOtherMultimedia(test);
    assertEquals(test, dancer.getOtherMultimedia());
  }

  /**
   * test getName method.
   */
  @Test
  public void getName() {
    assertEquals("Kobe Bryant", dancer.getName());
  }

  /**
   * test setName method.
   */
  @Test
  public void setName() {
    dancer.setName("test");
    assertEquals("test", dancer.getName());
  }

  /**
   * test getAge method.
   */
  @Test
  public void getAge() {
    assertEquals(41, dancer.getAge());
  }

  /**
   * test setAge method.
   */
  @Test
  public void setAge() {
    dancer.setName("test");
    assertEquals("test", dancer.getName());
  }

  /**
   * test getGenre method.
   */
  @Test
  public void getGenre() {
    assertEquals("basketball", dancer.getGenre());
  }

  /**
   * test setGenre method.
   */
  @Test
  public void setGenre() {
    dancer.setGenre("test");
    assertEquals("test", dancer.getGenre());
  }

  /**
   * test getAwards method.
   */
  @Test
  public void getAwards() {
    List<String> test = new ArrayList<String>();
    test.add("MVP");
    assertEquals(test, dancer.getAwards());
  }

  /**
   * test setAwards method.
   */
  @Test
  public void setAwards() {
    List<String> test = new ArrayList<String>();
    test.add("test");
    dancer.setAwards(test);
    assertEquals(test, dancer.getAwards());
  }
}