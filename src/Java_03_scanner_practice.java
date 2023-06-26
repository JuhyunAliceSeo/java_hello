import java.util.Scanner;

class Circle2 {
    private double radius;

    public Circle2() {}

    public Circle2(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}

class Rectangle2 {
    private int width, height;

    public Rectangle2() {}

    public Rectangle2(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

public class Java_03_scanner_practice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle2 circle;
        Rectangle2 rectangle;

        // Circle
        System.out.print("원의 반지름: ");
        double radius = scanner.nextDouble();
        circle = new Circle2(radius);
        System.out.println("원의 넓이는 " + circle.getArea());

//        // Rectangle
//        System.out.print("사각형의 가로: ");
//        int width = scanner.nextInt();
//        System.out.print("사각형의 세로: ");
//        int height = scanner.nextInt();
//        rectangle = new Rectangle2(width, height);
//        System.out.println("사각형의 넓이는 " + rectangle.getArea());

        // Additional Rectangle Input
        Scanner rectangleScanner = new Scanner(System.in);
        Rectangle2 rectangleObject;

        boolean continueProgram = true;

        while (continueProgram) {
            System.out.print("가로: ");
            int a = rectangleScanner.nextInt();
            System.out.print("세로: ");
            int b = rectangleScanner.nextInt();

            rectangleObject = new Rectangle2(a, b);
            System.out.println("넓이: " + rectangleObject.getArea());

            System.out.print("계속하시겠습니까? (Yes/No): ");
            String continueChoice = rectangleScanner.next();//next는 문자열을 덮는것
//            if (continueChoice.equalsIgnoreCase("No")) {
//                continueProgram = false;
                
//                if (continueChoice.equals("yes") || continueChoice.equals("y"))
//                	continue;
//                else
//                	break;
                
                if(continueChoice.compareToIgnoreCase("yes")==0)//진행하라는 문구
                	continue;
                else
                	break; 
            }
        }

//        rectangleScanner.close();
//    }
}