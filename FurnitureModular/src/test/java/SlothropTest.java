//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SlothropTest {
  private Slothrop slothrop1;
  private Slothrop slothrop2;

  public SlothropTest() {
  }

  @Before
  public void setUp() throws Exception {
    this.slothrop1 = new Slothrop("WARDROBE");
    this.slothrop2 = new Slothrop("HALF");
  }

  @Test
  public void getDimension() {
    Dimension d1 = new Dimension(72, 36);
    Dimension d2 = new Dimension(36, 36);
    Assert.assertEquals(d1, this.slothrop1.getDimension());
    Assert.assertEquals(d2, this.slothrop2.getDimension());
  }

  @Test
  public void setDimension() {
    Dimension d1 = new Dimension(72, 36);
    Dimension d2 = new Dimension(36, 36);
    this.slothrop1.setDimension("HALF");
    this.slothrop2.setDimension("WARDROBE");
    Assert.assertEquals(d1, this.slothrop2.getDimension());
    Assert.assertEquals(d2, this.slothrop1.getDimension());
  }

  @Test
  public void getSize() {
    Assert.assertEquals("WARDROBE", this.slothrop1.getSize());
    Assert.assertEquals("HALF", this.slothrop2.getSize());
  }

  @Test
  public void setSize() {
    this.slothrop1.setSize("HALF");
    this.slothrop2.setSize("WARDROBE");
    Assert.assertEquals("WARDROBE", this.slothrop2.getSize());
    Assert.assertEquals("HALF", this.slothrop1.getSize());
  }

  @Test
  public void getColors() {
    ArrayList<String> warColors = new ArrayList(Arrays.asList("brown", "black"));
    ArrayList<String> halfColors = new ArrayList(Arrays.asList("brown", "black"));
    Assert.assertEquals(warColors, this.slothrop1.getColors());
    Assert.assertEquals(halfColors, this.slothrop2.getColors());
  }

  @Test
  public void setColors() {
    this.slothrop1.setColors("HALF");
    this.slothrop2.setColors("WARDROBE");
    ArrayList<String> warColors = new ArrayList(Arrays.asList("brown", "black"));
    ArrayList<String> halfColors = new ArrayList(Arrays.asList("brown", "black"));
    Assert.assertEquals(warColors, this.slothrop2.getColors());
    Assert.assertEquals(halfColors, this.slothrop1.getColors());
  }

  @Test
  public void getHandleIncluded() {
    Assert.assertEquals(true, this.slothrop1.getHandleIncluded());
    Assert.assertEquals(true, this.slothrop2.getHandleIncluded());
  }

  @Test
  public void setHandleIncluded() {
    this.slothrop1.setHandleIncluded("HALF");
    this.slothrop2.setHandleIncluded("WARDROBE");
    Assert.assertEquals(true, this.slothrop1.getHandleIncluded());
    Assert.assertEquals(true, this.slothrop2.getHandleIncluded());
  }

  @Test
  public void testEquals() {
    Slothrop test1 = new Slothrop("HALF");
    Slothrop test2 = new Slothrop("HALF");
    Slothrop test3 = new Slothrop("WARDROBE");
    Slothrop test4 = new Slothrop("WARDROBE");
    Belacqua belacqua = new Belacqua("WARDROBE");
    Assert.assertEquals(test1, test2);
    Assert.assertEquals(test3, test4);
    Assert.assertNotEquals(belacqua, test4);
  }

  @Test
  public void testHashCode() {
    Slothrop test1 = new Slothrop("HALF");
    Slothrop test2 = new Slothrop("HALF");
    Assert.assertEquals((long)test1.hashCode(), (long)test2.hashCode());
  }

  @Test
  public void testToString() {
    Slothrop test1 = new Slothrop("HALF");
    Slothrop test2 = new Slothrop("HALF");
    Assert.assertEquals(test2.toString(), test1.toString());
  }

  @Test
  public void getTypeName() {
    Assert.assertEquals("Slothrop", slothrop2.getTypeName());
  }
}
