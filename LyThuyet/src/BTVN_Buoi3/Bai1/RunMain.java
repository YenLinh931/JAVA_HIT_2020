package BTVN_Buoi3.Bai1;

import BTVN_Buoi3.Bai1.Person;

public class RunMain {
    public static void main(String[] args) {
        Person DoanXinhGai= new Person();
        Person DiepBueDe= new Person();
        //Scanner yl=new Scanner(System.in);
        DoanXinhGai.setName("Vũ Văn Doan");
        System.out.println(DoanXinhGai.getName());
        DoanXinhGai.setDateOfBirth("01/01/2000");
        System.out.println(DoanXinhGai.getDateOfBirth());
        DoanXinhGai.setGender("Male");
        System.out.println(DoanXinhGai.getGender());
        DoanXinhGai.setHobby("Code");
        System.out.println(DoanXinhGai.getHobby());
        System.out.println("-------------------------------------------------");
        DoanXinhGai.setName("Nguyễn Đức Điệp");
        System.out.println(DoanXinhGai.getName());
        DoanXinhGai.setDateOfBirth("02/02/2000");
        System.out.println(DoanXinhGai.getDateOfBirth());
        DoanXinhGai.setGender("Male");
        System.out.println(DoanXinhGai.getGender());
        DoanXinhGai.setHobby("Code");
        System.out.println(DoanXinhGai.getHobby());
    }
}
