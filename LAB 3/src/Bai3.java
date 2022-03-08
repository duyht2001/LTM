import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
	    int n = 0, tempSort;
	     Scanner scanner = new Scanner(System.in); 
	    do {
	        System.out.println("Nhap vao so phan tu mang: ");
	        n = scanner.nextInt();
	    } while (n < 0);
	         
	    // khởi tạo và cấp phát bộ nhớ cho mảng
	    int array[] = new int[n];
	         
	    System.out.println("Nhap cac phan tu cho mang: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print("Nhap phan tu thu " + i + ": ");
	        array[i] = scanner.nextInt();
	    }
	         
	    // Hiển thị mảng vừa nhập
	    System.out.println("\nMang da nhap la: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print(array[i] + "\t");
	    }
	    //
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = i + 1; j <= n - 1; j++) {
	            if (array[i] < array[j]) {
	                tempSort = array[i];
	                array[i] = array[j];
	                array[j] = tempSort;
	            }
	        }
	    }
	    System.out.println("\nPhan tu nho nhat la: " + array[n - 1]);
	}
	
}
