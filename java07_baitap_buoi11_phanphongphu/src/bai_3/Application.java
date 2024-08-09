package bai_3;

public class Application {

	public static void main(String[] args) {
		NhanVienSanXuat nhanVienSanXuat = new NhanVienSanXuat();
		NhanVienVanPhong nhanVienVanPhong = new NhanVienVanPhong();

		// Nhập thông tin
		System.out.println("Nhập thông tin nhân viên sản xuất: ");
		nhanVienSanXuat.nhapThongTin();
		System.out.println("Nhập thông tin nhân viên văn phòng: ");
		nhanVienVanPhong.nhapThongTin();
		System.out.println();
		
		// In thông tin và lương
		System.out.println("Nhân viên sản xuất: ");
		nhanVienSanXuat.xuatThongTin();
		nhanVienSanXuat.tinhLuong();
		System.out.println("Nhân viên văn phòng: ");
		nhanVienVanPhong.xuatThongTin();
		nhanVienVanPhong.tinhLuong();
	}
}
