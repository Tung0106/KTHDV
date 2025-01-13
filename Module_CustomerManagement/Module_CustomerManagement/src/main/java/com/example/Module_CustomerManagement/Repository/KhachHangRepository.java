package com.example.Module_CustomerManagement.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Module_CustomerManagement.entities.KhachHang;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang, String>{
	
	Optional<KhachHang> findByTenKhachHang(String tenkhachhang);
	
}
