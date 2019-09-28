package com.devtwins.landingpage.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devtwins.landingpage.model.Membro;
import com.devtwins.landingpage.repository.MembroRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class MembroService {

	@Autowired
	private MembroRepository repo;

	public Membro buscar(Long id) throws ObjectNotFoundException {
		Optional<Membro> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objecto não encontrado! Id: " + id + ", tipe: "+ Membro.class.getName()));
	}

	public List<Membro> listar(){
		List<Membro> lista = repo.findAll();
		return lista;
	}

	public Membro salvar(Membro membro) {
		membro = repo.save(membro);
		return membro;
	}

	public Membro editar(Membro membro) {
		membro = repo.save(membro);
		return membro;
	}

}
