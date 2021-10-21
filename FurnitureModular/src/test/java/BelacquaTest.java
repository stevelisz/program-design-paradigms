//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BelacquaTest {
  private Belacqua belacqua1;
  private Belacqua belacqua2;
  private Belacqua belacqua3;

  public BelacquaTest() {
  }

  @Before
  public void setUp() throws Exception {
    this.belacqua1 = new Belacqua("WARDROBE");
    this.belacqua2 = new Belacqua("HALF");
    this.belacqua3 = new Belacqua("QUARTER");
  }

  @Test
  public void getDimension() {
    Dimension d1 = new Dimension(72, 36);
    Dimension d2 = new Dimension(36, 36);
    Dimension d3 = new Dimension(18, 36);
    Assert.assertEquals(d1, this.belacqua1.getDimension());
    Assert.assertEquals(d2, this.belacqua2.getDimension());
    Assert.assertEquals(d3, this.belacqua3.getDimension());
  }

  @Test
  public void setDimension() {
    Dimension d1 = new Dimension(72, 36);
    Dimension d2 = new Dimension(36, 36);
    Dimension d3 = new Dimension(18, 36);
    this.belacqua1.setDimension("QUARTER");
    this.belacqua2.setDimension("WARDROBE");
    this.belacqua3.setDimension("HALF");
    Assert.assertEquals(d3, this.belacqua1.getDimension());
    Assert.assertEquals(d1, this.belacqua2.getDimension());
    Assert.assertEquals(d2, this.belacqua3.getDimension());
  }

  @Test
  public void getSize() {
    Assert.assertEquals("WARDROBE", this.belacqua1.getSize());
    Assert.assertEquals("HALF", this.belacqua2.getSize());
    Assert.assertEquals("QUARTER", this.belacqua3.getSize());
  }

  @Test
  public void setSize() {
    this.belacqua1.setSize("QUARTER");
    this.belacqua2.setSize("WARDROBE");
    this.belacqua3.setSize("HALF");
    Assert.assertEquals("WARDROBE", this.belacqua2.getSize());
    Assert.assertEquals("HALF", this.belacqua3.getSize());
    Assert.assertEquals("QUARTER", this.belacqua1.getSize());
  }

  @Test
  public void getColors() {
    ArrayList<String> warColors = new ArrayList(Arrays.asList("bone", "oxblood"));
    ArrayList<String> halfColors = new ArrayList(Arrays.asList("bone", "oxblood"));
    ArrayList<String> quarColors = new ArrayList(Arrays.asList("bone", "oxblood"));
    Assert.assertEquals(warColors, this.belacqua1.getColors());
    Assert.assertEquals(halfColors, this.belacqua2.getColors());
    Assert.assertEquals(quarColors, this.belacqua3.getColors());
  }

  @Test
  public void setColors() {
    ArrayList<String> warColors = new ArrayList(Arrays.asList("bone", "oxblood"));
    ArrayList<String> halfColors = new ArrayList(Arrays.asList("bone", "oxblood"));
    ArrayList<String> quarColors = new ArrayList(Arrays.asList("bone", "oxblood"));
    this.belacqua1.setColors("QUARTER");
    this.belacqua2.setColors("WARDROBE");
    this.belacqua3.setColors("HALF");
    Assert.assertEquals(warColors, this.belacqua1.getColors());
    Assert.assertEquals(halfColors, this.belacqua2.getColors());
    Assert.assertEquals(quarColors, this.belacqua3.getColors());
  }

  @Test
  public void getHandleIncluded() {
    Assert.assertEquals(true, this.belacqua1.getHandleIncluded());
    Assert.assertEquals(true, this.belacqua2.getHandleIncluded());
    Assert.assertEquals(true, this.belacqua3.getHandleIncluded());
  }

  @Test
  public void setHandleIncluded() {
    this.belacqua1.setHandleIncluded("HALF");
    this.belacqua2.setHandleIncluded("QUARTER");
    this.belacqua3.setHandleIncluded("WARDROBE");
    Assert.assertEquals(true, this.belacqua1.getHandleIncluded());
    Assert.assertEquals(true, this.belacqua2.getHandleIncluded());
    Assert.assertEquals(true, this.belacqua3.getHandleIncluded());
  }

  @Test
  public void testEquals() {
    Belacqua test1 = new Belacqua("WARDROBE");
    Belacqua test2 = new Belacqua("WARDROBE");
    Belacqua test3 = new Belacqua("HALF");
    Belacqua test4 = new Belacqua("HALF");
    Belacqua test5 = new Belacqua("QUARTER");
    Belacqua test6 = new Belacqua("QUARTER");
    Slothrop slothrop = new Slothrop("QUARTER");
    Assert.assertEquals(test1, test2);
    Assert.assertEquals(test3, test4);
    Assert.assertEquals(test5, test6);
    Assert.assertNotEquals(slothrop, test3);
  }

  @Test
  public void testHashCode() {
    Belacqua test1 = new Belacqua("WARDROBE");
    Belacqua test2 = new Belacqua("WARDROBE");
    Belacqua test3 = new Belacqua("HALF");
    Belacqua test4 = new Belacqua("HALF");
    Belacqua test5 = new Belacqua("QUARTER");
    Belacqua test6 = new Belacqua("QUARTER");
    Assert.assertEquals((long)test1.hashCode(), (long)test2.hashCode());
    Assert.assertEquals((long)test3.hashCode(), (long)test4.hashCode());
    Assert.assertEquals((long)test5.hashCode(), (long)test6.hashCode());
  }

  @Test
  public void testToString() {
    Belacqua test1 = new Belacqua("WARDROBE");
    Belacqua test2 = new Belacqua("WARDROBE");
    Belacqua test3 = new Belacqua("HALF");
    Belacqua test4 = new Belacqua("HALF");
    Belacqua test5 = new Belacqua("QUARTER");
    Belacqua test6 = new Belacqua("QUARTER");
    Assert.assertEquals(test1.toString(), test2.toString());
    Assert.assertEquals(test3.toString(), test4.toString());
    Assert.assertEquals(test5.toString(), test6.toString());
  }

  @Test
  public void getTypeName() {
    Assert.assertEquals("Belacqua", belacqua1.getTypeName());
  }
}
