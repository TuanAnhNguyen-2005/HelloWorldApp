package Class;

import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen341;
	protected String ngaySinh341;
	protected String queQuan341;

	// phuong thuc
	// ham khoi tao khong doi so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen341, String ngaySinh341, String queQuan341) {
		this.hoTen341 = hoTen341;
		this.ngaySinh341 = ngaySinh341;
		this.queQuan341 = queQuan341;
	}

	// ham nhap thong tin
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen341 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		ngaySinh341 = sc.nextLine();
		System.out.print("\tNhap que quan: ");
		queQuan341 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen341);
		System.out.println("\tNgay sinh: " + ngaySinh341);
		System.out.println("\tQue quan: " + queQuan341);
	}
}