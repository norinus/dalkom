package com.lab.core.repository;

import com.lab.core.domain.CommonCode;
import com.lab.core.domain.CommonCodeId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CommonCodeRepository extends JpaRepository<CommonCode, CommonCodeId>, JpaSpecificationExecutor<CommonCode> {
}