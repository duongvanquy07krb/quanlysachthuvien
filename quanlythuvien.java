//Khoi tao

import java.util.Scanner;

class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXB;
    private double donGia;
    private int soLuong;
    private int loaiSach;


    public Sach() {
    }

    public Sach(String ma, String tens, String tg, int nam, double dg, int sl, int ls) {
        this.maSach = ma;
        this.tenSach = tens;
        this.tacGia = tg;
        this.namXB = nam;
        this.donGia = dg;
        this.soLuong = sl;
        this.loaiSach = ls;
    }
//Nhập dữ liệu
    public boolean Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        tacGia = sc.nextLine();
    //thêm điều kiện nhập
        System.out.print("Nhap nam xuat ban: ");
        namXB = sc.nextInt();
        if(namXB > 2026 || namXB <= 0){
            System.out.println("Nam XB phai lon hon 0 va nho hon 2026 ");
            return false;
        }

        System.out.print("Nhap Don gia:");
        donGia = sc.nextDouble();
        if(donGia <= 0){
                System.out.println("Don gia phai lon hon 0 !");
                return false ;
        }

        System.out.print("Nhap so luong: ");
        soLuong = sc.nextInt();
        if(soLuong < 0){
                System.out.print("So luong phai lon hon hoac bang 0");
                return false;
        }

       
        System.out.print("Nhap loai sach (1: SGK, 2: Tham khao, 3: Chuyen nganh, 4: Khac): ");
        loaiSach = sc.nextInt();
        if (loaiSach < 1 || loaiSach > 4) {
            System.out.println("Loi: Loai sach khong hop le!");
            return false;
        }
         return true;
    }
    
    //Phân loại giá
    public String loaiGia() {
        if(donGia < 50000){
            return "Sach gia thap";
        }else if( donGia <= 100000){
            return "sach gia trung binh";
        }else if( donGia <= 200000){
            return "sach gia cao";
        }else {
            return "sach gia dat biet";
        }
    }

    //Phân loại kho
    public String tonKho() {
        if (soLuong == 0) {
            return "Het sach";
        } else if (soLuong <= 5) {
            return "Sap het";
        } else if (soLuong <= 20) {
            return "Con it";
        } else {
            return "Con nhieu";
        }

        
    }
    
    

//xuất dữ liệu
    public void Xuat(){
         System.out.println("--xuat du lieu--");
        System.out.println("Ma Sach: "+ maSach);
        System.out.println("TenSach: "+ tenSach);
        System.out.println("Tac gia: "+ tacGia);
        System.out.println("Nam XB: " + namXB);
        System.out.println("Don gia: " + donGia + " Loai gia:" + loaiGia());
        System.out.println("So Luong: " + soLuong + " Ton Kho: "+ tonKho() );
        System.out.println("Thanh Tien: " + thanhTien());
        System.out.println("Phi van Chuyen: "+ phiVanChuyen());
        System.out.println("Tong tien: "+ tongTien());
        System.out.print("Loai sach: ");
        switch (loaiSach) {
            case 1: System.out.println("Sach giao khoa"); break;
            case 2: System.out.println("Sach tham khao"); break;
            case 3: System.out.println("Sach chuyen nganh"); break;
            case 4: System.out.println("Sach khac"); break;
        }
    }
//tính thành tiền
    public double thanhTien() {
        return donGia * soLuong;
    }
//tính phí vận chuyển
    public double phiVanChuyen() {
        return donGia * 0.05;
    }
//tính tổng tiền
    public double tongTien() {
        return thanhTien() + phiVanChuyen();
    }
}

void main() {
    Sach sachMoi = new Sach();
    if(sachMoi.Nhap()) {
        sachMoi.Xuat();
    }
}