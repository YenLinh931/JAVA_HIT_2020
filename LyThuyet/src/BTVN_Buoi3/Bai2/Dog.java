package BTVN_Buoi3.Bai2;

import java.util.Scanner;

public class Dog {
    private String name;
    private int MP=100;

    Scanner yl=new Scanner(System.in);
    public void InputName(){
        System.out.print("Input Name Of Dog: ");
        name=yl.nextLine();
    }
    public void ShowMP(){
        System.out.println("MP = "+MP);
    }
    public void Bark(){
        if(name!="")
        {
            System.out.println(name+"  sủa");
            MP -= 20;
        }
        else System.out.println("Xin lỗi bạn chưa điền tên");
    }
}
