package com.cd.bot.model.domain.repository;

import com.cd.bot.model.domain.PlayerBot;
import com.cd.bot.model.domain.bot.LifecycleEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Cory on 6/2/2017.
 */
@Repository
public interface LifecycleEventRepository extends JpaRepository<LifecycleEvent, Long> {
    LifecycleEvent findByOrderByTimeRequestedDesc();

    List<LifecycleEvent> findByPlayerBotAndLifecycleEventOutcomeIsNullAndAutomaticFalse(PlayerBot playerBot);
}
