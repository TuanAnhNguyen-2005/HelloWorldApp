package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
	// thuoc tinh
	private ArrayList<KhachTro> ds341;

	// phuong thuc
	// ham khoi tao
	public KhachSan() {
		ds341 = new ArrayList<KhachTro>(10);
	}

	// ham them khach tro vao khach san
	public void themKhachTro(KhachTro kt) {
		ds341.add(kt);
	}

	// ham nhap danh sach
	public void nhapDanhSach(Scanner sc) {
		KhachTro khach;

		System.out.print("Nhap vao so luong khach: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao thong tin khach tro:");
		for (int i = 0; i < n; i++) {
			System.out.println("Khach tro thu " + (i + 1) + " la:");
			khach = new KhachTro();
			khach.nhapThongTin(sc);
			themKhachTro(khach);
		}
	}

	// ham hien thi
	public void hienThiDanhSach() {
		for (KhachTro khach : ds341) {
			khach.hienThiThongTin();
		}
	}

	// ham tinh tien
	public double tinhTien(int CMND341) {
		double tien = 0;

		for (KhachTro khach : ds341) {
			if (khach.getCMND341() == CMND341) {
				tien = khach.getSoNgayTro341() * khach.getGiaPhong341();
			}
		}

		return tien;
	}
}