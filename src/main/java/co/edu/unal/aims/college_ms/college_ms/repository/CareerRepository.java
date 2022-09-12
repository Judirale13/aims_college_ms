package co.edu.unal.aims.college_ms.college_ms.repository;

import co.edu.unal.aims.college_ms.college_ms.model.college.Careers;
import co.edu.unal.aims.college_ms.college_ms.model.college.Departments;
import co.edu.unal.aims.college_ms.college_ms.model.college.Faculties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CareerRepository extends JpaRepository<Careers ,Integer> {
    List<Careers> findByName(String name);
}
