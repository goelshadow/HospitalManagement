package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hospital.entity.DoctorTimeDuration;

@Repository
public interface FillDoctorTimeSlotsRepository extends JpaRepository<DoctorTimeDuration, Long> {

}
