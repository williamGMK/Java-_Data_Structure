abstract class Shape {
    String color;
    abstract double area();
    public abstract String toString();

    // abstract class can have the constructor
    public Shape(String color){
        this.color = color;
    }

    // this is a concrete method
    public String getColor(){

        return color;

    }
}
