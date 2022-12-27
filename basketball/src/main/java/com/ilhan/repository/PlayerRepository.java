package com.ilhan.repository;

import com.ilhan.entity.Player;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends Neo4jRepository<Player,Long> {
    List<Player> findByName(String name);
}
