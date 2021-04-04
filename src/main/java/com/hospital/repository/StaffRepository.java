package com.hospital.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.hospital.entity.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, String> {

	public Optional<Staff> findById(@Param("username") String username);
}
