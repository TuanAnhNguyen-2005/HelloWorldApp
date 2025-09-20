package Class;

import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
	// thuoc tinh
	private int soNguoi341;
	private int soNha341;
	private Nguoi[] list341; // list341 la mang danh sach chua cac thanh vien trong ho

	// phuong thuc
	// ham khoi tao khong doi so
	public HoDan() {
		list341 = new Nguoi[10];
	}

	// ham khoi tao co doi so
	public HoDan(String hoTen341, Date ngaySinh341, String ngheNghiep341, int soNguoi341, int soNha341) {
		super(hoTen341, ngaySinh341, ngheNghiep341);
		this.soNguoi341 = soNguoi341;
		this.soNha341 = soNha341;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so nguoi: ");
		soNguoi341 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha341 = sc.nextInt();
		sc.nextLine();
		System.out.println("\tNhap thong tin cho tung nguoi trong ho:");
		for (int i = 0; i < soNguoi341; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			list341[i] = new Nguoi();
			list341[i].nhapThongTin(sc);
		}
	}

	// hien thi
	public void hienThiThongTin() {
		System.out.println("\tSo nguoi: " + soNguoi341);
		System.out.println("\tSo nha: " + soNha341);
		System.out.println("\tThong tin cua tung nguoi trong gia dinh:");
		for (int i = 0; i < soNguoi341; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			list341[i].hienThiThongTin();
		}
	}

	// ham lay ra thanh vien trong ho dan
	public Nguoi[] getList341() {
		return list341;
	}

	// ham lay ra so thanh vien trong ho gia dinh
	public int getSoNguoi341() {
		return soNguoi341;
	}
}