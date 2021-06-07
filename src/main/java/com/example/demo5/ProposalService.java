package com.example.demo5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProposalService {
    @Autowired
private ProposalRepository repository;

public Proposal saveProposal(Proposal proposal){
    return repository.save(proposal);
}

public List<Proposal> saveProposals(List<Proposal> proposals){
    return repository.saveAll(proposals);
}

public List<Proposal> getProposals(){
    return repository.findAll();
}

public Proposal getProposalId(int id){
    return repository.findById(id).orElse(null);
}

    public List<Proposal> getLikePlanCode(String plancode){
        return repository.findByPlancodeContains(plancode);
    }

public String deleteProposalId (int id){
    repository.deleteById(id);
    return "id " + id +" Has removed";
}

public Proposal updateProposal (Proposal proposal){
    Proposal itemProposal;
    itemProposal = repository.findById(proposal.getId()).orElse(null);
    itemProposal.setProposaldate(proposal.getProposaldate());
    itemProposal.setFaceamount(proposal.getFaceamount());
    itemProposal.setAge(proposal.getAge());
    itemProposal.setPlancode(proposal.getPlancode());
    return repository.save(itemProposal);
}

}
