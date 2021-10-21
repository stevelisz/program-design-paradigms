package assignment1.problem2;

import java.util.List;

/**
 * This abstract class extends abstract class Artist to demonstrate few other properties that some
 * other concrete classes use.
 */
public abstract class AcDaFi extends Artist {

  private List<String> movies;
  private List<String> series;
  private List<String> otherMultimedia;

  /**
   * constructor that constructs following properties.
   *
   * @param name            inherits from parent class.
   * @param age             inherits from parent class.
   * @param genre           inherits from parent class.
   * @param awards          inherits from parent class.
   * @param movies          list of movies that actors/dancers/filmmakers get involved.
   * @param series          list of series that actors/dancers/filmmakers get involved.
   * @param otherMultimedia list of other multimedia that actors/dancers/filmmakers get involved.
   */
  public AcDaFi(String name, int age, String genre, List<String> awards, List<String> movies,
      List<String> series, List<String> otherMultimedia) {
    super(name, age, genre, awards);
    this.movies = movies;
    this.series = series;
    this.otherMultimedia = otherMultimedia;


  }

  /**
   * get list of movies that actors/dancers/filmmakers get involved.
   *
   * @return the list.
   */
  public List<String> getMovies() {
    return movies;
  }

  /**
   * set list of movies that actors/dancers/filmmakers get involved.
   *
   * @param movies
   */
  public void setMovies(List<String> movies) {
    this.movies = movies;
  }

  /**
   * get list of series that actors/dancers/filmmakers get involved.
   *
   * @return the list.
   */
  public List<String> getSeries() {
    return series;
  }

  /**
   * set list of movies that actors/dancers/filmmakers get involved.
   *
   * @param series
   */
  public void setSeries(List<String> series) {
    this.series = series;
  }

  /**
   * get list of other multimedia that actors/dancers/filmmakers get involved.
   *
   * @return the list.
   */
  public List<String> getOtherMultimedia() {
    return otherMultimedia;
  }

  /**
   * set list of movies that actors/dancers/filmmakers get involved.
   *
   * @param otherMultimedia
   */
  public void setOtherMultimedia(List<String> otherMultimedia) {
    this.otherMultimedia = otherMultimedia;
  }
}
