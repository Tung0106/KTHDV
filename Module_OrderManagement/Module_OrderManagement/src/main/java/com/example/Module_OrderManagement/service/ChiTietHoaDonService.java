package com.example.Module_OrderManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Module_OrderManagement.entities.ChiTietHoaDon;
import com.example.Module_OrderManagement.entities.HoaDon;
import com.example.Module_OrderManagement.entities.ThucDon;
import com.example.Module_OrderManagement.repository.ChiTietHoaDonRepository;
import com.example.Module_OrderManagement.repository.HoaDonRepository;

@Service
public class ChiTietHoaDonService {

	@Autowired
	private ChiTietHoaDonRepository chiTietHDRepo;
	
	@Autowired
	private HoaDonRepository hoaDonRepo;
	
	
	//lưu các món ăn vào hóa đơn chi tiết
	public boolean saveDetailBill(List<ThucDon> thucDon) {
		
		//tìm hóa đơn có mã hóa đơn cao nhất hiện tại
		HoaDon hoaDon = hoaDonRepo.findTopByOrderByMaHoaDonDesc();
		
		//mỗi lần lặp sẽ lưu vào dtb
		for(ThucDon td : thucDon) {
			
			//khởi tạo đối tượng chi tiết hóa đơn mới
			ChiTietHoaDon detailBill = new ChiTietHoaDon();
			
			//set các thuộc tính
			detailBill.setMaHoaDon(hoaDon);
			detailBill.setMaMonAn(td.getMaMonAn());
			detailBill.setSoLuong(td.getSoLuong());
			detailBill.setTongTien(td.getTongTien());
			
			//đặt biến status để kiểm tra thêm thành công không
			ChiTietHoaDon status = chiTietHDRepo.save(detailBill);
			
			if(status == null) {
				return false;
			}
		}
		
		return true;
	}
}
