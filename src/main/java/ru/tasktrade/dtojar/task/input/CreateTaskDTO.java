package ru.tasktrade.dtojar.task.input;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateTaskDTO {
    @Size(max = 100)
    @NotEmpty
    private String name;
    @Size(max = 300)
    @NotEmpty
    private String description;
}
