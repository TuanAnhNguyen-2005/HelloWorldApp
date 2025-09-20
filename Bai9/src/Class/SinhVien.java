package Class;

import java.util.Scanner;

public class SinhVien {
	// thuoc tinh
	protected String hoTen341;
	protected String maSV341;
	protected String ngaySinh341;
	protected String lop341;

	// phuong thuc
	// ham khoi tao khong doi so
	public SinhVien() {

	}

	// ham khoi tao co doi so
	public SinhVien(String hoTen341, String maSV341, String ngaySinh341, String lop341) {
		this.hoTen341 = hoTen341;
		this.maSV341 = maSV341;
		this.ngaySinh341 = ngaySinh341;
		this.lop341 = lop341;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen341 = sc.nextLine();

		System.out.print("\tNhap ma sinh vien: ");
		maSV341 = sc.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		ngaySinh341 = sc.nextLine();

		System.out.print("\tNhap lop: ");
		lop341 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen341);
		System.out.println("\tNgay sinh: " + ngaySinh341);
		System.out.println("\tMa sinh vien: " + maSV341);
		System.out.println("\tLop: " + lop341);
	}
}