package in.hotels.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.hotels.model.ContactMessage;
import in.hotels.service.ContactService;

@RestController
@RequestMapping("/contacts")
@CrossOrigin(origins = {
	    "http://localhost:4200",
	    "https://fionastudiointerior.netlify.app"
	})
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping
    public ContactMessage saveContact(@RequestBody ContactMessage contact) {
        return contactService.saveContact(contact);
    }

    @GetMapping
    public List<ContactMessage> getAllContacts() {
        return contactService.getAllContacts();
    }

    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable Long id) {
        contactService.deleteContact(id);
    }
}
