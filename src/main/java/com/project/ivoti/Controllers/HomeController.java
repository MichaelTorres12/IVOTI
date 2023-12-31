package com.project.ivoti.Controllers;
import com.project.ivoti.Models.Candidato;
import com.project.ivoti.Models.CentroVotacion;
import com.project.ivoti.Models.Partido;
import com.project.ivoti.Models.Votante;
import com.project.ivoti.interfaceService.IcandidatoService;
import com.project.ivoti.interfaceService.IpartidoService;
import com.project.ivoti.interfaceService.IvotanteService;
import com.project.ivoti.interfaceService.IvotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {

    @Qualifier("candidatoService")
    @Autowired(required = true)
    private IcandidatoService candidato;
    @Autowired(required = true)
    private IpartidoService partido;
    @Autowired(required = true)
    private IvotanteService votante;
    @Autowired(required = true)
    private IvotoService voto;

    @GetMapping("/") //Ruta del menu principal, es decir el index
    public String index() {

        return "index";
    }

    //Rutas del sistema de verificacion
    @GetMapping("/urna") //Ruta de donde se ingresa el DUI verificación.
    public String urna() {
        return "Verificacion/duiVerificacionView";
    }

    @GetMapping("/informacionVotante") //Ruta donde se muestra la informacion del votante.
    public String informacionVotante() {return "Verificacion/detalleVotanteView"; }


    //Rutas del sistema de votacion
    @GetMapping("/votaciones") //Ruta donde se inicia el sistema de sufragio.
    public String votaciones(Model model) {
        List<Votante> votantes = votante.listar();
        model.addAttribute("votantes", votantes);
        return "Voto/duiIngresoView";
    }


    //Agregar para que acepte el Dui como parametro
    @PostMapping("/candidatos") //Ruta donde se muestran los candidatos.
    public String candidatos(@ModelAttribute Votante votante01, Model model) {
        int dui = votante01.getDui();
        System.out.println(dui);
        List<Candidato> canditatos = candidato.listar();
        model.addAttribute("candidatos", canditatos);
        model.addAttribute("dui1", dui);
        return "Voto/candidatosView";
    }

    @PostMapping("/votoFinalizado") //Ruta donde se indica que terminó el proceso.
    public String votosFinalizado(@ModelAttribute Votante votante01, @ModelAttribute Candidato candidato01) {
        int dui1 = votante01.getDui();
        Votante dui = votante01;
        int candidato1 = candidato01.getId_candidato();
        Optional<Votante> votan = votante.buscarById(dui1);
        Votante vot = votan.get();



        CentroVotacion id_centro_votacion = vot.getId_centro_votacion();

        voto.save(candidato01, dui, id_centro_votacion);

        System.out.println("DUI: " + dui);
        System.out.println("Candidato: " + candidato1);
        System.out.println("Votante: " + votan);
        System.out.println("Centro Votacion: " + id_centro_votacion);

        return "Voto/finalizadoView";
    }


    //Rutas del sistema de estadísticas
    @GetMapping("/estadisticas")
    public String estadistica(){
        return "Estadistica/estadisticaView";
    }

    @PostMapping("/verificarDUI")
    public String verificarDUI(@ModelAttribute Votante votante01, Model model) {
        int dui = votante01.getDui();
        Optional<Votante> votanteEncontrado = votante.buscarById(dui);

        if (votanteEncontrado.isPresent()) {
            model.addAttribute("votante", votanteEncontrado.get());
            return "Verificacion/detalleVotanteView";
        } else {
            model.addAttribute("mensaje", "El votante no existe.");
            return "Verificacion/duiVerificacionView";
        }


    }
}

