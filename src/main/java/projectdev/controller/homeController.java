package projectdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import projectdev.service.AtivoServiceImp;
import projectdev.service.OrdemServiceImp;

import java.util.Map;

@Controller
public class homeController {

    @Autowired
    private AtivoServiceImp ativoServiceImp;
    @Autowired
    private OrdemServiceImp ordemServiceImp;

    @GetMapping("/")
    public String homePage(){
        //Insere alguns ativos no banco de dados
        //ativoServiceImp.preencheTable();
       // ordemServiceImp.preencheTabelaOrdem();
        return "index";
    }

    @GetMapping(value = "/pesquisar")
    public String pesquisar(@RequestParam Map<String,String> requestParams, Model model){
        String codigo = requestParams.get("campoAtivo");
        model.addAttribute("listOrdem", ordemServiceImp.buscarOrdens(codigo));
        return "pesquisar";
    }

    @PostMapping(value = "/cancelar")
    public String pesquisar(){
        return "index";
    }
}
