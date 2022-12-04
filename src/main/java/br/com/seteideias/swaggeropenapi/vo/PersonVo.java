package br.com.seteideias.swaggeropenapi.vo;

import br.com.seteideias.swaggeropenapi.dto.PersonDto;
import lombok.Getter;

import java.util.Objects;

@Getter
public class PersonVo {
    private String id;
    private String name;

    private String cpfCadastrado;

    public PersonVo(PersonDto personDto) {
        this.id = personDto.getId();
        this.name = personDto.getName();
        if (Objects.nonNull(personDto.getCpf())) {
            this.cpfCadastrado = "TEM CPF NO CADASTRO";
        } else {
            this.cpfCadastrado = "NÃO TEM CPF NO CADASTRO";
        }
    }
}
