package com.across.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.across.domain.Ranking;
import com.across.repository.RankingRepository;

@Service
public class RankingService {

	@Autowired
	RankingRepository repository;

	public List<Ranking> findAll() {

		return repository.findAll();
	}

}
