package assignment1.problem2;

import java.util.List;

/**
 * This abstract class represents artists which will be extended by another abstract class AcDaFi
 * and some concrete classes.
 */
public abstract class Artist {

  private String name;
  private int age;
  private String genre;
  private List<String> awards;

  /**
   * Constructor that constructs following universal properties. Exception will be thrown if input
   * is invalid.
   *
   * @param name   name of the artist.
   * @param age    age of the artist.
   * @param genre  genre of the artist.
   * @param awards awards of the artist.
   */
  public Artist(String name, int age, String genre, List<String> awards) {
    if (name.isEmpty() || name == null) {
      throw new IllegalArgumentException("Invalid name.");
    }
    if (age < 0 || age > 128) {
      throw new IllegalArgumentException("Invalid age.");
    }
    this.name = name;
    this.age = age;
    this.genre = genre;
    this.awards = awards;
  }

  /**
   * get name of the artist.
   *
   * @return name as a string.
   */
  public String getName() {
    return name;
  }

  /**
   * set name of the artist.
   *
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * get age of the artist.
   *
   * @return age as an integer.
   */
  public int getAge() {
    return age;
  }

  /**
   * set age of the artist.
   *
   * @param age
   */
  public void setAge(int age) {
    this.age = age;
  }

  /**
   * get genre of the artist.
   *
   * @return genre as a string.
   */
  public String getGenre() {
    return genre;
  }

  /**
   * set genre of the artist.
   *
   * @param genre
   */
  public void setGenre(String genre) {
    this.genre = genre;
  }

  /**
   * get a list of awards of the artist.
   *
   * @return awards as a list.
   */
  public List<String> getAwards() {
    return awards;
  }

  /**
   * set award list of the artist.
   *
   * @param awards
   */
  public void setAwards(List<String> awards) {
    this.awards = awards;
  }


}
