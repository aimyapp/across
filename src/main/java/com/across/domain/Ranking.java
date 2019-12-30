package com.across.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Ranking {

	/** 自動採番ID */
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/** 機種名 */
	private String name;

	/** ポイント */
	private Integer point;


}
