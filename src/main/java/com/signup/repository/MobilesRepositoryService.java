package com.signup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.signup.model.MobilesModel;

@Repository
public interface MobilesRepositoryService extends JpaRepository<MobilesModel, Long> {

}
