package com.example.belajarspring.DTO;

public class TaskDTO {

@javax.validation.constraints.NotNull(message = "ID tidak boleh kosong")
private Long id;

@javax.validation.constraints.NotBlank(message = "Judul tidak boleh kosong")
@javax.validation.constraints.Size(max = 255, message = "Panjang judul tidak boleh lebih dari 255 karakter")
private String title;

@javax.validation.constraints.NotBlank(message = "Deskripsi tidak boleh kosong")
@javax.validation.constraints.Size(max = 500, message = "Panjang deskripsi tidak boleh lebih dari 500 karakter")
private String description;

@javax.validation.constraints.NotBlank(message = "Prioritas tidak boleh kosong")
@javax.validation.constraints.Size(max = 10, message = "Panjang prioritas tidak boleh lebih dari 10 karakter")
private String Priority;

@javax.validation.constraints.NotNull(message = "User tidak boleh kosong")
private USerDTO user;




}