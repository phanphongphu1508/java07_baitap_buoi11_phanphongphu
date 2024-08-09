package bai_3;

import java.util.Scanner;

public class NhanVien {
	private String hoTen;
	private String ngaySinh;

	public void nhapThongTin() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập họ tên: ");
		this.hoTen = scan.nextLine();

		System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
		this.ngaySinh = scan.nextLine();

	}

	public void xuatThongTin() {
		
		System.out.println("Họ tên: " + this.hoTen);
		System.out.println("Ngày sinh: " + this.ngaySinh);

	}
}
