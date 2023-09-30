package OOP.Bai45_LuyenTap;

public class XeOto extends PhuongTienDiChuyen{
    private String loaiNhienLieu;

    public XeOto(HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super("O To", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 100;
    }
    
}
