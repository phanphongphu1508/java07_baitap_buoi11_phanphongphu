package bai_2;

import java.util.Scanner;

public class VanDongVien {

	private String monThiDau;
	protected String hoTen;
	private int tuoi;
	private double canNang;
	private double chieuCao;

	public void nhap() {
		Scanner scan = new Scanner(System.in);

		System.out.print("Nhập môn thi đấu: ");
		this.monThiDau = scan.nextLine();

		System.out.print("Nhập họ tên: ");
		this.hoTen = scan.nextLine();

		System.out.print("Nhập tuổi: ");
		this.tuoi = scan.nextInt();

		System.out.print("Nhập cân nặng: ");
		this.canNang = scan.nextDouble();

		System.out.print("Nhập chiều cao: ");
		this.chieuCao = scan.nextDouble();

	}

	public void xuat() {
		System.out.println("Họ tên: " + this.hoTen);
		System.out.println("Tuổi: " + this.tuoi);
		System.out.println("Môn thi đấu: " + this.monThiDau);
		System.out.println("Cân nặng: " + this.canNang);
		System.out.println("Chiều cao: " + this.chieuCao);
	}

	public boolean lonHon(VanDongVien vdv) {
		if (this.chieuCao > vdv.chieuCao) {
			return true;
		} else if (this.chieuCao == vdv.chieuCao && this.canNang > vdv.canNang) {
			return true;
		} else {
			return false;
		}
	}
}
