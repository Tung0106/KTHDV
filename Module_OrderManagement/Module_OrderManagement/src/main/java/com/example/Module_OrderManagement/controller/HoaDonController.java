package com.example.Module_OrderManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Module_OrderManagement.entities.HoaDon;
import com.example.Module_OrderManagement.service.HoaDonService;

@RestController
@RequestMapping("/hoadon")
public class HoaDonController {

	@Autowired
	private HoaDonService service;
	
	@GetMapping()
	public HoaDon findBillMaxId() {
		return service.findBillMaxId();
	}
	
	@PostMapping()
	public HoaDon saveBill(@RequestBody HoaDon hoaDon) {
		return service.saveBill(hoaDon);
	}
}
