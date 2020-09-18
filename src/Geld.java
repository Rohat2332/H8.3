import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Geld extends Applet {
    Label label;
    Button knop;
    String stringgeld;
    TextField input;
    double bedrag;
    String display;



    public void init() {
        input = new TextField("", 40);
        label = new Label("Schrijf u getal in het vak en druk op Enter");
        knop = new Button();
        knop.setLabel("Ok");
        knop.addActionListener(new KnopListener());
        input.addActionListener(new KnopListener());
        add(input);
        add(label);
        add(knop);

    }

    public void paint(Graphics g) {
        setBackground(Color.CYAN);
        g.drawString(display, 170, 100 );

    }
    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ){
            stringgeld = input.getText();
            bedrag = Double.parseDouble(stringgeld);
            double btwper = bedrag / 100 * 21;
            bedrag = bedrag + btwper;
            display = "" + bedrag;
            repaint();


        }
    }
}