package bai_4;

import java.util.Scanner;

public class Oto extends PhuongTienGiaoThong {
	private int soChoNgoi;
	private String kieuDongCo;

	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập kiểu động cơ: ");
		this.kieuDongCo = scan.nextLine();
		System.out.print("Nhập số chỗ ngồi: ");
		this.soChoNgoi = scan.nextInt();
		System.out.println();
	}

	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.println("Kiểu động cơ: " + this.kieuDongCo);
		System.out.println("Số chỗ ngồi: " + this.soChoNgoi);
		System.out.println();
	}
}
