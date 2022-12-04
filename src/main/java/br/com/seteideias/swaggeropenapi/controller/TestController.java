package br.com.seteideias.swaggeropenapi.controller;

import br.com.seteideias.swaggeropenapi.dto.PersonDto;
import br.com.seteideias.swaggeropenapi.vo.PersonVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController("")
public class TestController {

    @GetMapping("/person")
    public PersonVo personDto (){
        var p = new PersonDto();
        p.setId(UUID.randomUUID().toString());
        p.setName("Carlos");
        p.setCpf("214576278-76");

        PersonVo personVo = new PersonVo(p);

        return personVo;
    }

}
