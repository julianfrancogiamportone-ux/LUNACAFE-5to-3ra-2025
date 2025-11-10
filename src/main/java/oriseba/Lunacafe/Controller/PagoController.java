package oriseba.Lunacafe.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import oriseba.Lunacafe.Iservice.IPagoService;
import oriseba.Lunacafe.entity.Pago;



@RestController
@RequestMapping("/api/pagos")
@CrossOrigin(origins = "*")
public class PagoController {
	@Autowired 
	private IPagoService ipagoservice;
	
	@GetMapping
	public List<Pago>getAllPagos(){
		return ipagoservice.findAllPagos();
	}
	
	@GetMapping("/lunacafe/{id}")
	public Optional<Pago> getPagoById(@PathVariable Long id) {
		return ipagoservice.findAllPagoById(id);
	}
	
	@PostMapping 
	public Pago createPago(@RequestBody Pago pago) {
		return ipagoservice.savePago(pago);
	}
}
