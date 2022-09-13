package br.com.seteideias.swaggeropenapi.controller;

import br.com.seteideias.swaggeropenapi.dto.personDto.java.PersonDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public PersonDto personDto (){
        var p = new PersonDto();
        p.setName("Carlos");
        return p;
    }

}
