package com.across.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.across.domain.Ranking;

@Repository
public interface RankingRepository extends JpaRepository<Ranking, Integer> {

}
