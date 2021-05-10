package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	
	public List<JobAdvertisement> getAll();
	public void add(JobAdvertisement advertisement);
	public void update(JobAdvertisement advertisement);
	public void delete(JobAdvertisement advertisement);
}
