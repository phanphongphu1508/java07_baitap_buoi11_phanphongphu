package bai_1;

public class Application {
	public static void main(String[] args) {

		PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();
        System.out.println("Nhập phân số thứ nhất: ");
        ps1.nhap();
        System.out.println("Nhập phân số thứ hai: ");
        ps2.nhap();

        PhanSo tong = ps1.cong(ps2);
        PhanSo hieu = ps1.tru(ps2);
        PhanSo tich = ps1.nhan(ps2);
        PhanSo thuong = ps1.chia(ps2);

        System.out.println();
        System.out.print("Tổng 2 phân số: ");
        tong.xuat();
        System.out.print("Hiệu 2 phân số: ");
        hieu.xuat();
        System.out.print("Tích 2 phân số: ");
        tich.xuat();
        System.out.print("Thương 2 phân số: ");
        thuong.xuat();
	}
}	
