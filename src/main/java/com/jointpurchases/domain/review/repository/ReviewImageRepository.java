package com.jointpurchases.domain.review.repository;

import com.jointpurchases.domain.review.model.entity.ReviewImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewImageRepository extends JpaRepository<ReviewImageEntity, Integer> {

    List<ReviewImageEntity> getAllByReviewId(int id);

    void deleteById(int id);
}
