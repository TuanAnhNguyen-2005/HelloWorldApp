package BuildClass;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	// Thuoc tinh
	private ArrayList<BienLai> ds341;

	// Phuong thuc
	// Ham khoi tao
	public QuanLy() {
		ds341 = new ArrayList<BienLai>(10);
	}

	// Ham them bien lai vao danh sach
	public void themBienLai(BienLai bienLai) {
		ds341.add(bienLai);
	}

	// Ham nhap danh sach
	public void nhapDanhSach(Scanner sc) {
		BienLai bienLai;
		System.out.print("Nhap vao so luong bien lai: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao danh sach bien lai:");
		for (int i = 0; i < n; i++) {
			System.out.println("Bien lai thu " + (i + 1) + " la:");
			bienLai = new BienLai();
			bienLai.nhapThongTin(sc);
			themBienLai(bienLai);
		}
	}

	// Ham hien thi danh sach
	public void hienThiDanhSach() {
		for (int i = 0; i < ds341.size(); i++) {
			System.out.println("Bien lai thu " + (i + 1) + " la:");
			ds341.get(i).hienThiThongTin();
			System.out.println();
		}
	}
}