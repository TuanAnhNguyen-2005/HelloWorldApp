package Class;

import java.util.Date;
import java.util.Scanner;

public class KhachTro extends Nguoi {
	// thuoc tinh
	private int soNgayTro341;
	private String loaiPhong341;
	private double giaPhong341;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhachTro() {

	}

	// ham khoi tao co doi so
	public KhachTro(String hoTen341, Date ngaySinh341, int CMND341, int soNgayTro341, String loaiPhong341, double giaPhong341) {
		super(hoTen341, ngaySinh341, CMND341);
		this.soNgayTro341 = soNgayTro341;
		this.loaiPhong341 = loaiPhong341;
		this.giaPhong341 = giaPhong341;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap so ngay tro: ");
		soNgayTro341 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap loai phong: ");
		loaiPhong341 = sc.nextLine();
		System.out.print("\tNhap gia phong: ");
		giaPhong341 = sc.nextDouble();
		sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo ngay tro: " + soNgayTro341);
		System.out.println("\tLoai phong: " + loaiPhong341);
		System.out.println("\tGia phong: " + giaPhong341);
	}

	// ham lay ra thong tin so ngay tro
	public int getSoNgayTro341() {
		return soNgayTro341;
	}

	// ham lay thong tin gia phong
	public double getGiaPhong341() {
		return giaPhong341;
	}
}