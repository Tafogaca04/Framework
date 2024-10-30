package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Atividade_01 {


@GetMapping("/compras")
public String compras() {
	return "compras.html";
}
@GetMapping("/vendas")
public String vendas() {
	return "vendas.html";
}
@GetMapping("/estoque")
public String estoque() {
	return "estoque.html";
}
}