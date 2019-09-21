package com.example.demo.controller;

import com.example.demo.domain.Data;
import com.example.demo.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/data")
public class DataController {
    @Autowired
    private DataRepository dataRepository;

    @PostConstruct
    public void setUp() {
        this.dataRepository.save(
                Data.builder()
                        .id(1)
                        .str("1")
                        .firstIndex(1)
                        .secondIndex(1)
                        .build()
        );
    }

    @PostMapping
    public Data create(@RequestBody Data data) {
        return this.dataRepository.save(data);
    }

    @PutMapping("/{id}")
    public Data update(@PathVariable long id, @RequestBody Data data) {
        Data result = null;

        if(this.dataRepository.existsById(id)) {
            result = this.dataRepository.save(data);
        }

        return result;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        this.dataRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Data read(@PathVariable long id) {
        return this.dataRepository.findById(id).orElse(null);
    }
}
