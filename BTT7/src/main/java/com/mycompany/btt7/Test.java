

package com.mycompany.btt7;

import java.util.ArrayList;

/**
 *
 * @author DuongVanQuy
 */
public class Test {
    public static void main(String[] args) {
        Sach Toan = new Sach();
        Toan.setMaSach( "T001");
        Toan.setTieuDe( "Giai Tich");
        Toan.setTacGia (" Nguyen Minh Anh");
        Toan.setNamXuatBan(  2007);
        Toan.setSoLuong(  12);

        
        Sach Ly = new Sach();
        Ly.setMaSach("L002");
        Ly.setTieuDe( "Song dien tu");
        Ly.setTacGia( " Nguyen Quan Sinh");
        Ly.setNamXuatBan( 2005);
        Ly.setSoLuong(3);

        
        Sach Hoa = new Sach();
        Hoa.setMaSach ("H001");
        Hoa.setTieuDe ("Hoa dai cuong");
        Hoa.setTacGia(" Le Dai Duong");
        Hoa.setNamXuatBan(2009);
        Hoa.setSoLuong(20);
       
        
        Sach Sinh = new Sach("S001", "Tham Thuc Vat", "Tran Anh Khoa", 2010, 7);
        
        ArrayList <Sach> danhSachSach = new ArrayList <>();
        danhSachSach.add(Toan);
        danhSachSach.add(Ly);
        danhSachSach.add(Hoa);
        danhSachSach.add(Sinh);
        System.out.println("--- DANH SACH SACH TRONG THU VIEN ---");
        for (Sach s : danhSachSach) {
            s.hienThiThongTin();
            System.out.println("----------------------");
        }
    }
}