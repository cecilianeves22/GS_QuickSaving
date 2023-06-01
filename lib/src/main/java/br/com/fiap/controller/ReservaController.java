package br.com.fiap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.fiap.dto.ReservaDTO;
import br.com.fiap.service.ReservaService;

public class ReservaController {
	
	@Autowired
	private ReservaService reservaService; 
	
	@GetMapping("/reserva")
	ResponseEntity<List<ReservaDTO>> all() {
		return ResponseEntity.ok(reservaService.getAllReserva());
	}
	
	@GetMapping("/reserva/{id}")
	ResponseEntity<List<ReservaDTO>> getReservaId(@PathVariable Long id) {
		return ResponseEntity.ok(reservaService.getAllReservaID(id));
	}
	
	
	
	@PostMapping("/cadastroReserva")
	public ResponseEntity<ReservaDTO> newReserva(@RequestBody ReservaDTO newReserva) {
		reservaService.saveReserva(newReserva);
		return ResponseEntity.ok(newReserva);
	}
    
	
	@PutMapping("/reserva/{id}")
	public ResponseEntity<ReservaDTO> replaceReserva(@RequestBody ReservaDTO newReserva, @PathVariable Long id) {
		ReservaDTO reservaUpdated = reservaService.updateReserva(newReserva,id);
		return ResponseEntity.ofNullable(reservaUpdated);
	}
	
	@DeleteMapping("/reserva/{id}")
	public ResponseEntity<ReservaDTO> deleteReserva(@PathVariable Long id) {
		return ResponseEntity.ofNullable(reservaService.deleteReserva(id));
	}

}
