import java.io.File;
import java.io.IOException;

import java.util.Arrays;
import java.util.Collection;


public class Main {

  public static void main(String[] args) throws IOException {

    CommandParser commandParser = new CommandParser();
    String csvFileName = commandParser.getCSVFileName(args);
    String outputDir = commandParser.getOutputDir(args);
    String templateName = commandParser.getTemplateName(args);

    System.out.println(templateName);
    System.out.println(csvFileName);
    System.out.println(outputDir);

    Generator generator = new Generator();
    generator.generate(templateName, csvFileName, outputDir);

  }
//--email --email-template customEmailTemplate.txt --output-dir C:123//output --csv-file insurancecompanymembers.csv
}



