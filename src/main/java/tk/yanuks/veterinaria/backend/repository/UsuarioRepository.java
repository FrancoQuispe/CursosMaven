package tk.yanuks.veterinaria.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tk.yanuks.veterinaria.backend.modal.Usuarios;

public interface UsuarioRepository extends JpaRepository<Usuarios, Long>{

}
