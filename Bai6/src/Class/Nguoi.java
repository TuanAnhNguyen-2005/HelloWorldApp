package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen341;
	protected Date ngaySinh341;
	protected int CMND341;

	// phuong thuc
	// ham khoi tao khong doi so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen341, Date ngaySinh341, int CMND341) {
		this.hoTen341 = hoTen341;
		this.ngaySinh341 = ngaySinh341;
		this.CMND341 = CMND341;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen341 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh341 = strToDate(strDate);
		System.out.print("\tNhap CMND: ");
		CMND341 = sc.nextInt();
	}

	private Date strToDate(String strDate) {
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date;
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen341);
		System.out.println("\tNgay sinh: " + ngaySinh341);
		System.out.println("\tCMND: " + CMND341);
	}

	// ham lay ra thong tin CMND
	public int getCMND341() {
		return CMND341;
	}
}