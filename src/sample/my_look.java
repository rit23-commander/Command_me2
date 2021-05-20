package sample;
import javax.swing.* ;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class my_look {

private  JTextArea shell ;
private String enter_text ;

    public void look() {

        JFrame f = new JFrame("Command Shell");

        f.setVisible(true);
        f.setSize(200 , 200) ;
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        f.setLayout(new BorderLayout());

        shell = new JTextArea();
        shell.setBackground(Color.BLACK);
        shell.setForeground(Color.GREEN);
        shell.setFont(new Font("classic" , Font.ITALIC , 15));
       shell.setCaretColor(Color.GREEN);
       shell.setRows(100);
       shell.setColumns(100);

        JScrollPane pane = new JScrollPane(shell , JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER );
        f.add(pane);

    }

    private void work_process() {

       shell.setText("Shell is Started \n");

        enter_text = shell.getText() ;

        shell.addKeyListener(new KeyListener() {

            int co  ;

            @Override
            public void keyTyped(KeyEvent keyEvent) {
                // No Use
            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {
             int code = keyEvent.getKeyCode();
                if(code == 10 && ! enter_text.isEmpty()) {


                }

            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {

            }

        });
    }

     private  void match( ) {
         switch(enter_text) {



             default :
                 shell.setText("\n Invalid Command enter") ;
                 break ;
         }
   }

    public static void main(String [] args) {
       new my_look().look();

    }
}
