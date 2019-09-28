package com.devtwins.landingpage.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devtwins.landingpage.model.Membro;
import com.devtwins.landingpage.services.MembroService;

import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value = "/membros")
public class MembroResource {

	@Autowired
	private MembroService service;

	@RequestMapping(value = "/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Long id){
		Membro obj = null;
		try {
			obj = service.buscar(id);
		} catch (ObjectNotFoundException e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(value = "/listar", method=RequestMethod.GET)
	public ResponseEntity<?> listar(){
		List<Membro> membros = service.listar();
		return ResponseEntity.ok().body(membros);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> salvar(@RequestBody Membro membro){
		membro = service.salvar(membro);
		return ResponseEntity.ok().body(membro);
	}

	@RequestMapping(method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> editar(@RequestBody Membro membro){
		membro = service.editar(membro);
		return ResponseEntity.ok().body(membro);
	}

}
