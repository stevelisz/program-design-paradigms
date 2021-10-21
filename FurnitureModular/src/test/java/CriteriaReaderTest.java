import static org.junit.Assert.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Before;
import org.junit.Test;

public class CriteriaReaderTest {
  private CriteriaReader criteriaReader;
  private JSONObject test;

  @Before
  public void setUp() throws Exception {
    criteriaReader = new CriteriaReader();
    test = criteriaReader.getCriteria("criteria.json");
  }

  @Test
  public void getCriteria() {
    JSONObject test1 = criteriaReader.getCriteria("criteria.json");
    JSONObject test = criteriaReader.getCriteria("criteria.json");
    assertEquals(test, test1);


  }

  @Test
  public void getDesiredWidth() {
    int res = criteriaReader.getDesiredWidth(test);
    assertEquals(36, res);
  }

  @Test
  public void getDesiredHeight() {
    int res = criteriaReader.getDesiredHeight(test);
    assertEquals(72, res);
  }

  @Test
  public void getDesiredShelfAmount() {
    int res = criteriaReader.getDesiredShelfAmount(test);
    assertEquals(7, res);
  }

  @Test
  public void getDesiredDrawerAmount() {
    int res = criteriaReader.getDesiredDrawerAmount(test);
    assertEquals(3, res);
  }

  @Test
  public void getDesiredColor() {
    String res = criteriaReader.getDesiredColor(test);
    assertEquals("brown", res);
  }

  @Test
  public void getDesiredMounting() {
    Mounting res = criteriaReader.getDesiredMounting(test);
    Mounting res1 = criteriaReader.getDesiredMounting(test);
    Mounting res2 = criteriaReader.getDesiredMounting(test);

    assertEquals(Mounting.floorAndWall, res);
  }

  @Test
  public void getBudgetPriority() {
    Boolean res = criteriaReader.getBudgetPriority(test);
    assertEquals(true, res);
  }
}