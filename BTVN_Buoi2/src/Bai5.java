import java.util.Scanner;

public class Bai5
{
    public static void main(String[] args)
    {
        int S=0;
        Scanner yl=new Scanner(System.in);
        String str=yl.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char x=str.charAt(i);
            if(Character.isDigit(x))
            {
                S+=Integer.parseInt(String.valueOf(x));
            }
        }
        System.out.println("SUM= "+S);
    }
}
