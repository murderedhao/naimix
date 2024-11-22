package com.thesol.taro.models;

import lombok.Getter;
import lombok.Setter;

import java.time.Period;

@Setter
@Getter
public class CompatibilityDto {
    private Period ageDifference;
    private double score;

    private CompatibilityDto() {}

    public static CompatibilityDto makeCompatibilityDto() {
        CompatibilityDto compatibilityDto = new CompatibilityDto();

        return compatibilityDto;
    }


}
