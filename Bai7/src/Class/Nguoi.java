package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen341;
	protected Date ngaySinh341;
	protected String queQuan341;

	// phuong thuc
	// ham khoi tao khong doi so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen341, Date ngaySinh341, String queQuan341) {
		this.hoTen341 = hoTen341;
		this.ngaySinh341 = ngaySinh341;
		this.queQuan341 = queQuan341;
	}

	// ham nhap vao thong tin
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen341 = sc.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh341 = strToDate(strDate);

		System.out.print("\tNhap que quan: ");
		queQuan341 = sc.nextLine();
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
		System.out.println("\tQue quan: " + queQuan341);
	}

	// ham lay ra que quan
	public String getQueQuan341() {
		return queQuan341;
	}

	// ham lay ra thong tin ve ngay sinh
	public Date getNgaySinh341() {
		return ngaySinh341;
	}
}