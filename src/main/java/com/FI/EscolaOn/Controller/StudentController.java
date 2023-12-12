package com.FI.EscolaOn.Controller;


import com.FI.EscolaOn.dto.request.StudentRegisterRequestDTO;
import com.FI.EscolaOn.dto.response.StudentRegisterResponseDTO;
import com.FI.EscolaOn.dto.response.StudentResponseFindAllDTO;
import com.FI.EscolaOn.service.AddressService;
import com.FI.EscolaOn.service.CourseService;
import com.FI.EscolaOn.service.StudentService;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/student")
public class StudentController {

	StudentService studentService;
	AddressService addressService;
	CourseService courseService;

    @Autowired
    public StudentController(StudentService studentService, AddressService addressService, CourseService courseService) {
        this.studentService = studentService;
        this.addressService = addressService;
        this.courseService = courseService;
    }

    @PostMapping
	public ResponseEntity<StudentRegisterResponseDTO> register(@RequestBody @Valid StudentRegisterRequestDTO request) {
		return ResponseEntity.ok().body(studentService.register(request));
	}
    
    @GetMapping
    public ResponseEntity<List<StudentResponseFindAllDTO>> findAll() {
        return ResponseEntity.ok().body(studentService.findAll());
    }
    

//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	@GetMapping("/listar")
//	public ResponseEntity<List<AlunoDTO>> listar() {
//		List listaAluno = this.alunoService.findAll();
//		return new ResponseEntity<>(listaAluno, HttpStatus.OK);
//	}

//	@GetMapping("/listar")
//	public ResponseEntity<List<AlunoDTO>> listar() {
//	  List<AlunoDTO> listaAluno = this.studentService.findAll().stream().map(AlunoDTO::new).collect(Collectors.toList());
//	  return new ResponseEntity<>(listaAluno, HttpStatus.OK);
//	}
//
//	@PutMapping("/updateAluno/{id}")
//	public Student updateAluno(@RequestBody Student student, @PathVariable Long id) throws Exception {
//		Student alun = studentService.findById(id);
//		alun.setNome(student.getNome());
//		alun.setSenha(student.getSenha());
//		alun.setCpf(student.getCpf());
//		alun.setEmail(student.getEmail());
//		return studentService.updateAluno(alun, id);
//	}
//
//	@DeleteMapping("/deleteAluno/{id}")
//	public void deleteById(@PathVariable("id") Long id) {
//		studentService.deletar(id);
//	}
}
