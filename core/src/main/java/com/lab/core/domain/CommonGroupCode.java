package com.lab.core.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "tbl_common_group_code")
public class CommonGroupCode extends AbstractAuditingEntity implements Serializable {

    @Id
    @Size(max = 120)
    @Column(name = "common_group_code", nullable = false, length = 120)
    private String commonGroupCode;

    @Size(max = 120)
    @NotNull
    @Column(name = "common_group_code_name", nullable = false, length = 120)
    private String commonGroupCodeName;

    @NotNull
    @ColumnDefault("1")
    @Column(name = "is_used", nullable = false, columnDefinition = "TINYINT(1) DEFAULT 1")
    private Boolean isUsed = true;

    @OneToMany(mappedBy = "commonGroupCode")
    private List<CommonCode> commonCodes;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "commonGroupCode = " + commonGroupCode + ")";
    }
}
