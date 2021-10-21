package assignment1.problem2;

import java.util.List;

/**
 * This concrete class represents actors. Itextends AcDaFi abstract class and has all the properties
 * from AcDaFi class.
 */
public class Actor extends AcDaFi {

  /**
   * @param name            inherits from parent class.
   * @param age             inherits from parent class.
   * @param genre           inherits from parent class.
   * @param awards          inherits from parent class.
   * @param movies          inherits from parent class.
   * @param series          inherits from parent class.
   * @param otherMultimedia inherits from parent class.
   */
  public Actor(String name, int age, String genre, List<String> awards,
      List<String> movies, List<String> series, List<String> otherMultimedia) {
    super(name, age, genre, awards, movies, series, otherMultimedia);
  }
}



