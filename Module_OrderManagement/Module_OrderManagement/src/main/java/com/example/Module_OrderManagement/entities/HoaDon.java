package com.example.Module_OrderManagement.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HoaDon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maHoaDon;

	private int maNhanVien;

	private String soDT;
	private BigDecimal tongTien;
	private Timestamp thoiGianVao;
	private Timestamp thoiGianRa;

	public int getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(int maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	public int getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(int maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	public BigDecimal getTongTien() {
		return tongTien;
	}

	public void setTongTien(BigDecimal tongTien) {
		this.tongTien = tongTien;
	}

	public Timestamp getThoiGianVao() {
		return thoiGianVao;
	}

	public void setThoiGianVao() {
		this.thoiGianVao = Timestamp.from(Instant.now());
	}

	public Timestamp getThoiGianRa() {
		return thoiGianRa;
	}

	public void setThoiGianRa() {
		this.thoiGianRa = Timestamp.from(Instant.now());
	}
}
