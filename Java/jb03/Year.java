import java.util.Scanner;

public class Year{
    public static void main(String[] args){
        Scanner y = new Scanner(System.in);
        int a = Integer.parseInt (y);
        if(a>=1000 && a<=3000){
            int b = a-544; 
            System.out.println("서기년도는" +b+ "입니다." );
        }

    }
}