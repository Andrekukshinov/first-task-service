package com.epam.kukshynau.firsttaskservice.controller;

import com.epam.kukshynau.firsttaskservice.entity.Hooman;
import com.epam.kukshynau.firsttaskservice.service.HoomanService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/hoomen")
public class HoomanController {
    private final HoomanService service;

    public HoomanController(HoomanService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Hooman getHoomanById(@PathVariable String id) {
        return service.getHoomanById(id);
    }

    @PostMapping
    public Hooman save(Hooman hooman) {
        return service.save(hooman);
    }
}
