
package com.mycompany.btt7;

/**
 *
 * @author DuongVanQuy
 */
 class Sach {
    private  String maSach  ;
    private  String tieuDe ;
    private  String tacGia ;
    private  int  namXuatBan ;
    private  int soLuong ;

    public Sach() {}
     
    public Sach ( String maSach, String tieuDe, String tacGia, int  namXuatBan, int soLuong)
    {
         this.maSach= maSach;
         this.tieuDe = tieuDe;
         this.tacGia = tacGia;
         this.namXuatBan= namXuatBan;
         this. soLuong = soLuong; 
     }
    
    public void setMaSach(String maSach){
        this.maSach = maSach ;
    }
    public String getMaSach(){
        return maSach;
    }
    
    public void setTieuDe(String tieuDe){
        this.tieuDe = tieuDe;
        
    }
    public String getTieuDe(){
        return tieuDe;
    }
    public void setTacGia(String tacGia ){
        this.tacGia = tacGia ;
        
    }
    public String getTacGia(){
        return tacGia;
    }
    
    public void setNamXuatBan(int namXuatBan ){
        if ( namXuatBan < 2026 && namXuatBan > 0 )
            this.namXuatBan =namXuatBan ;
        else
            System.out.println("Nam khong hop le!");
    }
    public int getNamXuatBan(){
        return namXuatBan ;
    }
    
    public void setSoLuong(int soLuong ){
        if( soLuong >= 0)
            this.soLuong = soLuong;
        else
            System.out.println("So luong khong hop le!");
    }
    public int getSoLuong(){
        return  soLuong;
    }
    
    public void hienThiThongTin(){
        System.out.println("Ma sach la: " + maSach );
        System.out.println("Tieu de: " + tieuDe );
        System.out.println("tac gia : " + tacGia);
        System.out.println("nam  xuat  ban:" + namXuatBan);
        System.out.println(" so luong: " + soLuong);
    }

 }