package com.example.CafeShopManager.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;

public class KhachHang {
	private String soDT; 
	private String tenKhachHang; 
	private BigDecimal tongTienTichLuy; 
	private int tongDiemTichLuy; 
	
	private Timestamp thoiGianTao; 
	
	private Timestamp thoiGianCapNhat;

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	public String getTenKhachHang() {
		return tenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}

	public BigDecimal getTongTienTichLuy() {
		return tongTienTichLuy;
	}

	public void setTongTienTichLuy(BigDecimal tongTienTichLuy) {
		this.tongTienTichLuy = tongTienTichLuy;
	}

	public int getTongDiemTichLuy() {
		return tongDiemTichLuy;
	}

	public void setTongDiemTichLuy(int tongDiemTichLuy) {
		this.tongDiemTichLuy = tongDiemTichLuy;
	}

	public Timestamp getThoiGianTao() {
		return thoiGianTao;
	}

	public void setThoiGianTao() {
		this.thoiGianTao = Timestamp.from(Instant.now());
	}

	public Timestamp getThoiGianCapNhat() {
		return thoiGianCapNhat;
	}

	public void setThoiGianCapNhat() {
		this.thoiGianCapNhat = Timestamp.from(Instant.now());
	} 
}
