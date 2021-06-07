package com.example.demo5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProposalController {
    @Autowired
    private ProposalService proposalService;

    @PostMapping("/addproposal")
    public  Proposal addProposal(@RequestBody Proposal proposal){
        return proposalService.saveProposal(proposal);
    }

    @PostMapping("/addproposals")
    public List<Proposal> addProposals(@RequestBody List<Proposal> proposals){
        return proposalService.saveProposals(proposals);
    }

    @GetMapping("/proposal")
    public List<Proposal> findProposals(){
        return proposalService.getProposals();
    }

    @GetMapping("/proposalid/{id}")
    public Proposal findProposalId (@PathVariable int id){
        return proposalService.getProposalId(id);
    }

    @GetMapping("/proposalplan/{plancode}")
    public List<Proposal> findLikePlanCode(@PathVariable String plancode){
        return proposalService.getLikePlanCode(plancode);
    }

    @DeleteMapping("/deleteid/{id}")
    public String deleteProposalId (@PathVariable int id){
        return proposalService.deleteProposalId(id);
    }

    @PutMapping("/update")
    public Proposal updateProposal(@RequestBody Proposal proposal){
        return proposalService.updateProposal(proposal);
    }
}
