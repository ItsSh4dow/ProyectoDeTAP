package ventanas;

import java.awt.*;
import javax.swing.*;

public class Cajero  extends JFrame{
    private JButton corte, configuracion,inventario, ayuda, buscarProd, cambiar, eliminar, cobrar, reinprimir, salir, ventasDelDia;
    private JLabel ventaProductos, codigoProducto, total, PagoCon, cambio, CodigoBarras,
            nombreDelProducto, precioDelProducto, cantidad, importe, existencia, campoVacioBoton, campoVacio2, campoVacio3, campovacio4, derechos;
    private JTextField codigoDelProducuto, totalPagar, pago, cam;
    private JPanel panelAlto, panel2, panel3, panel4, panel5, panel6, panel7,panel8, panel9;
    private JList espacio1, espacio2, espacio3, espacio4, espacio5, espacio6;

    public Cajero (){
        super("ChikiStore");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        panelAlto = new JPanel ();
        corte = new JButton ("Corte");
        configuracion= new JButton ("Configuracion");
        inventario= new JButton("Inventario");
        ayuda = new JButton("Ayuda");
        campoVacioBoton = new JLabel("                                                                                                ");
        salir = new JButton("Salir");
        panelAlto.add(corte);
        panelAlto.add(configuracion);
        panelAlto.add(inventario);
        panelAlto.add(ayuda);
        panelAlto.add(campoVacioBoton);
        panelAlto.add(salir);
        add(panelAlto);
        panelAlto.setLayout(new FlowLayout(FlowLayout.LEADING));

        panel2=new JPanel();
        panel2.setBackground(Color.CYAN);
        ventaProductos = new JLabel("Venta de Productos");
        panel2.add(ventaProductos);
        add(panel2);
        panel2.setLayout(new FlowLayout(FlowLayout.LEADING));

        panel3=new JPanel();
        codigoProducto = new JLabel("Codigo del producto");
        codigoDelProducuto = new JTextField("                                                    ");
        buscarProd = new JButton("Buscar");
        panel3.add(codigoProducto);
        panel3.add(codigoDelProducuto);
        panel3.add(buscarProd);
        add(panel3);
        panel3.setLayout(new FlowLayout(FlowLayout.LEADING));

        panel4 = new JPanel();
        CodigoBarras = new JLabel("Codigo de barras       ");
        nombreDelProducto= new JLabel("nombre del producto       ");
        precioDelProducto = new JLabel("Precio del producto       ");
        cantidad = new JLabel("Cantidad        ");
        importe= new JLabel("Importe       ");
        existencia = new JLabel("Existencia  ");
        panel4.add(CodigoBarras);
        panel4.add(nombreDelProducto);
        panel4.add(precioDelProducto);
        panel4.add(cantidad);
        panel4.add(importe);
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
        ventaProductos = new JLabel("Venta de productos: ");
        campoVacio2=new JLabel("                                                                                                         ");
        cobrar= new JButton("      Cobrar       ");
        total = new JLabel("Total:");
        panel6.add(ventaProductos);
        panel6.add(campoVacio2);
        panel6.add(cobrar);
        panel6.add(total);
        add(panel6);
        panel6.setLayout(new FlowLayout(FlowLayout.LEADING));

        panel7= new JPanel();
        cambiar= new JButton("Cambiar");
        eliminar= new JButton("Eliminar");
        reinprimir= new JButton("   Reimprimir   ");
        totalPagar = new JTextField("$                      ");
        campoVacio3= new JLabel("                                                                                          ");
        panel7.add(cambiar);
        panel7.add(eliminar);
        panel7.add(campoVacio3);
        panel7.add(reinprimir);
        panel7.add(totalPagar);

        add(panel7);
        panel7.setLayout(new FlowLayout(FlowLayout.LEADING));

        panel8 = new JPanel();
        PagoCon= new JLabel("Pago con:                 ");
        cambio = new JLabel("Cambio:                                                                                            ");
        ventasDelDia= new JButton("Ventas del Dia");
        panel8.add(PagoCon);
        panel8.add(cambio);
        panel8.add(ventasDelDia);
        add(panel8);
        panel8.setLayout(new FlowLayout(FlowLayout.LEADING));

        panel9 = new JPanel();
        pago= new JTextField("$                          ");
        cam = new JTextField("$                          ");
        campovacio4 = new JLabel("   ");
        panel9.add(pago);
        panel9.add(campovacio4);
        panel9.add(cam);
        add(panel9);
        panel9.setLayout(new FlowLayout(FlowLayout.LEADING));

        derechos = new JLabel("Chikilines Store M.R. todos los derechos reservados :)))S");
        add(derechos, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();

    }


}
