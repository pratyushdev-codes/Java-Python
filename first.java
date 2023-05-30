class Cylinder{
  private int radius;
  private int height;

  public Cylinder(int radius, int height) {
      this.radius = radius;
      this.height = height;
  }

  public int getRadius() {
      return radius;
  }

  public void setRadius(int radius) {
      this.radius = radius;
  }

  public int getHeight() {
      return height;
  }

  public void setHeight(int height) {
      this.height = height;
 
}
}
public class first{
  public static void main(String args[]){
    Cylinder mycylinder= new Cylinder();
    mycylinder.setHeight(12);
    System.out.println(mycylinder.getHeight());
  }
}
