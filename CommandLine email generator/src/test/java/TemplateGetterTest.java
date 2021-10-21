import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.Before;
import org.junit.Test;

public class TemplateGetterTest {



  @Test
  public void getTemplate() throws IOException {
    TemplateGetter templateGetter = new TemplateGetter();
    String[] args = {"--email-template", "lettertemplate.txt", "--csv-file", "insurancecompanymembers.csv",
        "--output-dir", "/Users/Steve/Desktop/test/letter1",  "--email"};
    String test = "";
    File file = new File("lettertemplate.txt");

    BufferedReader br = new BufferedReader(new FileReader(file));

    test = new String(Files.readAllBytes(Paths.get("lettertemplate.txt")));


    assertEquals(test, templateGetter.getTemplate("lettertemplate.txt"));

  }
}