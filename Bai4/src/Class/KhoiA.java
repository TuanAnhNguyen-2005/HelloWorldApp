package Class;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
	// thuoc tinh
	private String mon1341;
	private String mon2341;
	private String mon3341;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhoiA() {

	}

	// ham khoi tao co doi so
	public KhoiA(String mon1341, String mon2341, String mon3341) {
		this.mon1341 = mon1341;
		this.mon2341 = mon2341;
		this.mon3341 = mon3341;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap mon 1: ");
		mon1341 = sc.nextLine();
		System.out.print("\tNhap mon 2: ");
		mon2341 = sc.nextLine();
		System.out.print("\tNhap mon 3: ");
		mon3341 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTo hop mon thi: " + mon1341 + " - " + mon2341 + " - " + mon3341);
	}
}