package bai_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		menu();
	}

	public static void menu() {
		List<PhuongTienGiaoThong> danhSachPhuongTien = new ArrayList<PhuongTienGiaoThong>();

		Scanner banPhim = new Scanner(System.in);
		int luaChon;

		do {
			System.out.println("Lựa chọn theo menu bên dưới:");
			System.out.println("1. Nhập thông tin ô tô");
			System.out.println("2. Xuất thông tin ô tô có cùng vận tốc");
			System.out.println("0. Dừng chương trình");
			System.out.print("Lựa chọn: ");
			luaChon = banPhim.nextInt();
			System.out.println();

			if (luaChon < 0 || luaChon > 2) {
				System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại");
			} else {
				switch (luaChon) {
				case 1:
					Oto oto = new Oto();
					oto.nhapThongTin();
					danhSachPhuongTien.add(oto);
					break;
				case 2:
					System.out.print("Nhập vận tốc tối đa cần tìm: ");
					double vanToc = banPhim.nextDouble();
					System.out.println();
					boolean kiemTra = false;
					for (PhuongTienGiaoThong phuongTienGiaoThong : danhSachPhuongTien) {
						if (phuongTienGiaoThong.getVanTocToiDa() == vanToc) {
							phuongTienGiaoThong.xuatThongTin();
							kiemTra = true;
						}
					}
					if (!kiemTra) {
						System.out.println("Không tìm thấy vận tốc cần tìm. ");
					}
					break;
				case 0:
					System.out.println("Đã dừng chương trình.");
					return;
				default:
					break;
				}
			}
		} while (luaChon >= 0 || luaChon <= 2);
	}
}
