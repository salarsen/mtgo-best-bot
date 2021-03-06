package com.cd.bot.model.domain.repository;

import com.cd.bot.model.domain.PlayerBot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Cory on 5/15/2017.
 */
@Repository
public interface PlayerBotRepository extends JpaRepository<PlayerBot, Long> {
    PlayerBot findByName(String name);
}
