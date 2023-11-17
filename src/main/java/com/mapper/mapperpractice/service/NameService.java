package com.mapper.mapperpractice.service;

import com.mapper.mapperpractice.entity.Name;
import com.mapper.mapperpractice.mapper.NameMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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

    @SpringBootApplication
    public static class MapperPracticeApplication {

        public static void main(String[] args) {
            SpringApplication.run(MapperPracticeApplication.class, args);
        }

    }
}