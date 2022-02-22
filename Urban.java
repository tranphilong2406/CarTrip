package CarTrip;

public class Urban extends Trip {
    private int soTuyen;
    private double soKm;

    public Urban()
    {
        this.maChuyen = " ";
        this.hoTenTaiXe = " ";
        this.soXe = " ";
        this.soTuyen = 0;
        this.soKm = 0;
        this.doanhThu = 0;
    }
    public Urban(String maChuyen,String hoTenTaiXe,String soXe,int soTuyen,double soKm,double doanhThu)
    {
        this.maChuyen = maChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.soTuyen = soTuyen;
        this.soKm = soKm;
        this.doanhThu = doanhThu;
    }
    public int getSoTuyen() {
        return soTuyen;
    }

    public double getSoKm() {
        return soKm;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("So tuyen: " + this.soTuyen);
        System.out.println("So km: " + this.soKm);
    }
}
