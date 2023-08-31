package com.bookstack.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstack.model.Review;

@Repository
public interface ReviewDao extends JpaRepository<Review, Long> {
    Review save(Review review);

	Optional<Review> findByBookId(int bookId);

	List<Review> findByBook_Id(int bookId);
}
