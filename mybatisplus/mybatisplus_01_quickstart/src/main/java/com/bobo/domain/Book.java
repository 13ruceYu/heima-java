package com.bobo.domain;

import lombok.*;

// @Setter
// @Getter
// @ToString
// @EqualsAndHashCode
// @AllArgsConstructor
// @NoArgsConstructor
@Data
public class Book {
    private Integer id;
    private String name;
    private String type;
    private String description;
}
