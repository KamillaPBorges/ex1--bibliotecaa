package kamillapb.ex1__biblioteca;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
@GetMapping
public String mensagemDeBemVindo() {
return "Bem vindo a biblioteca central!";
}
}
