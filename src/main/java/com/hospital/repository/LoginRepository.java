package com.hospital.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hospital.entity.Staff;

@Repository
public interface LoginRepository extends JpaRepository<Staff, Long> {

	@Query(value = "select * from STAFF WHERE USERNAME=:userName AND password=:pazzwrd" , nativeQuery = true )
	Staff findByStaffId(@Param("userName") String userName, @Param("pazzwrd") String pazzwrd);
}
