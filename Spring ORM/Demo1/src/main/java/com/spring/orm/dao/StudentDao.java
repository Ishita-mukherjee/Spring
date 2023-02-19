package com.spring.orm.dao;
import com.spring.orm.entity.*;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(StudentEntity student)
	{
		Integer i =(Integer)this.hibernateTemplate.save(student);
		return i;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
