package com.devsuperior.demo.repositories;

import com.devsuperior.demo.entities.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    @Query("SELECT obj FROM Event obj "
            + "WHERE UPPER(obj.name) LIKE UPPER(CONCAT('%', :name, '%')) ")
    Page<Event> searchByName(String name, Pageable pageable);
}
