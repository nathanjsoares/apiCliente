package com.devsuperio.apiCliente.dto;

import com.devsuperio.apiCliente.entities.Client;
import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;
    @Size(min = 1, message = "Nome não pode ser vazio")
    @NotBlank(message = "Campo requerido")
    private String name;
    @Size(min = 11, max = 11, message = "O CPF precisa ter 11 caracteres")
    @NotBlank(message = "Campo requerido")
    private String cpf;
    @Positive(message = "O income deve ser positivo")
    private Double income;
    @PastOrPresent(message = "A data deve ser menor ou igual à data atual")
    private LocalDate birthDate;
    private Integer children;

    public ClientDTO(){
    }

    public ClientDTO(@Nonnull Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
