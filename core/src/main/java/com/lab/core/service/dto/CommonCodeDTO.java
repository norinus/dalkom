package com.lab.core.service.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lab.core.domain.CommonCodeId;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


/**
 * DTO for {@link com.lab.core.domain.CommonCode}
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommonCodeDTO extends AbstractAuditingEntityDTO implements Serializable {

    @NotNull
    @Schema(description = "공통코드아이디")
    CommonCodeId id;

    @NotNull
    @Schema(description = "공통코드명")
    String commonCodeName;

    @NotNull
    @Schema(description = "사용유무")
    Boolean isUsed;
}