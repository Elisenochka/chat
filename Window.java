import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedWriter;

/**
 * Created by Romych on 15.04.2016.
 */
public class Window extends JFrame implements ActionListener{
    public static JTextArea ta = new JTextArea();
    int lines =0;
    public JLabel[] text = new JLabel[lines];
    public Window(String name, BufferedWriter writer){
        setTitle(name);
        setSize(400,400);
        setLocation(1200,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        final JTextArea jta = new JTextArea();
        JButton jb1 = new JButton("Send");
        jb1.setMnemonic(KeyEvent.VK_ENTER);
        jta.setFont(new Font("Times New Roman", Font.ITALIC,14));
        jta.setBackground(Color.lightGray);
        add(jta);
        final JTextField jtf = new JTextField();
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new BorderLayout());
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BorderLayout());
        add(southPanel,BorderLayout.SOUTH);
        add(northPanel,BorderLayout.NORTH);
        southPanel.setLayout(new BorderLayout());
        southPanel.add(jtf, BorderLayout.CENTER);
        southPanel.add(jb1, BorderLayout.EAST);
        jb1.addActionListener(this);
        //jb1.setMnemonic(KeyEvent.KEY_PRESSED);
        //JRootPane rp = SwingUtilities.getRootPane(jb1);
        //rp.setDefaultButton(jb1);
        //
        jtf.addKeyListener(new KeyListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                }
                jb1.addActionListener(new

                                              ActionListener() {
                                                  @Override
                                                  public void actionPerformed(ActionEvent e) {
                                                      jta.append(jtf.getText() + '\n');
                                                      //;
                                                      jta.append(ta.getText());
                                                      jtf.setText("");


                                                  }
                                              }

                );

                setVisible(true);


            }

        }
