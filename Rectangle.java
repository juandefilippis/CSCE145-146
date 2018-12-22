/**
 Written by Juan De Filippis
 */
public class Rectangle implements ShapeInterface {

 private double length;
 private double width;

 public Rectangle() {
  this.length = 0.0;
  this.width = 0.0;
 }
 public Rectangle(double length, double width) {
  this.length = length;
  this.width = width;
 }
 public double getWidth() {
  return this.width;
 }
 public double getLength() {
  return this.length;
 }
 public void setWidth(double width) {
  this.width = width;
 }
 public void setLength(double length) {
  this.length = length;
 }

 public double getArea() {
  return this.length*this.width;
 }

 public String getShapeType() {
  return "Rectangle";
 }
 public String toString() {
  return "Length: "+ this.length + " Width: "+ this.width + " Area: "+ getArea() + " Shape Type: " + getShapeType();
 }

}
