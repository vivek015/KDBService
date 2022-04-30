package com.kedb.service;

import com.kedb.entity.Rainbow;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RainbowService {
    public Rainbow save(Rainbow rainbow);
    public Rainbow update(Rainbow rainbow);
    public List<Rainbow> findByName(String name);
    public List<Rainbow> getAllRainbow();
    public Rainbow findById(int id);
}
