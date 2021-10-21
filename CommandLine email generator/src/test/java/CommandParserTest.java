import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CommandParserTest {

  @Before
  public void setUp() throws Exception {


  }

  @Test
  public void getTemplateName() {
    CommandParser commandParser = new CommandParser();
    String[] args = {"--email-template", "lettertemplate.txt", "--csv-file", "insurancecompanymembers.csv",
        "--output-dir", "/Users/Steve/Desktop/test/letter1",  "--email"};
    String[] args1 = {"--letter-template", "lettertemplate.txt", "--csv-file", "insurancecompanymembers.csv",
        "--output-dir", "/Users/Steve/Desktop/test/letter1",  "--letter"};
    assertEquals("lettertemplate.txt",commandParser.getTemplateName(args));
    assertEquals("lettertemplate.txt", commandParser.getTemplateName(args1));

  }

  @Test
  public void getCSVFileName() {
    CommandParser commandParser = new CommandParser();
    String[] args = {"--email-template", "lettertemplate.txt", "--csv-file", "insurancecompanymembers.csv",
        "--output-dir", "/Users/Steve/Desktop/test/letter1",  "--email"};
    assertEquals("insurancecompanymembers.csv",commandParser.getCSVFileName(args));
  }

  @Test
  public void getOutputDir() {
    CommandParser commandParser = new CommandParser();
    String[] args = {"--email-template", "lettertemplate.txt", "--csv-file", "insurancecompanymembers.csv",
        "--output-dir", "/Users/Steve/Desktop/test/letter1",  "--email"};
    assertEquals("/Users/Steve/Desktop/test/letter1",commandParser.getOutputDir(args));
  }
}