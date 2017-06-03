package com.cd.bot.model.domain.repository;

import com.cd.bot.model.domain.bot.LifecycleEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Date;

/**
 * Created by Cory on 6/2/2017.
 */
@Repository
public interface LifecycleEventRepository extends JpaRepository<LifecycleEvent, Long> {
    @Modifying
    @Transactional
    @Query("delete from LifecycleEvent le where le.timeExecuted < ?1")
    void deleteOlderThan(Date timeExecuted);

    LifecycleEvent findByOrderByTimeExecutedDesc();
}