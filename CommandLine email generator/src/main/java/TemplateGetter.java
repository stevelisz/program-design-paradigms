import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * This class represents a template getter.
 */
public class TemplateGetter {

  /**
   * Simple constructor that constructs the object.
   */
  public TemplateGetter() {
  }

  /**
   * This method get the template as a String and pass it to Generator.
   *
   * @param fileName the name of a file.
   * @return the content of a file as String.
   * @throws IOException if file not found etc.,
   */
  public String getTemplate(String fileName) throws IOException {

    File file = new File(fileName);
    Scanner sc = new Scanner(file);
    String result = "";

    BufferedReader br = new BufferedReader(new FileReader(file));

    result = new String(Files.readAllBytes(Paths.get(fileName)));
    return result;

  }
}
