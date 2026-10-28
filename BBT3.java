class Sach {
    private String maSach ;
    private String tenSach ;
    private String tacGia;
    private int namXB;
    private double donGia;
    private int soLuong;

    public Sach()
    {}

    public Sach (String ma, String tens, String tg, int nam, double dg, int sl){
        this.maSach = ma;
        this.tenSach = tens;
        this.tacGia = tg;
        this.namXB = nam;
        this.donGia = dg;
        this.soLuong =sl;
    }

    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sach: ") ;
        maSach =sc.nextLine();
        System.out.print("Nhap ten sach: ") ;
        tenSach = sc.nextLine();
        System.out.print("Nhap tac gia: ") ;
        tacGia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ") ;
        namXB = sc.nextInt();
        System.out.print("Nhap Don gia:");
        donGia = sc.nextDouble();
        System.out.print("Nhap so luong: ") ;
        soLuong = sc.nextInt();
    }
    public void Xuat(){
        System.out.println("Ma Sach: "+ maSach);
        System.out.println("TenSach: "+ tenSach);
        System.out.println("Tac gia: "+ tacGia);
        System.out.println("Nam XB: " + namXB);
        System.out.println("Don gia: " + donGia);
        System.out.println("So Luong: " + soLuong);
    }

    public double thanhTien(){
        return donGia*soLuong;
    }

    public double phiVanChuyen(){
        return donGia*0.05;
    }
    public double tongTien(){
        return thanhTien()+phiVanChuyen();
    }
}   

void main(){
    Sach sachMoi = new Sach();
    sachMoi.Nhap();
    sachMoi.Xuat();
    
}