package Class;

import java.util.Scanner;

public class CanBo {
	// thuoc tinh
	private String hoTen341;
	private String ngaySinh341;
	private String gioiTinh341;
	private String diaChi341;

	// phuong thuc
	// ham khoi tao khong doi so
	public CanBo() {

	}

	// ham khoi tao co doi so
	public CanBo(String hoTen341, String ngaySinh341, String gioiTinh341, String diaChi341) {
		this.hoTen341 = hoTen341;
		this.ngaySinh341 = ngaySinh341;
		this.gioiTinh341 = gioiTinh341;
		this.diaChi341 = diaChi341;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen341 = sc.nextLine();
		System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
		ngaySinh341 = sc.nextLine();
		System.out.print("\tNhap gioi tinh: ");
		gioiTinh341 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi341 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen341);
		System.out.println("\tNgay sinh: " + ngaySinh341);
		System.out.println("\tGioi tinh: " + gioiTinh341);
		System.out.println("\tDia chi: " + diaChi341);
	}

	// ham lay thong tin ho ten
	public String getHoTen341() {
		return this.hoTen341;
	}
}