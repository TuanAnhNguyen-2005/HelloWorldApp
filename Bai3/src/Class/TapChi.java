package Class;

import java.util.Scanner;

public class TapChi extends TaiLieu {
	// thuoc tinh
	private int soPhatHanh341;
	private int thangPhatHanh341;

	// phuong thuc
	// ham khoi tao khong doi so
	public TapChi() {

	}

	// ham khoi tao co doi so
	public TapChi(String maTaiLieu341, String tenNXB341, int soBanPhatHanh341, int soPhatHanh341, int thangPhatHanh341) {
		super(maTaiLieu341, tenNXB341, soBanPhatHanh341);
		this.soPhatHanh341 = soPhatHanh341;
		this.thangPhatHanh341 = thangPhatHanh341;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap so phat hanh: ");
		soPhatHanh341 = sc.nextInt();
		System.out.print("\tNhap thang phat hanh: ");
		thangPhatHanh341 = sc.nextInt();
		sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo phat hanh: " + soPhatHanh341);
		System.out.println("\tThang phat hanh: " + thangPhatHanh341);
	}
}