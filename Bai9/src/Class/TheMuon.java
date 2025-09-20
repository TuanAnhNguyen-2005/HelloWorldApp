package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
	// thuoc tinh
	private int soMuon341;
	private Date ngayMuon341;
	private Date hanTra341;
	private String soHieu341;

	// phuong thuc
	// ham khoi tao khong doi so
	public TheMuon() {

	}

	// ham khoi tao co doi so
	public TheMuon(String hoTen341, String maSV341, String ngaySinh341, String lop341, int soMuon341, Date ngayMuon341, String soHieu341) {
		super(hoTen341, maSV341, ngaySinh341, lop341);
		this.soMuon341 = soMuon341;
		this.ngayMuon341 = ngayMuon341;
		this.hanTra341 = null; // hanTra341 will be set in nhapThongTin
		this.soHieu341 = soHieu341;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap so muon: ");
		soMuon341 = sc.nextInt();
		sc.nextLine();

		System.out.print("\tNhap ngay muon: ");
		String strNgayMuon = sc.nextLine();
		ngayMuon341 = strToDate(strNgayMuon);

		String strNgayTra = "31-12-2020";
		hanTra341 = strToDate(strNgayTra);

		System.out.print("\tNhap so hieu: ");
		soHieu341 = sc.nextLine();
	}

	private Date strToDate(String strNgay) {
		Date date = null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = sdf.parse(strNgay);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date;
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo phieu muon: " + soMuon341);
		System.out.println("\tNgay muon: " + ngayMuon341);
		System.out.println("\tHan tra: " + hanTra341);
		System.out.println("\tSo hieu: " + soHieu341);
	}

	// ham lay ra thong tin ve han tra
	public Date getHanTra341() {
		return hanTra341;
	}
}