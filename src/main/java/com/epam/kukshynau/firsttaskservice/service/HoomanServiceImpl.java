package com.epam.kukshynau.firsttaskservice.service;

import com.epam.kukshynau.firsttaskservice.entity.Hooman;
import com.epam.kukshynau.firsttaskservice.repository.HoomanRepository;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class HoomanServiceImpl  implements HoomanService{

    private final HoomanRepository repository;

    public HoomanServiceImpl(HoomanRepository repository) {
        this.repository = repository;
    }

    @Override
    public Hooman save(Hooman hooman) {
        String id = UUID.randomUUID().toString();
        hooman.setId(id);
        return repository.save(hooman);
    }

    @Override
    public Hooman getHoomanById(String id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("404"));
    }
}
