package com.lab.core.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CommonCodeId implements Serializable {

    private String commonCode;

    private String commonGroupCode;
}