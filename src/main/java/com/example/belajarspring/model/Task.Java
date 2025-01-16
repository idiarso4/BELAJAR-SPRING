package com.example.belajarspring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_tasks")
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column(name="title", nullable=false)
    private String title;

   
	@Column(length=255)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name="prioritas", nullable=false)
    private Priority priority;
}
