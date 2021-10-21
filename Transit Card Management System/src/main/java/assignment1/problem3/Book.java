package assignment1.problem3;

/**
 * This abstract class extends Publications class with few extra properties.
 */
public abstract class Book extends Publications {

  private String publishingCompany;
  private int pageNumber;

  /**
   * Constructor that constructs following properties.
   *
   * @param title             inherits from parent class.
   * @param authors           inherits from parent class.
   * @param publishingYear    inherits from parent class.
   * @param citationNumbers   inherits from parent class.
   * @param publishingCompany publishing company of the Book.
   * @param pageNumber        page number of the Book.
   */
  public Book(String title, String[] authors, int publishingYear, int citationNumbers,
      String publishingCompany, int pageNumber) {
    super(title, authors, publishingYear, citationNumbers);
    this.publishingCompany = publishingCompany;
    this.pageNumber = pageNumber;
  }

  /**
   * get publishing company of the book.
   *
   * @return a string.
   */
  public String getPublishingCompany() {
    return publishingCompany;
  }

  /**
   * set publishing company of the book.
   *
   * @param publishingCompany
   */
  public void setPublishingCompany(String publishingCompany) {
    this.publishingCompany = publishingCompany;
  }

  /**
   * get page number of the book.
   *
   * @return an integer.
   */
  public int getPageNumber() {
    return pageNumber;
  }

  /**
   * set page number of the book.
   *
   * @param pageNumber
   */
  public void setPageNumber(int pageNumber) {
    this.pageNumber = pageNumber;
  }
}
