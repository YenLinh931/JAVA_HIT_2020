import java.util.Scanner;

public class BTVN1
{
    public static void main(String[] args)
    {
        int m,n;
        Scanner yl=new Scanner(System.in);
        m=yl.nextInt();
        n=yl.nextInt();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || i==m-1 || j==0 || j==n-1)    System.out.printf(" * ");
                else                                    System.out.printf("   ");
            }
            System.out.printf("\n");
        }
    }
}
