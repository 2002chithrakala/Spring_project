package com.TNS.shopowner;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Shopownerservices {

	@Autowired
	private Shopownerservicesrepository repo;
	public List<Shopowner> listAll()
	{
		return repo.findAll();
	}
	public Shopowner get(Integer shop_id)
	{
		return repo.findById(shop_id).get();
	}
	public void delete(Integer shop_id)
	{
		repo.deleteById(shop_id);
	}
	public void save(Shopowner shpownr)
	{
		repo.save(shpownr);
	}
}
