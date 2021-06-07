package com.example.demo5;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProposalRepository extends JpaRepository<Proposal,Integer> {


List<Proposal> findByPlancodeContains(String plancode);
}
