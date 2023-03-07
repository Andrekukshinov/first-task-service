package com.epam.kukshynau.firsttaskservice.repository;

import com.epam.kukshynau.firsttaskservice.entity.Hooman;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoomanRepository extends CrudRepository<Hooman, String> {
}
