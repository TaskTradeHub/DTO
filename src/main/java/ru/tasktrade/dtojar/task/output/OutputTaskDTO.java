package ru.tasktrade.dtojar.task.output;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;
import ru.tasktrade.dtojar.project.output.OutputProjectDTO;

@Data
@Builder
public class OutputTaskDTO {
    @Size(max = 100)
    @NotEmpty
    private String name;
    @Size(max = 300)
    @NotEmpty
    private String description;
    @Size(max = 10)
    @NotEmpty
    private String status;

    private OutputProjectDTO project;
}
