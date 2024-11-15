package com.thesol.taro.repository;

import com.thesol.taro.models.users.HR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HRRepository extends JpaRepository<HR, Long> {
}
