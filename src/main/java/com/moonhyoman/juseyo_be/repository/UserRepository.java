package com.moonhyoman.juseyo_be.repository;

import com.moonhyoman.juseyo_be.domain.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Parent, String> {
}