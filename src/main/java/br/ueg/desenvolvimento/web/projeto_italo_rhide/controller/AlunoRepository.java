package br.ueg.desenvolvimento.web.projeto_italo_rhide.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}