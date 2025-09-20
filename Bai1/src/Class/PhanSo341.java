package Class;

import java.util.Scanner;

public class PhanSo341 {
    // thuoc tinh
    private int tuSo341;
    private int mauSo341;

    // phuong thuc
    // ham khoi tao khong doi so
    public PhanSo341() {
        tuSo341 = 0;
        mauSo341 = 1;
    }

    // ham khoi tao co doi so
    public PhanSo341(int tuSo341, int mauSo341) {
        this.tuSo341 = tuSo341;
        this.mauSo341 = mauSo341;
    }

    // ham nhap phan so
    public void nhapPS(Scanner sc) {
        int a;
        int b;

        do {
            System.out.print("\tNhap vao tu so: ");
            a = sc.nextInt();

            System.out.print("\tNhap vao mau so: ");
            b = sc.nextInt();

            // kiem tra
            if (b == 0) {
                System.out.println("Mau so khong duoc bang 0. Hay nhap lai!");
            } else {
                tuSo341 = a;
                mauSo341 = b;
            }
        } while (b == 0);
    }

    // ham hien thi
    public void hienThiPS() {
        if (tuSo341 * mauSo341 < 0) {
            System.out.println("\t-" + Math.abs(tuSo341) + "/" + Math.abs(mauSo341));
        } else {
            System.out.println("\t" + Math.abs(tuSo341) + "/" + Math.abs(mauSo341));
        }
    }

    // ham cong
    public PhanSo341 congPS(PhanSo341 ps2) {
        int a = tuSo341 * ps2.mauSo341 + ps2.tuSo341 * mauSo341;
        int b = mauSo341 * ps2.mauSo341;

        return new PhanSo341(a, b);
    }

    // ham tru
    public PhanSo341 truPS(PhanSo341 ps2) {
        int a = tuSo341 * ps2.mauSo341 - ps2.tuSo341 * mauSo341;
        int b = mauSo341 * ps2.mauSo341;

        return new PhanSo341(a, b);
    }

    // ham nhan
    public PhanSo341 nhanPS(PhanSo341 ps2) {
        int a = tuSo341 * ps2.tuSo341;
        int b = mauSo341 * ps2.mauSo341;

        return new PhanSo341(a, b);
    }

    // ham chia
    public PhanSo341 chiaPS(PhanSo341 ps2) {
        int a = tuSo341 * ps2.mauSo341;
        int b = mauSo341 * ps2.tuSo341;

        return new PhanSo341(a, b);
    }

    // ham tim uscln
    private int timUSCLN(int a, int b) {
        int r = a % b;

        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }

        return b;
    }

    // ham kiem tra phan so toi gian hay chua
    public boolean kiemTraToiGian() {
        if (timUSCLN(tuSo341, mauSo341) == 1) {
            return true;
        }
        return false;
    }

    // ham toi gian
    public void toiGianPS() {
        int x = timUSCLN(tuSo341, mauSo341);

        tuSo341 /= x;
        mauSo341 /= x;
    }
}