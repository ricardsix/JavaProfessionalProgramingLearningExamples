package com.company.drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Screen extends JFrame implements ActionListener
        {
            Dummy dummyObject = new Dummy();
            private JMenuBar mb;
            private JMenu ind;
            private JMenuItem mi1,mi2,mi3,cua,cir,rec,tri,pen;

            public static void main(String[] args)
            {
                Screen screen= new Screen();
                screen.setTitle("WINDOWS DUMMY");
                int windowWidth = 400;           // Window width in pixels
                int windowHeight = 150;          // Window height in pixels
                screen.setBounds(50, 100,       // Set position
                        windowWidth, windowHeight);  // and size
                screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                screen.setVisible(true);        // Display the window
            }
            public Screen()
            {
                setLayout(null);
                mb=new JMenuBar();
                setJMenuBar(mb);
                ind=new JMenu("INDICES");
                mb.add(ind);
                cua=new JMenuItem("Cuadrado");
                cua.addActionListener(this);
                ind.add(cua);
                mi1=new JMenuItem("Rojo");
                mi1.addActionListener(this);
                ind.add(mi1);
                mi2=new JMenuItem("Verde");
                mi2.addActionListener(this);
                ind.add(mi2);
                mi3=new JMenuItem("Azul");
                mi3.addActionListener(this);
                ind.add(mi3);
            }
            public void actionPerformed(ActionEvent e)
            {
                Container f=this.getContentPane();
                if (e.getSource()==cua) {
                    this.getContentPane().add(dummyObject);
                    dummyObject.setVisible(true);
                    this.pack();
                }
                if (e.getSource()==mi1) {
                    f.setBackground(new Color(255,0,0));
                }
                if (e.getSource()==mi2) {
                    f.setBackground(new Color(0,255,0));
                }
                if (e.getSource()==mi3) {
                    f.setBackground(new Color(0,0,255));
                }
            }
            /*public void paint(Graphics g)
            {
                g.setColor(Color.WHITE);
                g.fillRect(0,0, getWidth(),getHeight());
                g.setColor(Color.BLACK);
                g.setFont(new Font("Serif",Font.BOLD,18));
                g.drawString("HOLA MUNDO", this.getSize().width/2-60, this.getSize().height/2+9);
            }*/
        }
            //JFrameWindows windows = new JFrameWindows();
        //windows.setVisible(true)
        //}
/*public class Screen extends JFrame
{
    static JFrame F = new Screen();


    public Screen()
    {
        add(dummyObject);
        setUndecorated(true);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setVisible(true);
    }

    public static void main(String[] args)
    {

    }
}*/
