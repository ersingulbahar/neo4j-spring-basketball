package com.ilhan.repository;

import com.ilhan.entity.Coach;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoachRepository extends Neo4jRepository<Coach, Long> {
}
