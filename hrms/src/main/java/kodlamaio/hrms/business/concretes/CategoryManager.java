package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CategoryService;
import kodlamaio.hrms.dataAccess.abstracts.CategoryDao;
import kodlamaio.hrms.entities.concretes.Category;

@Service
public class CategoryManager implements CategoryService {

	CategoryDao categoryDao;

	@Autowired
	public CategoryManager(CategoryDao categoryDao) {
		super();
		this.categoryDao = categoryDao;
	}

	@Override
	public List<Category> getAll() {
		return this.categoryDao.findAll();
	}
	
	
	
}
