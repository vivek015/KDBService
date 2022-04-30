package com.kedb.service;

import com.kedb.entity.Rainbow;
import com.kedb.controller.repository.RainbowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class RainbowServiceImpl implements RainbowService {
    @Autowired
    private RainbowRepository rainbowRepository;


    @Transactional
    public Rainbow save(Rainbow rainbow) {

        Rainbow raiResponse = rainbowRepository.save(rainbow);

        return raiResponse;
    }

    @Transactional
    public Rainbow update(Rainbow rainbow) {

        Rainbow updateResponse = rainbowRepository.save(rainbow);
        return updateResponse;
    }

    @Transactional
    public List<Rainbow> findByName(String name) {
        List<Rainbow> response = (List<Rainbow>)  rainbowRepository.findByName(name);

        return response;
    }

    @Override
    public List<Rainbow> getAllRainbow() {
        return rainbowRepository.findAll();
    }

    @Transactional
    public Rainbow findById(int id) {

        Rainbow rainResponse = rainbowRepository.findById(id);
        return rainResponse;
    }
}
