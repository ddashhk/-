package com.uniplan.repo;

import com.uniplan.model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TasksRepo extends JpaRepository<Tasks, Long> {
    List<Tasks> findAllByOrderByName();

    List<Tasks> findAllByOrderByIdDesc();
}
