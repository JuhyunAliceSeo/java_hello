
class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle {
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

//public class Java_08_string {
//    public static void main(String[] args) {
//    	
//        Rectangle[] arrRectangle = new Rectangle[2]; // Rectangle 배열 선언
//
//        arrRectangle[0] = new Rectangle(40, 50);
//        arrRectangle[1] = new Rectangle(20, 50);
//
//        int area = 0;
//        for(int i=0; i < arrRectangle.length;i++) {
//            int width, height;
//            Scanner sc = new Scanner(System.in);
//            width = sc.nextInt();
//            height = sc.nextInt();         
//         
//            arrRectangle[i] = new Rectangle(width,height);
//         }
////        for (int i = 0; i < arrRectangle.length; i++) {
////            area = area + arrRectangle[i].getArea();
////        }
//        System.out.println(area);
//    }
//		
//		
////		String[] arrStr = new String[2];
////		
////		arrStr[0] = "String 1";
////		arrStr[1] = "String 2";
////		
////		System.out.println(arrStr[0].length());
////		System.out.println(arrStr[1].length());
////		
////		int sum=0;
////		for(int i = 0; i < arrStr.length; i++) {
////			sum= sum + arrStr[i].length();
////			
////		}
//		
////		for(int i=0; i< arrStr.length;i++) {
////			System.out.println(arrStr[i]);
////		}
//
////	}
//
//}
