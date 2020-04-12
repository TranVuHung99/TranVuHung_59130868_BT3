/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVien;

/**
 *
 * @author KimKhanh
 */
  abstract public class SinhVienPoly {
    public String hoTen;
    public String nganh;
    public  SinhVienPoly(String hoTen, String nganh){
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    abstract public double getDiem();
    public String getHocLuc(){
        String hocLuc;
        double Diem = getDiem();
        if(Diem<5) hocLuc="Yếu";
        else if(Diem<6.5) hocLuc="Trung Bình";
        else if(Diem<7.5) hocLuc="Khá";
        else if(Diem<9) hocLuc="Giỏi";
        else hocLuc="Xuât Sắc";
        return hocLuc;
    }
    public void xuat(){
        System.out.println("Họ và Tên: "+hoTen+"\tNgành: "+nganh+"\tĐiểm: "+getDiem()+"\tHọc Lực: "+getHocLuc());
    }
    
}

    
    
    

