package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Contact;
import com.repository.ContactRepository;

@RestController
@RequestMapping("/person")
public class ContactMeController {

	
	@Autowired
	private ContactRepository contactRepo;
	
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody Contact getPersonInfo() {
		Contact p1 = contactRepo.findOne(1l);
		return p1;
	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public void createContact(@RequestBody Contact contact) {
		contactRepo.save(contact);
	}
	
}
