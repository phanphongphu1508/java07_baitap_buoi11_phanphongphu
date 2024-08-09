package bai_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NhanVienSanXuat extends NhanVien {

	private double luongCanBan;
	private int soSanPham;

	@Override
	public void nhapThongTin() {
		Scanner scan = new Scanner(System.in);
		super.nhapThongTin();
		System.out.print("Nhập lương căn bản: ");
		this.luongCanBan = scan.nextDouble();
		System.out.print("Nhập số sản phẩm: ");
		this.soSanPham = scan.nextInt();
	}

	public void tinhLuong() {
		double luong = this.luongCanBan + (this.soSanPham * 5000);
		DecimalFormat df = new DecimalFormat("#,###");
		String dinhDangLuong = df.format(luong);
		System.out.println("Lương: " + dinhDangLuong + "đ");
	}

	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.println("Số sản phẩm làm được: " + this.soSanPham + " cái");
	}
}
