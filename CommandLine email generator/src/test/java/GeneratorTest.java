import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import org.junit.Test;

public class GeneratorTest {

  @Test
  public void generate() throws IOException {
    Generator generator = new Generator();
    generator.generate("lettertemplate.txt", "1.csv", "C:123");
    File file = new File("C:123/generatedMessage0.txt");
    Scanner sc = new Scanner(file);
    String test = "";
    String expected = "Chemel, James L Cpa.\n"
        + "Art Venere\n"
        + "8 W Cerritos Ave #54, Bridgeport,\n"
        + "Gloucester, NJ, 08014\n"
        + "(art@venere.org)\n"
        + "\n"
        + "Dear Art Venere,\n"
        + "As you may have heard or read, last month we learned that criminals forced their way into our systems, \n"
        + "and stole information about our customers. Late last week, as part of our ongoing investigation, \n"
        + "we learned that the taken information includes names, mailing addresses, phone numbers or email addresses. \n"
        + "\n"
        + "I am writing to make you aware that your name, mailing address, phone number or email address may \n"
        + "have been taken during the intrusion. \n"
        + "\n"
        + "I am truly sorry this incident occurred, and I sincerely regret any inconvenience it may cause you. \n"
        + "\n"
        + "Because we value you as a customer, and because your trust is important to us, our company is \n"
        + "offering you one year of free credit monitoring through Experian’s ProtectMyID product, which includes \n"
        + "identity theft insurance where available. Enclosed please find your additional information about your \n"
        + "free credit card monitoring.\n"
        + "\n"
        + "\n"
        + "You can find additional information and FAQs about this incident at our website. If you have further questions, \n"
        + "you may call us at 866-852-8680.\n"
        + " \n"
        + "Thank you for your patience and your loyalty. \n"
        + "\n"
        + "Sincerely, \n"
        + "Insurance Company CEO\n"
        + "\n"
        + "\n";

    BufferedReader br = new BufferedReader(new FileReader(file));

    test = new String(Files.readAllBytes(Paths.get("C:123/generatedMessage0.txt")));
    expected = expected.replaceAll("\\s", "");
    test = test.replaceAll("\\s", "");
    assertEquals(expected, test);

  }
}