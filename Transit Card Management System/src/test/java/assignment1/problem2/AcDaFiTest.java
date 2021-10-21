package assignment1.problem2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * this test class tests AcDaFi abstract class using its three sub concrete class Actor, Dancer, and
 * Filmmaker objects.
 */
public class AcDaFiTest {

  private Actor actor;
  private Dancer dancer;
  private Filmmaker filmmaker;

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
    dancer = new Dancer("Kobe Bryant", 41, "basketball", testAwards, testMovies, testSeries,
        testOtherMultimedia);
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
    assertEquals(test, actor.getMovies());
    assertEquals(test, dancer.getMovies());
    assertEquals(test, filmmaker.getMovies());

  }

  /**
   * test setMovies method.
   */
  @Test
  public void setMovies() {
    List<String> test = new ArrayList<String>();
    test.add("test");
    actor.setMovies(test);
    dancer.setMovies(test);
    filmmaker.setMovies(test);
    assertEquals(test, actor.getMovies());
    assertEquals(test, dancer.getMovies());
    assertEquals(test, filmmaker.getMovies());


  }

  /**
   * test getSeries method.
   */
  @Test
  public void getSeries() {
    List<String> test = new ArrayList<String>();
    test.add("5rings");
    assertEquals(test, actor.getSeries());
    assertEquals(test, dancer.getSeries());
    assertEquals(test, filmmaker.getSeries());
  }

  /**
   * test setSeries method.
   */
  @Test
  public void setSeries() {
    List<String> test = new ArrayList<String>();
    test.add("test");
    actor.setSeries(test);
    dancer.setSeries(test);
    filmmaker.setSeries(test);
    assertEquals(test, actor.getSeries());
    assertEquals(test, dancer.getSeries());
    assertEquals(test, filmmaker.getSeries());
  }

  /**
   * test getOtherMultimedia method.
   */
  @Test
  public void getOtherMultimedia() {
    List<String> test = new ArrayList<String>();
    test.add("father");
    assertEquals(test, actor.getOtherMultimedia());
    assertEquals(test, dancer.getOtherMultimedia());
    assertEquals(test, filmmaker.getOtherMultimedia());
  }

  /**
   * test setOtherMultimedia method.
   */
  @Test
  public void setOtherMultimedia() {
    List<String> test = new ArrayList<String>();
    test.add("test");
    actor.setOtherMultimedia(test);
    dancer.setOtherMultimedia(test);
    filmmaker.setOtherMultimedia(test);
    assertEquals(test, actor.getOtherMultimedia());
    assertEquals(test, dancer.getOtherMultimedia());
    assertEquals(test, filmmaker.getOtherMultimedia());
  }
}