package com.easy4lazy.proj.repository;

import com.easy4lazy.proj.model.Vote;
import org.springframework.data.repository.CrudRepository;

public interface VoteRepository extends CrudRepository<Vote, Integer> {
    Integer countAllByVoteTypeIdAndContentId(Integer voteType, Integer contentId);
}
