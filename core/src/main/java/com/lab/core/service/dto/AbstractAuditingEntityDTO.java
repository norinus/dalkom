package com.lab.core.service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link com.lab.core.domain.AbstractAuditingEntity}
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class AbstractAuditingEntityDTO implements Serializable {

    @NotNull
    @Schema(description = "생성자")
    String createdBy;

    @NotNull
    @Schema(description = "생성자")
    Instant createdDate;

    @NotNull
    @Schema(description = "수정자")
    String LastModifiedBy;

    @NotNull
    @Schema(description = "수정일")
    Instant lastModifiedDate;
}