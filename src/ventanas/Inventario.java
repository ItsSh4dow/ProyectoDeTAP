package ventanas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Inventario extends JFrame{
    private JLabel buscarProducto, producto, codigo, cantidad;
    private JTextField cajaTexto;
    private JList<String> listaProducto, listaCodigo, listaCantidad;
    private JPanel  panel1, segundoPanel, tercerPanel;
    private JButton buscar;

    public Inventario(){
        super("Inventario");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        panel1 = new JPanel();
        buscarProducto = new JLabel("Buscar Producto: ");
        cajaTexto = new JTextField("",20);
        buscar = new JButton("Buscar");
        panel1.add(buscarProducto);
        panel1.add(cajaTexto);
        panel1.add(buscar);
        add(panel1);
        panel1.setLayout(new FlowLayout(FlowLayout.LEADING));

        segundoPanel = new JPanel();
        producto = new JLabel("Producto                                                                                                      ");
        codigo = new JLabel("Codigo                    ");
        cantidad = new  JLabel("Cantidad");
        segundoPanel.add(codigo); segundoPanel.add(producto);  segundoPanel.add(cantidad);
        add(segundoPanel);
        segundoPanel.setLayout(new FlowLayout(FlowLayout.LEADING));

        tercerPanel = new JPanel();
        listaProducto = new JList<>();
        listaCodigo = new JList<>();
        listaCantidad = new JList<>();

        listaProducto.setVisibleRowCount(10);
        listaCodigo.setVisibleRowCount(10);
        listaCantidad.setVisibleRowCount(10);

        listaProducto.setFixedCellHeight(20);
        listaProducto.setFixedCellWidth(100);
        listaCodigo.setFixedCellHeight(20);
        listaCodigo.setFixedCellWidth(375);
        listaCantidad.setFixedCellHeight(20);
        listaCantidad.setFixedCellWidth(75);

        tercerPanel.add(new JScrollPane(listaProducto));
        tercerPanel.add(new JScrollPane(listaCodigo));
        tercerPanel.add(new JScrollPane(listaCantidad));
        add(tercerPanel);
        tercerPanel.setLayout(new FlowLayout(FlowLayout.LEADING));

    }

}