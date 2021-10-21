//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class AtreidesTest {
  private Atreides atreides1;
  private Atreides atreides2;

  public AtreidesTest() {
  }

  @Before
  public void setUp() throws Exception {
    this.atreides1 = new Atreides("HALF");
    this.atreides2 = new Atreides("QUARTER");
  }

  @Test
  public void getDimension() {
    Dimension dimension1 = new Dimension(36, 36, 16);
    Dimension dimension2 = new Dimension(18, 36, 16);
    Assert.assertEquals(dimension1, this.atreides1.getDimension());
    Assert.assertEquals(dimension2, this.atreides2.getDimension());
  }

  @Test
  public void setDimension() {
    Dimension dimension1 = new Dimension(36, 36, 16);
    Dimension dimension2 = new Dimension(18, 36, 16);
    this.atreides1.setDimension("QUARTER");
    this.atreides2.setDimension("HALF");
    Assert.assertEquals(dimension1, this.atreides2.getDimension());
    Assert.assertEquals(dimension2, this.atreides1.getDimension());
  }

  @Test
  public void getSize() {
    Assert.assertEquals("HALF", this.atreides1.getSize());
    Assert.assertEquals("QUARTER", this.atreides2.getSize());
  }

  @Test
  public void setSize() {
    this.atreides1.setSize("QUARTER");
    this.atreides2.setSize("HALF");
    Assert.assertEquals("HALF", this.atreides2.getSize());
    Assert.assertEquals("QUARTER", this.atreides1.getSize());
  }

  @Test
  public void getColors() {
    ArrayList<String> halfColors = new ArrayList(Arrays.asList("brown", "bone"));
    ArrayList<String> quarColors = new ArrayList(Arrays.asList("brown", "bone"));
    Assert.assertEquals(halfColors, this.atreides1.getColors());
    Assert.assertEquals(quarColors, this.atreides1.getColors());
  }

  @Test
  public void setColors() {
    ArrayList<String> halfColors = new ArrayList(Arrays.asList("brown", "bone"));
    ArrayList<String> quarColors = new ArrayList(Arrays.asList("brown", "bone"));
    this.atreides1.setColors("QUARTER");
    this.atreides2.setColors("HALF");
    Assert.assertEquals(quarColors, this.atreides1.getColors());
    Assert.assertEquals(halfColors, this.atreides2.getColors());
  }

  @Test
  public void getMounting() {
    Assert.assertEquals(Mounting.floorOrWall, this.atreides1.getMounting());
    Assert.assertEquals(Mounting.floorOrWall, this.atreides2.getMounting());
  }

  @Test
  public void setMounting() {
    this.atreides1.setMounting("QUARTER");
    this.atreides2.setMounting("HALF");
    Assert.assertEquals(Mounting.floorOrWall, this.atreides1.getMounting());
    Assert.assertEquals(Mounting.floorOrWall, this.atreides1.getMounting());
  }

  @Test
  public void getFeet() {
    Assert.assertEquals(Feet.optional, this.atreides1.getFeet());
    Assert.assertEquals(Feet.optional, this.atreides2.getFeet());
  }

  @Test
  public void setFeet() {
    this.atreides1.setFeet("QUARTER");
    this.atreides2.setFeet("HALF");
    Assert.assertEquals(Feet.optional, this.atreides1.getFeet());
    Assert.assertEquals(Feet.optional, this.atreides2.getFeet());
  }

  @Test
  public void getRail() {
    Assert.assertEquals(Rail.atreides, this.atreides1.getRail());
    Assert.assertEquals(Rail.atreides, this.atreides2.getRail());
  }

  @Test
  public void getShelfAmount() {
    Assert.assertEquals(3L, (long)this.atreides1.getShelfAmount());
    Assert.assertEquals(1L, (long)this.atreides2.getShelfAmount());
  }

  @Test
  public void setShelfAmount() {
    this.atreides1.setShelfAmount("QUARTER");
    this.atreides2.setShelfAmount("HALF");
    Assert.assertEquals(1L, (long)this.atreides1.getShelfAmount());
    Assert.assertEquals(3L, (long)this.atreides2.getShelfAmount());
  }

  @Test
  public void getDrawerAmount() {
    Assert.assertEquals(0L, (long)this.atreides1.getDrawerAmount());
    Assert.assertEquals(0L, (long)this.atreides2.getDrawerAmount());
  }

  @Test
  public void setDrawerAmount() {
    this.atreides1.setDrawerAmount("QUARTER");
    this.atreides2.setDrawerAmount("HALF");
    Assert.assertEquals(0L, (long)this.atreides1.getDrawerAmount());
    Assert.assertEquals(0L, (long)this.atreides2.getDrawerAmount());
  }


  @Test
  public void testEquals() {
    Atreides test1 = new Atreides("HALF");
    Atreides test2 = new Atreides("HALF");
    Atreides test3 = new Atreides("QUARTER");
    Atreides test4 = new Atreides("QUARTER");

    Assert.assertEquals(test1, test2);
    Assert.assertEquals(test3, test4);
    Assert.assertFalse(test2.equals(test3));

  }

  @Test
  public void testHashCode() {
    Atreides test1 = new Atreides("HALF");
    Atreides test2 = new Atreides("HALF");
    Atreides test3 = new Atreides("QUARTER");
    Atreides test4 = new Atreides("QUARTER");

    Assert.assertEquals(test1.hashCode(), test2.hashCode());
    Assert.assertEquals(test3.hashCode(), test4.hashCode());

  }

  @Test
  public void testToString() {
    Atreides test1 = new Atreides("HALF");
    Atreides test2 = new Atreides("HALF");
    Atreides test3 = new Atreides("QUARTER");
    Atreides test4 = new Atreides("QUARTER");

    Assert.assertEquals(test1.toString(), test2.toString());
    Assert.assertEquals(test3.toString(), test4.toString());


  }

  @Test
  public void getTypeName() {
    Assert.assertEquals("Atreides", atreides1.getTypeName());
  }
}
