package tk.yanuks.veterinaria.backend.services;

import java.util.List;

import tk.yanuks.veterinaria.backend.modal.Usuarios;

public interface UsuarioServices {
	
	Usuarios crearUsuario(Usuarios usuario);
	List<Usuarios> mostrarUsuarios();
	void eliminarUsuario(int id);
}
