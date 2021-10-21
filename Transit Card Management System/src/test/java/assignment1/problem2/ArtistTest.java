package assignment1.problem2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * This test class test Artist abstract class using some concrete class object like Poet and
 * Dancer.
 */
public class ArtistTest {

  private Dancer dancer;
  private Poet poet;

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
    poet = new Poet("Kobe Bryant", 41, "basketball", testAwards);
    testMovies.add("HAHA");
    testSeries.add("HEHE");
    testOtherMultimedia.add("LOL");
    dancer = new Dancer("John Smith", 88, "modern", testAwards, testMovies, testSeries,
        testOtherMultimedia);
  }

  /**
   * test getName method.
   */
  @Test
  public void getName() {
    assertEquals("Kobe Bryant", poet.getName());
    assertEquals("John Smith", dancer.getName());
  }

  /**
   * test setName method.
   */
  @Test
  public void setName() {
    dancer.setName("test name");
    poet.setName("goat");
    assertEquals("test name", dancer.getName());
    assertEquals("goat", poet.getName());

  }

  /**
   * test getAge method.
   */
  @Test
  public void getAge() {
    assertEquals(41, poet.getAge());
    assertEquals(88, dancer.getAge());
  }

  /**
   * test setAge method.
   */
  @Test
  public void setAge() {
    dancer.setAge(18);
    poet.setAge(18);
    assertEquals(18, dancer.getAge());
    assertEquals(18, poet.getAge());

  }

  /**
   * test getGenre method.
   */
  @Test
  public void getGenre() {
    assertEquals("modern", dancer.getGenre());
    assertEquals("basketball", poet.getGenre());
  }

  /**
   * test setGenre method.
   */
  @Test
  public void setGenre() {
    dancer.setGenre("vintage");
    poet.setGenre("lakers");
    assertEquals("vintage", dancer.getGenre());
    assertEquals("lakers", poet.getGenre());
  }

  /**
   * test getAwards method.
   */
  @Test
  public void getAwards() {
    List<String> test = new ArrayList<>();
    test.add("MVP");
    assertTrue(poet.getAwards().equals(test));
    assertTrue(dancer.getAwards().equals(test));
  }

  /**
   * test setAwards method.
   */
  @Test
  public void setAwards() {
    List<String> test = new ArrayList<>();
    test.add("test");
    poet.setAwards(test);
    dancer.setAwards(test);
    assertEquals(test, poet.getAwards());
    assertEquals(test, dancer.getAwards());

  }
}