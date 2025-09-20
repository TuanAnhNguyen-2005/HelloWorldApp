package Class;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KhuPho {
	// thuoc tinh
	private ArrayList<HoDan> dshd341;

	// phuong thuc
	// ham khoi tao
	public KhuPho() {
		dshd341 = new ArrayList<HoDan>(10);
	}

	// ham them 1 ho dan
	public void themHoDan(HoDan hoDan) {
		dshd341.add(hoDan);
	}

	// ham nhap vao danh sach ho dan
	public void nhapDanhSach(Scanner sc) {
		HoDan hoDan;

		System.out.print("Nhap vao so ho dan: ");
		int soHoDan341 = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao thong tin cho tung ho dan:");
		for (int i = 0; i < soHoDan341; i++) {
			System.out.println("Ho dan thu " + (i + 1) + " la:");
			hoDan = new HoDan();
			hoDan.nhapThongTin(sc);
			themHoDan(hoDan);
		}
	}

	// ham hien thi danh sach
	public void hienThiDanhSach() {
		int n = dshd341.size();

		for (int i = 0; i < n; i++) {
			System.out.println("Ho dan thu " + (i + 1) + " la:");
			dshd341.get(i).hienThiThongTin();
		}
	}

	// ham tim kiem thong tin
	public void timKiemThongTin() {
		// lay ra duoc nam hien tai
		Date now = new Date();
		int namHienTai = now.getYear() + 1900;

		Nguoi[] dstv341 = null;

		for (HoDan hoDan : dshd341) {
			dstv341 = hoDan.getList341();
			for (int i = 0; i < hoDan.getSoNguoi341(); i++) {
				if (namHienTai - (dstv341[i].getNgaySinh341().getYear() + 1900) == 80) {
					hoDan.hienThiThongTin();
				}
			}
		}
	}
}