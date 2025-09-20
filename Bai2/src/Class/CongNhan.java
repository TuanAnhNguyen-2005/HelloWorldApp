package Class;

import java.util.Scanner;

public class CongNhan extends CanBo {
	// thuoc tinh
	private String bac;

	// phuong thuc
	// ham khoi tao khong doi so
	public CongNhan() {

	}

	// ham khoi tao co doi so
	public CongNhan(String hoTen341, String ngaySinh341, String gioiTinh341, String diaChi341, String bac) {
		super(hoTen341, ngaySinh341, gioiTinh341, diaChi341);
		this.bac = bac;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap bac: ");
		bac = sc.nextLine();
	}

	// ham hien thi thong tin
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tBac: " + bac);
	}
}