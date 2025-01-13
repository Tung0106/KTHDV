package com.example.Module_OrderManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Module_OrderManagement.entities.HoaDon;
import com.example.Module_OrderManagement.repository.HoaDonRepository;

@Service
public class HoaDonService {

	@Autowired
	private HoaDonRepository repo;
	
	//lấy đơn có số thứ tự lớn nhất
	public HoaDon findBillMaxId() {
		return repo.findTopByOrderByMaHoaDonDesc();
	}
	
	//lưu hóa đơn
	public HoaDon saveBill(HoaDon hoaDon) {
		return repo.save(hoaDon);
	}
	
	/*
	 * public HoaDon saveBill(HoaDon hoaDon) {
	 * 
	 * }
	 */
}
