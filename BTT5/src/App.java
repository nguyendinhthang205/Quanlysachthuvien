import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Sử dụng mảng để lưu tạm thời danh sách (Tối đa 100 cuốn)
        String[] maSach = new String[100];
        String[] tenSach = new String[100];
        double[] donGia = new double[100];
        int[] soLuong = new int[100];
        int tongDauSach = 0;
        int chon = 0;

        do {
            System.out.println("\n===== MENU TUAN 5 (VONG LAP) =====");
            System.out.println("1. Nhap n sach bang vong lap");
            System.out.println("2. Tinh tong so luong va tong gia tri");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Thoat");
            System.out.print("Chon chuc nang: ");
            chon = Integer.parseInt(scanner.nextLine());

            switch (chon) {
                case 1:
                    System.out.print("Nhap so luong sach can them (n): ");
                    int n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("--- Nhap thong tin cuon thu " + (tongDauSach + 1) + " ---");
                        System.out.print("Ma sach: "); maSach[tongDauSach] = scanner.nextLine();
                        System.out.print("Ten sach: "); tenSach[tongDauSach] = scanner.nextLine();
                        System.out.print("Don gia: "); donGia[tongDauSach] = Double.parseDouble(scanner.nextLine());
                        System.out.print("So luong: "); soLuong[tongDauSach] = Integer.parseInt(scanner.nextLine());
                        tongDauSach++;
                    }
                    break;
                case 2:
                    int tongSL = 0;
                    double tongGia = 0;
                    for (int i = 0; i < tongDauSach; i++) {
                        tongSL += soLuong[i];
                        tongGia += (donGia[i] * soLuong[i]);
                    }
                    System.out.println("=> Tong so luong tat ca cac sach: " + tongSL);
                    System.out.println("=> Tong gia tri tat ca cac sach: " + tongGia);
                    break;
                case 3:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = scanner.nextLine();
                    boolean thay = false;
                    for (int i = 0; i < tongDauSach; i++) {
                        if (maSach[i].equals(maTim)) {
                            System.out.println("Tim thay: " + tenSach[i] + " | Gia: " + donGia[i] + " | SL: " + soLuong[i]);
                            thay = true;
                            break;
                        }
                    }
                    if (!thay) System.out.println("Khong tim thay ma sach nay.");
                    break;
                case 4:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Chon sai, vui long chon lai!");
            }
        } while (chon != 4);
        
        scanner.close();
    }
}