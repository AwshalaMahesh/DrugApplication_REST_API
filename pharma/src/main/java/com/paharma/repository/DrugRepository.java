package com.paharma.repository;

import com.paharma.entity.Drug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrugRepository extends JpaRepository<Drug, Integer> {

    List<Object> findById(Long id);

}
