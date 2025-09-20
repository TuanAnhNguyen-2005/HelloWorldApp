package Testing;

import java.util.Scanner;

import Class.QuanLySach;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		QuanLySach qls = new QuanLySach();

		qls.nhapDanhSachTL(sc);

		System.out.print("\n\nNhap vao loai tai lieu can tim: ");
		String loai = sc.nextLine();
		qls.timLoaiTL(loai);

		System.out.print("\n\nNhap vao ma tai lieu can tim: ");
		String maTaiLieu341 = sc.nextLine();
		qls.timMaTL(maTaiLieu341);

		sc.close();
	}

}