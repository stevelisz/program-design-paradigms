package assignment1.problem3;

import java.util.Calendar;

/**
 * This abstracts class represents publications and will be extended by two other abstract class,
 * Article and Book.
 */
public abstract class Publications {

  String title;
  String[] authors;
  Integer publishingYear;
  Integer citationNumbers;

  /**
   * constructors that constructs following properties.
   *
   * @param title           Title of the publication as a string.
   * @param authors         Authors of the publication as an array.
   * @param publishingYear  Publishing year of the publication as an integer.
   * @param citationNumbers Citation numbers of the publication as an integer.
   */
  public Publications(String title, String[] authors, int publishingYear, int citationNumbers) {
    if (title.isEmpty() || title == null || authors == null || publishingYear < 0
        || citationNumbers < 0) {
      throw new IllegalArgumentException("Invalid input");
    }
    this.title = title;
    this.authors = authors;
    this.publishingYear = publishingYear;
    this.citationNumbers = citationNumbers;
  }

  /**
   * get the title of the publication.
   *
   * @return a string.
   */
  public String getTitle() {
    return title;
  }

  /**
   * set the title of the publication.
   *
   * @param title
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * get the authors of the publication.
   *
   * @return an array.
   */
  public String[] getAuthors() {
    return authors;
  }

  /**
   * set the authors of the publication.
   *
   * @param authors
   */
  public void setAuthors(String[] authors) {
    this.authors = authors;
  }

  /**
   * get the publishing year of the publication.
   *
   * @return an integer.
   */
  public int getPublishingYear() {
    return publishingYear;
  }

  /**
   * set the publishing year of the publication.
   *
   * @param publishingYear
   */
  public void setPublishingYear(int publishingYear) {
    this.publishingYear = publishingYear;
  }

  /**
   * get citation number of the publication.
   *
   * @return an integer.
   */
  public int getCitationNumbers() {
    return citationNumbers;
  }

  /**
   * set citation number of hte publication.
   *
   * @param citationNumbers
   */
  public void setCitationNumbers(int citationNumbers) {
    this.citationNumbers = citationNumbers;
  }

  /**
   * abstract method waiting to be implemented in subclass. To get the factor which will be used in
   * calculating impact of a publication.
   *
   * @return an integer.
   */
  public abstract int factor();

  /**
   * Get the age of a publication.
   *
   * @return an integer.
   * @throws ImpactEstimationException if the age of publication is greater than 250.
   */
  public int getAge() throws ImpactEstimationException {
    int age;
    int currYear = Calendar.getInstance().get(Calendar.YEAR);
    if (this.publishingYear == currYear || this.publishingYear == currYear - 1) {
      age = 1;
    } else {
      age = currYear - this.publishingYear;
    }
    if (age > 250) {
      throw new ImpactEstimationException("This publication is older than 250 years.");
    }
    return age;
  }

  /**
   * get the bump value of a publication. If the publication is younger than 3 years, bump will be
   * 100. Otherwise it will be 0.
   *
   * @return an integer.
   * @throws ImpactEstimationException if the age of publication is greater than 250.
   */
  public int bump() throws ImpactEstimationException {
    int age = getAge();

    if (age <= 3) {
      return 100;
    }
    return 0;
  }

  /**
   * get the base impact of a publication.
   *
   * @return a double value.
   * @throws ImpactEstimationException if the age of publication is greater than 250.
   */
  public double getBI() throws ImpactEstimationException {
    int age = getAge();
    double citationAmount = this.getCitationNumbers();

    return citationAmount / age;
  }

  /**
   * get the estimate impact of a publication.
   *
   * @return a double value.
   * @throws ImpactEstimationException if the age of publication is greater than 250.
   */
  public double estimateImpact() throws ImpactEstimationException {
    int factors = factor();
    double baseImpact = getBI();
    int bump = bump();

    return baseImpact * factors + bump;


  }


}
