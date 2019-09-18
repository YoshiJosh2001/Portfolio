/*
Programmer: Josh McAllister
Student ID: 12110614
What is the code supposed to do: Create a GUI for the CQAC company
*/

import java.awt.*;
import javax.swing.*;

public class CQAC {
    
    public static void main(String args[])
    {
        //calls the GUI screen
        GUI();
    }
    
    public static void GUI()
    {
        //creates the variables for the screen dim, X and Y are position variables
        int screenHeight;
        int screenWidth;
        int screenX;
        int screenY;
        
        //creates the Frames input fields
        JTextField techName;
        JTextField techNum;
        JTextField buildAddNo;
        JTextField buildAdd;
        JTextField postCode;
        JTextField city;
        JButton enter;
        
        //Creating necessary frames
        JFrame frameTech = new JFrame("Technician Info");
        JFrame frameBuild = new JFrame("Building Info");
        JFrame frameDates = new JFrame("Installation Date Info");
        frameTech.setTitle("CQAC");
        frameBuild.setTitle("CQAC");
        frameDates.setTitle("CQAC");
        
        //creates the exit button for all frames
        frameTech.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameBuild.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameDates.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //retrieves screen size
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        
        //creates screen size and location
        screenHeight = screenSize.height;
        screenWidth = screenSize.width;
        screenHeight = screenHeight/2;
        screenWidth = screenWidth/2;
        screenX = screenWidth/2;
        screenY = screenHeight/2;
        
        //sets the sizes and location for all frames
        frameTech.setSize(screenWidth, screenHeight); 
        frameTech.setLocation(screenX-8,screenY);
        frameBuild.setSize(screenWidth, screenHeight); 
        frameBuild.setLocation(screenX-8,screenY);
        frameDates.setSize(screenWidth, screenHeight); 
        frameDates.setLocation(screenX-8,screenY);
        
        //creates the necessary input fields
        techName = new JTextField("Technician Name");
        techNum = new JTextField("Technician Phone Number");
        buildAddNo = new JTextField("Building Address Number");
        buildAdd = new JTextField("Building Address");
        postCode = new JTextField("Postcode");
        city = new JTextField("City");
        enter = new JButton("Enter");
        /*
        I've used JTextField a lot, is there a number version?
        To add: dates
        */
        
        //creates Container for the frames
        JPanel panelTech = new JPanel();

        //creates the grouplayout and sets ...
        GroupLayout groupTech = new GroupLayout(panelTech);
        groupTech.setAutoCreateGaps(true);
        
        panelTech.add(techName);
        

        
       
        
        //frameTech.add(techName, BorderLayout.NORTH);
        //frameTech.add(techNum, BorderLayout.EAST);
        //frameTech.add(enter, BorderLayout.SOUTH);
        /*
        now see, this doesn't look good, I want to use the right half of the 
        screen, maybe 80% of it to show the information on the left and the 
        input data on the right        
        */
        
        //creates the layout for the Building Info Frame
        frameBuild.setLayout(new FlowLayout());
        frameBuild.add(buildAddNo);
        frameBuild.add(buildAdd);
        frameBuild.add(postCode);
        frameDates.add(city);
        ///frameDates.add(enter);
        /*
        Ideally, once I hit enter for the techframe, it will load into the
        building info layout and then continue that way, but I need 
        action listeners for that        
        */
        
        
        
        frameTech.setVisible(true);
        //frameBuild.setVisible(true);
    }
    
    
}
