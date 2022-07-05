package com.jonatanmorisson.devtest.CRUDService.repository;

import com.jonatanmorisson.devtest.CRUDService.entity.Details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsRepository extends JpaRepository<Details, Long> {
    Details findByName(String name);
}
