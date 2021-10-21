package assignment1.problem2;

import java.util.List;

/**
 * This concrete class represents Painters. It extends Artist abstract class and has all the
 * properties from Artist class.
 */
public class Painter extends Artist {

  /**
   * @param name   inherits from parent class.
   * @param age    inherits from parent class.
   * @param genre  inherits from parent class.
   * @param awards inherits from parent class.
   */
  public Painter(String name, int age, String genre, List<String> awards) {
    super(name, age, genre, awards);
  }
}
