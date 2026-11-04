package com.mycompany.quanlysach;
import java.util.Scanner;
import java.util.ArrayList;

class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXB;
    private double donGia;
    private int soLuong;
    private int loaiSach;

    public Sach() {}

    public boolean Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();
        
        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();
        
        System.out.print("Nhap tac gia: ");
        tacGia = sc.nextLine();
        
        System.out.print("Nhap nam xuat ban: ");
        namXB = sc.nextInt();
        if(namXB > 2026 || namXB <= 0){
            System.out.println("Nam XB phai lon hon 0 va nho hon 2026 ");
            return false;
        }

        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
        if(donGia <= 0){
            System.out.println("Don gia phai lon hon 0 !");
            return false ;
        }

        System.out.print("Nhap so luong: ");
        soLuong = sc.nextInt();
        if(soLuong < 0){
            System.out.println("So luong phai lon hon hoac bang 0");
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

    // Các hàm tính toán
    public double thanhTien() { return donGia * soLuong; }
    public double phiVanChuyen() { return donGia * 0.05; }
    public double tongTien() { return thanhTien() + phiVanChuyen(); }

    public int getSoLuong() { return soLuong; }
    public String getMaSach() { return maSach; }

    public void Xuat() {
        System.out.println("Ma Sach: " + maSach + " | Ten: " + tenSach + 
                           " | So Luong: " + soLuong + " | Tong Tien: " + tongTien());
    }
}

public class Quanlysach {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] soLuong = new int[5];
        ArrayList<String> dsMaSach = new ArrayList<>();
        ArrayList<Sach> danhSachSach = new ArrayList<>();
        
        int luaChon = 0;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.print("Chon chuc nang: ");
            
            luaChon = sc.nextInt();
            sc.nextLine(); 

            switch (luaChon) {
                case 1:
                    Sach sachMoi = new Sach();
                    if(sachMoi.Nhap()){
                        danhSachSach.add(sachMoi);
                        dsMaSach.add(sachMoi.getMaSach());
                        System.out.println("Them thanh cong!");
                    }
                    break;
                case 2:
                    for(Sach s : danhSachSach){
                        s.Xuat();
                    }
                    break;
                case 3:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    boolean timThay = false;
                    for(Sach s : danhSachSach){
                        if(s.getMaSach().equals(maTim)){
                            s.Xuat();
                            timThay = true;
                            break;
                        }
                    }
                    if(!timThay) System.out.println("Khong tim thay!");
                    break;
                case 4:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    boolean xoaThanhCong = false;
                    for(int i=0; i<danhSachSach.size(); i++){
                         if(danhSachSach.get(i).getMaSach().equals(maXoa)){
                             danhSachSach.remove(i);
                             dsMaSach.remove(maXoa);
                             xoaThanhCong = true;
                             System.out.println("Da xoa!");
                             break;
                         }
                    }
                    if(!xoaThanhCong) System.out.println("Khong tim thay!");
                    break;
                case 5:
                    System.out.print("Nhap ma sach can sua: ");
                    String maSua = sc.nextLine();
                    boolean suaThanhCong = false;
                    for(int i=0; i<danhSachSach.size(); i++){
                         if(danhSachSach.get(i).getMaSach().equals(maSua)){
                             System.out.println("Nhap thong tin moi:");
                             Sach sSua = new Sach();
                             if(sSua.Nhap()){
                                 danhSachSach.set(i, sSua);
                                 dsMaSach.set(i, sSua.getMaSach());
                                 System.out.println("Da sua!");
                             }
                             suaThanhCong = true;
                             break;
                         }
                    }
                    if(!suaThanhCong) System.out.println("Khong tim thay!");
                    break;
                case 6:
                    int tongSL = 0;
                    for(Sach s : danhSachSach){
                        tongSL += s.getSoLuong();
                    }
                    System.out.println("Tong so luong: " + tongSL);
                    break;
                case 7:
                    double tongGiaTri = 0;
                    for(Sach s : danhSachSach){
                        tongGiaTri += s.tongTien();
                    }
                    System.out.println("Tong gia tri: " + tongGiaTri);
                    break;
                case 8:
                    System.out.println("Tam biet!");
                    break;
                default:
                    System.out.println("Chon sai!");
            }
        } while (luaChon != 8);
        sc.close();
    }
}