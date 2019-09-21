package com.example.demo.repository;

import com.example.demo.domain.Data;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataRepository extends CrudRepository<Data, Long> {
    List<Data> findByFirstIndex(long firstIndex);
    List<Data> findBySecondIndex(long secondIndex);
}
