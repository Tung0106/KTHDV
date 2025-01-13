package com.example.Module_ReportingManagement.entities;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Report {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sTT;

	private LocalDateTime thoiGian;

	private int tongTien;

	private int tongHoaDon;

	public int getSTT() {
		return sTT;
	}

	public void setSTT(int sTT) {
		this.sTT = sTT;
	}

	public LocalDateTime getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(LocalDateTime thoiGian) {
		this.thoiGian = thoiGian;
	}

	public int getTongTien() {
		return tongTien;
	}

	public void setTongTien(int tongTien) {
		this.tongTien = tongTien;
	}

	public int getTongHoaDon() {
		return tongHoaDon;
	}

	public void setTongHoaDon(int tongHoaDon) {
		this.tongHoaDon = tongHoaDon;
	}
}
