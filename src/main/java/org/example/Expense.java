package org.example;

import lombok.*;

@AllArgsConstructor
@Getter
public class Expense {
    private String type;
    private String description;
    private Double value;
    private Integer month;


}
