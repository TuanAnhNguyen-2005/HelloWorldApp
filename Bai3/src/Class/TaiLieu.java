package Class;

import java.util.Scanner;

public class TaiLieu {
	// thuoc tinh
	private String maTaiLieu341;
	private String tenNXB341;
	private int soBanPhatHanh341;

	// phuong thuc
	// ham khoi tao khong doi so
	public TaiLieu() {

	}

	// ham khoi tao co doi so
	public TaiLieu(String maTaiLieu341, String tenNXB341, int soBanPhatHanh341) {
		this.maTaiLieu341 = maTaiLieu341;
		this.tenNXB341 = tenNXB341;
		this.soBanPhatHanh341 = soBanPhatHanh341;
	}

	// nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ma tai lieu: ");
		maTaiLieu341 = sc.nextLine();
		System.out.print("\tNhap ten nha xuat ban: ");
		tenNXB341 = sc.nextLine();
		System.out.print("\tNhap so ban phat hanh: ");
		soBanPhatHanh341 = sc.nextInt();
		sc.nextLine();
	}

	// hien thi
	public void hienThiThongTin() {
		System.out.println("\tMa tai lieu: " + maTaiLieu341);
		System.out.println("\tTen nha xuat ban: " + tenNXB341);
		System.out.println("\tSo ban phat hanh: " + soBanPhatHanh341);
	}

	// ham lay ra ma tai lieu
	public String getMaTaiLieu341() {
		return maTaiLieu341;
	}
}