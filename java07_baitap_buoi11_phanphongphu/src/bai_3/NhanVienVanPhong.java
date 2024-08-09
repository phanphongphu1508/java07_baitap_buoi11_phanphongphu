package bai_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NhanVienVanPhong extends NhanVien {
	private int soNgayLamViec;

	@Override
	public void nhapThongTin() {
		Scanner scan = new Scanner(System.in);
		super.nhapThongTin();
		System.out.print("Nhập số ngày làm việc: ");
		this.soNgayLamViec = scan.nextInt();
	}

	public void tinhLuong() {
		double luong = this.soNgayLamViec * 100000;
		DecimalFormat df = new DecimalFormat("#,###");
		String dinhDangLuong = df.format(luong);
		System.out.println("Lương: " + dinhDangLuong + "đ");
	}

	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.println("Số ngày làm việc: " + this.soNgayLamViec + " ngày");
	}
}