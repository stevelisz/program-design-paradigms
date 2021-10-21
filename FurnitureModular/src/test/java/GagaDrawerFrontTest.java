//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GagaDrawerFrontTest {
  private GagaDrawerFront gagaDrawerFront;

  public GagaDrawerFrontTest() {
  }

  @Before
  public void setUp() throws Exception {
    this.gagaDrawerFront = new GagaDrawerFront("QUARTER");
  }

  @Test
  public void getDimension() {
    Dimension d1 = new Dimension(18, 36);
    Assert.assertEquals(d1, this.gagaDrawerFront.getDimension());
  }

  @Test
  public void setDimension() {
    this.gagaDrawerFront.setDimension("QUARTER");
    Dimension d1 = new Dimension(18, 36);
    Assert.assertEquals(d1, this.gagaDrawerFront.getDimension());
  }

  @Test
  public void getSize() {
    Assert.assertEquals("QUARTER", this.gagaDrawerFront.getSize());
  }

  @Test
  public void setSize() {
    this.gagaDrawerFront.setSize("HAHA");
    Assert.assertEquals("HAHA", this.gagaDrawerFront.getSize());
  }

  @Test
  public void getColors() {
    ArrayList<String> quarColors = new ArrayList(Arrays.asList("brown", "black", "bone", "oxblood"));
    Assert.assertEquals(quarColors, this.gagaDrawerFront.getColors());
  }

  @Test
  public void setColors() {
    ArrayList<String> test = new ArrayList(Arrays.asList("brown", "black", "bone", "oxblood"));
    this.gagaDrawerFront.setColors("QUARTER");
    Assert.assertEquals(test, this.gagaDrawerFront.getColors());
  }

  @Test
  public void getHandleIncluded() {
    Assert.assertEquals(false, this.gagaDrawerFront.getHandleIncluded());
  }

  @Test
  public void setHandleIncluded() {
    this.gagaDrawerFront.setHandleIncluded("QUARTER");
    Assert.assertEquals(false, this.gagaDrawerFront.getHandleIncluded());
  }

  @Test
  public void testEquals() {
    GagaDrawerFront test1 = new GagaDrawerFront("QUARTER");
    GagaDrawerFront test2 = new GagaDrawerFront("QUARTER");
    GagaDoor test3 = new GagaDoor("QUARTER");
    Assert.assertEquals(test1, test2);
    Assert.assertNotEquals(test2, test3);
  }

  @Test
  public void testHashCode() {
    GagaDrawerFront test1 = new GagaDrawerFront("QUARTER");
    GagaDrawerFront test2 = new GagaDrawerFront("QUARTER");
    Assert.assertEquals((long)test1.hashCode(), (long)test2.hashCode());
  }

  @Test
  public void testToString() {
    GagaDrawerFront test1 = new GagaDrawerFront("QUARTER");
    GagaDrawerFront test2 = new GagaDrawerFront("QUARTER");
    Assert.assertEquals(test1.toString(), test2.toString());
  }

  @Test
  public void getTypeName() {
    Assert.assertEquals("GagaDrawerFront", gagaDrawerFront.getTypeName());
  }
}
