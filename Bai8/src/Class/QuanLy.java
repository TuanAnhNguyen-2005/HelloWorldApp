package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	// thuoc tinh
	private ArrayList<CBGV> ds341;

	// phuong thuc
	// ham khoi tao
	public QuanLy() {
		ds341 = new ArrayList<CBGV>(10);
	}

	// ham them can bo vao danh sach
	public void themCBGV(CBGV canBo) {
		ds341.add(canBo);
	}

	// ham nhap vao danh sach
	public void nhapDanhSach(Scanner sc) {
		CBGV canBo;

		System.out.print("Nhap vao so luong can bo: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao danh sach:");
		for (int i = 0; i < n; i++) {
			System.out.println("Can bo thu " + (i + 1) + " la:");
			canBo = new CBGV();
			canBo.nhapThongTin(sc);
			themCBGV(canBo);
		}
	}

	// ham hien thi danh sach
	public void hienThiDanhSach() {
		for (CBGV cb : ds341) {
			cb.hienThiThongTin();
		}
	}

	// ham tim kiem
	public void timKiem(double luong341) {
		for (CBGV cb : ds341) {
			if (cb.getLuongThucLinh341() >= luong341) {
				cb.hienThiThongTin();
			}
		}
	}
}