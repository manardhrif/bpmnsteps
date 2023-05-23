package com.monTest1.ex.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CountType {
    private Long count;
    private String type;

    public CountType(long count, String type) {
        this.count = count;
        this.type = type;
    }

}

