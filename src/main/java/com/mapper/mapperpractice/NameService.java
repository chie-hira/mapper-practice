package com.mapper.mapperpractice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameService {
    private  final NameMapper nameMapper;

    public NameService(NameMapper nameMapper){
        this.nameMapper = nameMapper;
    }
    public List<Name> getName(){
          List<Name> names = nameMapper.findAll();
          return names;
    }

}
