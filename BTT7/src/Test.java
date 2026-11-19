import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        System.out.print("Nhap so luong dau sach muon them: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Nhap thong tin cuon sach thu " + (i + 1) + " ---");
            
            System.out.print("Nhap ma sach: ");
            String ma = scanner.nextLine();
            
            System.out.print("Nhap tieu de: ");
            String tieuDe = scanner.nextLine();
            
            System.out.print("Nhap tac gia: ");
            String tacGia = scanner.nextLine();
            
            System.out.print("Nhap nam xuat ban: ");
            int namXB = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Nhap so luong: ");
            int soLuong = Integer.parseInt(scanner.nextLine());

            // Tuần 8: Sử dụng Constructor để tạo đối tượng
            Sach s = new Sach(ma, tieuDe, tacGia, namXB, soLuong);
            danhSachSach.add(s);
        }

        System.out.println("\n===== DANH SACH SACH (TUAN 8) =====");
        for (Sach s : danhSachSach) {
            s.hienThiThongTin();
        }
        scanner.close();
    }
}