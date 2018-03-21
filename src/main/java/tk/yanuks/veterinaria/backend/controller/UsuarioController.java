package tk.yanuks.veterinaria.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.yanuks.veterinaria.backend.modal.Usuarios;
import tk.yanuks.veterinaria.backend.services.UsuarioServices;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	protected UsuarioServices services;
	
	@PostMapping
	public Usuarios crearUsuario(@RequestBody Usuarios usuario) {
		return this.services.crearUsuario(usuario);
	}
	
	@GetMapping
	public List<Usuarios> mostrarUsuarios(){
		return this.services.mostrarUsuarios();
	}
	
	@GetMapping("/sayHello")
	public String sayHello(){
		return "hola desde spring";
	}

}
