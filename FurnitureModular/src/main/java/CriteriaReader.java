import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * This class represents a criteria reader object which can read criteria.
 */
public class CriteriaReader {

  /**
   * Constructor with no parameters.
   */
  public CriteriaReader() {
  }

  /**
   * extract criteria from a json file.
   *
   * @param filename the name of json file.
   * @return criteria as JSONObject.
   */
  public JSONObject getCriteria(String filename) {
    JSONParser jsonParser = new JSONParser();
    JSONObject criteria = new JSONObject();
    filename = "criteria.json";
    try (FileReader reader = new FileReader(filename)) {

      Object obj = jsonParser.parse(reader);

      criteria = (JSONObject) obj;

    } catch (IOException | ParseException e) {
      e.printStackTrace();
    }
    return criteria;

  }

  /**
   * get desired width of customer.
   *
   * @param criteria JSONObject.
   * @return the desired width.
   */
  public Integer getDesiredWidth(JSONObject criteria) {

    criteria = this.getCriteria("criteria.json");
    return Integer.parseInt((String) criteria.get("desiredWidth"));

  }

  /**
   * get desired height of customer.
   *
   * @param criteria JSONObject.
   * @return the desired height.
   */
  public Integer getDesiredHeight(JSONObject criteria) {

    criteria = this.getCriteria("criteria.json");
    return Integer.parseInt((String) criteria.get("desiredHeight"));

  }

  /**
   * get desired shelf amount of customer.
   *
   * @param criteria JSONObject.
   * @return the desired shelf amount.
   */
  public Integer getDesiredShelfAmount(JSONObject criteria) {
    criteria = this.getCriteria("criteria.json");
    return Integer.parseInt((String) criteria.get("desiredShelfAmount"));
  }

  /**
   * get desired drawer amount of customer.
   *
   * @param criteria JSONObject.
   * @return the desired amount.
   */
  public Integer getDesiredDrawerAmount(JSONObject criteria) {
    criteria = this.getCriteria("criteria.json");
    return Integer.parseInt((String) criteria.get("desiredDrawerAmount"));
  }

  /**
   * get desired color of customer.
   *
   * @param criteria JSONObject.
   * @return the desired color.
   */
  public String getDesiredColor(JSONObject criteria) {
    criteria = this.getCriteria("criteria.json");
    return (String) criteria.get("desiredColor");
  }

  /**
   * get desired mounting type of customer.
   *
   * @param criteria JSONObject.
   * @return the mounting type.
   */
  public Mounting getDesiredMounting(JSONObject criteria) {
    criteria = this.getCriteria("criteria.json");
    String result = (String) criteria.get("desiredMounting");
    if (result.equals("floorOrWall")) {
      return Mounting.floorOrWall;
    } else if (result.equals("floorAndWall")) {
      return Mounting.floorAndWall;
    } else if (result.equals("floorOnly")) {
      return Mounting.floor;
    } else {
      return Mounting.wall;
    }
  }

  /**
   * get desired budget priority of customer.
   *
   * @param criteria JSONObject.
   * @return the budget priority.
   */
  public Boolean getBudgetPriority(JSONObject criteria) {
    criteria = this.getCriteria("criteria.json");
    String result = (String) criteria.get("budgetPriority");
    return result.equals("true");
  }


}