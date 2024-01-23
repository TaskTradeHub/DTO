package ru.tasktrade.dtojar.project.change;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ChangeProjectDTO {

    @Size(max = 100)
    private String name;

    @Size(max = 300)
    private String description;

    @Size(max = 100)
    private String category;

    @Min(0)
    private Double budget;

    @Min(0)
    private Integer timeframe;

    private LocalDateTime endDate;

}
