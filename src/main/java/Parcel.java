public class Parcel {
  private int mLength;
  private int mWidth;
  private int mHeight;
  private int mDistance;
  private int mWeight;

  public Parcel(int length, int width, int height, int distance, int weight) {
    mLength = length;
    mWidth = width;
    mHeight = height;
    mDistance = distance;
    mWeight = weight;
  }

  public int getHeight() {
    return mHeight;
  }

  public int getLength() {
    return mLength;
  }

  public int getWidth() {
    return mWidth;
  }

  public int getVolume() {
    return mWidth * mLength * mHeight;
  }

  public int getDistance() {
    return mDistance;
  }

  public int getWeight() {
    return mWeight;
  }

  public int getShipCost() {
    int volume = getVolume();
    return ((volume + mDistance + mWeight)/10);
  }

}
