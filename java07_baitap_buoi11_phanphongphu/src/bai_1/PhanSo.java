package bai_1;

import java.util.Scanner;

public class PhanSo {

	private int tuSo;
	private int mauSo;

	// Hàm khởi tạo không tham số (giá trị mặc định là 0/1)
	public PhanSo() {
		this.tuSo = 0;
		this.mauSo = 1;
	}

	// Hàm khởi tạo có tham số
	public PhanSo(int tuSo, int mauSo) {
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}

	// Phương thức nhập
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập tử số: ");
		tuSo = scanner.nextInt();
		do {
			System.out.print("Nhập mẫu số (Khác 0): ");
			mauSo = scanner.nextInt();
			if (mauSo == 0) {
				System.out.println("Mẫu số phải khác 0. Vui lòng nhập lại:");
			}
		} while (mauSo == 0);
	}

	// Phương thức xuất
	public void xuat() {
		System.out.println(tuSo + "/" + mauSo);
	}

	// Phương thức cộng
	public PhanSo cong(PhanSo ps) {
		int tu = tuSo * ps.mauSo + mauSo * ps.tuSo;
		int mau = mauSo * ps.mauSo;
		return new PhanSo(tu, mau);
	}

	// Phương thức trừ (tương tự cộng)
	public PhanSo tru(PhanSo ps) {
		int tu = tuSo * ps.mauSo - mauSo * ps.tuSo;
		int mau = mauSo * ps.mauSo;
		return new PhanSo(tu, mau);
	}

	// Phương thức nhân
	public PhanSo nhan(PhanSo ps) {
		int tu = tuSo * ps.tuSo;
		int mau = mauSo * ps.mauSo;
		return new PhanSo(tu, mau);
	}

	// Phương thức chia
	public PhanSo chia(PhanSo ps) {
		int tu = tuSo * ps.mauSo;
		int mau = mauSo * ps.tuSo;
		return new PhanSo(tu, mau);
	}
}