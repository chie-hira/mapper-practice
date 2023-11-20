package com.mapper.mapperpractice.controller;

import com.mapper.mapperpractice.entity.Name;
import com.mapper.mapperpractice.service.NameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController {
    private final NameService nameService;

    public NameController(NameService nameService) {
        this.nameService = nameService;
    }

    @GetMapping("/names")
    public List<Name> getNames() {
        List<Name> names = nameService.getNames();
        return names;
    }

    @GetMapping("/names/{id}")
    public NameShowResponse getName(@PathVariable Integer id) {
        return nameService.getName(id);
    }
}
