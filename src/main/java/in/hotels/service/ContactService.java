package in.hotels.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.hotels.model.ContactMessage;
import in.hotels.repository.ContactRepository;

@Service
public class ContactService {
	@Autowired
    private ContactRepository contactRepository;

    // Save a new contact
    public ContactMessage saveContact(ContactMessage contact) {
        return contactRepository.save(contact);
    }

    // Get all contacts
    public List<ContactMessage> getAllContacts() {
        return contactRepository.findAll();
    }

    // Delete a contact by ID
    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }
}
