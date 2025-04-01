/*
 * Activity 4.9.2
 */
public class Giraffe extends Hooved
{
  private String string;
  private boolean b;
  private double d;
      
    public Giraffe(String string, boolean b, double d) {
      this.string = string;
      this.b = b;
      this.d = d;
  }

  public void hum()
  {
    System.out.println("The giraffe hums.");
  }
}