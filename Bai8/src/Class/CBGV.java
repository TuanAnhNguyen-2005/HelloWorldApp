package Class;

import java.util.Scanner;

public class CBGV extends Nguoi {
	// thuoc tinh
	private double luongCung341;
	private double thuong341;
	private double phat341;
	private double luongThucLinh341;

	// phuong thuc
	// ham khoi tao khong doi so
	public CBGV() {

	}

	// ham khoi tao co doi so
	public CBGV(String hoTen341, String ngaySinh341, String queQuan341, double luongCung341, double thuong341, double phat341) {
		super(hoTen341, ngaySinh341, queQuan341);
		this.luongCung341 = luongCung341;
		this.thuong341 = thuong341;
		this.phat341 = phat341;
		this.luongThucLinh341 = luongCung341 + thuong341 - phat341;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap luong cung: ");
		luongCung341 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap thuong: ");
		thuong341 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap phat: ");
		phat341 = sc.nextDouble();
		sc.nextLine();

		// tinh luong
		luongThucLinh341 = luongCung341 + thuong341 - phat341;
	}

	// ham hien thi thong tin
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLuong cung: " + luongCung341);
		System.out.println("\tThuong: " + thuong341);
		System.out.println("\tPhat: " + phat341);
		System.out.println("\tLuong thuc linh: " + luongThucLinh341);
	}

	// ham lay ra thong tin ve luong thuc linh
	public double getLuongThucLinh341() {
		return luongThucLinh341;
	}
}