import java.util.*;

class CircleWithException{

    private double radius;

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
    public double getDiameter() {
        return this.radius * 2;
    }

    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter radius for circle: ");
        double radius = input.nextDouble();
        
        // try {
        //     if (radius <= 0){
        //         throw new IllegalArgumentException();
        //     }
    
        //     if (radius > 1000){
        //         throw new Exception();
        //     }
        // } catch (IllegalArgumentException e){
        //     System.out.println(e.getMessage());
        // } catch (Exception e){
        //     System.out.println("Exception");
        // }

        if (radius <= 0){
            throw new IllegalArgumentException();
        }
        if (Math.PI * radius * radius > 1000){
            throw new Exception("Exception");
        }

        CircleWithException circle = new CircleWithException();
        circle.setRadius(radius);
        System.out.print("Radius of circle: " + circle.getRadius() + "\nArea of circle: " + circle.getArea() + "\nDiameter of circle: " + circle.getDiameter());

        input.close();
    }
}
