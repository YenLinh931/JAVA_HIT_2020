package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    static Scanner sc=new Scanner(System.in);
    public static void Insert_News(ArrayList<News> news){
        int n;
        System.out.print("Input n: ");
        n=sc.nextInt();
        for (int i = 0; i <n ; i++) {
            News A=new News();
            A.Input();
            news.add(A);
        }
    }
    public static void View_list_news(ArrayList<News> news){
        for (int i = 0; i <news.size() ; i++) {
            news.get(i).Display();
        }
    }
    public static void averageRate(ArrayList<News> news){
        for (int i = 0; i <news.size() ; i++) {
            news.get(i).Caculator();
            news.get(i).Display();
        }

    }
    public static void main(String[] args) {
        ArrayList<News> news=new ArrayList<>();
        do {
            int choice;
            System.out.println("===================MENU=======================");
            System.out.println("1.Insert News");
            System.out.println("2.View list news");
            System.out.println("3.Average rate");
            System.out.println("4.Exit");
            System.out.println("Let you choose: ");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    Insert_News(news);
                    break;
                case 2:
                    View_list_news(news);
                    break;
                case 3:
                    averageRate(news);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("You input wrong, let input again!");
            }
        }
        while(true);
    }
}
