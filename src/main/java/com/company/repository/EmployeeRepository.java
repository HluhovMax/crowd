package com.company.repository;

import com.company.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by 38066 on 14.02.2019.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("from Employee e " +
            "where " +
            "   concat(e.lastName, ' ', e.patronymic, ' ', e.firstName) like concat('%', :name, '%')")
    List<Employee> findByName(@Param("name") String name);
}
