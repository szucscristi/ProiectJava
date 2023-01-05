package org.ieti.SzucsCristian;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        // FRAME
        JFrame frame=new JFrame("Banca Silver - date clienti");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(1980,1080);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);



        // Adaugare elemente in lista
        DefaultListModel<String> lista=new DefaultListModel<>();
        lista.addElement("Nume");
        JList<String> jList_lista=new JList<>(lista);
        jList_lista.setBounds(7,1,100,100);
        frame.add(jList_lista);


        // Butoane bara
        JMenuBar menuBar=new JMenuBar();
        JMenu fileMenu=new JMenu("Fisier");
        JMenu helpMenu=new JMenu("Ajutor");
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        JMenuItem openOption=new JMenuItem("Deschideti");
        JMenuItem saveOption=new JMenuItem("Salvati ca..");
        fileMenu.add(openOption);
        fileMenu.add(saveOption);
        frame.setJMenuBar(menuBar);

        // Panel
        JPanel mainPanel=new JPanel();


        JTextField text_field_nume=new JTextField(15);
        JTextField text_field_prenume=new JTextField(15);
        JTextField text_field_cnp=new JTextField(15);
        JTextField text_field_serie=new JTextField(15);
        JTextField text_field_sold=new JTextField(15);
        JTextField text_field_rata=new JTextField(15);


        JLabel text_informativ=new JLabel("Introduceti datele clientului: ");
        text_informativ.setFont(new Font("Serif", Font.BOLD, 18));


        JLabel nume_client=new JLabel("Nume      ");
        nume_client.setFont(new Font("Serif", Font.PLAIN, 18));
        JPanel text_nume_client=new JPanel();
        text_nume_client.add(nume_client);
        text_nume_client.add(text_field_nume);

        JLabel prenume_client=new JLabel("Prenume      ");
        prenume_client.setFont(new Font("Serif", Font.PLAIN, 18));
        JPanel text_prenume_client=new JPanel();
        text_prenume_client.add(prenume_client);
        text_prenume_client.add(text_field_prenume);

        JLabel cnp_client=new JLabel("CNP      ");
        cnp_client.setFont(new Font("Serif", Font.PLAIN, 18));
        JPanel text_cnp_client=new JPanel();
        text_cnp_client.add(cnp_client);
        text_cnp_client.add(text_field_cnp);

        JLabel serie_buletin_client=new JLabel("Serie buletin      ");
        serie_buletin_client.setFont(new Font("Serif", Font.PLAIN, 18));
        JPanel text_serie_client=new JPanel();
        text_serie_client.add(serie_buletin_client);
        text_serie_client.add(text_field_serie);

        JLabel sold_curent_client=new JLabel("Sold curent(lei)      ");
        sold_curent_client.setFont(new Font("Serif", Font.PLAIN, 18));
        JPanel text_sold_curent_client=new JPanel();
        text_sold_curent_client.add(sold_curent_client);
        text_sold_curent_client.add(text_field_sold);

        JLabel rata_client=new JLabel("Rata lunara(lei)      ");
        rata_client.setFont(new Font("Serif", Font.PLAIN, 18));
        JPanel text_rata_client=new JPanel();
        text_rata_client.add(rata_client);
        text_rata_client.add(text_field_rata);

        JButton send=new JButton("Introducere date");
        JButton delete=new JButton("Stergere date");

        mainPanel.add(text_informativ);
        mainPanel.add(text_nume_client);
        mainPanel.add(text_prenume_client);
        mainPanel.add(text_cnp_client);
        mainPanel.add(text_serie_client);
        mainPanel.add(text_sold_curent_client);
        mainPanel.add(text_rata_client);
        mainPanel.add(send);
        mainPanel.add(delete);
        //mainPanel.setBounds(1400,480,500,500);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setVisible(true);

        //
        JTextArea text_area=new JTextArea();

        //Scrollbar
        JScrollBar scroll=new JScrollBar();
        scroll.setBounds(1895,1,18,1000);
        frame.add(scroll);

        // placements and visibility
        frame.getContentPane().add(mainPanel);
        frame.getContentPane().add(BorderLayout.CENTER,text_area);
        frame.setVisible(true);
    }
}
