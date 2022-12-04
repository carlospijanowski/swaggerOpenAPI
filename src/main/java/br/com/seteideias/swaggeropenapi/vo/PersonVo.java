package br.com.seteideias.swaggeropenapi.vo;

import br.com.seteideias.swaggeropenapi.dto.PersonDto;
import lombok.Getter;

@Getter
public class PersonVo {
    private String id;
    private String name;

    public PersonVo(PersonDto personDto) {
        this.id = personDto.getId();
        this.name = personDto.getName();
    }


}
