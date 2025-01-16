package com.example.belajarspring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import lombok.Data;

@Entity
@Table(name = "tb_users")
@Data

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	Column(nullable=false, length = 100)
    private String name;

	@Column(nullable=false, unique = true,)
    private String email;

	@Column(nullable=false)
    private String password;

	@Enumerated(EnumType.STRING)
	@Column(name="role", nullable=false)
    private String role;

	


}
