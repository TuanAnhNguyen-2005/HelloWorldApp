package Class;

import java.util.Scanner;

public class ThiSinh {
	// thuoc tinh
	private int soBD341;
	private String hoTen341;
	private String diaChi341;
	private String dienUuTien341;

	// phuong thuc
	// ham khoi tao khong doi so
	public ThiSinh() {

	}

	// ham khoi tao co doi so
	public ThiSinh(int soBD341, String hoTen341, String diaChi341, String dienUuTien341) {
		this.soBD341 = soBD341;
		this.hoTen341 = hoTen341;
		this.diaChi341 = diaChi341;
		this.dienUuTien341 = dienUuTien341;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so bao danh: ");
		soBD341 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ho ten: ");
		hoTen341 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi341 = sc.nextLine();
		System.out.print("\tNhap dien uu tien: ");
		dienUuTien341 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tSo bao danh: " + soBD341);
		System.out.println("\tHo ten: " + hoTen341);
		System.out.println("\tDia chi: " + diaChi341);
		System.out.println("\tDien uu tien: " + dienUuTien341);
	}

	// ham lay ra thong tin ve so bao danh
	public int getSoBD341() {
		return soBD341;
	}
}