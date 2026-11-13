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
            Sach s = new Sach();
            
            System.out.print("Nhap ma sach: ");
            s.maSach = scanner.nextLine();
            
            System.out.print("Nhap tieu de: ");
            s.tieuDe = scanner.nextLine();
            
            System.out.print("Nhap tac gia: ");
            s.tacGia = scanner.nextLine();
            
            System.out.print("Nhap nam xuat ban: ");
            s.namXuatBan = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Nhap so luong: ");
            s.soLuong = Integer.parseInt(scanner.nextLine());

            danhSachSach.add(s);
        }

        System.out.println("\n===== DANH SACH SACH (TUAN 7) =====");
        for (Sach s : danhSachSach) {
            s.hienThiThongTin();
        }
        scanner.close();
    }
}