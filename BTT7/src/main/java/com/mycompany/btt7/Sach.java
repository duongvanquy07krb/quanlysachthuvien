
package com.mycompany.btt7;

/**
 *
 * @author DuongVanQuy
 */
 class Sach {
    public String maSach  ;
    public  String tieuDe ;
    public    String    tacGia ;
    public int  namXuatBan ;
    public  int soLuong ;

     public Sach() {}
     
     public Sach ( String maSach, String tieuDe, String tacGia, int  namXuatBan, int soLuong)
     {
          this.maSach= maSach;
          this.tieuDe = tieuDe;
          this.tacGia = tacGia;
          this.namXuatBan= namXuatBan;
          this. soLuong = soLuong; 
     }
    
     public void hienThiThongTin(){
    System.out.println("Ma sach la: " + maSach );
    System.out.println("Tieu de: " + tieuDe );
    System.out.println("tac gia : " + tacGia);
    System.out.println("nam  xuat  ban:" + namXuatBan);
    System.out.println(" so luong: " + soLuong);
     
 
}

 }