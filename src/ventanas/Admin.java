package ventanas;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class Admin extends JFrame{
    private JButton buscarProd, cambiar, eliminar, cobrar, reinprimir, ventasDelDia;
    private JLabel ventaProductos, codigoProducto, total, PagoCon, cambio, CodigoBarras,
            nombreDelProducto, precioDelProducto, cantidad, importe, existencia, campoVacio2, campoVacio3, campovacio4, derechos;
    private JTextField codigoDelProducuto, totalPagar, pago, cam;
    private JPanel panelAlto, panel2, panel3, panel4, panel5, panel6, panel7,panel8, panel9;
    private JList espacio1, espacio2, espacio3, espacio4, espacio5, espacio6;
    private JMenuBar menuBar;
    private JMenu corte, configuracion, inventario, ayuda, herramientasAdmin, salir;
    private JMenuItem agregarVendedor, deshabilitarVendedor;

    public Admin (){
        super("ChikiStore");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        panelAlto = new JPanel ();
        menuBar = new JMenuBar();

        setJMenuBar(menuBar);
        // Cambiamos la fuente las opciones del menu
        corte = new JMenu("Corte");
        corte.setFont(new Font("Arial", Font.PLAIN, 12));
        configuracion = new JMenu("Configuracion");
        configuracion.setFont(new Font("Arial", Font.PLAIN, 12));
        inventario = new JMenu("Inventario");
        inventario.setFont(new Font("Arial", Font.PLAIN, 12));
        ayuda = new JMenu("Ayuda");
        ayuda.setFont(new Font("Arial", Font.PLAIN, 12));
        herramientasAdmin = new JMenu("Herramientas");
        herramientasAdmin.setFont(new Font("Arial", Font.PLAIN, 12));
        salir = new JMenu("Salir");

        //add the sub menu
        agregarVendedor = new JMenuItem("Agregar Vendedor");
        deshabilitarVendedor = new JMenuItem("Desabilitar Vendedor");
        herramientasAdmin.add(agregarVendedor);
        herramientasAdmin.add(deshabilitarVendedor);

        // Add all the configurations of the menu
        menuBar.add(corte);
        menuBar.add(configuracion);
        menuBar.add(inventario);
        menuBar.add(ayuda);
        menuBar.add(herramientasAdmin);
        menuBar.add(salir);
        panelAlto.add(menuBar);
        // The panel with the menu to JFrame
        add(panelAlto);
        panelAlto.setLayout(new FlowLayout(FlowLayout.LEADING));

        panel2=new JPanel();
        panel2.setBackground(Color.CYAN);
        ventaProductos = new JLabel("Venta de Productos");
        panel2.add(Box.createRigidArea(new Dimension(300,0)));
        panel2.add(ventaProductos);
        add(panel2);
        panel2.setLayout(new FlowLayout(FlowLayout.LEADING));

        panel3=new JPanel();
        codigoProducto = new JLabel("Codigo del producto");
        codigoDelProducuto = new JTextField();
        codigoDelProducuto.setPreferredSize((new Dimension(180,25)));
        buscarProd = new JButton("Buscar");
        panel3.add(codigoProducto);
        panel3.add(codigoDelProducuto);
        panel3.add(buscarProd);
        add(panel3);
        panel3.setLayout(new FlowLayout(FlowLayout.LEADING));

        panel4 = new JPanel();
        // Instance of all the Labels
        CodigoBarras = new JLabel("Codigo de barras");
        nombreDelProducto= new JLabel("Nombre del producto");
        precioDelProducto = new JLabel("Precio del producto");
        cantidad = new JLabel("Cantidad");
        importe= new JLabel("Importe");
        existencia = new JLabel("Existencia");
        //  Give dimensions for what are in the middle
        panel4.add(Box.createRigidArea(new Dimension(7,30)));
        panel4.add(CodigoBarras);
        panel4.add(Box.createRigidArea(new Dimension(20,0)));
        panel4.add(nombreDelProducto);
        panel4.add(Box.createRigidArea(new Dimension(16,0)));
        panel4.add(precioDelProducto);
        panel4.add(Box.createRigidArea(new Dimension(25,0)));
        panel4.add(cantidad);
        panel4.add(Box.createRigidArea(new Dimension(23,0)));
        panel4.add(importe);
        panel4.add(Box.createRigidArea(new Dimension(55,0)));
        panel4.add(existencia);
        add(panel4);
        panel4.setLayout(new FlowLayout(FlowLayout.LEADING));

        panel5 = new JPanel();
        espacio1 = new JList<String>();
        espacio1.setVisibleRowCount(5);
        espacio1.setFixedCellHeight(50);
        espacio1.setFixedCellWidth(120);



        espacio2=new JList<String>();
        espacio2.setVisibleRowCount(5);
        espacio2.setFixedCellHeight(50);
        espacio2.setFixedCellWidth(140);

        espacio3=new JList<String>();
        espacio3.setVisibleRowCount(5);
        espacio3.setFixedCellHeight(50);
        espacio3.setFixedCellWidth(135);

        espacio4=new JList<String>();
        espacio4.setVisibleRowCount(5);
        espacio4.setFixedCellHeight(50);
        espacio4.setFixedCellWidth(75);

        espacio5=new JList<String>();
        espacio5.setVisibleRowCount(5);
        espacio5.setFixedCellHeight(50);
        espacio5.setFixedCellWidth(68);

        espacio6=new JList<String>();
        espacio6.setVisibleRowCount(5);
        espacio6.setFixedCellHeight(50);
        espacio6.setFixedCellWidth(160);



        panel5.add(espacio1);
        panel5.add(espacio2);
        panel5.add(espacio3);
        panel5.add(espacio4);
        panel5.add(espacio5);
        panel5.add(espacio6);
        add(panel5);
        panel5.add(new JScrollPane(espacio1));
        panel5.add(new JScrollPane(espacio2));
        panel5.add(new JScrollPane(espacio3));
        panel5.add(new JScrollPane(espacio4));
        panel5.add(new JScrollPane(espacio5));
        panel5.add(new JScrollPane(espacio6));
        panel5.setLayout(new FlowLayout(FlowLayout.LEADING));

        panel6 = new JPanel();
        // Set de dimensions of all the buttons and add the panel 6
        ventaProductos = new JLabel("Venta de productos: ");
        campoVacio2=new JLabel("                                                                                                         ");
        cobrar= new JButton("Cobrar");
        cobrar.setPreferredSize(new Dimension(120,30));
        cobrar.setHorizontalAlignment(SwingConstants.CENTER);
        total = new JLabel("Total:");
        total.setPreferredSize(new Dimension(150,30));
        total.setHorizontalAlignment(SwingConstants.CENTER);
        panel6.add(ventaProductos);
        panel6.add(campoVacio2);
        panel6.add(Box.createRigidArea(new Dimension(1,0)));
        panel6.add(cobrar);
        panel6.add(total);
        add(panel6);
        panel6.setLayout(new FlowLayout(FlowLayout.LEADING));

        panel7= new JPanel();
        cambiar= new JButton("Cambiar");
        eliminar= new JButton("Eliminar");
        reinprimir= new JButton("Reimprimir");
        reinprimir.setHorizontalAlignment(SwingConstants.CENTER);
        reinprimir.setPreferredSize(new Dimension(120,30));

        totalPagar = new JTextField("$");
        totalPagar.setPreferredSize(new Dimension(120,30));
        campoVacio3= new JLabel("                                                                                          ");
        panel7.add(cambiar);
        panel7.add(eliminar);
        panel7.add(campoVacio3);
        panel7.add(reinprimir);
        panel7.add(Box.createRigidArea(new Dimension(20,0)));
        panel7.add(totalPagar);

        add(panel7);
        panel7.setLayout(new FlowLayout(FlowLayout.LEADING));

        panel8 = new JPanel();
        PagoCon= new JLabel("Pago con:");
        PagoCon.setPreferredSize(new Dimension(75,40));
        cambio = new JLabel("Cambio:                                                                                            ");
        ventasDelDia= new JButton("Ventas del Dia");
        ventasDelDia.setHorizontalAlignment(SwingConstants.CENTER);
        ventasDelDia.setPreferredSize(new Dimension(120,30));
        panel8.add(PagoCon);
        panel8.add(Box.createRigidArea(new Dimension(30,0)));
        panel8.add(cambio);
        panel8.add(Box.createRigidArea(new Dimension(1,0)));
        panel8.add(ventasDelDia);
        add(panel8);
        panel8.setLayout(new FlowLayout(FlowLayout.LEADING));

        panel9 = new JPanel();
        pago= new JTextField("$");
        pago.setPreferredSize(new Dimension(85,20));
        cam = new JTextField("$");
        cam.setPreferredSize(new Dimension(85,20));

        campovacio4 = new JLabel("   ");
        panel9.add(pago);
        panel9.add(campovacio4);
        panel9.add(cam);
        add(panel9);
        panel9.setLayout(new FlowLayout(FlowLayout.LEADING));

        derechos = new JLabel("Chikilines Store M.R. todos los derechos reservados :)))");
        add(derechos, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
        setLocation(300,80);
    }
}
