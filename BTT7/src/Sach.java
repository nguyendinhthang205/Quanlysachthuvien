import java.time.Year;

public class Sach {
    // Yêu cầu Tuần 8: Đóng gói dữ liệu bằng private
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // Constructor có tham số đầy đủ
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        setNamXuatBan(namXuatBan); 
        setSoLuong(soLuong);       
    }

    // Public Getters và Setters
    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public String getTieuDe() { return tieuDe; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }

    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }

    public int getNamXuatBan() { return namXuatBan; }
    public void setNamXuatBan(int namXuatBan) {
        int currentYear = Year.now().getValue();
        if (namXuatBan > 0 && namXuatBan <= currentYear) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("-> Nam XB khong hop le! Dat mac dinh: " + currentYear);
            this.namXuatBan = currentYear;
        }
    }

    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("-> So luong khong duoc am! Dat mac dinh: 0");
            this.soLuong = 0;
        }
    }

    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach + " | Tieu de: " + tieuDe + 
                           " | Tac gia: " + tacGia + " | Nam XB: " + namXuatBan + 
                           " | So luong: " + soLuong);
    }
}