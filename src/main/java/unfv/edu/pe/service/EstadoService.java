package unfv.edu.pe.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unfv.edu.pe.model.Estado;
import unfv.edu.pe.repository.EstadoRepository;

@Service
public class EstadoService implements BaseService<Estado>{

	@Autowired
	private EstadoRepository estadoRepository;
	
	@Override
	public List<Estado> obtenerTodo() {		
		return estadoRepository.findAll();
	}

	@Override
	public Optional<Estado> obtenerPorId(Long id) {
		Optional<Estado> estado = estadoRepository.findById(id);
		if (estado.isEmpty()) {
			return Optional.empty();
		}else {
			return estado;
		}		
	}

	@Override
	public Estado guardar(Estado entity) {
		entity = estadoRepository.save(entity);
		return entity;
	}
	
	public void guardarVarios(List<Estado> estados) {
		estadoRepository.saveAll(estados);
	}

	@Override
	public HashMap<String, String> eliminarPorId(Long id) {		
		HashMap<String, String> respuesta = new HashMap<String, String>();
		estadoRepository.deleteById(id);
		respuesta.put("mensaje", "Elemento eliminado correctamente");
		return respuesta;
	}
}
