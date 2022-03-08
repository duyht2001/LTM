import java.util.Scanner;
public class Bai1 {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập hệ số a: ");
		int a = nhap.nextInt();
		System.out.print("Nhập hệ số b: ");
		int b = nhap.nextInt(); 
		if(a == 0){
			if(b == 0){
			System.out.println("Phương trình vô số nghiệm");
			}
			else{
			System.out.println("Phương trình vô nghiệm");
			} }
			else{
			System.out.println("Nghiệm x=" +(-b/a));
			}
	}

}