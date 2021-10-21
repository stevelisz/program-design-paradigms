//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LuthienTest {

  private Luthien luthien1;
  private Luthien luthien2;

  public LuthienTest() {
  }

  @Before
  public void setUp() throws Exception {
    this.luthien1 = new Luthien("HALF");
    this.luthien2 = new Luthien("QUARTER");
  }

  @Test
  public void getDimension() {
    Dimension dimension2 = new Dimension(36, 36, 16);
    Dimension dimension3 = new Dimension(18, 36, 16);
    Assert.assertEquals(dimension2, this.luthien1.getDimension());
    Assert.assertEquals(dimension3, this.luthien2.getDimension());
  }

  @Test
  public void setDimension() {
    Dimension dimension1 = new Dimension(36, 36, 16);
    Dimension dimension2 = new Dimension(18, 36, 16);
    this.luthien1.setDimension("QUARTER");
    this.luthien2.setDimension("HALF");
    Assert.assertEquals(dimension1, this.luthien2.getDimension());
    Assert.assertEquals(dimension2, this.luthien1.getDimension());
  }

  @Test
  public void getSize() {
    Assert.assertEquals("HALF", this.luthien1.getSize());
    Assert.assertEquals("QUARTER", this.luthien2.getSize());
  }

  @Test
  public void setSize() {
    this.luthien1.setSize("QUARTER");
    this.luthien2.setSize("HALF");
    Assert.assertEquals("HALF", this.luthien2.getSize());
    Assert.assertEquals("QUARTER", this.luthien1.getSize());
  }

  @Test
  public void getColors() {
    ArrayList<String> halfColors = new ArrayList(Arrays.asList("black", "bone"));
    ArrayList<String> quarColors = new ArrayList(Arrays.asList("black", "bone"));
    Assert.assertEquals(halfColors, this.luthien1.getColors());
    Assert.assertEquals(quarColors, this.luthien2.getColors());
  }

  @Test
  public void setColors() {
    ArrayList<String> halfColors = new ArrayList(Arrays.asList("black", "bone"));
    ArrayList<String> quarColors = new ArrayList(Arrays.asList("black", "bone"));
    this.luthien1.setColors("QUARTER");
    this.luthien2.setColors("HALF");
    Assert.assertEquals(halfColors, this.luthien1.getColors());
    Assert.assertEquals(quarColors, this.luthien2.getColors());
  }

  @Test
  public void getMounting() {
    Assert.assertEquals(Mounting.floorOrWall, this.luthien1.getMounting());
    Assert.assertEquals(Mounting.floorOrWall, this.luthien2.getMounting());
  }

  @Test
  public void setMounting() {
    this.luthien1.setMounting("QUARTER");
    this.luthien2.setMounting("HALF");
    Assert.assertEquals(Mounting.floorOrWall, this.luthien1.getMounting());
    Assert.assertEquals(Mounting.floorOrWall, this.luthien2.getMounting());
  }

  @Test
  public void getFeet() {
    Assert.assertEquals(Feet.optional, this.luthien1.getFeet());
    Assert.assertEquals(Feet.required, this.luthien2.getFeet());
  }

  @Test
  public void setFeet() {
    this.luthien1.setFeet("QUARTER");
    this.luthien2.setFeet("HALF");
    Assert.assertEquals(Feet.required, this.luthien1.getFeet());
    Assert.assertEquals(Feet.optional, this.luthien2.getFeet());
  }

  @Test
  public void getRail() {
    Assert.assertEquals(Rail.standard, this.luthien1.getRail());
    Assert.assertEquals(Rail.standard, this.luthien2.getRail());
  }

  @Test
  public void getShelfAmount() {
    Assert.assertEquals(3L, (long) this.luthien1.getShelfAmount());
    Assert.assertEquals(1L, (long) this.luthien2.getShelfAmount());
  }

  @Test
  public void setShelfAmount() {
    this.luthien1.setShelfAmount("QUARTER");
    this.luthien2.setShelfAmount("HALF");
    Assert.assertEquals(1L, (long) this.luthien1.getShelfAmount());
    Assert.assertEquals(3L, (long) this.luthien2.getShelfAmount());
  }

  @Test
  public void getDrawerAmount() {
    Assert.assertEquals(1L, (long) this.luthien1.getDrawerAmount());
    Assert.assertEquals(1L, (long) this.luthien2.getDrawerAmount());
  }

  @Test
  public void setDrawerAmount() {
    this.luthien1.setDrawerAmount("QUARTER");
    this.luthien2.setDrawerAmount("HALF");
    Assert.assertEquals(1L, (long) this.luthien1.getDrawerAmount());
    Assert.assertEquals(1L, (long) this.luthien2.getDrawerAmount());
  }

  @Test
  public void testEquals() {
    Luthien test1 = new Luthien("HALF");
    Luthien test2 = new Luthien("HALF");

    Luthien test3 = new Luthien("QUARTER");
    Luthien test4 = new Luthien("QUARTER");

    Assert.assertEquals(test1, test2);
    Assert.assertEquals(test3, test4);
    Assert.assertNotEquals(test1, test4);

  }

  @Test
  public void testHashCode() {
    Luthien test1 = new Luthien("HALF");
    Luthien test2 = new Luthien("HALF");

    Luthien test3 = new Luthien("QUARTER");
    Luthien test4 = new Luthien("QUARTER");

    Assert.assertEquals(test1.hashCode(), test2.hashCode());
    Assert.assertEquals(test3.hashCode(), test4.hashCode());
  }

  @Test
  public void testToString() {
    Luthien test1 = new Luthien("HALF");
    Luthien test2 = new Luthien("HALF");

    Luthien test3 = new Luthien("QUARTER");
    Luthien test4 = new Luthien("QUARTER");

    Assert.assertEquals(test1.toString(), test2.toString());
    Assert.assertEquals(test3.toString(), test4.toString());
  }

  @Test
  public void getTypeName() {
    Assert.assertEquals("Luthien", luthien1.getTypeName());
  }
}
