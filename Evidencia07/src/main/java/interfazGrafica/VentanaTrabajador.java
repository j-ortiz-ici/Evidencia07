package interfazGrafica;

import modelo.Trabajador;
import ventana.GuiTrabajador;
import gestorDeArchivos.gestorArchivos;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaTrabajador extends GuiTrabajador {
    private JLabel subtituloPagina;
    private JButton botonmenuPrincipal;
    private JButton botonTrabajador1;
    private JButton botonTrabajador2;
    Trabajador trabajador1 = new Trabajador("Juanito","Perez","20161003-6","Consalud","Qseyo");
    Trabajador trabajador2 = new Trabajador("Juanito2","Perez2","20161003-2","Consalud2","Qseyo2");

    public VentanaTrabajador(){
        super("Trabajadores", 500, 400);
        generarElementosVentana();
    }
    private void generarElementosVentana(){
        generarBotonMenu();
        generarMensajePagina();
        generarBotonTrabajador1();
        generarBotonTrabajador2();
    }
    private void generarMensajePagina(){
        String textInstrucciones = "Subtitulo genérico";
        super.generarJLabel(this.subtituloPagina,textInstrucciones,150,15,460,150);
    }

    private void generarBotonMenu(){
        String textoBoton = "Volver al menu principal";
        this.botonmenuPrincipal = super.generarBoton(textoBoton,150,300,200,40);
        this.add(this.botonmenuPrincipal);
        this.botonmenuPrincipal.addActionListener(this);
    }

    private void generarBotonTrabajador1(){
        String textoBoton = "Ver Trabajador1";
        this.botonTrabajador1 = super.generarBoton(textoBoton,150,140,200,40);
        this.add(this.botonTrabajador1);
        this.botonTrabajador1.addActionListener(this);
    }
    private void generarBotonTrabajador2(){
        String textoBoton = "Ver Trabajador2";
        this.botonTrabajador2= super.generarBoton(textoBoton,150,220,200,40);
        this.add(this.botonTrabajador2);
        this.botonTrabajador2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonmenuPrincipal) {
            VentanaPrincipal principal = new VentanaPrincipal();
            this.dispose();
        }
        if (e.getSource() == this.botonTrabajador1) {

            JOptionPane.showMessageDialog(this, "Información sobre el trabajador 1:\n" +
                    "Nombre: " + trabajador1.getNombre() + "\n"+
                    "Apellido: " + trabajador1.getApellido()+ "\n"+
                    "Rut: " +trabajador1.getRut()+ "\n"+
                    "Isapre: "+trabajador1.getIsapre()+ "\n"+
                    "AFP: "+trabajador1.getAfp());
        }
        if (e.getSource() == this.botonTrabajador2) {
            JOptionPane.showMessageDialog(this, "Información sobre el trabajador 2:\n" +
                    "Nombre: " + trabajador2.getNombre() + "\n"+
                    "Apellido: " + trabajador2.getApellido()+ "\n"+
                    "Rut: " +trabajador2.getRut()+ "\n"+
                    "Isapre: "+trabajador2.getIsapre()+ "\n"+
                    "AFP: "+trabajador2.getAfp());
        }
    }
}