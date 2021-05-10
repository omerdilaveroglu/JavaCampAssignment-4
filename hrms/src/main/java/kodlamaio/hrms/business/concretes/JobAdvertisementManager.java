package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {
	
	JobAdvertisementDao jobAdvertisementDao;

	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public List<JobAdvertisement> getAll() {
		return this.jobAdvertisementDao.findAll();
	}

	@Override
	public void add(JobAdvertisement advertisement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(JobAdvertisement advertisement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(JobAdvertisement advertisement) {
		// TODO Auto-generated method stub
		
	}
}
