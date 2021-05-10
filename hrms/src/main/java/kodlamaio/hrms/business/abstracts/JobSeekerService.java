package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {

	public List<JobSeeker> getAll();
	public void register(JobSeeker jobSeeker);
}
