package BTVN_Buoi3.Bai4;

public class RunMain {
    public static void main(String[] args) {
        Array arr1=new Array();
        Array arr2=new Array();
        System.out.println("Nhập mảng thứ nhất");
        arr1.InputData();
        System.out.println("Nhập mảng thứ hai");
        arr2.InputData();
        if((1.0*arr1.Sum()/arr1.getN())>(1.0*arr2.Sum()/arr2.getN()))
            System.out.println("Trung bình cộng các phần tử của mảng 1 lớn hơn mảng 2");
        else if((1.0*arr1.Sum()/arr1.getN())<(1.0*arr2.Sum()/arr2.getN()))
            System.out.println("Trung bình cộng các phần tử của mảng 1 nhỏ hơn mảng 2");
        else System.out.println("Hi");
    }
}
