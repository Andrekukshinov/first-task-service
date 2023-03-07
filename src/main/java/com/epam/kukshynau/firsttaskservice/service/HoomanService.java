package com.epam.kukshynau.firsttaskservice.service;

import com.epam.kukshynau.firsttaskservice.entity.Hooman;

public interface HoomanService {
    Hooman save(Hooman hooman);

    Hooman getHoomanById(String id);
}
