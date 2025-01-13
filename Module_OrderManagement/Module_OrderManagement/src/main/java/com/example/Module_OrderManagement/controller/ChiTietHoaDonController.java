package com.example.Module_OrderManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Module_OrderManagement.entities.ThucDon;
import com.example.Module_OrderManagement.service.ChiTietHoaDonService;

@RestController
@RequestMapping("/chitiethoadon")
public class ChiTietHoaDonController {

	@Autowired
	private ChiTietHoaDonService service;
	
	@PostMapping()
	public boolean saveDetailBill(@RequestBody List<ThucDon> thucDon) {
		return service.saveDetailBill(thucDon);
	}
}
