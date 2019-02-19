package com.multicampus.contactsapp.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.multicampus.contactsapp.domain.Contact;

@RepositoryRestResource
public interface ContactRepository extends PagingAndSortingRepository<Contact, Integer> {

}
