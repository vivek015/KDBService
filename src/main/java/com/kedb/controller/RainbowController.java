package com.kedb.controller;

import com.kedb.entity.Rainbow;
import com.kedb.service.RainbowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/rainbow")
public class RainbowController {
    @Autowired
    private RainbowService rainbowService;

    @GetMapping("/getAllRainbow")
    public List<Rainbow> getAllRainbow()
    {
        return rainbowService.getAllRainbow();
    }

    @GetMapping(value= "/findByName/{name}")
    public List<Rainbow> findByName(@PathVariable String name)
    {
        List<Rainbow> rainResponse = (List<Rainbow>) rainbowService.findByName(name);
        return rainResponse;
    }

    @PostMapping("/saveDetails")
    public Rainbow saveRainbow(@RequestBody Rainbow rainbow)
    {
        Rainbow raiResponse =rainbowService.save(rainbow);
        return raiResponse;
    }

    @GetMapping(value= "/findById/{id}")
    public Rainbow findById(@PathVariable int id)
    {

        Rainbow rainResponse = rainbowService.findById(id);
        return rainResponse;
    }
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Rainbow updateRainbow (@RequestBody Rainbow rainbow, @PathVariable int id)
    {
        Rainbow existRainbow = rainbowService.findById(id);
        if(existRainbow  == null)
        {
            throw new RuntimeException("Record not found");
        }
        Rainbow updateResponse =(Rainbow) rainbowService.update(rainbow);
        return updateResponse;
    }
}
