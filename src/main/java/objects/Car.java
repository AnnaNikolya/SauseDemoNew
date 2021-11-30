package tests;

import lombok.*;

import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Car {
    private String make;
    private String model;
    private int speed;
    private int doors;
}
