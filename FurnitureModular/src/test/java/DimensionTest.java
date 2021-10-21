//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DimensionTest {
  private Dimension d1;
  private Dimension d2;

  public DimensionTest() {
  }

  @Before
  public void setUp() throws Exception {
    this.d1 = new Dimension(10, 10, 10);
    this.d2 = new Dimension(10, 10);
  }

  @Test
  public void getHeight() {
    Assert.assertEquals(10L, (long)this.d1.getHeight());
    Assert.assertEquals(10L, (long)this.d2.getHeight());
  }

  @Test
  public void setHeight() {
    this.d1.setHeight(5);
    this.d2.setHeight(5);
    Assert.assertEquals(5L, (long)this.d1.getHeight());
    Assert.assertEquals(5L, (long)this.d2.getHeight());
  }

  @Test
  public void getWidth() {
    Assert.assertEquals(10L, (long)this.d1.getWidth());
    Assert.assertEquals(10L, (long)this.d2.getWidth());
  }

  @Test
  public void setWidth() {
    this.d1.setWidth(3);
    this.d2.setWidth(4);
    Assert.assertEquals(3L, (long)this.d1.getWidth());
    Assert.assertEquals(4L, (long)this.d2.getWidth());
  }

  @Test
  public void getDepth() {
    Assert.assertEquals(10L, (long)this.d1.getDepth());
    Assert.assertNull(this.d2.getDepth());
  }

  @Test
  public void setDepth() {
    this.d1.setDepth(5);
    Assert.assertEquals(5L, (long)this.d1.getDepth());
  }

  @Test
  public void setDepth2() {
    this.d2.setDepth(5);
    Assert.assertEquals(5L, (long)this.d2.getDepth());
  }

  @Test
  public void testEquals() {
    Dimension t1 = new Dimension(5, 5, 5);
    Dimension t2 = new Dimension(5, 5, 5);
    Dimension t3 = new Dimension(5, 5);
    Dimension t4 = new Dimension(5, 5);
    Assert.assertEquals(t1, t2);
    Assert.assertEquals(t3, t4);
    Assert.assertNotEquals(t2, t3);
  }

  @Test
  public void testHashCode() {
    Dimension t1 = new Dimension(5, 5, 5);
    Dimension t2 = new Dimension(5, 5, 5);
    Dimension t3 = new Dimension(5, 5);
    Dimension t4 = new Dimension(5, 5);
    Assert.assertEquals((long)t1.hashCode(), (long)t2.hashCode());
    Assert.assertEquals((long)t3.hashCode(), (long)t4.hashCode());
  }

  @Test
  public void testToString() {
    Dimension t1 = new Dimension(5, 5, 5);
    Dimension t2 = new Dimension(5, 5, 5);
    Dimension t3 = new Dimension(5, 5);
    Dimension t4 = new Dimension(5, 5);
    Assert.assertEquals(t1.toString(), t2.toString());
    Assert.assertEquals(t3.toString(), t4.toString());
  }
}
