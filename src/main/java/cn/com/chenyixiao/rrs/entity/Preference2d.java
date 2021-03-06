package cn.com.chenyixiao.rrs.entity;
// Generated 2016-4-6 18:18:32 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Preference2d generated by hbm2java
 */
@Entity
@Table(name = "preference2d", catalog = "rrs")
public class Preference2d implements java.io.Serializable {

	private long id;
	private Long restaurantId;
	private Long userId;
	private Double score;

	public Preference2d() {
	}

	public Preference2d(long id) {
		this.id = id;
	}

	public Preference2d(long id, Long restaurantId, Long userId, Double score) {
		this.id = id;
		this.restaurantId = restaurantId;
		this.userId = userId;
		this.score = score;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "restaurant_id")
	public Long getRestaurantId() {
		return this.restaurantId;
	}

	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}

	@Column(name = "user_id")
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "score", precision = 22, scale = 0)
	public Double getScore() {
		return this.score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

}
