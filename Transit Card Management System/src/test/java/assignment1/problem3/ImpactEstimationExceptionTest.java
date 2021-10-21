package assignment1.problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ImpactEstimationExceptionTest {
  private String[] test;

  @Before
  public void setUp() throws Exception {
    test = new String[1];
    test[0] = "test";
    ConferenceProceeding conferenceProceeding = new ConferenceProceeding("test",
        test, 1600, 10,"test", "test");
    EditedVolume editedVolume = new EditedVolume("test", test, 1600,
        10, "test", 10);
    Textbook textbook = new Textbook("test", test, 1500, 10,
        "test", 10);
    Journal journal = new Journal("test", test, 1500,10,
        "test", test);
  }

  @Test(expected = ImpactEstimationException.class)
  public void cpTest() throws ImpactEstimationException {
    ConferenceProceeding conferenceProceeding = new ConferenceProceeding("test",
        test, 1600, 10,"test", "test");
    conferenceProceeding.getAge();
  }

  @Test(expected = ImpactEstimationException.class)
  public void evTest() throws ImpactEstimationException {
    EditedVolume editedVolume = new EditedVolume("test", test, 1600,
        10, "test", 10);
    editedVolume.getAge();
  }

  @Test(expected = ImpactEstimationException.class)
  public void tTest() throws ImpactEstimationException {
    Textbook textbook = new Textbook("test", test, 1500, 10,
        "test", 10);
    textbook.getAge();
  }

  @Test(expected = ImpactEstimationException.class)
  public void jTest() throws ImpactEstimationException {
    Journal journal = new Journal("test", test, 1500,10,
        "test", test);
    journal.getAge();
  }
}