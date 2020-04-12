/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

import SinhVien.SinhVienBiz;
import SinhVien.SinhVienIT;
import SinhVien.SinhVienPoly;
/**
 *
 * @author KimKhanh
 */
public class BT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SinhVienPoly svPoly = new SinhVienIT("Lê Phan Anh", "Poly", 7.5, 8.5, 9.0);
        svPoly.xuat();
        SinhVienIT svIT = new SinhVienIT("Trần Vũ Hùng","Công Nghê thông tin",7.0,6.5,6.8);
        svIT.xuat();
        SinhVienBiz svBiz = new SinhVienBiz("Lê Thị Lựu","Kinh Doanh",7.3,6.9);
        svBiz.xuat();
        
    }
}
