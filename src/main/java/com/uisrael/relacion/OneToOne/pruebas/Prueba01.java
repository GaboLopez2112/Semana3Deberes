package com.uisrael.relacion.OneToOne.pruebas;
import com.uisrael.relacion.OneToOne.model.Gerente;
import com.uisrael.relacion.OneToOne.model.Local;
import com.uisrael.relacion.OneToOne.repository.GerenteRepositoy;
import com.uisrael.relacion.OneToOne.repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Prueba01 implements CommandLineRunner {
    @Autowired
    private LocalRepository localRepository;
    @Autowired
    private GerenteRepositoy gerenteRepositoy;
    @Override
    public void run(String... args)throws Exception{
        Local local= new Local();
        local.setCalle("E120-288 Calle Secundaria");
        local.setCiudad("Cuenca");
        local.setCodigoPostal("1723");

        localRepository.save(local);

        Gerente gerente = new Gerente();
        gerente.setNombre("Alejandro");
        gerente.setLocal(local);
        gerenteRepositoy.save(gerente);
    }
}
