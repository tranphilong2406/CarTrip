package CarTrip;

public abstract class Trip {
    protected String maChuyen;
    protected String hoTenTaiXe;
    protected String soXe;
    protected double doanhThu;

    public Trip()
    {
        this.maChuyen = " ";
        this.hoTenTaiXe = " ";
        this.soXe = " ";
        this.doanhThu = 0;
    }

    public Trip(String maChuyen,String hoTenTaiXe,String soXe,double doanhThu)
    {
        this.maChuyen = maChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMaChuyen() {
        return maChuyen;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void xuat()
    {
        System.out.println("Ma chuyen: " + this.maChuyen);
        System.out.println("Ho ten tai xe: " + this.hoTenTaiXe);
        System.out.println("So xe: " + this.soXe);
        System.out.println("Doanh thu: " + this.doanhThu);
    }
}