package ventanas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;

public class VentaDelDia extends JFrame {
    private JLabel mostrarVentas, mostrarVendedor, seleccionFecha, folioTicket, codigo, producto, cantidad, precio, vendedorQueAtendio;
    private JComboBox<String> momentoVentas, SeleccionVendedor;
    private JList<String> listaCodigo, listaFolio, listaProducto, listaCantidad, listaPrecio, listaVendedor;
    private JPanel  panel1, panelOpMomento, panelOpVendedor, panel2, primerPanel, segundoPanel, tercerPanel;
    private static String momento[] = {"Hoy", "Semana actual", "Semana pasada"};
    private static String vendedor[] = {"Seleccione Vendedor", "Ricardo", "Betito", "Yorcho", "Steve", "Osvi"};

    public VentaDelDia(){
        super("Venta del dia");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        panel1 = new JPanel();
        mostrarVentas = new JLabel("Mostrar ventas de: ");
        momentoVentas = new JComboBox<String>(momento);
        momentoVentas.setMaximumRowCount(3);
        panel1.add(mostrarVentas);
        panel1.add(momentoVentas);
        mostrarVendedor = new JLabel("            Vendedor: ");
        SeleccionVendedor = new JComboBox<String>(vendedor);
        SeleccionVendedor.setMaximumRowCount(3);
        panel1.add(mostrarVendedor);
        panel1.add(SeleccionVendedor);
        add(panel1);
        panel1.setLayout(new FlowLayout(FlowLayout.LEADING));

        segundoPanel = new JPanel();
        folioTicket = new        JLabel("Folio de Ticket               ");
        codigo = new             JLabel("Codigo        ");
        producto = new           JLabel("Producto                                                       ");
        cantidad = new           JLabel("Cantidad        ");
        precio = new             JLabel("Precio            ");
        vendedorQueAtendio = new JLabel("Vendedor que atendio                                       ");
        segundoPanel.add(codigo); segundoPanel.add(folioTicket);  segundoPanel.add(producto); segundoPanel.add(cantidad); segundoPanel.add(precio); segundoPanel.add(vendedorQueAtendio);
        add(segundoPanel);
        segundoPanel.setLayout(new FlowLayout(FlowLayout.LEADING));

        tercerPanel = new JPanel();
        listaCodigo = new JList<>();
        listaFolio = new JList<>();
        listaProducto = new JList<>();
        listaCantidad = new JList<>();
        listaPrecio = new JList<>();
        listaVendedor = new JList<>();

        listaCodigo.setVisibleRowCount(10);
        listaFolio.setVisibleRowCount(10);
        listaProducto.setVisibleRowCount(10);
        listaCantidad.setVisibleRowCount(10);
        listaPrecio.setVisibleRowCount(10);
        listaVendedor.setVisibleRowCount(10);

        listaCodigo.setFixedCellHeight(20);
        listaCodigo.setFixedCellWidth(65);
        listaFolio.setFixedCellHeight(20);
        listaFolio.setFixedCellWidth(125);
        listaProducto.setFixedCellHeight(20);
        listaProducto.setFixedCellWidth(225);
        listaCantidad.setFixedCellHeight(20);
        listaCantidad.setFixedCellWidth(75);
        listaPrecio.setFixedCellHeight(20);
        listaPrecio.setFixedCellWidth(75);
        listaVendedor.setFixedCellHeight(20);
        listaVendedor.setFixedCellWidth(350);

        tercerPanel.add(new JScrollPane(listaCodigo));
        tercerPanel.add(new JScrollPane(listaFolio));
        tercerPanel.add(new JScrollPane(listaProducto));
        tercerPanel.add(new JScrollPane(listaCantidad));
        tercerPanel.add(new JScrollPane(listaPrecio));
        tercerPanel.add(new JScrollPane(listaVendedor));
        add(tercerPanel);
        tercerPanel.setLayout(new FlowLayout(FlowLayout.LEADING));

    }



}