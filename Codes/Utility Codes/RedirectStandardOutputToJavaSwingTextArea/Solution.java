package RedirectStandardOutputToJavaSwingTextArea; /**
 * Project: TestProject
 * Package: PACKAGE_NAME
 * Date: 30/Mar/2015
 * Time: 15:01
 * System Time: 3:01 PM
 */

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;


/*
    Redirect the output to Java Swing textarea
    The below example will redirect the System.out to Java Swing text area.
    If want to redirect java.util.logging.Logger to Java Swing text area.
    Need override ConsoleHandler to setOutputStream(System.err); to setOutputStream(System.out);

    Or update System.setOut(new PrintStream(new PipedOutputStream(outPipe), true));
    to System.setErr(new PrintStream(new PipedOutputStream(outPipe), true));

    From: http://yanfengpeng.blogspot.com/2014/01/redirect-output-to-java-swing-textarea.html
 */

public class Solution {

    private static Logger logger = Logger.getLogger(Solution.class.getName());

    /**
     * Output message using system.out
     * @param msg
     */
    public static void outputTest(String msg){
        for(int i=0;i<10;i++){
            System.out.println(i+" "+msg);
            logger.info("Test "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }


    /**
     * Redirect the standard output stream
     * @param area swing testarea
     * @throws IOException
     */
    public static void console(final JTextArea area) throws IOException {
        final PipedInputStream outPipe = new PipedInputStream();

        // reassign the standard output stream
        System.setOut(new PrintStream(new PipedOutputStream(outPipe), true));

        // redirect the output stream into swing textarea
        new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {
                Scanner s = new Scanner(outPipe);
                while (s.hasNextLine()){
                    String line = s.nextLine();
                    publish(line + "\n");
                }
                s.close();
                return null;
            }

            @Override
            protected void process(List<String> chunks) {
                for (String line : chunks){
                    area.append(line);
                }
            }
        }.execute();
    }

    /**
     * test
     * @param args user input
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("JConsole");
        JTextArea jta = new JTextArea();
        JButton button = new JButton("Run");
        frame.setLayout(new BorderLayout());
        frame.add(button,BorderLayout.NORTH);
        frame.add(jta,BorderLayout.CENTER);

        // send information from pressing the button
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new SwingWorker<Void, Object>(){
                    @Override
                    protected Void doInBackground() throws Exception {
                        outputTest("inner"); // system out information into standard output
                        return null;
                    }}.execute();
            }});

        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        console(jta);  // redirect system out stream into swing textarea
    }

}
