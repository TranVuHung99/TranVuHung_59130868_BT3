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
public class SinhVienIT extends SinhVienPoly{
    public double diemJava;
    public double diemCss;
    public double diemHTML;
    
    public SinhVienIT(String hoTen ,String nganh, double diemJava, double diemCss, double diemHTML){
       super(hoTen,nganh);
       this.diemJava = diemJava;
       this.diemCss = diemCss;
       this.diemHTML = diemHTML;
    }
    @Override
    public double getDiem(){
        return(diemJava*2+diemCss+diemHTML)/(double)4;
    }
 }


