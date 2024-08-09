package bai_4;

import java.util.Scanner;

public class PhuongTienGiaoThong {
	private String hangSanXuat;
	private String tenPhuongTien;
	private int namSanXuat;
	private double vanTocToiDa;

	public void nhapThongTin() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập hãng sản xuất: ");
		this.hangSanXuat = scan.nextLine();

		System.out.print("Nhập tên phương tiện: ");
		this.tenPhuongTien = scan.nextLine();

		System.out.print("Nhập năm sản xuất: ");
		this.namSanXuat = scan.nextInt();

		System.out.print("Nhập vận tốc tối đa: ");
		this.vanTocToiDa = scan.nextDouble();
	}

	public void xuatThongTin() {
		System.out.println("Hãng sản xuất: " + this.hangSanXuat);
		System.out.println("Tên phương tiện: " + this.tenPhuongTien);
		System.out.println("Năm sản xuất: " + this.namSanXuat);
		System.out.println("Vận tốc tối đa: " + this.vanTocToiDa + " km/h");
	}

	public double getVanTocToiDa() {
		return vanTocToiDa;
	}

	public void setVanTocToiDa(double vanTocToiDa) {
		this.vanTocToiDa = vanTocToiDa;
	}
}
