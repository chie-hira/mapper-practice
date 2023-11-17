package com.mapper.mapperpractice.controller;

import com.mapper.mapperpractice.Name;
import com.mapper.mapperpractice.NameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController {
    private final NameService nameService;

    public NameController(NameService nameService){
        this.nameService = nameService;
    }
    @GetMapping("/names")
    public List<Name> getName(){
        List<Name> names = nameService.getName();
        return names;
    }
}
