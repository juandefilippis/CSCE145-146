// Written by Juan De Filippis
public class RightTriangle implements ShapeInterface {
 
 private double base;
 private double height;
 private double area;
 
 public RightTriangle() {
  this.base = 0.0;
  this.height = 0.0;
  this.area = 0.0;
 }
 
 public RightTriangle(double aBase, double aHeight) {
  this.setBase(aBase);
  this.setHeight(aHeight);
  this.setArea((aBase*aHeight)/2);
 }

 public double getBase() {
  return base;
 }

 public void setBase(double aBase) {
  this.base = aBase;
 }

 public double getHeight() {
  return height;
 }

 public void setHeight(double aHeight) {
  this.height = aHeight;
 }

 public double getArea() {
  return area;
 }

 public void setArea(double area) {
  this.area = area;
 }
 public String getShapeType() {
  return "Right Triangle";
 }
 public String toString() {
  String str = "Right SideA: "+getBase() + " SideB: "+getHeight()+" Area: "+getArea();
  return str;
 }
}
