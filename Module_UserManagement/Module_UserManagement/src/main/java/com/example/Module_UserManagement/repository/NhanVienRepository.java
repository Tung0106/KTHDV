package com.example.Module_UserManagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Module_UserManagement.entities.NhanVien;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, Integer> {

//	@Query("SELECT nv FROM NhanVien nv WHERE nv.TaiKhoan = :taikhoan AND nv.MatKhau = :matkhau")
//	NhanVien login(@Param("taikhoan") String taikhoan, @Param("matkhau") String matkhau);
//
//	@Query("SELECT nv FROM NhanVien nv WHERE nv.TaiKhoan = :taikhoan")
//	NhanVien checkExistAccount(@Param("taikhoan") String taikhoan);
	
	Optional<NhanVien> findByTaiKhoan(String taikhoan);
	Optional<NhanVien> findByTaiKhoanAndMatKhau(String taikhoan, String matkhau);
}
