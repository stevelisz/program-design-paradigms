
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;

public class YossarianTest {
  private Yossarian yossarian1;
  private Yossarian yossarian2;
  private Yossarian yossarian3;

  public YossarianTest() {
  }

  @Before
  public void setUp() throws Exception {
    this.yossarian1 = new Yossarian("WARDROBE");
    this.yossarian2 = new Yossarian("HALF");
    this.yossarian3 = new Yossarian("QUARTER");
  }

  @Test
  public void getDimension() {
    Dimension dimension1 = new Dimension(72, 36, 16);
    Dimension dimension2 = new Dimension(36, 36, 16);
    Dimension dimension3 = new Dimension(18, 36, 16);
    Assert.assertEquals(dimension1, this.yossarian1.getDimension());
    Assert.assertEquals(dimension2, this.yossarian2.getDimension());
    Assert.assertEquals(dimension3, this.yossarian3.getDimension());
  }

  @Test
  public void setDimension() {
    Dimension dimension1 = new Dimension(72, 36, 16);
    Dimension dimension2 = new Dimension(36, 36, 16);
    Dimension dimension3 = new Dimension(18, 36, 16);
    this.yossarian1.setDimension("QUARTER");
    this.yossarian2.setDimension("WARDROBE");
    this.yossarian3.setDimension("HALF");
    Assert.assertEquals(dimension3, this.yossarian1.getDimension());
    Assert.assertEquals(dimension1, this.yossarian2.getDimension());
    Assert.assertEquals(dimension2, this.yossarian3.getDimension());
  }

  @Test
  public void getSize() {
    Assert.assertEquals("WARDROBE", this.yossarian1.getSize());
    Assert.assertEquals("HALF", this.yossarian2.getSize());
    Assert.assertEquals("QUARTER", this.yossarian3.getSize());
  }

  @Test
  public void setSize() {
    this.yossarian1.setSize("HALF");
    this.yossarian2.setSize("QUARTER");
    this.yossarian3.setSize("WARDROBE");
    Assert.assertEquals("HALF", this.yossarian1.getSize());
    Assert.assertEquals("QUARTER", this.yossarian2.getSize());
    Assert.assertEquals("WARDROBE", this.yossarian3.getSize());
  }

  @Test
  public void getColors() {
    ArrayList<String> warColors = new ArrayList(Arrays.asList("brown", "black", "bone", "oxblood"));
    ArrayList<String> halfColors = new ArrayList(Arrays.asList("brown", "black", "bone"));
    ArrayList<String> quarColors = new ArrayList(Arrays.asList("brown", "black", "bone"));
    Assert.assertEquals(warColors, this.yossarian1.getColors());
    Assert.assertEquals(halfColors, this.yossarian2.getColors());
    Assert.assertEquals(quarColors, this.yossarian3.getColors());
  }

  @Test
  public void setColors() {
    ArrayList<String> warColors = new ArrayList(Arrays.asList("brown", "black", "bone", "oxblood"));
    ArrayList<String> halfColors = new ArrayList(Arrays.asList("brown", "black", "bone"));
    ArrayList<String> quarColors = new ArrayList(Arrays.asList("brown", "black", "bone"));
    this.yossarian1.setColors("QUARTER");
    this.yossarian2.setColors("WARDROBE");
    this.yossarian3.setColors("HALF");
    Assert.assertEquals(quarColors, this.yossarian1.getColors());
    Assert.assertEquals(warColors, this.yossarian2.getColors());
    Assert.assertEquals(halfColors, this.yossarian3.getColors());
  }

  @Test
  public void getMounting() {
    Assert.assertEquals(Mounting.floor, this.yossarian1.getMounting());
    Assert.assertEquals(Mounting.floorOrWall, this.yossarian2.getMounting());
    Assert.assertEquals(Mounting.floorOrWall, this.yossarian3.getMounting());
  }

  @Test
  public void setMounting() {
    this.yossarian1.setMounting("HALF");
    this.yossarian2.setMounting("QUARTER");
    this.yossarian3.setMounting("WARDROBE");
    Assert.assertEquals(Mounting.floorOrWall, this.yossarian1.getMounting());
    Assert.assertEquals(Mounting.floorOrWall, this.yossarian2.getMounting());
    Assert.assertEquals(Mounting.floor, this.yossarian3.getMounting());
  }

  @Test
  public void getFeet() {
    Assert.assertEquals(Feet.notRequired, this.yossarian1.getFeet());
    Assert.assertEquals(Feet.optional, this.yossarian2.getFeet());
    Assert.assertEquals(Feet.required, this.yossarian3.getFeet());
  }

  @Test
  public void setFeet() {
    this.yossarian1.setFeet("QUARTER");
    this.yossarian2.setFeet("WARDROBE");
    this.yossarian3.setFeet("HALF");
    Assert.assertEquals(Feet.required, this.yossarian1.getFeet());
    Assert.assertEquals(Feet.notRequired, this.yossarian2.getFeet());
    Assert.assertEquals(Feet.optional, this.yossarian3.getFeet());
  }

  @Test
  public void getRail() {
    Assert.assertEquals(Rail.standard, this.yossarian1.getRail());
    Assert.assertEquals(Rail.standard, this.yossarian2.getRail());
    Assert.assertEquals(Rail.standard, this.yossarian3.getRail());
  }

  @Test
  public void getShelfAmount() {
    Assert.assertEquals(7L, (long)this.yossarian1.getShelfAmount());
    Assert.assertEquals(3L, (long)this.yossarian2.getShelfAmount());
    Assert.assertEquals(1L, (long)this.yossarian3.getShelfAmount());
  }

  @Test
  public void setShelfAmount() {
    this.yossarian1.setShelfAmount("QUARTER");
    this.yossarian2.setShelfAmount("WARDROBE");
    this.yossarian3.setShelfAmount("HALF");
    Assert.assertEquals(1L, (long)this.yossarian1.getShelfAmount());
    Assert.assertEquals(7L, (long)this.yossarian2.getShelfAmount());
    Assert.assertEquals(3L, (long)this.yossarian3.getShelfAmount());
  }

  @Test
  public void getDrawerAmount() {
    Assert.assertEquals(0L, (long)this.yossarian1.getDrawerAmount());
    Assert.assertEquals(0L, (long)this.yossarian2.getDrawerAmount());
    Assert.assertEquals(0L, (long)this.yossarian3.getDrawerAmount());
  }

  @Test
  public void setDrawerAmount() {
    this.yossarian1.setDrawerAmount("QUARTER");
    this.yossarian2.setDrawerAmount("WARDROBE");
    this.yossarian3.setDrawerAmount("HALF");
    Assert.assertEquals(0L, (long)this.yossarian1.getDrawerAmount());
    Assert.assertEquals(0L, (long)this.yossarian2.getDrawerAmount());
    Assert.assertEquals(0L, (long)this.yossarian3.getDrawerAmount());
  }

  @Test
  public void testEquals() {
    Yossarian test1 = new Yossarian("WARDROBE");
    Yossarian test2 = new Yossarian("WARDROBE");
    Yossarian test3 = new Yossarian("HALF");
    Yossarian test4 = new Yossarian("HALF");
    Yossarian test5 = new Yossarian("QUARTER");
    Yossarian test6 = new Yossarian("QUARTER");

    Assert.assertEquals(test1, test2);
    Assert.assertEquals(test3, test4);
    Assert.assertEquals(test5, test6);



  }

  @Test
  public void testHashCode() {
    Yossarian test1 = new Yossarian("WARDROBE");
    Yossarian test2 = new Yossarian("WARDROBE");
    Yossarian test3 = new Yossarian("HALF");
    Yossarian test4 = new Yossarian("HALF");
    Yossarian test5 = new Yossarian("QUARTER");
    Yossarian test6 = new Yossarian("QUARTER");

    Assert.assertEquals(test1.hashCode(), test1.hashCode());
    Assert.assertEquals(test3.hashCode(), test4.hashCode());
    Assert.assertEquals(test5.hashCode(), test6.hashCode());
  }

  @Test
  public void testToString() {
    Yossarian test1 = new Yossarian("WARDROBE");
    Yossarian test2 = new Yossarian("WARDROBE");
    Yossarian test3 = new Yossarian("HALF");
    Yossarian test4 = new Yossarian("HALF");
    Yossarian test5 = new Yossarian("QUARTER");
    Yossarian test6 = new Yossarian("QUARTER");

    Assert.assertEquals(test1.toString(), test2.toString());
    Assert.assertEquals(test3.toString(), test4.toString());
    Assert.assertEquals(test5.toString(), test6.toString());

    Assert.assertNotEquals(test1, test3);
  }

  @Test
  public void getEarthquakeSafety() {

    this.yossarian1.setEarthquakeSafety("WARDROBE");
    this.yossarian2.setEarthquakeSafety("HALF");
    this.yossarian3.setEarthquakeSafety("QUARTER");

    Assert.assertEquals(true, yossarian1.getEarthquakeSafety());
    Assert.assertEquals(false, yossarian2.getEarthquakeSafety());
    Assert.assertEquals(false, yossarian3.getEarthquakeSafety());



  }

  @Test
  public void setEarthquakeSafety() {
    this.yossarian1.setEarthquakeSafety("WARDROBE");
    this.yossarian2.setEarthquakeSafety("HALF");
    this.yossarian3.setEarthquakeSafety("QUARTER");

    Assert.assertEquals(true, yossarian1.getEarthquakeSafety());
    Assert.assertEquals(false, yossarian2.getEarthquakeSafety());
    Assert.assertEquals(false, yossarian3.getEarthquakeSafety());
  }

  @Test
  public void getTypeName() {
    Assert.assertEquals("Yossarian", yossarian3.getTypeName());
  }
}
