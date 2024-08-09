package bai_2;

public class Application {

	public static void main(String[] args) {
		
		VanDongVien vdv1 = new VanDongVien();
        VanDongVien vdv2 = new VanDongVien();

        System.out.println("Nhập thông tin vận động viên thứ nhất:");
        vdv1.nhap();

        System.out.println("Nhập thông tin vận động viên thứ hai:");
        vdv2.nhap();
        
        System.out.println("\nThông tin vận động viên thứ nhất:");
        vdv1.xuat();

        System.out.println("\nThông tin vận động viên thứ hai:");
       vdv2.xuat();
       System.out.println();
       
        if (vdv1.lonHon(vdv2)) {
        	System.out.println("Vận động viên " + vdv1.hoTen + " lớn hơn vận động viên " + vdv2.hoTen);
        } else if (vdv2.lonHon(vdv1)) {
        	System.out.println("Vận động viên " + vdv2.hoTen + " lớn hơn vận động viên " + vdv1.hoTen);
        } else {
        	System.out.println("Vận động viên " + vdv1.hoTen + " và vận động viên " + vdv2.hoTen + " bằng nhau");
        }
    }
}
