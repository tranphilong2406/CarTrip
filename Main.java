package CarTrip;

public class Main {
    public static void main(String[] args) {
        Company ct = new Company("RichDragon",4);

        ct.xuat();

        double doanhThuUrban = ct.tinhDoanhThuUrban();
        System.out.println("Doanh thu noi thanh: " + doanhThuUrban);

        double doanhThuSuburban = ct.tinhDoanhThuSuburban();
        System.out.println("Doanh thu noi thanh: " + doanhThuSuburban);

        double tongDoanhThu = doanhThuSuburban + doanhThuUrban;
        System.out.println("Tong doanh thu: " + tongDoanhThu);
    }
    
}
