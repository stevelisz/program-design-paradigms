import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;


import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * This class represents Generator object and its functions.
 */
public class Generator {

  /**
   * Simple constructor that constructs the object.
   */
  public Generator() {
  }

  /**
   * Replace the place holder in the template with the info provided in CSV file and output them
   * in a chosen directory.
   * @param templateName Name of a template.
   * @param csvFileName Name of a CSV file.
   * @param outputDir Path of a directory.
   * @throws IOException if file not found etc.,
   */
  public void generate(String templateName, String csvFileName, String outputDir) throws IOException {

    TemplateGetter templateGetter = new TemplateGetter();
    CSVGetter csvGetter = new CSVGetter();
    HashMap<String, ArrayList<String>> csvInfo = csvGetter.readCSV(csvFileName);
    String template = templateGetter.getTemplate(templateName);

    ArrayList<String> lst = new ArrayList<>();
    for (HashMap.Entry<String, ArrayList<String>> entry : csvInfo.entrySet()) {
      String replaced;

      replaced = template.replaceAll(java.util.regex.Pattern.quote("[[email]]"), entry.getKey());
      replaced = replaced
          .replaceAll(java.util.regex.Pattern.quote("[[first_name]]"), entry.getValue().get(0));
      replaced = replaced
          .replaceAll(java.util.regex.Pattern.quote("[[last_name]]"), entry.getValue().get(1));
      replaced = replaced
          .replaceAll(java.util.regex.Pattern.quote("[[company_name]]"), entry.getValue().get(2));
      replaced = replaced
          .replaceAll(java.util.regex.Pattern.quote("[[address]]"), entry.getValue().get(3));
      replaced = replaced
          .replaceAll(java.util.regex.Pattern.quote("[[city]]"), entry.getValue().get(4));
      replaced = replaced
          .replaceAll(java.util.regex.Pattern.quote("[[county]]"), entry.getValue().get(5));
      replaced = replaced
          .replaceAll(java.util.regex.Pattern.quote("[[state]]"), entry.getValue().get(6));
      replaced = replaced
          .replaceAll(java.util.regex.Pattern.quote("[[zip]]"), entry.getValue().get(7));
      replaced = replaced
          .replaceAll(java.util.regex.Pattern.quote("[[phone1]]"), entry.getValue().get(8));
      replaced = replaced
          .replaceAll(java.util.regex.Pattern.quote("[[phone2]]"), entry.getValue().get(9));


      lst.add(replaced);

    }

    int length = lst.size();
    ArrayList<String> filenames = new ArrayList<>();

    for (int i = 0; i < length; i++) {
      String s = null;
      s = "generatedMessage" + i + ".txt";
      filenames.add(s);
    }


    for (int i = 0; i < length; i++) {

      FileOutputStream outputStream = null;
      try {
        outputStream = new FileOutputStream(outputDir +"/"+ filenames.get(i));
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      }
      byte[] allBytes = lst.get(i).getBytes();
      try {
        outputStream.write(allBytes);
      } catch (IOException e) {
        e.printStackTrace();
      }

      try {
        outputStream.close();
      } catch (IOException e) {
        e.printStackTrace();
      }

    }
    //System.out.println(filenames);

    //System.out.println(lst);

  }
}