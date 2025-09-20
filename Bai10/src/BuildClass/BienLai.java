package BuildClass;

import java.util.Scanner;

public class BienLai extends KhachHang {
	// Thuoc tinh
	private int chiSoMoi341;
	private int chiSoCu341;
	private double tien341;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public BienLai() {

	}

	// Ham khoi tao co doi so
	public BienLai(String tenChuHo341, int soNha341, String maCongTo341, int chiSoMoi341, int chiSoCu341, double tien341) {
		super(tenChuHo341, soNha341, maCongTo341);
		this.chiSoMoi341 = chiSoMoi341;
		this.chiSoCu341 = chiSoCu341;
		this.tien341 = tien341;
	}

	public BienLai(int chiSoMoi341, int chiSoCu341, double tien341) {
		this.chiSoMoi341 = chiSoMoi341;
		this.chiSoCu341 = chiSoCu341;
		this.tien341 = tien341;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap chi so moi: ");
		chiSoMoi341 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap chi so cu: ");
		chiSoCu341 = sc.nextInt();
		sc.nextLine();
		tien341 = (chiSoMoi341 - chiSoCu341) * 750;
	}

	// Ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tChi so moi: " + chiSoMoi341);
		System.out.println("\tChi so cu: " + chiSoCu341);
		System.out.println("\tTien: " + tien341);
	}
}