package com.example.skillwillproject21.Repositories;

import com.example.skillwillproject21.Models.UserCarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCarRepository extends JpaRepository<UserCarModel, String> {



}
