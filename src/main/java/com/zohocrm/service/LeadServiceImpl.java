package com.zohocrm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.zohocrm.entity.Lead;
import com.zohocrm.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {

	private final LeadRepository leadRepo;
	
	
	public LeadServiceImpl(LeadRepository leadRepo) {
		this.leadRepo = leadRepo;
	}


	@Override
	public void saveOneLead(Lead lead) {
		leadRepo.save(lead);
	}


	@Override
	public Lead findLeadById(long id) {

		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}


	@Override
	public void deleteById(long id) {
		leadRepo.deleteById(id);
	}


	@Override
	public List<Lead> findAllLeads() {
		List<Lead> findAll = leadRepo.findAll();
		return findAll;
	}

}
