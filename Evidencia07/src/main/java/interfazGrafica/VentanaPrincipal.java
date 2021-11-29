package interfazGrafica;

import ventana.GuiTrabajador;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends GuiTrabajador {
    private JLabel bienvenida;
    private JButton botonTrabajadores;
    private JButton botonEdicion;
    private JButton botonSalida;

    public VentanaPrincipal(){
        super("Trabajadores",500,400);
        generarElementosVentana();
    }

    private void generarElementosVentana(){
        generarMensajeBienvenida();
        generarBotonInstrucciones();
        generarBotonEdicion();
        generarBotonSalir();
    }

    private void generarMensajeBienvenida(){
        String textoBienvenida = "Bienvenido al menú principal";
        super.generarJLabelEncabezado(this.bienvenida, textoBienvenida,20,30,500,30);
    }

    private void generarBotonEdicion(){
        String textoBoton = "Editar";
        this.botonEdicion = super.generarBoton(textoBoton,175,100,150,40);
        this.add(this.botonEdicion);
        this.botonEdicion.addActionListener(this);
    }

    private void generarBotonSalir(){
        String textoBoton = "Salir";
        this.botonSalida = super.generarBoton(textoBoton,175,300,150,40);
        this.add(this.botonSalida);
        this.botonSalida.addActionListener(this);
    }

    private void generarBotonInstrucciones(){
        String textoBoton = "Ver trabajadores";
        this.botonTrabajadores = super.generarBoton(textoBoton,175,200,150,40);
        this.add(this.botonTrabajadores);
        this.botonTrabajadores.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == this.botonEdicion){
            JOptionPane.showMessageDialog(this,"Proximamente");
        }
        if(e.getSource() == this.botonTrabajadores){
            VentanaTrabajador ventanaTrabajador = new VentanaTrabajador();
            this.dispose();
        }
        if(e.getSource() == this.botonSalida){
            this.dispose();
            System.exit(0);
        }
    }
}
