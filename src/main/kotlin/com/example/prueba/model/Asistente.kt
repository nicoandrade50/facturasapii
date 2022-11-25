package com.example.prueba.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotBlank

@Entity
@Table(name="asistente")
class Asistente {
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id
        @Column(updatable = false)

        var id:Long? = null
    @NotBlank(message="Obligatorio")
    var nui: String? = null
    @NotBlank(message="Obligatorio")
    var nombre: String? = null
    @NotBlank(message="Obligatorio")
    var correo: String? = null
    @NotBlank(message="Obligatorio")
    var institucion: String? = null
    @NotBlank(message="Obligatorio")
    var posicion: String? = null
}

