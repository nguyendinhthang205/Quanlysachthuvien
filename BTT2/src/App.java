import java.util.Scanner;
import java.time.Year;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // ---------- PHẦN BÀI TẬP TUẦN 3 ----------
        System.out.println("--- NHAP THONG TIN SACH ---");
        System.out.print("Nhap ma sach: "); 
        String maSach = scanner.nextLine();
        
        System.out.print("Nhap ten sach: "); 
        String tenSach = scanner.nextLine();
        
        System.out.print("Nhap tac gia: "); 
        String tacGia = scanner.nextLine();
        
        System.out.print("Nhap nam xuat ban: "); 
        int namXuatBan = scanner.nextInt();
        
        System.out.print("Nhap don gia: "); 
        double donGia = scanner.nextDouble();
        
        System.out.print("Nhap so luong: "); 
        int soLuong = scanner.nextInt();

        double thanhTien = donGia * soLuong;
        double phiVanChuyen = 0.05 * thanhTien; 
        double tongTienNhap = thanhTien + phiVanChuyen;

        System.out.println("\nThanh tien: " + thanhTien + " | Phi van chuyen: " + phiVanChuyen + " | Tong: " + tongTienNhap);

        // ---------- PHẦN BÀI TẬP TUẦN 4 ----------
        System.out.println("\n--- PHAN TICH THONG TIN SACH (TUAN 4) ---");
        
        // Bài 1: Kiểm tra tính hợp lệ
        int currentYear = Year.now().getValue();
        if (donGia > 0 && soLuong >= 0 && namXuatBan > 0 && namXuatBan <= currentYear) {
            System.out.println("Trang thai: HOP LE.");
        } else {
            System.out.println("Trang thai: KHONG hop le.");
        }

        // Bài 2: Phân loại giá
        System.out.print("Phan loai gia: ");
        if (donGia < 50000) {
            System.out.println("Thap");
        } else if (donGia <= 100000) {
            System.out.println("Trung binh");
        } else if (donGia <= 200000) {
            System.out.println("Cao");
        } else {
            System.out.println("Dac biet");
        }

        // Bài 3: Phân loại tồn kho
        System.out.print("Phan loai ton kho: ");
        if (soLuong == 0) {
            System.out.println("Het sach");
        } else if (soLuong <= 5) {
            System.out.println("Sap het");
        } else if (soLuong <= 20) {
            System.out.println("Con it");
        } else {
            System.out.println("Con nhieu");
        }

        // Bài 4: Chọn loại sách bằng Switch-case
        System.out.print("\nChon loai (1.Giao khoa | 2.Tham khao | 3.Chuyen nganh | 4.Khac): ");
        int loaiSach = scanner.nextInt();
        switch (loaiSach) {
            case 1: System.out.println("Sach giao khoa"); break;
            case 2: System.out.println("Sach tham khao"); break;
            case 3: System.out.println("Sach chuyen nganh"); break;
            case 4: System.out.println("Sach khac"); break;
            default: System.out.println("Lua chon khong hop le"); break;
        }
        
        scanner.close();
    }
}