/**
Written by Juan De Filippis
 */
public class Circle implements ShapeInterface {
 private double radius;

 public Circle() {
  this.radius = 0.0;
 }
 public Circle(double radius) {
  this.radius = radius;
 }
 public double getRadius() {
  return this.radius;
 }
 public void setRadius(double radius) {
  this.radius = radius;
 }
  
 public double getArea() {
  return Math.PI*this.radius*this.radius;
 }

 public String getShapeType() {
  return "Circle";
 }
 public String toString() {
  return "Radius: "+ this.radius + " Shape Type: " + getShapeType();
 }

}

