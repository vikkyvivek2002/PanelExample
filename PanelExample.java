import java.awt.*;    import java.awt.event.*; 
public class PanelExample {  
     PanelExample()  
        {  
        Frame f= new Frame("Panel Example");
        f.setBackground(Color.yellow);    
        Panel panel1=new Panel();
        panel1.setBackground(Color.black);
        Button b1=new Button("Button 1");     
        b1.setBackground(Color.blue);
       Button b2=new Button("Button 2");   
        b2.setBackground(Color.green);   
        panel1.add(b1); panel1.add(b2);
        Panel panel2=new Panel();
        panel2.setBackground(Color.red); 
        Label l1=new Label("This is Panel2's label");   
        panel2.add(l1); 
        f.add(panel1); f.add(panel2);
        f.setSize(100,100); f.setLayout(new FlowLayout());    
        f.setVisible(true);        }  
        public static void main(String args[])      {  
        new PanelExample();     }  
} 
