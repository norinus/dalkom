package com.lab.core.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link com.lab.core.domain.CommonGroupCode}
 */
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommonGroupCodeDTO extends AbstractAuditingEntityDTO implements Serializable {

    @NotNull
    @Schema(description = "공통그룹코드")
    String commonGroupCode;

    @NotNull
    @Schema(description = "공통그룹코드명")
    String commonGroupCodeName;

    List<CommonCodeDTO> commonCodes;
}