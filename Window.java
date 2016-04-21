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
public class Window extends JFrame{
    int lines =0;
    public JLabel[] text = new JLabel[lines];

    public Window(final String name, final String text){
        setTitle(name);
        setSize(400,400);
        setLocation(1200,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        final JTextArea jta = new JTextArea();
        final JButton jb1 = new JButton("Send");
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
        //jb1.addActionListener();
        //jb1.setMnemonic(KeyEvent.KEY_PRESSED);
        //JRootPane rp = SwingUtilities.getRootPane(jb1);
        //rp.setDefaultButton(jb1);
        //
        jtf.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e){
            }

        public void keyPressed(KeyEvent e){
            }

            public void keyReleased(KeyEvent e){
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    jta.append(jtf.getText() + '\n');
                    jtf.setText("");
                }
            }
        });
                jb1.addActionListener(new ActionListener() {
            @Override
                 public void actionPerformed(ActionEvent e) {
                       jta.append(text);
                    }
        });

                setVisible(true);


    }

    public void printInWindow(String text){

    }

}
