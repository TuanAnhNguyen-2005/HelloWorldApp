package Class;

import java.util.Date;
import java.util.Scanner;

public class HocSinh extends Nguoi {
	// thuoc tinh
	private String lop341;
	private String khoHoc341;
	private String kyHoc341;

	// phuong thuc
	// ham khoi tao khong doi so
	public HocSinh() {

	}

	// ham khoi tao co doi so
	public HocSinh(String hoTen341, Date ngaySinh341, String queQuan341, String lop341, String khoHoc341, String kyHoc341) {
		super(hoTen341, ngaySinh341, queQuan341);
		this.lop341 = lop341;
		this.khoHoc341 = khoHoc341;
		this.kyHoc341 = kyHoc341;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap lop: ");
		lop341 = sc.nextLine();

		System.out.print("\tNhap khoa hoc: ");
		khoHoc341 = sc.nextLine();

		System.out.print("\tNhap ky hoc: ");
		kyHoc341 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLop: " + lop341);
		System.out.println("\tKhoa hoc: " + khoHoc341);
		System.out.println("\tKy hoc: " + kyHoc341);
	}

	// ham lay ra thong tin ve lop
	public String getLop341() {
		return lop341;
	}
}