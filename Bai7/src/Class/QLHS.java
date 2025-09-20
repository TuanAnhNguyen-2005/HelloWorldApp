package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
	// thuoc tinh
	private ArrayList<HocSinh> dshs341;

	// phuong thuc
	// ham khoi tao
	public QLHS() {
		dshs341 = new ArrayList<HocSinh>(10);
	}

	// ham them hoc sinh
	public void themHS(HocSinh hs) {
		dshs341.add(hs);
	}

	// ham nhap danh sach
	public void nhapDanhSachHS(Scanner sc) {
		HocSinh hs;

		System.out.print("Nhap vao so luong hoc sinh: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap thong tin cho hoc sinh trong danh sach:");
		for (int i = 0; i < n; i++) {
			System.out.println("\tHoc sinh thu " + (i + 1) + " la:");

			hs = new HocSinh();
			hs.nhapThongTin(sc);

			themHS(hs);
		}
	}

	// ham hien thi
	public void hienThiDanhSach() {
		int n = dshs341.size();
		for (int i = 0; i < n; i++) {
			System.out.println("\tHoc sinh thu " + (i + 1) + " la:");
			dshs341.get(i).hienThiThongTin();
		}
	}

	// ham tim kiem thong tin
	public void timKiemThongTin(int nam, String queQuan341) {
		for (HocSinh hs : dshs341) {
			if ((hs.getNgaySinh341().getYear() + 1900 == nam) && (queQuan341.equals(hs.getQueQuan341()))) {
				hs.hienThiThongTin();
			}
		}
	}

	public void timKiemThongTin(String lop341) {
		for (HocSinh hs : dshs341) {
			if (lop341.equals(hs.getLop341())) {
				hs.hienThiThongTin();
			}
		}
	}
}