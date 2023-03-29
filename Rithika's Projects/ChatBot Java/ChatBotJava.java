import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Chatbot extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea ca= new JTextArea();
	private JTextField cf=new JTextField();                                  
	private JButton b=new JButton();
	private JLabel l=new JLabel();
	
	Chatbot(){                                                // Layout                                       
		
		JFrame f=new JFrame();                                     
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);                      
		f.setVisible(true);
		f.setResizable(true);
		f.setLayout(null);
		f.setSize(400,400);
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.setTitle("Chat with Rithika");
		f.add(ca);
		f.add(cf);
		ca.setSize(300,310);
		ca.setLocation(1, 1);
		ca.setBackground(Color.WHITE);
		cf.setSize(300,20);
		cf.setLocation(1,320);
		f.add(b);
		l.setText("SEND");
		b.add(l);
		b.setSize(500,30);
		b.setLocation(300,320);
		
		b.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    
				if(e.getSource()==b) {                           // Texts sent to the user on Click button
					
					String text=cf.getText().toLowerCase();
					ca.setForeground(Color.black);
					ca.append("You-->"+text+"\n");
					cf.setText("");
					
					if(text.contains("hi")) {                         // conversation input
						replyMeth("Hello there!");                   // response from chatbot for the respective output
					}
					else if(text.contains("how are you")) {
						replyMeth("I'm Good :).Thankyou for asking!");
					}
					else if(text.contains("what is your name")) {
						replyMeth("I'm PROJECT X");
					}
					else if(text.contains("how old are you?")) {
						replyMeth("I'm immortal"+"\n"+"unless you mess with my system :(, so please don't!");
					}
					else if(text.contains("your interests?")) {
						replyMeth("Talking to you.");
					}
					else if(text.contains("bye")) {
						replyMeth("Too Soon :( AnyWays"+"\n"+"Take care! ");
					}
					else 
						replyMeth("Sorry!, I Can't Understand");
					
				}
				
			}
			
		});
		
	}
	public void replyMeth(String s) {                          // response method
		ca.append("ChatBot-->"+s+"\n");         
	}
			

}



public class ChatBotJava {                                     //Driver Class

	public static void main(String[] args) {             //main class
		
          new Chatbot();                                  
	}

}
