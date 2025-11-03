package com.example.mensagem.controller;



import com.example.mensagem.DTO.ConsultaDto;
import com.example.mensagem.DTO.MensagemDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class  MensagemController{
    @GetMapping("/mensagem")
        public MensagemDto getMensagem() {
            return new MensagemDto("olá bem-vindo ao backend");
        }

    public class ConsultaController {
        @GetMapping("/doutor")
        public ConsultaDto getConsulta(){
            return new ConsultaDto("essa é a tela de consulta");
        }
    }

}
