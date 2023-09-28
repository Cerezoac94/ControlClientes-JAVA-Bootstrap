package com.midominio.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import java.io.Serializable;
import lombok.Data;

@Entity
@Data
@Table(name="rol")
public class Rol implements Serializable {
  private static final long serialVersionUID = 1L;
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idRol;
  
  @NotEmpty
  private String nombre;
  
}
