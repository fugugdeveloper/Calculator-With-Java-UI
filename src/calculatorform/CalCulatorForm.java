package calculatorform;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class CalCulatorForm extends JFrame implements ActionListener, MouseListener, MouseMotionListener {

    CalCulatorInterface remote;

    boolean of;
    boolean onn;
    boolean fan;
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;
    JPanel panel5;
    JPanel panel6;
    JPanel panel7;
    JPanel panel8;
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton negative;
    JButton dot;
    JButton plus;
    JButton minus;
    JButton div;
    JButton mul;
    JButton mod;
    JButton equal;
    JButton doublezero;
    JButton plusorminus;
    JLabel menu;
    JButton MR;
    JButton MC;
    JButton MS;
    JButton c;
    JButton Ce;
    JButton backspace;
    JToggleButton on;
    JToggleButton off;
    Box box1;
    Box box2;
    Box box3;
    Box box4;
    Box box5;
    Box box6;
    JTextArea input;
    JTextArea display;
    JTextField memory;
    double innum1;
    double innum2;
    double result;
    boolean decpoint;
    boolean zerodisp;
    byte operation;
    Font f = new Font(Font.SANS_SERIF, Font.BOLD, 20);
    Font m = new Font(Font.SANS_SERIF, Font.BOLD, 15);
    JDialog dlg = new JDialog();
    JLabel exit;
    JLabel mini;

    public CalCulatorForm() throws NotBoundException, MalformedURLException, RemoteException {
remote=(CalCulatorInterface) Naming.lookup("rmi://localhost:1099/Calculator");
  System.out.println("Connected successfull");
        box1 = Box.createVerticalBox();
        box2 = Box.createVerticalBox();
        box3 = Box.createVerticalBox();
        box4 = Box.createHorizontalBox();
        box5 = Box.createHorizontalBox();
        box6 = Box.createHorizontalBox();

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        panel6 = new JPanel();
        panel7 = new JPanel();
        ImageIcon backb = new ImageIcon("Icon/back.png");
        backspace = new JButton(backb);
        backspace.setBackground(Color.DARK_GRAY);

        backspace.setFocusable(false);
        backspace.setBorderPainted(true);
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        equal = new JButton("Answer");
        doublezero = new JButton("00");
        plus = new JButton("+");
        minus = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        mod = new JButton("%");
        dot = new JButton(".");
        c = new JButton("C");
        Ce = new JButton("CE");
        MR = new JButton("MR");
        MC = new JButton("MC");
        MS = new JButton("MS");
      
        panel6.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel6.setBackground(Color.DARK_GRAY);
        JLabel stand = new JLabel("STANDARD");
        stand.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {

            }

            @Override
            public void mousePressed(MouseEvent me) {
              
                dlg.setVisible(false);
                dlg.dispose();
            }

            @Override
            public void mouseReleased(MouseEvent me) {

            }

            @Override
            public void mouseEntered(MouseEvent me) {

            }

            @Override
            public void mouseExited(MouseEvent me) {

            }

        });
        stand.setFont(f);
        stand.setForeground(Color.WHITE);
      
        panel6.add(stand);
        panel6.addMouseMotionListener(this);
        Box minexit = Box.createHorizontalBox();
        panel8 = new JPanel();
        panel8.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panel8.setBackground(Color.DARK_GRAY);
        ImageIcon exitimage = new ImageIcon("Icon/close.PNG");
        exit = new JLabel(exitimage);

        exit.addMouseListener(this);
        ImageIcon miniimage = new ImageIcon("Icon/min.PNG");
        mini = new JLabel(miniimage);
        mini.addMouseListener(this);
        panel8.add(mini);
        panel8.add(exit);
        minexit.add(panel6);
        minexit.add(panel8);
     
        panel7 = new JPanel();

//panel7.add(sc);
//panel7.add(st);

        on = new JToggleButton("ON");

        on.setSelected(true);
        off = new JToggleButton("OFF");

        memory = new JTextField(7);
        negative = new JButton("neg");
        input = new JTextArea(2, 3);
        display = new JTextArea(2, 3);
        plusorminus = new JButton("+/-");
        memory.setText("0");
        button0.setBackground(Color.GRAY);
        button5.setBackground(Color.GRAY);
        button1.setBackground(Color.GRAY);
        button6.setBackground(Color.GRAY);
        button2.setBackground(Color.GRAY);
        button7.setBackground(Color.GRAY);
        button3.setBackground(Color.GRAY);
        button8.setBackground(Color.GRAY);
        button4.setBackground(Color.GRAY);
        button9.setBackground(Color.GRAY);
        plus.setBackground(Color.LIGHT_GRAY);
        mod.setBackground(Color.LIGHT_GRAY);
        minus.setBackground(Color.LIGHT_GRAY);
        doublezero.setBackground(Color.GRAY);
        mul.setBackground(Color.LIGHT_GRAY);
        dot.setBackground(Color.GRAY);
        div.setBackground(Color.LIGHT_GRAY);
        c.setBackground(Color.GRAY);
        Ce.setBackground(Color.GRAY);
        equal.setBackground(Color.decode("#E87020"));
        plusorminus.setBackground(Color.GRAY);
        input.setBackground(Color.LIGHT_GRAY);
        display.setBackground(Color.LIGHT_GRAY);
        on.setBackground(Color.LIGHT_GRAY);
        off.setBackground(Color.LIGHT_GRAY);
        MR.setBackground(Color.LIGHT_GRAY);
        MC.setBackground(Color.LIGHT_GRAY);
        MS.setBackground(Color.LIGHT_GRAY);
        memory.setBackground(Color.LIGHT_GRAY);
        ButtonGroup gb = new ButtonGroup();
        gb.add(on);
        gb.add(off);

        button0.setFont(f);
        button1.setFont(f);
        button2.setFont(f);
        button3.setFont(f);
        button4.setFont(f);
        button5.setFont(f);
        button6.setFont(f);
        button7.setFont(f);
        button8.setFont(f);
        button9.setFont(f);
        memory.setFont(m);
        c.setFont(f);
        Ce.setFont(f);
        plusorminus.setFont(f);
        button1.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2, true));
        button2.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2, true));
        button3.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2, true));
        button4.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2, true));
        button5.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2, true));
        button6.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2, true));
        button7.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2, true));
        button8.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2, true));
        button9.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2, true));
        button9.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2, true));
        button9.setFocusable(false);
        button0.setFocusable(false);
        button8.setFocusable(false);
        button1.setFocusable(false);
        button7.setFocusable(false);
        button2.setFocusable(false);
        button6.setFocusable(false);
        button3.setFocusable(false);
        button5.setFocusable(false);
        button4.setFocusable(false);
        plus.setFocusable(false);
        minus.setFocusable(false);
        div.setFocusable(false);
        mod.setFocusable(false);
        dot.setFocusable(false);
        doublezero.setFocusable(false);
        negative.setFocusable(false);
        plusorminus.setFocusable(false);

        plus.setFont(f);
        minus.setFont(f);
        div.setFont(f);
        mul.setFont(f);
        mod.setFont(f);
        equal.setFont(f);
        doublezero.setFont(f);
        dot.setFont(f);

        display.setEditable(false);
        input.setText("0");
        input.setFont(f);
        display.setFont(f);
        panel5.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panel1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 5, true));
        panel5.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 5, false));
        panel4.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 5, false));

        panel1.setLayout(new GridLayout(2, 1, 0, 0));

//panel1.add(panel6);
        panel1.add(display);
        panel1.add(input);
        panel7.setBackground(Color.decode("#E87020"));
        box5.add(minexit);
        box1.add(box5);
        box1.add(panel1);
        panel2.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 10, true));
        panel2.setLayout(new GridLayout(5, 4, 2, 7));
        panel2.add(button7);
        panel2.add(button8);
        panel2.add(button9);
        panel2.add(plus);
        panel2.add(button4);
        panel2.add(button5);
        panel2.add(button6);
        panel2.add(minus);
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(mul);
        panel2.add(button0);
        panel2.add(plusorminus);
        panel2.add(dot);
        panel2.add(div);
        panel2.add(doublezero);
        panel2.add(Ce);
        panel2.add(c);
        panel2.add(mod);
        panel4.add(MR);
        panel4.add(MC);
        panel4.add(MS);
        panel4.add(memory);
        panel5.add(backspace);
        panel5.add(on);
        panel5.add(off);

        panel3.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 0, false));
        panel3.setLayout(new BorderLayout());
        panel3.add("Center", equal);

        panel3.setSize(this.getX(), 100);
        button1.addActionListener(this);
        button6.addActionListener(this);
        button2.addActionListener(this);
        button7.addActionListener(this);
        button3.addActionListener(this);
        button8.addActionListener(this);
        button4.addActionListener(this);
        button9.addActionListener(this);
        button5.addActionListener(this);
        button0.addActionListener(this);
        dot.addActionListener(this);
        c.addActionListener(this);
        Ce.addActionListener(this);
        plusorminus.addActionListener(this);
        MR.addActionListener(this);
        MC.addActionListener(this);
        MS.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        mod.addActionListener(this);
        equal.addActionListener(this);
        doublezero.addActionListener(this);
        on.addActionListener(this);
        off.addActionListener(this);
        backspace.addActionListener(this);
//box3.add(plus);
//box3.add(minus);
//box3.add(mul);
//box3.add(div);
//box3.add(doublezero);
        panel1.setBackground(Color.DARK_GRAY);
        panel2.setBackground(Color.DARK_GRAY);
        panel3.setBackground(Color.DARK_GRAY);
        panel4.setBackground(Color.DARK_GRAY);
        panel5.setBackground(Color.DARK_GRAY);
        box3.add(panel4);
        box3.add(panel5);
        box3.add(panel2);
        add("South", panel3);
        add("Center", box3);
        add("North", box1);
        off.setBackground(Color.RED);
        this.setBackground(Color.DARK_GRAY);
        this.setTitle("Real Calculator");
        this.setSize(300, 550);
        this.setResizable(false);
        this.setUndecorated(true);
//this.setLocationRelativeTo(null);

        this.setVisible(true);
        panel1.addMouseListener(this);
        panel2.addMouseListener(this);
        panel3.addMouseListener(this);
        panel4.addMouseListener(this);
        panel5.addMouseListener(this);
        panel6.addMouseListener(this);
        panel7.addMouseListener(this);
        panel8.addMouseListener(this);
        input.addMouseListener(this);
        display.addMouseListener(this);
        button0.addMouseListener(this);
        button2.addMouseListener(this);
        button3.addMouseListener(this);
        button4.addMouseListener(this);
        button5.addMouseListener(this);
        button6.addMouseListener(this);
        button7.addMouseListener(this);
        button8.addMouseListener(this);
        button9.addMouseListener(this);

        equal.addMouseListener(this);
        mul.addMouseListener(this);
        div.addMouseListener(this);
        mod.addMouseListener(this);
        plus.addMouseListener(this);
        minus.addMouseListener(this);
        MC.addMouseListener(this);
        memory.addMouseListener(this);
        MR.addMouseListener(this);
        MS.addMouseListener(this);
        dot.addMouseListener(this);
        plusorminus.addMouseListener(this);
        Ce.addMouseListener(this);
        c.addMouseListener(this);
        doublezero.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent me) {

        dlg.setVisible(false);
        dlg.dispose();
        
    }

    @Override

    public void mousePressed(MouseEvent me) {
        if (me.getSource() == panel1) {
            dlg.setVisible(false);
            dlg.dispose();
            
        }
        if (me.getSource() == panel2) {
            dlg.setVisible(false);
            dlg.dispose();
          
        }
        if (me.getSource() == panel3) {
            dlg.setVisible(false);
            dlg.dispose();
 
        }
        if (me.getSource() == panel4) {
            dlg.setVisible(false);
            dlg.dispose();
      
        }
        if (me.getSource() == panel5) {
            dlg.setVisible(false);
            dlg.dispose();
        
        }
        if (me.getSource() == panel6) {
            dlg.setVisible(false);
            dlg.dispose();
            
        }
        if (me.getSource() == panel7) {
            dlg.setVisible(false);
            dlg.dispose();
           
        }
        if (me.getSource() == panel8) {
            dlg.setVisible(false);
            dlg.dispose();
         
        }
        if (me.getSource() == input) {
            dlg.setVisible(false);
            dlg.dispose();

        }
        if (me.getSource() == display) {
            dlg.setVisible(false);
            dlg.dispose();
           
        }
        if (me.getSource() == button0) {
            dlg.setVisible(false);
            dlg.dispose();
           
        }
        if (me.getSource() == button1) {
            dlg.setVisible(false);
            dlg.dispose();
           
        }
        if (me.getSource() == button2) {
            dlg.setVisible(false);
            dlg.dispose();
            
        }
        if (me.getSource() == button3) {
            dlg.setVisible(false);
            dlg.dispose();
  
        }
        if (me.getSource() == button4) {
            dlg.setVisible(false);
            dlg.dispose();

        }
        if (me.getSource() == button5) {
            dlg.setVisible(false);
            dlg.dispose();
          
        }

        if (me.getSource() == button6) {
            dlg.setVisible(false);
            dlg.dispose();

        }

        if (me.getSource() == button7) {
            dlg.setVisible(false);
            dlg.dispose();
          
        }

        if (me.getSource() == button8) {
            dlg.setVisible(false);
            dlg.dispose();
          
        }

        if (me.getSource() == button9) {
            dlg.setVisible(false);
            dlg.dispose();
           
        }
        if (me.getSource() == equal) {
            dlg.setVisible(false);
            dlg.dispose();
           
        }
        if (me.getSource() == off) {
            dlg.setVisible(false);
            dlg.dispose();
           
        }
        if (me.getSource() == on) {
            dlg.setVisible(false);
            dlg.dispose();
         
        }
        if (me.getSource() == mul) {
            dlg.setVisible(false);
            dlg.dispose();
            
        }
        if (me.getSource() == div) {
            dlg.setVisible(false);
            dlg.dispose();
            
        }
        if (me.getSource() == minus) {
            dlg.setVisible(false);
            dlg.dispose();
            
        }
        if (me.getSource() == plus) {
            dlg.setVisible(false);
            dlg.dispose();
            
        }
        if (me.getSource() == mod) {
            dlg.setVisible(false);
            dlg.dispose();
           
        }
        if (me.getSource() == MC) {
            dlg.setVisible(false);
            dlg.dispose();
            
        }
        if (me.getSource() == MR) {
            dlg.setVisible(false);
            dlg.dispose();
            
        }
        if (me.getSource() == MS) {
            dlg.setVisible(false);
            dlg.dispose();
            
        }
        if (me.getSource() == memory) {
            dlg.setVisible(false);
            dlg.dispose();
            
        }
        if (me.getSource() == backspace) {
            dlg.setVisible(false);
            dlg.dispose();
           
        }
        if (me.getSource() == dot) {
            dlg.setVisible(false);
            dlg.dispose();
            
        }
        if (me.getSource() == plusorminus) {
            dlg.setVisible(false);
            dlg.dispose();
           
        }
        if (me.getSource() == Ce) {
            dlg.setVisible(false);
            dlg.dispose();
           
        }
        if (me.getSource() == c) {
            dlg.setVisible(false);
            dlg.dispose();
           
        }
        if (me.getSource() == doublezero) {
            dlg.setVisible(false);
            dlg.dispose();
            
        }

        if (me.getSource() == exit) {
            System.exit(0);

        } else if (me.getSource() == mini) {
            setExtendedState(ICONIFIED);

        } else if (me.getSource() == menu) {
           

            CalCulatorForm b;
            JPanel panel = new JPanel();
            JLabel labe11 = new JLabel("STANDARD");
            JLabel labe12 = new JLabel("SCIENTIFIC");
            JLabel labe13 = new JLabel("CONVERTION");
            JLabel labe14 = new JLabel("TIME");
            JLabel labe15 = new JLabel("LENGTH");
            panel.setLayout(new GridLayout(5, 1, 6, 6));
            labe11.setForeground(Color.WHITE);
            labe12.setForeground(Color.WHITE);
            labe13.setForeground(Color.WHITE);
            labe15.setForeground(Color.WHITE);
            labe14.setForeground(Color.WHITE);
            labe11.setFont(f);
            labe12.setFont(f);
            labe13.setFont(f);
            labe14.setFont(f);
            labe15.setFont(f);

            panel.add(labe11);
            panel.add(labe12);
            panel.add(labe13);
            panel.add(labe14);
            panel.add(labe15);
            panel.setBackground(Color.DARK_GRAY);
            JPanel panel2 = new JPanel();
            panel2.setBackground(Color.DARK_GRAY);
    
            panel2.setLayout(new FlowLayout(FlowLayout.RIGHT));
         
            Box box = Box.createVerticalBox();
            box.add(panel2);
            box.add(panel);

            JPanel panel3 = new JPanel();
            panel3.setBackground(Color.DARK_GRAY);
            

            dlg.add("North", box);
            dlg.add("Center", panel3);
            dlg.setUndecorated(true);
            dlg.setBackground(Color.DARK_GRAY);
            dlg.setSize(150, 500);
            dlg.setModal(false);
        
            dlg.setLocation((this.getX()) + 2, (this.getY() + 28));
            dlg.setVisible(true);

            
            labe11.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent me) {
                }

                @Override
                public void mousePressed(MouseEvent me) {
                
                    dlg.setVisible(false);
                    dlg.dispose();

                }

                @Override
                public void mouseReleased(MouseEvent me) {
                }

                @Override
                public void mouseEntered(MouseEvent me) {
                }

                @Override
                public void mouseExited(MouseEvent me) {
                }
            });
            labe12.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent me) {
                }

                @Override
                public void mousePressed(MouseEvent me) {
                    

                   
                    dlg.setVisible(false);
                    dlg.dispose();
//setVisible(false); 
                    Thread th = new Thread() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(50);
                                dis();
                            } catch (InterruptedException ex) {
                            }
                        }
                    };
                    th.start();
//dispose();

                }

                @Override
                public void mouseReleased(MouseEvent me) {
                }

                @Override
                public void mouseEntered(MouseEvent me) {
                }

                @Override
                public void mouseExited(MouseEvent me) {
                }
            });
        }
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        int x = me.getXOnScreen();
        int y = me.getYOnScreen();
        this.setLocation(x, y);

    }

    @Override
    public void mouseMoved(MouseEvent me) {
    }

    public void Show() throws NotBoundException, MalformedURLException, RemoteException {
        new CalCulatorForm();
        dlg.setVisible(false);
        dlg.dispose();
    }

    public void dis() {
        this.setVisible(false);
        this.dispose();
        dlg.setVisible(false);
        dlg.dispose();
    }

    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
        new CalCulatorForm();


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == backspace) {
            int length = input.getText().length();
            int number = input.getText().length() - 1;
            String store;
            if (length > 0) {
                StringBuilder back = new StringBuilder(input.getText());
                back.deleteCharAt(number);
                store = back.toString();
                input.setText(store);
            }
        }
        if (e.getSource() == button0) {
            if (!zerodisp && !decpoint) {
                input.setText(null);
            }
            input.setText(input.getText() + "0");

        }
        if (e.getSource() == button1) {
            if (!zerodisp && !decpoint) {
                input.setText(null);
            }
            input.setText(input.getText() + "1");
            zerodisp = true;
        }
        if (e.getSource() == button2) {
            if (!zerodisp && !decpoint) {
                input.setText(null);
            }
            input.setText(input.getText() + "2");
            zerodisp = true;
        }
        if (e.getSource() == button3) {
            if (!zerodisp && !decpoint) {
                input.setText(null);
            }
            input.setText(input.getText() + "3");
            zerodisp = true;
        }
        if (e.getSource() == button4) {
            if (!zerodisp && !decpoint) {
                input.setText(null);
            }
            input.setText(input.getText() + "4");
            zerodisp = true;
        }
        if (e.getSource() == button5) {
            if (!zerodisp && !decpoint) {
                input.setText(null);
            }
            input.setText(input.getText() + "5");
            zerodisp = true;
        }
        if (e.getSource() == button6) {
            if (!zerodisp && !decpoint) {
                input.setText(null);
            }
            input.setText(input.getText() + "6");
            zerodisp = true;
        }
        if (e.getSource() == button7) {
            if (!zerodisp && !decpoint) {
                input.setText(null);
            }
            input.setText(input.getText() + "7");
            zerodisp = true;
        }
        if (e.getSource() == button8) {
            if (!zerodisp && !decpoint) {
                input.setText(null);
            }
            input.setText(input.getText() + "8");
            zerodisp = true;
        }
        if (e.getSource() == button9) {
            if (!zerodisp && !decpoint) {
                input.setText(null);
            }
            input.setText(input.getText() + "9");
            zerodisp = true;
        }
        if (e.getSource() == doublezero) {
            if (!zerodisp && !decpoint) {
                input.setText(null);
            }
            input.setText(input.getText() + "00");
            zerodisp = true;
        }
        if (e.getSource() == dot) {
            if (!decpoint) {
                input.setText(input.getText() + ".");
                decpoint = true;
            }

        }
        if (e.getSource() == plusorminus) {
            boolean zero = false;
            innum1 = Double.parseDouble(String.valueOf(input.getText()));

            result = innum1 * -1;
            if (result > -1000000000 && result < 1000000000) {
                input.setText(String.valueOf(result));
            } else {
                input.setText("Invalid");
                input.setEnabled(false);
            }
            decpoint = true;
            result = 0;
        }
        if (e.getSource() == c) {
            display.setText(null);
            input.setText("0");
            innum1 = 0;
            innum2 = 0;
            zerodisp = false;
            decpoint = false;
        }
        if (e.getSource() == Ce) {
            input.setText(null);
            display.setText(null);
            zerodisp = false;
            decpoint = false;
            innum1 = 0;
            innum2 = 0;
            result = 0;
        }
        if (e.getSource() == MR) {
            input.setText(String.valueOf(memory.getText()));
        }
        if (e.getSource() == MC) {
            memory.setText("0");
        }
        if (e.getSource() == MS) {

            memory.setText(String.valueOf(input.getText()));
            memory.getText();
            decpoint = false;

        }
        if (e.getSource() == plus) {
            if (operation == 0) {
                innum1 = Double.parseDouble(String.valueOf(input.getText()));
            } else {
                innum2 = Double.parseDouble(String.valueOf(input.getText()));
            }
            if (operation == 1) {

                //innum1=innum1+innum2;
                try {
                    innum1 = remote.add(innum1, innum2);
                } catch (Exception ex) {
                };
            }
            if (operation == 2) {
                //innum1=innum1-innum2;
                try {
                    innum1 = remote.sub(innum1, innum2);
                } catch (Exception ex) {
                };
            }
            if (operation == 3) {
                //innum1=innum1*innum2;
                try {
                    innum1 = remote.mul(innum1, innum2);
                } catch (Exception ex) {
                };
                if (fan == true) {
                    innum1 = Double.parseDouble(String.valueOf(input.getText()));
                    double d = result * innum1;
                    display.setText(String.valueOf(d));
                }
            }
            if (operation == 4) {
                //innum1=innum1/innum2;
                try {
                    innum1 = remote.div(innum1, innum2);
                } catch (Exception ex) {
                };
            }
            if (operation == 5) {

                //innum1=innum1%innum2/100;
                try {
                    innum1 = remote.mol(innum1, innum2);
                } catch (Exception ex) {
                };
            }
            input.setText("0");
            display.setText(String.valueOf(innum1) + "+");

            operation = 1;
            decpoint = false;
            zerodisp = false;

        }

        if (e.getSource() == minus) {
            if (operation == 0) {
                innum1 = Double.parseDouble(String.valueOf(input.getText()));
            } else {
                innum2 = Double.parseDouble(String.valueOf(input.getText()));
            }
            if (operation == 1) {
                //innum1=innum1+innum2;
                try {
                    innum1 = remote.add(innum1, innum2);
                } catch (Exception ex) {
                };
            }
            if (operation == 2) {
                //innum1=innum1-innum2;
                try {
                    innum1 = remote.sub(innum1, innum2);
                } catch (Exception ex) {
                };
            }
            if (operation == 3) {
                //innum1=innum1*innum2;
                try {
                    innum1 = remote.mul(innum1, innum2);
                } catch (Exception ex) {
                };
                if (fan == true) {
                    innum1 = Double.parseDouble(String.valueOf(input.getText()));
                    double d = result * innum1;
                    display.setText(String.valueOf(d));
                }
            }
            if (operation == 4) {
                //innum1=innum1/innum2;
                try {
                    innum1 = remote.div(innum1, innum2);
                } catch (Exception ex) {
                };
            }
            if (operation == 5) {
                //innum1=innum1%innum2/100;
                try {
                    innum1 = remote.mol(innum1, innum2);
                } catch (Exception ex) {
                };
            }
            input.setText("0");
            display.setText(String.valueOf(innum1) + "-");

            operation = 2;
            decpoint = false;
            zerodisp = false;
        }
        if (e.getSource() == mul) {

            if (operation == 0) {
                innum1 = Double.parseDouble(String.valueOf(input.getText()));
            } else {
                innum2 = Double.parseDouble(String.valueOf(input.getText()));
            }
            if (operation == 1) {
                try {
                    //innum1=innum1+innum2;
                    if (remote != null) {
                        innum1 = remote.add(innum1, innum2);
                    }
                } catch (RemoteException ex) {

                }
            }
            if (operation == 2) {
                //innum1=innum1-innum2;
                try {
                    if (remote != null) {
                        innum1 = remote.sub(innum1, innum2);
                    }
                } catch (RemoteException ex) {

                }
            }
            if (operation == 3) {
                //innum1=innum1*innum2;
                try {

                    if (remote != null) {
                        innum1 = remote.mul(innum1, innum2);
                    }
                } catch (RemoteException ex) {

                }
                if (fan == true) {

                    innum1 = Double.parseDouble(String.valueOf(input.getText()));
                    double d = result * innum1;
                    display.setText(String.valueOf(d));
//                        try {
//                        double d =remote.mul(result, innum1);
//                        display.setText(String.valueOf(d));
//                    } catch (RemoteException ex) {}
                }
            }
            if (operation == 4) {
                //innum1=innum1/innum2;
                try {

                    if (remote != null) {
                        innum1 = remote.div(innum1, innum2);
                    }
                } catch (RemoteException ex) {

                }
            }
            if (operation == 5) {
                try {
                    //innum1=innum1%innum2/100;
                    innum1 = remote.mol(innum1, innum2);
                } catch (RemoteException ex) {

                }
            }
            input.setText("0");
            display.setText(String.valueOf(innum1) + "*");

            operation = 3;
            decpoint = false;
            zerodisp = false;
        }
        if (e.getSource() == div) {
            if (operation == 0) {
                innum1 = Double.parseDouble(String.valueOf(input.getText()));
            } else {
                innum2 = Double.parseDouble(String.valueOf(input.getText()));
            }
            if (operation == 1) {
                //innum1=innum1+innum2;
                try {
                    innum1 = remote.add(innum1, innum2);
                } catch (Exception ex) {
                };

            }
            if (operation == 2) {

                //innum1=innum1-innum2;
                try {
                    innum1 = remote.sub(innum1, innum2);
                } catch (Exception ex) {
                };
            }
            if (operation == 3) {
                //innum1=innum1*innum2;
                try {
                    innum1 = remote.mul(innum1, innum2);
                } catch (Exception ex) {
                };
                if (fan == true) {
                    innum1 = Double.parseDouble(String.valueOf(input.getText()));
                    double d = result * innum1;
                    display.setText(String.valueOf(d));
                }
            }
            if (operation == 4) {
                //innum1=innum1/innum2;
                try {
                    innum1 = remote.div(innum1, innum2);
                } catch (Exception ex) {
                };
            }
            if (operation == 5) {
                //innum1=innum1%innum2/100;
                try {
                    innum1 = remote.mol(innum1, innum2);
                } catch (Exception ex) {
                };
            }
            input.setText("0");
            display.setText(String.valueOf(innum1) + "/");

            operation = 4;
            decpoint = false;
            zerodisp = false;
        }
        if (e.getSource() == mod) {
            innum1 = Double.parseDouble(String.valueOf(input.getText()));
            input.setText("0");
            display.setText(String.valueOf(innum1 + "%("));
            decpoint = false;
            zerodisp = false;
            operation = 5;
        }
        if (e.getSource() == equal) {

            innum2 = Double.parseDouble(String.valueOf(input.getText()));
            if (operation == 0) {
                result =innum1;
                
                display.setText(String.valueOf(innum2));
            }
            if (operation == 1) {
                try {
                    //result=innum1+innum2;
                    result= remote.add(innum1, innum2);
                } catch (RemoteException ex) {
                   
                }
                

                display.setText(display.getText() + String.valueOf(innum2));
            }
            if (operation == 2) {
                //result=innum1-innum2;
                try {
                    //result=innum1+innum2;
                    result= remote.sub(innum1, innum2);
                } catch (RemoteException ex) {
                   
                }
                display.setText(display.getText() + String.valueOf(innum2));
            }
            if (operation == 3) {
             // result=innum1*innum2;
                 try {
                    //result=innum1+innum2;
                    result= remote.mul(innum1, innum2);
                } catch (RemoteException ex) {
                   
                }

                display.setText(display.getText() + String.valueOf(innum2));
                if (fan == true) {
                    innum1 = Double.parseDouble(String.valueOf(input.getText()));
                    double d = result * innum1;
                    display.setText(String.valueOf(d));
                }
            }
            if (operation == 4) {
                
                   //result=innum1/innum2;
                  try {
                    //result=innum1+innum2;
                    result= remote.div(innum1, innum2);
                } catch (RemoteException ex) {
                   
                }

                display.setText(display.getText() + String.valueOf(innum2) + "");
            }
            if (operation == 5) {
               // result = (innum1 % innum2) / 100;
                try {
                    //result=innum1+innum2;
                    result= remote.mol(innum1, innum2);
                } catch (RemoteException ex) {
                   
                }
                display.setText(display.getText() + String.valueOf(innum2) + ")");
            }
            if (result > -1000000000 && result < 1000000000) {
                input.setText(String.valueOf(result));
            } else {
                input.setText("Invalid");
                input.setEnabled(false);
            }
            innum1 = 0;
            innum2 = 0;
            fan = true;
            decpoint = true;
            zerodisp = true;

        }
        if (e.getSource() == on) {
            on.setBackground(Color.GREEN);
            off.setBackground(Color.RED);
            button0.setEnabled(true);
            button1.setEnabled(true);
            button2.setEnabled(true);
            button3.setEnabled(true);
            button4.setEnabled(true);
            button5.setEnabled(true);
            button6.setEnabled(true);
            button7.setEnabled(true);
            button8.setEnabled(true);
            button9.setEnabled(true);
            plus.setEnabled(true);
            minus.setEnabled(true);
            mul.setEnabled(true);
            div.setEnabled(true);
            mod.setEnabled(true);
            doublezero.setEnabled(true);
            memory.setEnabled(true);
            plusorminus.setEnabled(true);
            input.setEnabled(true);
            Ce.setEnabled(true);
            display.setEnabled(true);
            c.setEnabled(true);
            dot.setEnabled(true);
            MR.setEnabled(true);
            MC.setEnabled(true);
            equal.setEnabled(true);
            MS.setEnabled(true);
           
            input.setText("0");
            zerodisp = false;
        }
        if (e.getSource() == off) {
            off.setBackground(Color.GREEN);
            on.setBackground(Color.RED);
            button0.setEnabled(false);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            plus.setEnabled(false);
            minus.setEnabled(false);
            mul.setEnabled(false);
            div.setEnabled(false);
            mod.setEnabled(false);
            doublezero.setEnabled(false);
            memory.setEnabled(false);
            plusorminus.setEnabled(false);
            input.setEnabled(false);
            Ce.setEnabled(false);
            display.setEnabled(false);
            c.setEnabled(false);
            dot.setEnabled(false);
            MR.setEnabled(false);
            MC.setEnabled(false);
            equal.setEnabled(false);
            MS.setEnabled(false);
            input.setText(null);
            display.setText(null);
            of = false;
        }

    }

}
