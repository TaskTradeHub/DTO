package ru.tasktrade.dtojar.project.input;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateProjectDTO {

    @Size(max = 100)
    @NotEmpty
    private String name;

    @Size(max = 300)
    @NotEmpty
    private String description;

    @Size(max = 100)
    @NotEmpty
    private String category;

    @NotNull
    @Min(0)
    private Double budget;

    @NotNull
    @Min(0)
    private Integer timeframe;

}
