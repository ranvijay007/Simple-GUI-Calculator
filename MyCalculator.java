package demo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.script.*;

class MyFrame extends JFrame implements ActionListener{
    JPanel panel,panel1;
    JTextField text;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;
    
    MyFrame() throws Exception{
        panel=new JPanel();
        text=new JTextField("");
        text.setBackground(Color.LIGHT_GRAY);
        text.setEditable(false);
         text.setHorizontalAlignment(SwingConstants.RIGHT);
        text.setFont(new Font("SansSerif", Font.BOLD, 20));
        text.setPreferredSize(new Dimension(300,50));
        add(text,BorderLayout.NORTH);
        
        MyPanel();
        
        add(panel,BorderLayout.CENTER);
        setSize(300,400);
        setMinimumSize(new Dimension(300, 0));
        
        setVisible(true);
        panel.setPreferredSize(new Dimension(280,400));
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    void MyPanel() throws Exception{
        //Icon icon=new ImageIcon("C:\\Users\\Kakarot\\Documents\\NetBeansProjects\\Demo\\3.jpg");
        GridBagLayout grid=new GridBagLayout();
        panel.setLayout(grid);
        GridBagConstraints gdc=new GridBagConstraints();
        gdc.weightx=2;
        gdc.weighty=2;
        gdc.fill=GridBagConstraints.BOTH;
        gdc.gridx=0;
        gdc.gridy=0;
        
        //b1.setMargin(new Insets(1,1,1,1));

        b1=new JButton("DEL");
        panel.add(b1, gdc);
        gdc.gridx=1;
        gdc.gridy=0;
        b2=new JButton("/");
        panel.add(b2, gdc);
        gdc.gridx=2;
        gdc.gridy=0;
        b3=new JButton("*");
        panel.add(b3, gdc);
        gdc.gridx=3;
        gdc.gridy=0;
        b4=new JButton("-");
        panel.add(b4, gdc);
        
        //row 2
        gdc.fill=GridBagConstraints.BOTH;
        gdc.gridx=0;
        gdc.gridy=1;
        b5=new JButton("1");
        
        panel.add(b5, gdc);
        gdc.gridx=1;
        gdc.gridy=1;
        b6=new JButton("2");
        panel.add(b6, gdc);
        gdc.gridx=2;
        gdc.gridy=1;
        b7=new JButton("3");
        panel.add(b7, gdc);
        gdc.gridx=3;
        gdc.gridy=1;
        gdc.gridheight=2;
        b8=new JButton("+");
        panel.add(b8, gdc);
       
        //row 3
        gdc.fill=GridBagConstraints.BOTH;
        gdc.gridx=0;
        gdc.gridy=2;
        gdc.gridheight=1;
        b9=new JButton("4");
        panel.add(b9, gdc);
        gdc.gridx=1;
        gdc.gridy=2;
        b10=new JButton("5");
        panel.add(b10, gdc);
        gdc.gridx=2;
        gdc.gridy=2;
        b11=new JButton("6");
        panel.add(b11, gdc);
        
        //row 4
        gdc.fill=GridBagConstraints.BOTH;
        gdc.gridx=0;
        gdc.gridy=3;
        b12=new JButton("7");
        panel.add(b12, gdc);
        gdc.gridx=1;
        gdc.gridy=3;
        b13=new JButton("8");
        panel.add(b13, gdc);
        gdc.gridx=2;
        gdc.gridy=3;
        b14=new JButton("9");
        panel.add(b14, gdc);
        gdc.gridx=3;
        gdc.gridy=3;
        gdc.gridheight=2;
        b15=new JButton("=");
        panel.add(b15, gdc);
        
        //row 5
        gdc.fill=GridBagConstraints.BOTH;
        gdc.gridx=0;
        gdc.gridy=4;
        gdc.gridheight=1;
        b16=new JButton("C");
        panel.add(b16, gdc);
        gdc.gridx=1;
        gdc.gridy=4;
        b17=new JButton("0");
        panel.add(b17, gdc);
        gdc.gridx=2;
        gdc.gridy=4;
        b18=new JButton(".");
        panel.add(b18, gdc);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b8.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        String str=e.getActionCommand();
        String s;
        if(str.equals("1")){
            s=text.getText();
            s+="1";
            text.setText(s);
        }
        if(str.equals("2")){
            s=text.getText();
            s+="2";
            text.setText(s);
        }
        if(str.equals("3")){
            s=text.getText();
            s+="3";
            text.setText(s);
        }
        if(str.equals("4")){
            s=text.getText();
            s+="4";
            text.setText(s);
        }
        if(str.equals("5")){
            s=text.getText();
            s+="5";
            text.setText(s);
        }
        if(str.equals("6")){
            s=text.getText();
            s+="6";
            text.setText(s);
        }
        if(str.equals("7")){
            s=text.getText();
            s+="7";
            text.setText(s);
        }
        if(str.equals("8")){
            s=text.getText();
            s+="8";
            text.setText(s);
        }
        if(str.equals("9")){
            s=text.getText();
            s+="9";
            text.setText(s);
        }
        if(str.equals("0")){
            s=text.getText();
            if(s.isEmpty())
                s="0";
            else if(s.length() == 1)
                s="0";
            else
                s+="0";
            text.setText(s);
        }
        if(str.equals(".")){
            s=text.getText();
            int l=s.length();
            if(s.isEmpty())
                s+="0.";
            else if(s.charAt(l-1) == '.')
                s=s;
            else if(s.contains("."))
                s=s;
            else
                s+=".";
            text.setText(s);
        }
        if(str.equals("+")){
            s=text.getText();
            int l=s.length();
            if(s.isEmpty())
                s=s;
            else if(s.charAt(l-1) == '+'||s.charAt(l-1) == '-'||s.charAt(l-1) == '*'||s.charAt(l-1) == '/')
                s=s;
            else
                s+="+";
            text.setText(s);
        }
        if(str.equals("C")){
            
            text.setText("");
        }
        if(str.equals("-")){
            s=text.getText();
            int l=s.length();
            if(s.isEmpty())
                s=s;
            else if(s.charAt(l-1) == '+'||s.charAt(l-1) == '-'||s.charAt(l-1) == '*'||s.charAt(l-1) == '/')
                s=s;
            else
                s+="-";
            text.setText(s);
        }
        if(str.equals("/")){
            s=text.getText();
            int l=s.length();
            if(s.isEmpty())
                s=s;
            else if(s.charAt(l-1) == '+'||s.charAt(l-1) == '-'||s.charAt(l-1) == '*'||s.charAt(l-1) == '/')
                s=s;
            else
                s+="/";
            text.setText(s);
        }
        if(str.equals("*")){
            s=text.getText();
            int l=s.length();
            if(s.isEmpty())
                s=s;
            else if(s.charAt(l-1) == '+'||s.charAt(l-1) == '-'||s.charAt(l-1) == '*'||s.charAt(l-1) == '/')
                s=s;
            else
                s+="*";
            text.setText(s);
        }
        if(str.equals("DEL")){
            s=text.getText();
            int l=s.length();
            if(s.isEmpty())
                s=s;
            else
                s=s.substring(0,l-1);
            text.setText(s);
        }
        if(str.equals("=")){
            try{
                Double d;
                ScriptEngineManager mgr = new ScriptEngineManager();
                ScriptEngine engine = mgr.getEngineByName("JavaScript");
                s=text.getText();
                if(s.isEmpty())
                    s=s;
                else
                    s=String.valueOf(engine.eval(s));
                text.setText(s);
            }
            catch(ScriptException ex){}
    
        }
        
    }
}
public class MyCalculator {
    public static void main(String[] args)throws Exception {
        new MyFrame();
    }
    
}
