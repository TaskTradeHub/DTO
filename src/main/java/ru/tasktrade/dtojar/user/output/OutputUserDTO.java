package ru.tasktrade.dtojar.user.output;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OutputUserDTO {

    @NotNull
    private Long id;

    @Size(max = 50)
    @NotEmpty
    @Email
    private String email;

}
