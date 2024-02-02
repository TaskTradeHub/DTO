package ru.tasktrade.dtojar.task.change;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ChangeTaskDTO {
    @Size(max = 100)
    @NotEmpty
    private String name;
    @Size(max = 300)
    @NotEmpty
    private String description;
}
