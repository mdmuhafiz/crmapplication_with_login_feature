package com.crmapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.crmapp.entity.Lead;
import com.crmapp.repository.LeadRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class LeadRepositoryTest {
	@Autowired
	private LeadRepository leadRepo;
	@Test
	public void saveLeadData() {
		Lead l = new Lead("Sam","S","radio","sam@gmail.com","sangareddy","9010976316");
		leadRepo.save(l);
	}

}
