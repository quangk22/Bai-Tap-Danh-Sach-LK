package basis.dev;
import java.util.LinkedList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số lượng phần tử của danh sách: ");
		int n = sc.nextInt();
		System.out.println("Nhập các phần tử của danh sách: ");
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			list1.add(x);
			list2.addFirst(x);
		}
		System.out.println("\nDanh sách đặt theo thứ tự nhập vào: ");
		for (int x : list1) {
			System.out.print(x + " ");
		}
		System.out.println("\nDanh sách đặt theo thứ tự ngược với thứ tự nhập vào: ");
		for (int x : list2) {
			System.out.print(x + " ");
		}
		xoaPtTuyY(list1);
		chenPt(list1);
		locPhantu(list1);
		loaiBoSoLe(list1);
		
		
		
	}

	private static void chenPt(LinkedList<Integer> list1) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhập phần tử muốn thêm : ");
		int n = sc.nextInt();
		System.out.println("\nNhập ví trí muốn chèn :");
		int z = sc.nextInt();
		list1.add(z,n);
		System.out.println("Danh sách sau khi chèn :");
		System.out.println(list1);
	}

	private static void xoaPtTuyY(LinkedList<Integer> list1) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhập phần tử muốn xóa : ");
		int n = sc.nextInt();
		list1.remove(Integer.valueOf(n));
		System.out.println("Danh sách sau khi xóa : ");
		System.out.println(list1);
	}

	private static void loaiBoSoLe(LinkedList<Integer> list1) {
		// TODO Auto-generated method stub
		for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 2 != 0) {
                list1.remove(i);
                i--;
            }
        }
		System.out.println("\nDanh sách sau khi loại bỏ các số lẻ :");
		System.out.println(list1);
	}

	private static void locPhantu(LinkedList<Integer> list1) {
		// TODO Auto-generated method stub
		for (int i = 0; i < list1.size() - 1; i++) {
			if (list1.get(i) == list1.get(i + 1)) {
				list1.remove(i);
				i--;
			}
			
		}
		System.out.println("\nSau khi loại bỏ các phân tử trùng nhau :");
		System.out.println(list1);
	}
}