package assignment1.problem3;

/**
 * This concrete class extends abstract class Article with few extra properties.
 */
public class ConferenceProceeding extends Article {

  private String conferenceName;
  private String conferenceLocation;

  /**
   * constructor that constructs following properties.
   *
   * @param title              inherit from parent class.
   * @param authors            inherit from parent class.
   * @param publishingYear     inherit from parent class.
   * @param citationNumbers    inherit from parent class.
   * @param conferenceName     conference name of the conference proceeding.
   * @param conferenceLocation conference location of the conference proceeding.
   */
  public ConferenceProceeding(String title, String[] authors, int publishingYear,
      int citationNumbers, String conferenceName, String conferenceLocation) {
    super(title, authors, publishingYear, citationNumbers);
    this.conferenceName = conferenceName;
    this.conferenceLocation = conferenceLocation;
  }

  /**
   * override the function in Publications class to get the factor.
   *
   * @return an integer.
   */
  @Override
  public int factor() {
    return 1;
  }

  /**
   * get the conference name of the conference proceeding.
   *
   * @return a string.
   */
  public String getConferenceName() {
    return conferenceName;
  }

  /**
   * set the conference name of the conference proceeding.
   *
   * @param conferenceName
   */
  public void setConferenceName(String conferenceName) {
    this.conferenceName = conferenceName;
  }

  /**
   * get the the conference location of the conference proceeding.
   *
   * @return a string.
   */
  public String getConferenceLocation() {
    return conferenceLocation;
  }

  /**
   * set the the conference location of the conference proceeding.
   *
   * @param conferenceLocation
   */
  public void setConferenceLocation(String conferenceLocation) {
    this.conferenceLocation = conferenceLocation;
  }
}
