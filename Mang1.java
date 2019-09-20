import java.util.*;

public class Mang1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Nhap n: ");
		int n = sc.nextInt();
		int A[] = new int[n];
		System.out.println("Nhap cac phan tu cua mang:");
		for (int i = 0; i < n; i++) {
			System.out.printf("A[" + i + "]=");
			A[i] = sc.nextInt();
		}
		// in
		System.out.println("Mang da nhap la: ");
		for (int i = 0; i < n; i++) {
			System.out.println(A[i] + "\t");
		}
		// timkiem
		int k;
		System.out.println("Nhap so k tim kiem");
		k = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (A[i] == k) {
				System.out.println("co");
			//	System.out.println("Vi tri cua "+k+" la"+A[i]);
				
			} else {
				System.out.println("Khong");
				break;
			}
		}

	}
}
