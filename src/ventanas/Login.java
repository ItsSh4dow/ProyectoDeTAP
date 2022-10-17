package ventanas;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{
    private JPanel panel;
    private ImageIcon personaje;
    private JLabel etiquetaIcono;
    private JButton enter;
    private JTextField user;
    private JPasswordField pwd;

    public Login(){
        super("Chikilines");
        setSize(500,500);
        setLocationRelativeTo(null);
        setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarPaneles();
        iniciarComponentes();
    }
    public void iniciarComponentes(){
        parteSuperior();
        parteInferior();
    }
    public void iniciarPaneles(){
        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);
    }
    private void parteSuperior(){
        // Use this sentence for search the route the image
        String ruta = System.getProperty("user.dir") + System.getProperty("file.separator") +
                "src" + System.getProperty("file.separator") + "images" + System.getProperty("file.separator")+
                System.getProperty("file.separator")+"iconLogin"+".png";

        personaje = new ImageIcon(ruta);
        etiquetaIcono = new JLabel();
        etiquetaIcono.setBounds(150,20, 200,200);
        etiquetaIcono.setIcon(new ImageIcon(personaje.getImage().getScaledInstance(etiquetaIcono.getWidth(),etiquetaIcono.getHeight(), Image.SCALE_SMOOTH)));

        panel.add(etiquetaIcono);
    }
    private void parteInferior(){
        JLabel labelUsername = new JLabel("Username");
        JLabel labelPassword = new JLabel("Password");
        enter = new JButton("Login");
        user = new JTextField();
        pwd = new JPasswordField();


        // set the coordinates for each component
        enter.setBounds(210, 350, 70, 30);
        user.setBounds(170,250, 160,30);
        pwd.setBounds(170, 300, 160, 30);
        // put the label up the user and password
        labelUsername.setBounds(170, 220, 70, 30);
        labelPassword.setBounds(170, 275, 70, 30);
        //  Add the panel all the components
        panel.add(enter);
        panel.add(user);
        panel.add(labelUsername);
        panel.add(pwd);
        panel.add(labelPassword);
    }

}