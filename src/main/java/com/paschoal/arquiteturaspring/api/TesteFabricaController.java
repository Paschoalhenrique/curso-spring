package com.paschoal.arquiteturaspring.api;

import com.paschoal.arquiteturaspring.montadora.Chave;
import com.paschoal.arquiteturaspring.montadora.HondaHRV;
import com.paschoal.arquiteturaspring.montadora.Motor;
import com.paschoal.arquiteturaspring.montadora.CarroStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Qualifier;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired
    @Qualifier("motorTurbo")
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave) {
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }
}
