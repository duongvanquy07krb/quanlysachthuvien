

package com.mycompany.btt7;

import java.util.ArrayList;

/**
 *
 * @author DuongVanQuy
 */
public class Test {
    public static void main(String[] args) {
        Sach Toan = new Sach();
        Toan.maSach= "T001";
        Toan.tieuDe= "Giai Tich";
        Toan.tacGia= " Nguyen Minh Anh";
        Toan.namXuatBan=  2007;
        Toan.soLuong= 12;
        Toan.hienThiThongTin();
        
        Sach Ly = new Sach();
        Ly.maSach= "L002";
        Ly.tieuDe= "Song dien tu";
        Ly.tacGia= " Nguyen Quan Sinh";
        Ly.namXuatBan=  2005;
        Ly.soLuong= 7;
        Ly.hienThiThongTin();
        
        Sach Hoa = new Sach();
        Hoa.maSach= "H001";
        Hoa.tieuDe= "Hoa dai cuong";
        Hoa.tacGia= " Le Dai Duong";
        Hoa.namXuatBan=  2012;
        Hoa.soLuong= 20;
        Hoa.hienThiThongTin();
        
         ArrayList <Sach> danhSachSach = new ArrayList <>();
        danhSachSach.add(Toan);
        danhSachSach.add(Ly);
        danhSachSach.add(Hoa);
        System.out.println("--- DANH SÁCH SÁCH TRONG THƯ VIỆN ---");
        for (Sach s : danhSachSach) {
            s.hienThiThongTin();
            System.out.println("----------------------");
        }
    }
}