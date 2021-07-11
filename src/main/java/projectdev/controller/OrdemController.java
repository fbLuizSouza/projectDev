package projectdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import projectdev.model.Ativo;
import projectdev.model.Ordem;
import projectdev.service.AtivoServiceImp;
import projectdev.service.OrdemServiceImp;

import java.util.Map;

@Controller
public class OrdemController {

    @Autowired
    private AtivoServiceImp ativoServiceImp;
    @Autowired
    private OrdemServiceImp ordemServiceImp;

    @GetMapping(value = "/ordem")
    public String comprarVender(@RequestParam Map<String,String> requestParams, ModelMap model){
        String codigo = requestParams.get("campoAtivo");
        String acao = requestParams.get("codigoAcao");
        Ordem ordem = new Ordem();
        Ativo ativo = ativoServiceImp.findByCodigo(codigo);
        model.addAttribute("ativo", ativoServiceImp.findByCodigo(codigo));
        model.addAttribute("ordem", ordem);
        model.addAttribute("codAcao", acao);
        return "ordem";
    }

    @PostMapping(value = "/ordem")
    public String salvarOrdem(@ModelAttribute("ordem") Ordem ordem){

        if(ordem != null)
        {
            ordemServiceImp.save(ordem);
        }
        return "index";
    }
}
