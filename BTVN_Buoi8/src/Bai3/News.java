package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews{
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;
    private ArrayList<Integer> rateList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAverageRate(float averageRate) {
        this.averageRate = averageRate;
    }

    public void Input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input Id: ");
        id=sc.nextInt();
        sc.nextLine();
        System.out.print("Input title: ");
        title=sc.nextLine();
        System.out.print("Input publish date: ");
        publishDate=sc.nextLine();
        System.out.print("Input author: ");
        author=sc.nextLine();
        System.out.print("Input content: ");
        content=sc.nextLine();
        rateList=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int a;
            System.out.print("Input rate: ");
            a=sc.nextInt();
            rateList.add(a);
        }
    }
    public void Caculator(){
        int sum=0;
        for (int i = 0; i <3 ; i++) {
            sum+=rateList.get(i);
        }
        averageRate=sum/3f;
        System.out.println("Avverage Rate: "+averageRate);
    }

    @Override
    public void Display() {
        System.out.println("ID: "+id);
        System.out.println("Title: "+title);
        System.out.println("Publish Date: "+publishDate);
        System.out.println("Author: "+author);
        System.out.println("Content: "+content);
    }
}
