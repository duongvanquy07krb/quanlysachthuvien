package com.mycompany.quanlysach;
import java.util.Scanner;

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
        int luaChon = 0;
        
      
        Sach sachHienTai = new Sach(); 
        int tongSoLuongTatCa = 0;
        double tongGiaTriTatCa = 0;
        boolean daCoDuLieu = false; 

        // Bài 3: Menu lặp đến khi chọn Thoát
        do {
            System.out.println("\n===== MENU QUaN LY THU VIEN =====");
            System.out.println("1. Nhap n sach bang vong lap");
            System.out.println("2. Xem tong so luong va tong gia tri sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Thoat");
            System.out.print("Chon chuc nang (1-4): ");
            
            luaChon = sc.nextInt();
            sc.nextLine(); 

            switch (luaChon) {
                case 1:
                    System.out.print("Nhap so luong sach can them (n): ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    
                    // Bài 1: Nhập n sách bằng vòng lặp
                    for (int i = 1; i <= n; i++) {
                        System.out.println("\n--- Nhap sach thu " + i + " ---");
                        boolean hopLe = sachHienTai.Nhap(); 
                        
                        if (!hopLe) {
                            System.out.println("Du lieu sai, vui long nhap lai cuon nay!");
                            i--; 
                            continue;
                        }
                        
                        // Bài 2: Tính tổng số lượng và tổng giá trị sách ngay trong vòng lặp
                        tongSoLuongTatCa += sachHienTai.getSoLuong();
                        tongGiaTriTatCa += sachHienTai.tongTien();
                        daCoDuLieu = true; 
                    }
                    System.out.println("\n-> Da nhap xong " + n + " cuon sach!");
                    break;
                    
                case 2:
                    System.out.println("\n--- KET QUA TONG HOP ---");
                    System.out.println("Tong so luong sach: " + tongSoLuongTatCa);
                    System.out.println("Tong gia tri tat ca sach: " + tongGiaTriTatCa);
                    break;
                    
                case 3:
                    if (!daCoDuLieu) {
                        System.out.println("Chua co du lieu sach nao trong he thong!");
                        break;
                    }
                    
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    
                    // Bài 4: Tìm sách theo mã (Chỉ kiểm tra được cuốn cuối cùng)
                    if (maTim.equals(sachHienTai.getMaSach())) {
                        System.out.println("Da tim thay (Day la cuon sach ban nhap cuoi cung):");
                        sachHienTai.Xuat();
                    } else {
                        System.out.println("Khong tim thay ma sach nay! (Hoac do ban khong dung mang nen du lieu cac cuon sach truoc da bi xoa).");
                    }
                    break;
                    
                case 4:
                    System.out.println("Chuong trinh ket thuc. Tam biet!");
                    break;
                    
                default:
                    System.out.println("Chon sai, vui long chon tu 1 den 4!");
            }
        } while (luaChon != 4);
    }
}