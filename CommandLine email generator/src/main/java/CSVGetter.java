import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

/**
 * This class uses Apache Commons CSV to process csv file.
 */
public class CSVGetter {

  /**
   * simple constructor;
   */
  public CSVGetter() {
  }

  /**
   * This method process CSV file and return a Hashmap with key as email and value as an ArrayList
   * of other information.
   *
   * @param filename file name of the CSV file.
   * @return a Hashmap with key as email and value as an ArrayList * of other information.
   * @throws IOException if file not found etc.,
   */
  public HashMap<String, ArrayList<String>> readCSV(String filename) throws IOException {
    Reader in = new FileReader(filename);
    HashMap<String, ArrayList<String>> result = new HashMap<>();
    Iterable<CSVRecord> records = CSVFormat.DEFAULT
        .withHeader("first_name", "last_name", "company_name", "address", "city", "county", "state",
            "zip", "phone1", "phone2", "email", "web").parse(in);
    for (CSVRecord record : records) {
      ArrayList<String> lst = new ArrayList<>();
      String first_name = record.get(0);
      String last_name = record.get(1);
      String company_name = record.get(2);
      String address = record.get(3);
      String city = record.get(4);
      String county = record.get(5);
      String state = record.get(6);
      String zip = record.get(7);
      String phone1 = record.get(8);
      String phone2 = record.get(9);
      String email = record.get(10);
      String web = record.get(11);
      lst.add(first_name);
      lst.add(last_name);
      lst.add(company_name);
      lst.add(address);
      lst.add(city);
      lst.add(county);
      lst.add(state);
      lst.add(zip);
      lst.add(phone1);
      lst.add(phone2);
      lst.add(web);
      result.put(email, lst);
    }

    result.remove("email");

    return result;
  }


}


