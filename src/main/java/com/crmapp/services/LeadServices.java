package com.crmapp.services;

import java.util.List;



import com.crmapp.entity.Lead;

public interface LeadServices {
	public void saveLead(Lead lead);

	public List<Lead> listallleads();

	public void deleteLeadById(long id);

	public Lead updateLeadById(long id);

}
