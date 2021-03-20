/**
* Title: Making a GUI
* Semester: COP3337 – Summer 2019
* @author Anaisy Garcia
*
* I affirm that this program is entirely my own work * and none of it is the work of any other person.
*
* Description of program, & explanation of programming: Program uses preset list of items to convert to and from
* creates a GUI that allows user to convert to different options from drop down list.
*/

//package anaisygarciaa7;

//imports
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
    * class to create a GUI with colors, components, text boxes, and labels
    * @param JComponents, ItemListener, ActionListener - components of the windows
    * @return return the GUI constructed
    */
public class Converter extends Frame
implements ItemListener, ActionListener{
    //create the J components using Jcomponents class
    JComboBox convertFrom;
    JComboBox convertTo;
    JTextField textFrom;
    JLabel textTo;
    JLabel from;
    JLabel to;
    JLabel labelFrom;
    JLabel labelTo;
    JButton calculate;
    JButton quit;
    JPanel mainPanel;

    //initialize variables
    double in = 0;
    double out = 0;

            //constructor
            public Converter(){
                //create pop up window 
                super("Currency Application");
                this.mainPanel = new JPanel();
                setSize(400,400);
                setLayout(null);
                setBackground(Color.black);

                //label to convert from
                labelFrom = new JLabel("Convert From:");
                labelFrom.setBounds(30,45,250,30);
                labelFrom.setForeground(Color.red);
                add(labelFrom);

                //combobox drop down for list of available choices to convert from
                convertFrom = new JComboBox();
                convertFrom.setBounds(30,70,150,30);
                convertFrom.addItem("(USD)");
                convertFrom.addItem("(EUR)");
                convertFrom.addItem("(GBP)");
                add(convertFrom); 

                //label to convert to
                labelTo = new JLabel("To:");
                labelTo.setBounds(200,45,250,200);
                labelTo.setForeground(Color.red);
                add(labelTo);

                //combobox drop down for list of available choices to convert to
                convertTo = new JComboBox();
                convertTo.setBounds(200,160,150,30);
                convertTo.addItem("(USD)");
                convertTo.addItem("(EUR)");
                convertTo.addItem("(GBP)");
                add(convertTo);

                //label
                from = new JLabel("Enter Amount to Convert:");
                from.setBounds(50,210,300,30);
                add(from);
                from.setForeground(Color.red);

                //textfield for input
                textFrom = new JTextField(15);
                textFrom.setBounds(50,240,300,30);
                add(textFrom);
                
                //label for total print
                to = new JLabel("Total Amount after Conversion:");
                to.setBounds(50,270,300,30);
                add(to);  
                to.setForeground(Color.red);

                //label for showing the result
                textTo = new JLabel("");
                textTo.setBounds(50,300,300,30);
                textTo.setFocusable(false);
                textTo.setForeground(Color.red);
                add(textTo);

                //calculate button
                calculate = new JButton("Calculate");
                calculate.setBounds(100,350,100,30);
                add(calculate);
                
                //quit button
                quit = new JButton("Quit");
                quit.setBounds(210,350,100,30);
                add(quit);

                //add events to JComponents
                convertFrom.addItemListener(this);
                convertTo.addItemListener(this);
                calculate.addActionListener(this);
                textFrom.addActionListener(this);
                quit.addActionListener(this);

                addWindowListener(new WindowAdapter() {
                    
                @Override
                
                public void windowClosing(WindowEvent Z) {
                    quit();
                }
          });
}

            /**
            * class main to create program
            * @param quit button input
            * @return quitting GUI
            */ 
            public void quit(){
                setVisible(false);
                dispose();
                System.exit(0);
            }

  

                /**
                * class main to create program
                * @param string args
                * @return a new currency app
                */
                public static void main(String args[]){
                    Converter A = new Converter();
                    A.setVisible(true);
                }

                    /**
                    * class to convert
                    * @param input in dollars
                    * @return calculations
                    */
                    public void ConvertToDollars(){
                        //if and else statements for different choices
                        if(convertTo.getSelectedItem() != "(GBP)")
                            if(convertTo.getSelectedItem() != "(EUR)")
                                if(convertTo.getSelectedItem() != "(USD)"){
                                }else{
                                    textTo.setText("Please choose another currency to convert to.");
                                }else{
                                    out = (in / 1.42);
                                    textTo.setText("" + out);
                                }else{
                                    out = (in / 1.64);
                                    textTo.setText("" + out);
                                }
                    }

                    /**
                    * class to convert
                    * @param input in euros
                    * @return calculations
                    */
                    public void ConvertToEuros(){
                        //if and else statements for different choices
                        if(convertTo.getSelectedItem() != "(USD)")
                            if(convertTo.getSelectedItem() != "(GBP)")
                                if(convertTo.getSelectedItem() != "(EUR)"){

                            }else{
                                textTo.setText("Please choose another currency to convert to.");
                            }else{
                                out = (in / 1.13);
                                textTo.setText("" + out);
                            }else{
                                out = (in * 1.42);
                                textTo.setText("" + out);
                            }
                    }

                    /**
                    * class to convert
                    * @param input in GBP
                    * @return calculations
                    */
                    public void ConvertToGBP(){
                        if(convertTo.getSelectedItem() != "(USD)")
                            if(convertTo.getSelectedItem() != "(EUR)") 
                                if(convertTo.getSelectedItem() != "(GBP)"){

                            }else{
                                textTo.setText("Please choose another currency to convert to.");
                            }else{
                                out = (in * 1.13);
                                textTo.setText("" + out);
                            }else{
                                out = (in * 1.64);
                                textTo.setText("" + out);
                            }

                    }

            /**
            * class to show action performed by events
            * @param input in form of button pressing
            * @return response by GUI
            */
            @Override
            public void actionPerformed(ActionEvent A){
                //get input amount to be converted from user
                in = Double.parseDouble(textFrom.getText());
                String Y;
                Y = textFrom.getText();
                //click of button results
                if(A.getSource() != calculate){
                    int x;

                    x = JOptionPane.showConfirmDialog(null, "Quit?", "Quit:", JOptionPane.YES_NO_OPTION);

                    if(x != 0){
                    }else{
                        dispose();
                        System.exit(0);
                    }

                }else{

                    if(convertFrom.getSelectedItem() != "(USD)")
                        if(convertFrom.getSelectedItem() != "(EUR)")
                            if(convertFrom.getSelectedItem() != "(GBP)"){

                            }else{
                                ConvertToGBP();
                            }else{
                                ConvertToEuros();
                            }else{
                                ConvertToDollars();
                            }
                    }
                }

@Override
public void itemStateChanged(ItemEvent arg0) {

    }

}