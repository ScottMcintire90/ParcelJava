import org.junit.*;
import static org.junit.Assert.*;

public class ParcelTest {

  @Test
  public void newParcel_instantiatesCorrectly() {
    Parcel testParcel = new Parcel(2, 3, 4, 100, 10);
    assertEquals(true, testParcel instanceof Parcel);
  }

  @Test
  public void getHeight_getHeightofParcel_4() {
    Parcel testParcel = new Parcel(2, 3, 4, 100, 10);
    assertEquals(4, testParcel.getHeight());
  }

  @Test
  public void getLength_getLengthofParcel_2() {
    Parcel testParcel = new Parcel(2, 3, 4, 100, 10);
    assertEquals(2, testParcel.getLength());
  }

  @Test
  public void getWidth_getWidthofParcel_3() {
    Parcel testParcel = new Parcel(2, 3, 4, 100, 10);
    assertEquals(3, testParcel.getWidth());
  }

  @Test
  public void getVolume_getVolumeofParcel_24() {
    Parcel testParcel = new Parcel(2, 3, 4, 100, 10);
    assertEquals(24, testParcel.getVolume());
  }

  @Test
  public void getDistance_getDistanceofShipment_100() {
    Parcel testParcel = new Parcel(2, 3, 4, 100, 10);
    assertEquals(100, testParcel.getDistance());
  }

  @Test
  public void getWeight_getWeightofParce_10() {
    Parcel testParcel = new Parcel(2, 3, 4, 100, 10);
    assertEquals(10, testParcel.getWeight());
  }

  @Test
  public void getShipCost_getShippingCost_13() {
    Parcel testParcel = new Parcel(2, 3, 4, 100, 10);
    assertEquals(13, testParcel.getShipCost());
  }
}
