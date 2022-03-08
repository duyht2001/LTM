import java.util.Scanner;

public class Bai1 {
	

    public static void main(String[] args) {
    	int n;
    	boolean ok = true;
    	Scanner s = new Scanner(System.in);
    	System.out.print("nhap n: ");
    	n = s.nextInt();
    	
    
    	for (int i = 2; i < n - 1; i++) 
    	{
    	   if (n % i == 0) 
    	   {
    	      ok = false;
    	      break;
    	   }
    	}
    	if (ok == true) {
    		
    	   System.out.println ("" + n +" la so nguyen to");
    	}else {
    		
    	   System.out.println ("" + n + " khong phai la so nguyen to");
    }

    }
 }
