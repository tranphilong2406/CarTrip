package CarTrip;

import java.util.ArrayList;
import java.util.*;

public class Company {
    private String tenCongTy;
    private int soLuong;
    private ArrayList<Trip> dsXe;

    private static final Scanner scanner = new Scanner(System.in);    

    public Company()
    {
        this.tenCongTy = " ";
        this.soLuong = 0;
        this.dsXe = new ArrayList<Trip>();
    }

    public Company(String tenCongTy,int soLuong)
    {
        this.tenCongTy = tenCongTy;
        this.soLuong = soLuong;
        this.dsXe = new ArrayList<Trip>(soLuong);
        ListConstructor();
    }
    
    public void ListConstructor()
    {
        Trip s1 = new Suburban("NT1","Phi Long","3353","Ho Chi Minh",3,370000);
        Trip u1 = new Urban("NT2","Trong Nghia","2345",3,45.6,390290);
        Trip u2 = new Urban("NT3","Thanh Long","3485",2,33.4,290983);
        Trip s2 = new Suburban("NT4","Ngoc Giau","0607","Dong Nai",4,510000);
        this.dsXe.add(s1);
        this.dsXe.add(u1);
        this.dsXe.add(u2);
        this.dsXe.add(s2);
    }

    public void xuat()
    {
        System.out.println("Ten cong ty: " + this.tenCongTy);
        System.out.println("So luong: " + this.soLuong);
        System.out.println("Danh sach xe:");
        for (Trip trip : dsXe) {
            trip.xuat();
        }
    }

    public double tinhDoanhThuUrban()
    {
        double result = 0;
        for(int i = 0;i<this.soLuong;i++)
        {
            if(this.dsXe.get(i).getClass().getSimpleName().equals("Urban"))
            {
                result += this.dsXe.get(i).getDoanhThu();
            }
        }
        return result;
    }
    public double tinhDoanhThuSuburban()
    {
        double result = 0;
        for(int i = 0;i<this.soLuong;i++)
        {
            if(this.dsXe.get(i).getClass().getSimpleName().equals("Suburban"))
            {
                result += this.dsXe.get(i).getDoanhThu();
            }
        }
        return result;
    }
}