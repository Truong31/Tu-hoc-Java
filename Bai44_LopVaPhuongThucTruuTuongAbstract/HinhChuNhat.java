package OOP.Bai44_LopVaPhuongThucTruuTuongAbstract;

public class HinhChuNhat extends Hinh {
    private double chieuDai, chieuCao;
    
    public HinhChuNhat(ToaDo toaDo, double chieuDai, double chieuCao) {
        super(toaDo);
        this.chieuDai = chieuDai;
        this.chieuCao = chieuCao;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    @Override
    public double tinhDienTich() {
        return this.chieuCao*this.chieuDai;
    }
}
