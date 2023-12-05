package com.cybersoft.cozastore22.repository;

import com.cybersoft.cozastore22.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service
public interface CategoryRepository extends JpaRepository<CategoryEntity,Integer> {
}
