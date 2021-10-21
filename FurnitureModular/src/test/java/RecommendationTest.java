import static org.junit.Assert.*;

import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.junit.Before;
import org.junit.Test;

public class RecommendationTest {

  private Recommendation recommendation;

  @Before
  public void setUp() throws Exception {
    recommendation = new Recommendation(36, 36,
        0, 0, "black", Mounting.floorOrWall, true
    );
  }

  @Test
  public void getDoorType() {
    ArrayList<String> test = new ArrayList<>();
    test.add("Slothrop");
    test.add("GagaDoor");
    assertEquals(test, recommendation.getDoorType());
  }

  @Test
  public void getMountingType() {
    assertEquals("Floor or Wall", recommendation.getMountingType());
  }

  @Test
  public void getRailType() {
    assertEquals("Atreides", recommendation.getRailType("Atreides"));
    assertEquals("Standard", recommendation.getRailType("Yossarian"));
    assertEquals("Standard", recommendation.getRailType("Luthien"));
  }

  @Test
  public void getWallFixtureAmount() {
    assertEquals(0, recommendation.getWallFixtureAmount("Atreides"));
    assertEquals(0, recommendation.getWallFixtureAmount("Yossarian"));

  }

  @Test
  public void getDoorSize() {
    assertEquals("HALF", recommendation.getDoorSize());

  }


  @Test
  public void getSize() {
    assertEquals("HALF", recommendation.getSize());
  }

  @Test
  public void getType() {
    ArrayList<String> test = new ArrayList<>();
    test.add("Yossarian");
    test.add("Luthien");
    assertEquals(test, recommendation.getType());
  }

  @Test
  public void checkShelfAndDrawer() {
    Yossarian yossarian = new Yossarian("HALF");
    assertEquals(true, recommendation.checkShelfAndDrawer(yossarian));
  }

  @Test
  public void getCabAmount() {
    assertEquals(1, recommendation.getCabAmount());
  }

  @Test
  public void getCabSize() {
    assertEquals("HALF", recommendation.getCabSize());


  }

  @Test
  public void getDoorAmount() {
    assertEquals(1, recommendation.getDoorAmount());
  }

  @Test
  public void getHingesAmount() {
    assertEquals(1, recommendation.getHingesAmount());
  }

  @Test
  public void getDoorHandles() {
    assertEquals(0, recommendation.getDoorHandles("Slothrop"));
  }

  @Test
  public void getFeetAmount() {
    assertEquals(4, recommendation.getFeetAmount());
  }

  @Test
  public void testEquals() {
    Recommendation test2 = new Recommendation(36, 72, 1,
        0, "black", Mounting.floorOrWall, true);
    Recommendation test1 = new Recommendation(36, 72, 1,
        0, "black", Mounting.floorOrWall, true);

    assertEquals(test1, test2);
  }

  @Test
  public void testHashCode() {
    Recommendation test2 = new Recommendation(36, 72, 1,
        0, "black", Mounting.floorOrWall, true);
    Recommendation test1 = new Recommendation(36, 72, 1,
        0, "black", Mounting.floorOrWall, true);

    assertEquals(test1.hashCode(), test2.hashCode());
  }

  @Test
  public void testToString() {
    Recommendation test2 = new Recommendation(36, 72, 1,
        0, "black", Mounting.floorOrWall, true);
    Recommendation test1 = new Recommendation(36, 72, 1,
        0, "black", Mounting.floorOrWall, true);

    assertEquals(test1.toString(), test2.toString());
  }

  @Test
  public void addInfo() {
    Recommendation recommendation = new Recommendation(36, 36,
        0, 0, "black", Mounting.floorOrWall, true
    );
    recommendation.addInfo();

  }

  @Test
  public void createJSON() {
    Recommendation recommendation = new Recommendation(36, 36,
        0, 0, "black", Mounting.floorOrWall, true
    );
    recommendation.createJSON("Yossarian");
  }
}