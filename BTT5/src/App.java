import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Khai báo ArrayList lưu thông tin sách (Bài 3)
        ArrayList<String> danhSachSach = new ArrayList<>();
        int chon = 0;

        do {
            // Xây dựng menu 8 chức năng
            System.out.println("\n===== MENU TUAN 6 (ARRAYLIST) =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach (Cap nhat Gia & So luong)");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.print("Chon chuc nang (1-8): ");
            chon = Integer.parseInt(scanner.nextLine());

            switch (chon) {
                case 1:
                    System.out.print("Nhap Ma sach: "); String ma = scanner.nextLine();
                    System.out.print("Nhap Ten sach: "); String ten = scanner.nextLine();
                    System.out.print("Nhap Don gia: "); double gia = Double.parseDouble(scanner.nextLine());
                    System.out.print("Nhap So luong: "); int sl = Integer.parseInt(scanner.nextLine());
                    // Gộp thành 1 chuỗi để lưu vào ArrayList
                    danhSachSach.add(ma + "," + ten + "," + gia + "," + sl);
                    System.out.println("=> Da them sach thanh cong!");
                    break;

                case 2:
                    System.out.println("--- DANH SACH SACH ---");
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] info = danhSachSach.get(i).split(",");
                        System.out.println((i+1) + ". Ma: " + info[0] + " | Ten: " + info[1] + " | Gia: " + info[2] + " | SL: " + info[3]);
                    }
                    break;

                case 3:
                    System.out.print("Nhap Ma sach can tim: ");
                    String maTim = scanner.nextLine();
                    boolean thay = false;
                    for (String sach : danhSachSach) {
                        if (sach.startsWith(maTim + ",")) {
                            String[] info = sach.split(",");
                            System.out.println("=> Tim thay: Ten: " + info[1] + " | Gia: " + info[2] + " | SL: " + info[3]);
                            thay = true; 
                            break;
                        }
                    }
                    if (!thay) System.out.println("=> Khong tim thay ma sach nay!");
                    break;

                case 4:
                    System.out.print("Nhap Ma sach can xoa: ");
                    String maXoa = scanner.nextLine();
                    boolean daXoa = false;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        if (danhSachSach.get(i).startsWith(maXoa + ",")) {
                            danhSachSach.remove(i);
                            System.out.println("=> Da xoa thanh cong!");
                            daXoa = true; 
                            break;
                        }
                    }
                    if (!daXoa) System.out.println("=> Khong tim thay ma de xoa.");
                    break;

                case 5:
                    System.out.print("Nhap Ma sach can sua: ");
                    String maSua = scanner.nextLine();
                    boolean daSua = false;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        if (danhSachSach.get(i).startsWith(maSua + ",")) {
                            String[] info = danhSachSach.get(i).split(",");
                            System.out.println("Dang sua thong tin sach: " + info[1]);
                            System.out.print("Nhap Gia moi: "); double giaMoi = Double.parseDouble(scanner.nextLine());
                            System.out.print("Nhap So luong moi: "); int slMoi = Integer.parseInt(scanner.nextLine());
                            // Cập nhật lại phần tử
                            danhSachSach.set(i, info[0] + "," + info[1] + "," + giaMoi + "," + slMoi);
                            System.out.println("=> Da sua thanh cong!");
                            daSua = true; 
                            break;
                        }
                    }
                    if (!daSua) System.out.println("=> Khong tim thay ma de sua.");
                    break;

                case 6:
                    int tongSL = 0;
                    for (String sach : danhSachSach) {
                        String[] info = sach.split(",");
                        tongSL += Integer.parseInt(info[3]);
                    }
                    System.out.println("=> Tong so luong sach hien co: " + tongSL);
                    break;

                case 7:
                    double tongGia = 0;
                    for (String sach : danhSachSach) {
                        String[] info = sach.split(",");
                        tongGia += Double.parseDouble(info[2]) * Integer.parseInt(info[3]);
                    }
                    System.out.println("=> Tong gia tri cua thu vien: " + tongGia);
                    break;

                case 8:
                    System.out.println("Thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le, vui long chon tu 1-8.");
            }
        } while (chon != 8);
        
        scanner.close();
    }
}