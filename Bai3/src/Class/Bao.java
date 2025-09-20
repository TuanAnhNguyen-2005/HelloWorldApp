package Class;

import java.util.Scanner;

public class Bao extends TaiLieu {
	// thuoc tinh
	private String ngayPhatHanh341;

	// phuong thuc
	// ham khoi tao khong doi so
	public Bao() {

	}

	// ham khoi tao co doi so
	public Bao(String maTaiLieu341, String tenNXB341, int soBanPhatHanh341, String ngayPhatHanh341) {
		super(maTaiLieu341, tenNXB341, soBanPhatHanh341);
		this.ngayPhatHanh341 = ngayPhatHanh341;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap ngay phat hanh: ");
		ngayPhatHanh341 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tNgay phat hanh: " + ngayPhatHanh341);
	}
}