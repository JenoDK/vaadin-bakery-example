package com.genohm.jeno.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.genohm.jeno.backend.data.entity.HistoryItem;

public interface HistoryItemRepository extends JpaRepository<HistoryItem, Long> {
}
