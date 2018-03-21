package tk.yanuks.veterinaria.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tk.yanuks.veterinaria.backend.modal.Usuarios;
import tk.yanuks.veterinaria.backend.repository.UsuarioRepository;

@Service
public class UsuarioServicesImpl implements UsuarioServices{

	@Autowired
	protected UsuarioRepository repository;
	
	@Override
	public Usuarios crearUsuario(Usuarios usuario) {
		return this.repository.save(usuario);
	}

	@Override
	public List<Usuarios> mostrarUsuarios() {
		return this.repository.findAll();
	}

	@Override
	public void eliminarUsuario(int id) {
		
		this.repository.deleteById((long) id);
		
	}

}
