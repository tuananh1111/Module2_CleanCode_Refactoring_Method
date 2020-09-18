public class Cylinder {
    public static double getVolume(int radius, int height){
        double perimeter= getPerimeter(radius);
        double area= getArea(radius);
        double volume = perimeter * height + 2 * area;
        return volume;
    }
    public static double getArea(int radius){
        return Math.PI * radius * radius;
    }
    public static double getPerimeter(int radius){
        return  2 * Math.PI  * radius;
    }
}