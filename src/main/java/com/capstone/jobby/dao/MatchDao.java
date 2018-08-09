package com.capstone.jobby.dao;

import com.capstone.jobby.model.Match;
import java.util.List;

public interface MatchDao {
    List<Match> findAll();
    Match findById(Long id);
    List<Match> findByCandidateId(Long candidateId);
    List<Match> findByCandidateIdOrdered(Long candidateId);
    List<Match> findByJobIdOrdered(Long jobId);
    void save(Match match);
    void delete(Match match);
    void deleteByJobId(Long jobId);
}
