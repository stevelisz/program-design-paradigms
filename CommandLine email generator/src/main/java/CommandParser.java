import java.io.File;
import java.util.Arrays;

/**
 * This class represents a command parser which parses command lines.
 */
public class CommandParser {

  final static public int EXPECTED_LENGTH = 7;
  final static public String USAGE = "Usage:\n"
      + " --email only generate email messages\n"
      + " --email-template <file> accept a filename that holds the email template. Required if --email is used\n"
      + " --letter only generate letters\n"
      + " --letter-template <file> accept a filename that holds the email template. Required if --letter is used\n"
      + " --output-dir <path> accept the name of a folder, all output is placed in this folder\n"
      + " --csv-file <path> accept the name of the csv file to process\n"
      + "Examples:\n"
      + " --email --email-template email-template.txt --output-dir emails --csv-file customer.csv\n"
      + " --letter --letter-template letter-template.txt --outputdir letters --csv-file customer.csv\n"
      + "Please Include suffix of the file such as '.txt' or '.csv'.";

  /**
   * Simple constructor that constructs the object.
   */
  public CommandParser() {
  }

  /**
   * Get the template name from command line.
   *
   * @param args command lines.
   * @return the template name as String.
   */
  public String getTemplateName(String[] args) {
    String templateName = "";

    if (args.length != EXPECTED_LENGTH) {
      System.out.println(USAGE);
      System.exit(8);
    }

    for (int i = 0; i < args.length; i++) {
      if (args[i].equals("--email")) {
        if (Arrays.asList(args).contains("--email-template")) {
          templateName = args[Arrays.asList(args).indexOf("--email-template") + 1];
          if (!templateName.contains(".txt")) {
            System.out.println(USAGE);
            System.exit(10);
          }
        } else {
          System.out.println("Error: --email is provided but no --email-template is given.");
          System.exit(5);
        }
      } else if (args[i].equals("--letter")) {
        if (Arrays.asList(args).contains("--letter-template")) {
          templateName = args[Arrays.asList(args).indexOf("--letter-template") + 1];
          if (!templateName.contains(".txt")) {
            System.out.println(USAGE);
            System.exit(10);
          }
        } else {
          System.out.println("Error: --letter is provided but no --letter-template is given.");
          System.exit(6);
        }
      } else if (!Arrays.asList(args).contains("--email") && !Arrays.asList(args)
          .contains("--letter")) {
        System.out.println(USAGE);
        System.exit(7);

      }

    }
    return templateName;

  }

  /**
   * Get the CSV file name from command line.
   *
   * @param args command lines.
   * @return the name of CSV file as String.
   */
  public String getCSVFileName(String[] args) {
    String csvFileName = "";
    if (args.length != EXPECTED_LENGTH) {
      System.out.println(USAGE);
      System.exit(8);
    }

    if (Arrays.asList(args).contains("--csv-file") && Arrays.asList(args)
        .contains("--output-dir")) {
      csvFileName = args[Arrays.asList(args).indexOf("--csv-file") + 1];
      if (!csvFileName.contains(".csv")) {
        System.out.println(USAGE);
        System.exit(9);
      }

    } else {
      System.out.println(USAGE);
      System.exit(2);
    }
    return csvFileName;

  }

  /**
   * Get the output directory from command lines.
   *
   * @param args command lines.
   * @return output directory from command lines as String.
   */
  public String getOutputDir(String[] args) {
    String outputDir = "";
    if (args.length < EXPECTED_LENGTH) {
      System.out.println(USAGE);
      System.exit(8);
    }
    if (Arrays.asList(args).contains("--csv-file") && Arrays.asList(args)
        .contains("--output-dir")) {
      outputDir = args[Arrays.asList(args).indexOf("--output-dir") + 1];
      File file = new File(outputDir);
      file.mkdirs();
    } else {
      System.out.println(USAGE);
      System.exit(2);


    }
    return outputDir;
  }


}
