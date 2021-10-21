import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * This class turns criteria into actual item and amount.
 */
public class Recommendation {

  private static final int FEET_TWO = 2;
  private static final int FEET_THREE = 3;
  private static final int NO_NEED_FOR_WALL_FIXTURE = 0;

  private static final int UNIVERSAL_WIDTH = 36;
  private static final String[] sizes = {"WARDROBE", "HALF", "QUARTER"};
  private static final String[] options = {"Option 1", "Option 2", "Option3"};
  private static final Integer[] heights = {72, 36, 18};
  private int desiredWidth;
  private int desiredHeight;
  private int desiredShelfAmount;
  private int desiredDrawerAmount;
  private String desiredColor;
  private Mounting desiredMounting;
  private Boolean budgetPriority;

  /**
   * Constructor that has following properties.
   *
   * @param desiredWidth        customer's desired width.
   * @param desiredHeight       customer's desired height.
   * @param desiredShelfAmount  customer's desired shelf amount.
   * @param desiredDrawerAmount customer's desired drawer amount.
   * @param desiredColor        customer's desired color.
   * @param desiredMounting     customer's desired mounting type.
   * @param budgetPriority      customer's desired budget priority.
   */
  public Recommendation(int desiredWidth, int desiredHeight, int desiredShelfAmount,
      int desiredDrawerAmount, String desiredColor, Mounting desiredMounting,
      Boolean budgetPriority) {
    this.desiredWidth = desiredWidth;
    this.desiredHeight = desiredHeight;
    this.desiredShelfAmount = desiredShelfAmount;
    this.desiredDrawerAmount = desiredDrawerAmount;
    this.desiredColor = desiredColor;
    this.desiredMounting = desiredMounting;
    this.budgetPriority = budgetPriority;
  }

  /**
   * get all the door types given sizes.
   *
   * @return a list.
   */
  public ArrayList<String> getDoorType() {
    ArrayList<String> lst = new ArrayList<>();
    String size = this.getSize();
    Slothrop slothrop = new Slothrop(size);
    Belacqua belacqua = new Belacqua(size);
    GagaDoor gagaDoor = new GagaDoor(size);
    GagaDrawerFront gagaDrawerFront = new GagaDrawerFront(size);
    if (slothrop.getColors().contains(desiredColor)) {
      lst.add("Slothrop");
    } else if (belacqua.getColors().contains(desiredColor)) {
      lst.add("Belacqua");
    }

    if (gagaDoor.getColors().contains(desiredColor)) {
      lst.add("GagaDoor");
    } else if (gagaDrawerFront.getColors().contains(desiredColor)) {
      lst.add("gagaDrawerFront");
    }

    return lst;
  }

  /**
   * get mounting types base on size.
   *
   * @return mounting type as String.
   */
  public String getMountingType() {
    String result = "";
    if (this.getSize().equals("WARDROBE")) {
      result = "Floor";

    } else if (desiredMounting == Mounting.floor) {
      result = "Floor";

    } else if (desiredMounting == Mounting.wall) {
      result = "Wall";
    } else if (desiredMounting == Mounting.floorOrWall) {
      result = "Floor or Wall";
    }
    return result;
  }

  /**
   * get rail type.
   *
   * @param str given cabinet type.
   * @return String.
   */
  public String getRailType(String str) {
    if (str.equals("Atreides")) {
      return "Atreides";
    } else {
      return "Standard";
    }
  }

  /**
   * get wall fixture amount.
   *
   * @param str given type.
   * @return corresponding wall fixture amount.
   */
  public int getWallFixtureAmount(String str) {
    if (str.equals("Yossarian") && this.getSize().equals("WARDROBE")) {
      return this.getCabAmount();
    } else {
      return NO_NEED_FOR_WALL_FIXTURE;
    }
  }

  /**
   * get the size of a door.
   *
   * @return the size as String.
   */
  public String getDoorSize() {
    if (this.getSize().equals("WARDROBE")) {
      return "WARDROBE";
    } else if (this.getSize().equals("HALF")) {
      return "HALF";
    } else if (this.getSize().equals("QUARTER")) {
      return "QUARTER";
    } else {
      return "WRONG SIZES";
    }
  }

  /**
   * write json file.
   */
  public void addInfo() {
    ArrayList<String> lst = this.getType();
    JSONArray finalResult = new JSONArray();
    for (String str : lst) {
      finalResult.add(this.createJSON(str));
    }

    try (FileWriter file = new FileWriter("final.json")) {

      file.write(finalResult.toJSONString());
      file.flush();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * create JSON object to write.
   *
   * @param str cabinet type.
   * @return JSON array.
   */
  public JSONArray createJSON(String str) {
    JSONObject ops = new JSONObject();
    JSONObject ops1 = new JSONObject();
    JSONObject ops2 = new JSONObject();
    JSONArray jsonArray = new JSONArray();
    String[] types = {"Yossarian", "Luthien", "Atreides"};
    ArrayList<String> doorTypes = this.getDoorType();
    if (str.equals(types[0])) {
      JSONObject options = new JSONObject();
      for (String s : doorTypes) {
        JSONObject temp = new JSONObject();
        temp.put("Cabinet Type", types[0]);
        temp.put("Cabinet size", this.getSize());
        temp.put("Cabinet Amount", this.getCabAmount());
        temp.put("Wall Fixture Amount", this.getWallFixtureAmount(str));
        temp.put("Cabinet Mounting Type", this.getMountingType());
        temp.put("Cabinet Feet Amount", this.getFeetAmount());
        temp.put("OR", "");
        temp.put("Cabinet Rail Type", this.getRailType(str));
        temp.put("Cabinet Rails Amount", this.getCabAmount());
        temp.put("Door Information", "Necessary Modular for Cabinets");
        temp.put("Door Type", s);
        temp.put("Door Size", this.getDoorSize());
        temp.put("Door Amount", this.getDoorAmount());
        temp.put("Door Hinges", this.getDoorAmount());
        temp.put("Door Handles Amount", this.getDoorHandles(s));
        if (this.getSize().equals("QUARTER")) {
          temp.put("18” Drawers Amount", this.getCabAmount());
        }
        temp.put("Drawer Handles Amount", this.getCabAmount());

        options.put(types[0], temp);
        jsonArray.add(options);

      }

    } else if (str.equals(types[1])) {
      JSONObject options1 = new JSONObject();
      for (String s : doorTypes) {
        JSONObject temp = new JSONObject();
        temp.put("Cabinet Type", types[1]);
        temp.put("Cabinet size", this.getSize());
        temp.put("Cabinet Amount", this.getCabAmount());
        temp.put("Wall Fixture Amount", this.getWallFixtureAmount(str));
        temp.put("Cabinet Mounting Type", this.getMountingType());
        temp.put("Cabinet Feet Amount", this.getFeetAmount());
        temp.put("OR", "");
        temp.put("Cabinet Rail Type", this.getRailType(str));
        temp.put("Cabinet Rails Amount", this.getCabAmount());
        temp.put("Door Information", "Necessary Modular for Cabinets");
        temp.put("Door Type", s);
        temp.put("Door Size", this.getDoorSize());
        temp.put("Door Amount", this.getDoorAmount());
        temp.put("Door Hinges", this.getDoorAmount());
        temp.put("Door Handles Amount", this.getDoorHandles(s));
        if (this.getSize().equals("QUARTER")) {
          temp.put("18” Drawers Amount", this.getCabAmount());
        }
        temp.put("Drawer Handles Amount", this.getCabAmount());

        options1.put(types[1], temp);
        jsonArray.add(options1);

      }

    } else if (str.equals(types[2])) {
      JSONObject options2 = new JSONObject();
      for (String s : doorTypes) {
        JSONObject temp = new JSONObject();
        temp.put("Cabinet Type", types[2]);
        temp.put("Cabinet size", this.getSize());
        temp.put("Cabinet Amount", this.getCabAmount());
        temp.put("Wall Fixture Amount", this.getWallFixtureAmount(str));
        temp.put("Cabinet Mounting Type", this.getMountingType());
        temp.put("Cabinet Feet Amount", this.getFeetAmount());
        temp.put("OR", "");
        temp.put("Cabinet Rail Type", this.getRailType(str));
        temp.put("Cabinet Rails Amount", this.getCabAmount());
        temp.put("Door Information", "Necessary Modular for Cabinets");
        temp.put("Door Type", s);
        temp.put("Door Size", this.getDoorSize());
        temp.put("Door Amount", this.getDoorAmount());
        temp.put("Door Hinges", this.getDoorAmount());
        temp.put("Door Handles Amount", this.getDoorHandles(s));
        if (this.getSize().equals("QUARTER")) {
          temp.put("18” Drawers Amount", this.getCabAmount());
        }
        temp.put("Drawer Handles Amount", this.getCabAmount());

        options2.put(types[2], temp);
        jsonArray.add(options2);
      }


    }

    return jsonArray;


  }

  /**
   * get the size based on desired height.
   * @return sizes.
   */
  public String getSize() {
    String size = null;
    if (desiredHeight == heights[0]) {
      size = sizes[0];
    } else if (desiredHeight == heights[1]) {
      size = sizes[1];
    } else if (desiredHeight == heights[2]) {
      size = sizes[2];
    }
    return size;
  }

  /**
   * get cabinet type.
   * @return a list of proper cabinet type.
   */
  public ArrayList<String> getType() {

    String size = this.getSize();
    Yossarian yossarian = new Yossarian(size);
    Luthien luthien = new Luthien(size);
    Atreides atreides = new Atreides(size);
    ArrayList<String> lst = new ArrayList<>();
    if (checkShelfAndDrawer(yossarian) && yossarian
        .getColors().contains(desiredColor)) {
      lst.add(yossarian.getTypeName());
    }
    if (checkShelfAndDrawer(luthien) && luthien
        .getColors().contains(desiredColor)) {
      lst.add(luthien.getTypeName());
    }
    if (checkShelfAndDrawer(atreides) && atreides
        .getColors().contains(desiredColor)) {
      lst.add(atreides.getTypeName());
    }

    return lst;

  }

  /**
   * compare desired shelf and drawer amount to real world.
   * @param cabinet any concrete class object that extended cabinet.
   * @return true if satisfied, false otherwise.
   */
  public Boolean checkShelfAndDrawer(Cabinet cabinet) {

    int cabAmount = this.getCabAmount();
    if (desiredDrawerAmount <= cabAmount * cabinet.getDrawerAmount()
        && desiredShelfAmount <= cabinet.getShelfAmount()) {
      return true;
    } else {
      return false;
    }

  }

  /**
   * get the amount of cabinets base on desired width.
   * @return amount.
   */
  public int getCabAmount() {
    int desiredWidth = this.desiredWidth;
    return desiredWidth / UNIVERSAL_WIDTH;
  }

  /**
   * get the size of cabinets based on desired height.
   * @return cabinet sizes.
   */
  public String getCabSize() {
    int desiredHeight = this.desiredHeight;
    if (desiredHeight == 72) {
      return "WARDROBE";
    } else if (desiredHeight == 36) {
      return "HALF";
    } else {
      return "QUARTER";
    }
  }

  /**
   * get door amount.
   * @return door amount.
   */
  public int getDoorAmount() {
    return this.getCabAmount();
  }

  /**
   * get set of hinges.
   * @return amount.
   */
  public int getHingesAmount() {
    return this.getDoorAmount();
  }

  /**
   * get amount of handles.
   * @param s given type
   * @return 0 if included. door amount if not.
   */
  public int getDoorHandles(String s) {
    if (s.equals("Slothrop") || s.equals("Belacqua")) {
      return 0;
    } else {
      return this.getDoorAmount();
    }
  }

  /**
   * get the feet amount of cabinets.
   * @return amount.
   */
  public int getFeetAmount() {
    int result = 0;
    if (this.getCabSize().equals("WARDROBE")) {
      return result;
    } else if (this.getCabAmount() % 2 == 0) {
      result = this.getCabAmount() + FEET_TWO;
    } else if (this.getCabAmount() % 2 != 0) {
      result = this.getCabAmount() + FEET_THREE;
    }
    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recommendation that = (Recommendation) o;
    return desiredWidth == that.desiredWidth &&
        desiredHeight == that.desiredHeight &&
        desiredShelfAmount == that.desiredShelfAmount &&
        desiredDrawerAmount == that.desiredDrawerAmount &&
        Objects.equals(desiredColor, that.desiredColor) &&
        desiredMounting == that.desiredMounting &&
        Objects.equals(budgetPriority, that.budgetPriority);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(desiredWidth, desiredHeight, desiredShelfAmount, desiredDrawerAmount, desiredColor,
            desiredMounting, budgetPriority);
  }

  @Override
  public String toString() {
    return "Recommendation{" +
        "desiredWidth=" + desiredWidth +
        ", desiredHeight=" + desiredHeight +
        ", desiredShelfAmount=" + desiredShelfAmount +
        ", desiredDrawerAmount=" + desiredDrawerAmount +
        ", desiredColor='" + desiredColor + '\'' +
        ", desiredMounting=" + desiredMounting +
        ", budgetPriority=" + budgetPriority +
        '}';
  }
}



