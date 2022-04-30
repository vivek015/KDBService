package com.kedb.controller.repository;

import com.kedb.entity.Rainbow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface RainbowRepository extends JpaRepository<Rainbow, Serializable> {
    public List<Rainbow> findByName(String name);
    public Rainbow findById(int id);

}
