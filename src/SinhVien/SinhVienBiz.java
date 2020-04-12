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
public class SinhVienBiz extends SinhVienPoly{
    private double diemMKT;
    private double diemSales;
    public SinhVienBiz(String hoTen,String nganh, double diemMKT,double diemSales){
    super(hoTen,nganh);
    this.diemMKT = diemMKT;
    this.diemSales = diemSales;
    }
    @Override
    public double getDiem(){
    return(2*diemMKT+diemSales)/(double)3;
    }
 }


