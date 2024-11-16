package com.lab.core.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@Entity
@ToString
@Table(name = "tbl_common_code")
public class CommonCode extends AbstractAuditingEntity implements Serializable {

    @EmbeddedId
    private CommonCodeId id;

    @Column(name = "common_code_name", length = 120, nullable = false)
    private String commonCodeName;

    @Column(name = "is_used", nullable = false, columnDefinition = "TINYINT(1) DEFAULT 1")
    private boolean isUsed;

}