import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;

public class CSVGetterTest {

  @Test
  public void readCSV() throws IOException {
    CSVGetter csvGetter = new CSVGetter();
    HashMap<String, ArrayList<String>> hashMap = csvGetter.readCSV("1.csv");
    HashMap<String, ArrayList<String>> test = new HashMap<>();
    ArrayList<String> a1 = new ArrayList<>();
    a1.add("Art");
    a1.add("Venere");
    a1.add("Chemel, James L Cpa");
    a1.add("8 W Cerritos Ave #54");
    a1.add("Bridgeport");
    a1.add("Gloucester");
    a1.add("NJ");
    a1.add("08014");
    a1.add("856-636-8749");
    a1.add("856-264-4130");
    a1.add("http://www.chemeljameslcpa.com");
    test.put("art@venere.org", a1);
    assertEquals(a1, hashMap.get("art@venere.org"));
  }
}