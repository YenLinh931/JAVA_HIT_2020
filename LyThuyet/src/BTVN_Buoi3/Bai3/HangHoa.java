package BTVN_Buoi3.Bai3;

public class HangHoa {
    private String maHang;
    private String tenHang;
    private float donGia;
    private int soLuong;

    public HangHoa() {
    }

    public HangHoa(String maHang, String tenHang, float donGia, int soLuong) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public float getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public void Xuat(){
        System.out.println("Mã hàng: "+maHang);
        System.out.println("Tên hàng: "+tenHang);
        System.out.println("Đơn giá: "+donGia);
        System.out.println("Số lượng: "+soLuong);
        System.out.println("Thành tiền: "+(donGia*soLuong));
    }
    public static void main(String[] args) {
        HangHoa H1=new HangHoa();
        HangHoa H2=new HangHoa();
        H1=new HangHoa("H001","Computer",12,5);
        System.out.println("Thông tin mặt hàng thứ nhất");
        H1.Xuat();
        H2.setMaHang("H002");
        H2.setTenHang("Telephone");
        H2.setDonGia(100);
        H2.setSoLuong(2);
        System.out.println("Thông tin mặt hàng thứ hai");
        H2.Xuat();
    }
}
