package Bai2;

public class RunMain {
    public static void main(String[] args) {
        IShape[] shapes=new IShape[3];
        shapes[0]=new Rectangle(3.4,5.8);
        shapes[1]=new Circle(4.6);
        shapes[2]=new Rectangle(2.6,8.9);
        for (int i = 0; i <3 ; i++) {
            System.out.println("Area of shape["+i+"]: "+shapes[i].getArea());
            System.out.println("Perimeter of shape["+i+"]: "+shapes[i].getPerimeter());
        }
    }
}
