/*
 * package com.hospital.repository;
 * 
 * import java.util.List;
 * 
 * import org.springframework.data.jpa.repository.JpaRepository; import
 * org.springframework.data.jpa.repository.Query; import
 * org.springframework.data.repository.query.Param; import
 * org.springframework.stereotype.Repository;
 * 
 * import com.hospital.entity.StaffLogin;
 * 
 * @Repository public interface LoginRepository extends
 * JpaRepository<StaffLogin, Long>{
 * 
 * @Query(value =
 * "select * from TEST.STAFF_LOGIN WHERE STAFF_ID=:staffId AND password=:pazzwrd"
 * , nativeQuery = true) List<StaffLogin> findByStaffId(@Param("staffId") String
 * staffId,@Param("pazzwrd") String pazzwrd); }
 */