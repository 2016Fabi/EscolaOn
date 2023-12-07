//package com.FI.EscolaOn.Controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.FI.EscolaOn.entity.Teacher;
//import com.FI.EscolaOn.service.impl.EnderecoService;
//
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.validation.Valid;
//
//@RestController
//@RequestMapping("/Endereco")
//@CrossOrigin(origins = "*")
//public class EnderecoController {
//
//	@Autowired
//	EnderecoService enderecoService;
//
//	@PostMapping
//	public ResponseEntity<Object> saveEndereco(@RequestBody @Valid EnderecoDTO enderecoDTO,	HttpServletRequest request) {
//		Teacher end = new Teacher();
//		end.setProvincia(enderecoDTO.getProvincia());
//		end.setMunicipio(enderecoDTO.getMunicipio());
//		end.setBairro(enderecoDTO.getBairro());
//		end.setRua(enderecoDTO.getRua());		
//		end = enderecoService.save(end);
//		return new ResponseEntity<>(end, HttpStatus.OK);
//	}
//	
//	
//	@GetMapping
//	public ResponseEntity<List<Teacher>> listar(){
//		List<Teacher> listaEndereco = this.enderecoService.findAll();
//		return new ResponseEntity<>(listaEndereco, HttpStatus.OK);
//	}
//	
//	@PutMapping("/updateEndereco/{id}")
//	public Teacher updateEndereco(@RequestBody Teacher endereco, @PathVariable Long id) throws Exception { 
//		return enderecoService.updateEndereco(endereco, id);
//	}
//	
//	@DeleteMapping("/deleteEndereco/{id}")
//	public void deleteById(@PathVariable ("id") Long id) {
//		enderecoService.deletar(id);
//	}
//
//
//}
