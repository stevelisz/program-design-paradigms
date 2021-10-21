//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GagaDoorTest {

  private GagaDoor gagaDoor1;
  private GagaDoor gagaDoor2;

  public GagaDoorTest() {
  }

  @Before
  public void setUp() throws Exception {
    this.gagaDoor1 = new GagaDoor("HALF");
    this.gagaDoor2 = new GagaDoor("QUARTER");
  }

  @Test
  public void getDimension() {
    Dimension d1 = new Dimension(36, 36);
    Dimension d2 = new Dimension(18, 36);
    Assert.assertEquals(d1, this.gagaDoor1.getDimension());
    Assert.assertEquals(d2, this.gagaDoor2.getDimension());
  }

  @Test
  public void setDimension() {
    Dimension d1 = new Dimension(36, 36);
    Dimension d2 = new Dimension(18, 36);
    this.gagaDoor1.setDimension("QUARTER");
    this.gagaDoor2.setDimension("HALF");
    Assert.assertEquals(d1, this.gagaDoor2.getDimension());
    Assert.assertEquals(d2, this.gagaDoor1.getDimension());
  }

  @Test
  public void getSize() {
    Assert.assertEquals("HALF", this.gagaDoor1.getSize());
    Assert.assertEquals("QUARTER", this.gagaDoor2.getSize());
  }

  @Test
  public void setSize() {
    this.gagaDoor1.setSize("QUARTER");
    this.gagaDoor2.setSize("HALF");
    Assert.assertEquals("QUARTER", this.gagaDoor1.getSize());
    Assert.assertEquals("HALF", this.gagaDoor2.getSize());
  }

  @Test
  public void getColors() {
    ArrayList<String> halfColors = new ArrayList(
        Arrays.asList("brown", "black", "bone", "oxblood"));
    ArrayList<String> quarColors = new ArrayList(
        Arrays.asList("brown", "black", "bone", "oxblood"));
    Assert.assertEquals(halfColors, this.gagaDoor1.getColors());
    Assert.assertEquals(quarColors, this.gagaDoor2.getColors());
  }

  @Test
  public void setColors() {
    ArrayList<String> halfColors = new ArrayList(
        Arrays.asList("brown", "black", "bone", "oxblood"));
    ArrayList<String> quarColors = new ArrayList(
        Arrays.asList("brown", "black", "bone", "oxblood"));
    this.gagaDoor1.setColors("QUARTER");
    this.gagaDoor2.setColors("HALF");
    Assert.assertEquals(halfColors, this.gagaDoor2.getColors());
    Assert.assertEquals(quarColors, this.gagaDoor1.getColors());
  }

  @Test
  public void getHandleIncluded() {
    Assert.assertEquals(false, this.gagaDoor1.getHandleIncluded());
    Assert.assertEquals(false, this.gagaDoor2.getHandleIncluded());
  }

  @Test
  public void setHandleIncluded() {
    this.gagaDoor1.setHandleIncluded("QUARTER");
    this.gagaDoor2.setHandleIncluded("HALF");
    Assert.assertEquals(false, this.gagaDoor1.getHandleIncluded());
    Assert.assertEquals(false, this.gagaDoor2.getHandleIncluded());
  }

  @Test
  public void testEquals() {
    GagaDoor test1 = new GagaDoor("HALF");
    GagaDoor test2 = new GagaDoor("HALF");
    GagaDoor test3 = new GagaDoor("QUARTER");
    GagaDoor test4 = new GagaDoor("QUARTER");
    GagaDrawerFront d1 = new GagaDrawerFront("QUARTER");
    Assert.assertEquals(test1, test2);
    Assert.assertEquals(test3, test4);
    Assert.assertNotEquals(d1, test3);
  }

  @Test
  public void testHashCode() {
    GagaDoor test1 = new GagaDoor("HALF");
    GagaDoor test2 = new GagaDoor("HALF");
    GagaDoor test3 = new GagaDoor("QUARTER");
    new GagaDoor("QUARTER");
    Assert.assertEquals((long) test1.hashCode(), (long) test2.hashCode());
    Assert.assertEquals((long) test3.hashCode(), (long) test3.hashCode());
  }

  @Test
  public void testToString() {
    GagaDoor test1 = new GagaDoor("HALF");
    GagaDoor test2 = new GagaDoor("HALF");
    GagaDoor test3 = new GagaDoor("QUARTER");
    GagaDoor test4 = new GagaDoor("QUARTER");
    Assert.assertEquals(test1.toString(), test2.toString());
    Assert.assertEquals(test3.toString(), test4.toString());
  }

  @Test
  public void testCor() {
    GagaDoor test1 = new GagaDoor("HALF");
    Assert.assertTrue(test1.getColors().contains("black"));

  }

  @Test
  public void getTypeName() {
    Assert.assertEquals("GagaDoor", gagaDoor2.getTypeName());
  }
}
