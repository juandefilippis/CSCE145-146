/**
 * Auto Generated Java Class.
 */
public class ExponentialLine implements Line{
  
  private double exponent;
  
  public ExponentialLine()
  {
    exponent=0.0;
  }
  public ExponentialLine(double aExponent)
  {
    this.setExponent(aExponent);
  }
  public double getExponent()
  {
    return this.exponent;
  }
  public void setExponent(double aExponent)
  {
    this.exponent=aExponent;
  }
  public double getYPoint(double x)
  {
    return Math.pow(x,exponent);
  }
  
  
  /* ADD YOUR CODE HERE */
  
}
