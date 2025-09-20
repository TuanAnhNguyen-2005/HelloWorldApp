package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	private String hoTen341;
	private Date ngaySinh341;
	private String ngheNghiep341;

	// phuong thuc
	// ham khoi tao khong doi so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen341, Date ngaySinh341, String ngheNghiep341) {
		this.hoTen341 = hoTen341;
		this.ngaySinh341 = ngaySinh341;
		this.ngheNghiep341 = ngheNghiep341;
	}

	// nhap cac thong tung nguoi trong ho gia dinh
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen341 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh341 = strToDate(strDate);
		System.out.print("\tNhap nghe nghiep: ");
		ngheNghiep341 = sc.nextLine();
	}

	// ham thuc hien chuyen string sang date
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

	// hien thi ra tung nguoi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen341);
		System.out.println("\tNgay sinh: " + dateToString(ngaySinh341));
		System.out.println("\tNghe nghiep: " + ngheNghiep341);
	}

	// ham chuyen dinh dang tu date sang String
	private String dateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		String strDate = sdf.format(date);

		return strDate;
	}

	// ham lay thong tin ve ngay sinh
	public Date getNgaySinh341() {
		return ngaySinh341;
	}
}