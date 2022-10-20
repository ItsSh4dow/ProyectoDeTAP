package ventanas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;

import java.awt.Dimension;
import java.awt.FlowLayout;

public class CorteCaja extends JFrame{
    private JLabel dineroEsperado;
    private JLabel dineroEnCaja;
    private JLabel diferencia;

    private JTextField moneyEsperado;
    private JTextField moneyEnCaja;
    private JTextField diff;

    private JButton cerrarTurno;
    private JButton cancelar;
    private JPanel panelUno, panelDos, panelBotones;

    public CorteCaja(){
        super("Cierre de turno");
        this.setSize((new Dimension(500,400)));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        primerPanel();
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        add(panelUno);

        segundoPanel();
        add(panelDos);
        setLayout(new FlowLayout(FlowLayout.CENTER));

        tercerPanel();
        add(panelBotones);
        JScrollPane listScroller = new JScrollPane();
        listScroller.setPreferredSize(new Dimension(250, 80));
        listScroller.setAlignmentX(LEFT_ALIGNMENT);

    }
    public void primerPanel(){
        panelUno = new JPanel();
        panelUno.add(Box.createRigidArea(new Dimension(100,75)));
        dineroEsperado = new JLabel("Efectivo esperado en caja");
        dineroEsperado.setHorizontalAlignment(SwingConstants.CENTER);
        panelUno.setLayout(new BoxLayout(panelUno, BoxLayout.Y_AXIS));
        panelUno.add(dineroEsperado);
        panelUno.add(Box.createRigidArea(new Dimension(JFrame.MAXIMIZED_BOTH/2,(JFrame.MAXIMIZED_BOTH/2) + 25)));

        dineroEnCaja = new JLabel("¿Cuanto efectivo hay en la caja?");
        panelUno.add(dineroEnCaja);
        panelUno.add(Box.createRigidArea(new Dimension(JFrame.MAXIMIZED_BOTH/2,(JFrame.MAXIMIZED_BOTH/2) + 25)));

        diferencia = new JLabel("Diferencia");
        panelUno.add(diferencia);

    }
    public void segundoPanel(){
        panelDos = new JPanel();
        panelDos.setLayout(new BoxLayout(panelDos, BoxLayout.Y_AXIS));
        panelDos.add(Box.createRigidArea(new Dimension(230,80)));
        moneyEnCaja = new JTextField();
        moneyEnCaja.setMaximumSize(new Dimension(150,45));
        panelDos.add(moneyEnCaja);
        panelDos.add(Box.createRigidArea(new Dimension(JFrame.MAXIMIZED_BOTH/2,(JFrame.MAXIMIZED_BOTH/2) + 25)));

        moneyEsperado = new JTextField();
        moneyEsperado.setMaximumSize(new Dimension(150,45));
        panelDos.add(moneyEsperado);
        panelDos.add(Box.createRigidArea(new Dimension(JFrame.MAXIMIZED_BOTH/2,(JFrame.MAXIMIZED_BOTH/2) + 20)));

        diff = new JTextField();
        diff.setMaximumSize(new Dimension(150,45));
        panelDos.add(diff);


    }
    public void tercerPanel(){
        cerrarTurno =  new JButton("Cerrar Turno");
        cancelar = new JButton("Cancelar");
        panelBotones = new JPanel();
        panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.LINE_AXIS));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(40, 10, 10, 10));
        panelBotones.add(Box.createHorizontalGlue());
        panelBotones.add(cerrarTurno);
        panelBotones.add(Box.createRigidArea(new Dimension(10, 0)));
        panelBotones.add(cancelar);
    }

}
