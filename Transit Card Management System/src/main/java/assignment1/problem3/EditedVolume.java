package assignment1.problem3;

/**
 * This concrete class extends abstract class Book.
 */
public class EditedVolume extends Book {

  /**
   * constructor that constructs following properties.
   *
   * @param title             inherits from parent class.
   * @param authors           inherits from parent class.
   * @param publishingYear    inherits from parent class.
   * @param citationNumbers   inherits from parent class.
   * @param publishingCompany inherits from parent class.
   * @param pageNumber        inherits from parent class.
   */
  public EditedVolume(String title, String[] authors, int publishingYear, int citationNumbers,
      String publishingCompany, int pageNumber) {
    super(title, authors, publishingYear, citationNumbers, publishingCompany, pageNumber);
  }

  /**
   * override the abstract method in Publication class to get the factor.
   *
   * @return an integer.
   */
  @Override
  public int factor() {
    return 4;
  }

}
