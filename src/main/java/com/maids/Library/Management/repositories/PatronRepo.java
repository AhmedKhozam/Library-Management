package com.maids.Library.Management.repositories;

import com.maids.Library.Management.entites.PatronEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatronRepo extends JpaRepository<PatronEntity,Long> {
}
