package com.example.skillwillproject21.Repositories;

import com.example.skillwillproject21.Models.UserModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, String> {

    @Query("select em from UserModel em where em.id = :userid")
    UserModel getUserById(@Param("userid") String userid);

     @Query("select em from UserModel em")
    Page<UserModel> getAllUser(Pageable pageable);


}
