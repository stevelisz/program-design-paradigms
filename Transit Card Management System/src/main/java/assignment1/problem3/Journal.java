package assignment1.problem3;

/**
 * This concrete class extends abstract class Article with few extra properties.
 */
public class Journal extends Article {

  private String publisher;
  private String[] editors;

  /**
   * constructor that constructs following properties.
   *
   * @param title           inherits from parent class.
   * @param authors         inherits from parent class.
   * @param publishingYear  inherits from parent class.
   * @param citationNumbers inherits from parent class.
   * @param publisher       publisher of the journal.
   * @param editors         editors of the journal.
   */
  public Journal(String title, String[] authors, int publishingYear, int citationNumbers,
      String publisher, String[] editors) {
    super(title, authors, publishingYear, citationNumbers);
    this.publisher = publisher;
    this.editors = editors;
  }

  /**
   * override the abstract method in Publications class to get factor.
   *
   * @return an integer.
   */
  @Override
  public int factor() {
    return 2;
  }

  /**
   * get the publisher of the journal.
   *
   * @return a string.
   */
  public String getPublisher() {
    return publisher;
  }

  /**
   * set the publisher of the journal.
   *
   * @param publisher
   */
  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  /**
   * get the editors of the journal.
   *
   * @return an array.
   */
  public String[] getEditors() {
    return editors;
  }

  /**
   * set the editors of the journal.
   *
   * @param editors
   */
  public void setEditors(String[] editors) {
    this.editors = editors;
  }
}
