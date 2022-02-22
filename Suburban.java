package CarTrip;

public class Suburban extends Trip {
    private String noiDen;
    private int soNgayDi;

    public Suburban()
    {
        this.maChuyen = " ";
        this.hoTenTaiXe = " ";
        this.soXe = " ";
        this.noiDen = " ";
        this.soNgayDi = 0;
        this.doanhThu = 0;
    }
    public Suburban(String maChuyen,String hoTenTaiXe,String soXe,String noiDen,int soNgayDi,double doanhThu)
    {
        this.maChuyen = maChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
        this.doanhThu = doanhThu;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public int getSoNgayDi() {
        return soNgayDi;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Noi den: " + this.noiDen);
        System.out.println("So ngay di: " + this.soNgayDi);
    }
    
}
