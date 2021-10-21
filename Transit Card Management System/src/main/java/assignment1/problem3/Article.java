package assignment1.problem3;

/**
 * This abstract class extends Publications.
 */
public abstract class Article extends Publications {

  /**
   * Constructor that constructs following properties.
   *
   * @param title           inherits from parent class.
   * @param authors         inherits from parent class.
   * @param publishingYear  inherits from parent class.
   * @param citationNumbers inherits from parent class.
   */
  public Article(String title, String[] authors, int publishingYear, int citationNumbers) {
    super(title, authors, publishingYear, citationNumbers);
  }
}
