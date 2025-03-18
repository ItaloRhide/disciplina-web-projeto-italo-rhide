package br.ueg.desenvolvimento.web.projeto_italo_rhide.controller;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AlunoController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    static List alunos = new ArrayList<>();
    static {
        alunos.add(Map.of("nome", "João", "email", "joao@localhost"));
        alunos.add(Map.of("nome", "Maria", "email", "maria@localhost"));
        alunos.add(Map.of("nome", "José", "email", "jose@localhost"));
    }

    @GetMapping("/alunos")
    public String getHome(Model model) {
        model.addAttribute("alunos", alunos);
        return "alunos";
    }

    @GetMapping("/alunos/create")
    public String getCreate() {
        return "aluno-create";
    }

    @PostMapping("/alunos/create")
    public String postCreate(@RequestParam String nome, @RequestParam String email) {
        alunos.add(Map.of("nome", nome, "email", email));

        return "redirect:/alunos";
    }

    @GetMapping("/alunos/update/{id}")
    public String getUpdate(@PathVariable int id, Model model) {
        model.addAttribute("aluno", alunos.get(id));
        model.addAttribute("id", id);
        return "aluno-update";
    }

    @PostMapping("/alunos/update")
    public String postUpdate(@RequestParam int id, @RequestParam String nome, @RequestParam String email) {
        alunos.set(id, Map.of("nome", nome, "email", email));
        return "redirect:/alunos";
    }

    @GetMapping("/alunos/delete/{id}")
    public String getDelete(@PathVariable int id, Model model) {
        model.addAttribute("aluno", alunos.get(id));
        model.addAttribute("id", id);
        return "aluno-delete";
    }

    @PostMapping("/alunos/delete")
    public String postDelete(@RequestParam int id) {
        alunos.remove(id);
        return "redirect:/alunos";
    }
}