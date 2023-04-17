package com.TNS.shopowner;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Shopownercontroller {

	@Autowired
	private  Shopownerservices sos;
	@GetMapping(("\shop_owner_services"))
	public List<Shopowner> list()
	{
		return sos.listAll();
	}
	@GetMapping("\shop_owner_services/(shop_id)")
	public ResponseEntity<Shopowner> get (@PathVariable Integer shop_id)

	{
		try
		{
			@SuppressWarnings("unused")
			Shopowner sh=sos.get(shop_id);
			return new ResponseEntity<Shopowner>(HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<Shopowner>(HttpStatus.NOT_FOUND);
			
		}
	}
	@PostMapping("/shop_owner_services")
	public void add (@RequestBody Shopowner shpownr)
	{
		sos.save(shpownr);
	}
	@PutMapping("/shop_owner_services/(shop_id)")
	public ResponseEntity<?> update(@RequestBody Shopowner shpownr,@PathVariable Integer shop_id)
	{
	    @SuppressWarnings("unused")
		Shopowner exist_shop_owner=sos.get(shop_id);
		sos.save(shpownr);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@DeleteMapping("/shop_owner_services/(shop_id)")
	public void delete (@PathVariable Integer shop_id)
	{
		sos.delete(shop_id);
	}

}


