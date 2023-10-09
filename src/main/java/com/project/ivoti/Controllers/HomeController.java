package com.project.ivoti.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
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
    public String votaciones() { return "Voto/duiIngresoView"; }

    @GetMapping("/candidatos") //Ruta donde se muestran los candidatos.
    public String candidatos() { return "Voto/candidatosView"; }

    @GetMapping("/votoFinalizado") //Ruta donde se indica que terminó el proceso.
    public String votosFinalizado() { return "Voto/finalizadoView";}


    //Rutas del sistema de estadísticas
    @GetMapping("/estadisticas")
    public String estadistica(){
        return "Estadistica/estadisticaView";
    }
}

