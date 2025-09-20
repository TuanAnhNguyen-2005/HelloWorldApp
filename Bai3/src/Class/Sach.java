package Class;

import java.util.Scanner;

public class Sach extends TaiLieu {
	// thuoc tinh
	private String tacGia341;
	private int soTrang341;

	// phuong thuc
	// ham khoi tao khong doi so
	public Sach() {

	}

	// ham khoi tao co doi so
	public Sach(String maTaiLieu341, String tenNXB341, int soBanPhatHanh341, String tacGia341, int soTrang341) {
		super(maTaiLieu341, tenNXB341, soBanPhatHanh341);
		this.tacGia341 = tacGia341;
		this.soTrang341 = soTrang341;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap tac gia: ");
		tacGia341 = sc.nextLine();
		System.out.print("\tNhap so trang: ");
		soTrang341 = sc.nextInt();
		sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTac gia: " + tacGia341);
		System.out.println("\tSo trang: " + soTrang341);
	}
}