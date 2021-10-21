import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class Main {

  public static void main(String[] args) {


    CriteriaReader criteriaReader = new CriteriaReader();

    JSONObject criteria = criteriaReader.getCriteria("criteria.json");

    int width = criteriaReader.getDesiredWidth(criteria);
    int height = criteriaReader.getDesiredHeight(criteria);
    int dAmount = criteriaReader.getDesiredDrawerAmount(criteria);
    int sAmount = criteriaReader.getDesiredShelfAmount(criteria);
    String color = criteriaReader.getDesiredColor(criteria);
    Mounting mounting = criteriaReader.getDesiredMounting(criteria);
    Boolean priority = criteriaReader.getBudgetPriority(criteria);


    Recommendation recommendation = new Recommendation(width, height,
        sAmount, dAmount, color, mounting, priority);

    recommendation.addInfo();



  }


}
