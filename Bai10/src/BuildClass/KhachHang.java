package BuildClass;

import java.util.Scanner;

public class KhachHang {
	// Thuoc tinh
	protected String tenChuHo341;
	protected int soNha341;
	protected String maCongTo341;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public KhachHang() {

	}

	// Ham khoi tao co doi so
	public KhachHang(String tenChuHo341, int soNha341, String maCongTo341) {
		this.tenChuHo341 = tenChuHo341;
		this.soNha341 = soNha341;
		this.maCongTo341 = maCongTo341;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ten chu ho: ");
		tenChuHo341 = sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha341 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ma cong to: ");
		maCongTo341 = sc.nextLine();
	}

	// Ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tTen chu ho: " + tenChuHo341);
		System.out.println("\tSo nha: " + soNha341);
		System.out.println("\tMa cong to: " + maCongTo341);
	}
}