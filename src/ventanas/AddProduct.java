package ventanas;

import javax.swing.JFrame;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddProduct extends JFrame{
    private JLabel nombre, precio, CB, CA;
    private JTextField Texto, Texto2, Texto3, Texto4;
    private JPanel panel1, panel2, panel3, panel4, panel5;
    private JButton agregar, cancelar;

    public AddProduct(){
        super("Agregar Producto");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        panel1 = new JPanel();
        nombre = new JLabel("                               Nombre:                     ");
        Texto = new JTextField("",15);
        panel1.add(nombre);
        panel1.add(Texto);
        add(panel1);
        panel1.setLayout(new FlowLayout(FlowLayout.LEADING));

        panel2 = new JPanel();
        precio = new JLabel("                               Precio:                        ");
        Texto2 = new JTextField("",15);
        panel2.add(precio);
        panel2.add(Texto2);
        add(panel2);
        panel2.setLayout(new FlowLayout(FlowLayout.LEADING));

        panel3 = new JPanel();
        CB = new JLabel("                               Codigo de barras:     ");
        Texto3 = new JTextField("",15);
        panel3.add(CB);
        panel3.add(Texto3);
        add(panel3);
        panel3.setLayout(new FlowLayout(FlowLayout.LEADING));

        panel4 = new JPanel();
        CA = new JLabel("                              Cantidad en almacen:  ");
        Texto4 = new JTextField("",15);
        panel4.add(CA);
        panel4.add(Texto4);
        add(panel4);
        panel4.setLayout(new FlowLayout(FlowLayout.LEADING));

        panel5 = new JPanel();
        agregar = new JButton("Agregar");
        cancelar = new JButton("Cancelar");
        panel5.add(agregar);
        panel5.add(cancelar);
        add(panel5);
        panel1.setLayout(new FlowLayout(FlowLayout.LEADING));
    }
}
