package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Document;
import com.inti.service.interfaces.IDocumentService;

@CrossOrigin("*")
@RestController
public class DocumentController {
	@Autowired
	IDocumentService documentService;

	@RequestMapping(value = "documents", method = RequestMethod.GET)
	public List<Document> findAll() {
		return documentService.findAll(Document.class);
	}

	@RequestMapping(value = "documents/{idDocument}", method = RequestMethod.GET)
	public Document findOne(@PathVariable("idDocument") Long idDocument) {
		return documentService.findOne(Document.class, idDocument);
	}

	@RequestMapping(value = "documents", method = RequestMethod.POST)
	public void saveDocument(@RequestBody Document document) {
		documentService.save(document);
	}

	@RequestMapping(value = "documents/{idDocument}", method = RequestMethod.DELETE)
	public void deleteDocument(@PathVariable("idDocument") Long idDocument) {
		Document d= documentService.findOne(Document.class, idDocument);
		documentService.remove(d);
	}

	@RequestMapping(value = "document/{idDocument}", method = RequestMethod.PUT)
	public void updateDocument(@PathVariable("idDocument") Long idDocument, @RequestBody Document document) {
		Document currentDocument = documentService.findOne(Document.class, idDocument);
		currentDocument.setNomDocument(document.getNomDocument());
		currentDocument.setDateCreation(document.getDateCreation());
		currentDocument.setDescriptionDocument(document.getDescriptionDocument());
		currentDocument.setAffaire(document.getAffaire());
		documentService.update(currentDocument);
	}

}