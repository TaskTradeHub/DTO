package ru.tasktrade.dtojar.project.output;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;
import ru.tasktrade.dtojar.user.output.OutputUserDTO;

import java.time.LocalDateTime;

@Data
@Builder
public class OutputProjectDTO {

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

    @Size(max = 10)
    @NotEmpty
    private String status;

    @NotNull
    @Min(0)
    private Integer timeframe;

    @NotNull
    private LocalDateTime creationDate;

    @NotNull
    private LocalDateTime startedDate;

    @NotNull
    private LocalDateTime endDate;

    @NotNull
    private OutputUserDTO customer;

    @NotNull
    private OutputUserDTO producer;

}
