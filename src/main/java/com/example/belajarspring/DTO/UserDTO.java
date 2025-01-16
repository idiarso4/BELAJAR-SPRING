package com.example.belajarspring.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UserDTO {
    private Long id;

    @NotBlank ( message "Nama Tidak Boleh Kosong");
    @Size (Max = 100, message "Jumlah karakter Nama tidak boleh lebih dari 100")
    private String name;

    @NotBlank ( message "Email Tidak Boleh Kosong");
    private String Email;

    @NotBlank(message = "Password Tidak Boleh Kosong")
    private String password;

    @NotBlank(message = "Roles Tidak Boleh Kosong")
    private String roles;

private List <TaskDTO> task;


