package ventanas;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegistroVendedor extends JFrame{
    private JLabel nombre, apellido, rfc, telefono, correo;
    private JTextField cajaTexto1, cajaTexto2, cajaTexto3, cajaTexto4, cajaTexto5;
    private JPanel panel1, segundoPanel, tercerPanel, cuartoPanel, quintoPanel, sextoPanel;
    private JButton registrar, cancelar;

    public RegistroVendedor(){
        super("Registrar Vendedor");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        panel1 = new JPanel();
        nombre = new JLabel("                               Nombre:                    ");
        cajaTexto1 = new JTextField("",15);
        panel1.add(nombre);
        panel1.add(cajaTexto1);
        add(panel1);
        panel1.setLayout(new FlowLayout(FlowLayout.LEADING));

        segundoPanel = new JPanel();
        apellido = new JLabel("                               Apellido:                    ");
        cajaTexto2 = new JTextField("",15);
        segundoPanel.add(apellido);
        segundoPanel.add(cajaTexto2);
        add(segundoPanel);
        segundoPanel.setLayout(new FlowLayout(FlowLayout.LEADING));

        tercerPanel = new JPanel();
        rfc = new JLabel("                               RFC:                          ");
        cajaTexto3 = new JTextField("",15);
        tercerPanel.add(rfc);
        tercerPanel.add(cajaTexto3);
        add(tercerPanel);
        tercerPanel.setLayout(new FlowLayout(FlowLayout.LEADING));

        cuartoPanel = new JPanel();
        telefono = new JLabel("                              Telefono:                   ");
        cajaTexto4 = new JTextField("",15);
        cuartoPanel.add(telefono);
        cuartoPanel.add(cajaTexto4);
        add(cuartoPanel);
        cuartoPanel.setLayout(new FlowLayout(FlowLayout.LEADING));

        quintoPanel = new JPanel();
        correo = new JLabel("                               Correo:                     ");
        cajaTexto5 = new JTextField("",15);
        quintoPanel.add(correo);
        quintoPanel.add(cajaTexto5);
        add(quintoPanel);
        quintoPanel.setLayout(new FlowLayout(FlowLayout.LEADING));

        sextoPanel = new JPanel();
        registrar = new JButton("Registrar");
        cancelar = new JButton("Cancelar");
        sextoPanel.add(registrar);
        sextoPanel.add(cancelar);
        add(sextoPanel);
        panel1.setLayout(new FlowLayout(FlowLayout.LEADING));
    }
}
