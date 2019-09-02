package ex0502;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class game extends JFrame implements ActionListener, ItemListener, Runnable {
   
   public game() {

   JPanel background = new JPanel() {
      public void paintComponent(Graphics g) {
      
         setOpaque(false);
         super.paintComponent(g);
      }
   };
   }

   public static void main(String [] args) {
      MyPuzzle1 mp1 = new MyPuzzle1();
      mp1.display();
   }

   @Override
   public void run() {
      // TODO Auto-generated method stub
      
   }

   @Override
   public void itemStateChanged(ItemEvent arg0) {
      // TODO Auto-generated method stub
      
   }

   @Override
   public void actionPerformed(ActionEvent arg0) {
      // TODO Auto-generated method stub
      
   }
   }


class MyPuzzle1 extends JFrame implements ActionListener {
   
   ImageIcon icon[] = new ImageIcon[9];
   String str[] = new String[] {"pika1","pika2","pika3","pika4","pika5",
		   "pika6","pika7","pika8","pika1"};
   JButton btn[];
   JButton reset;
   JPanel panel,back;
   JLabel back1,ex;
   Font myfont;
   JScrollPane scrollPane;
   ImageIcon icon2;
   
   MyPuzzle1() {
	   
	   
	   
      myfont = new Font("굴림체", Font.BOLD, 59);
      panel = new JPanel(new GridLayout(3,3,5,5));
      back = new JPanel(new FlowLayout());
      icon2 = new ImageIcon(".\\img.jpg");
      back1 = new JLabel(icon2);

      btn = new JButton[9];
      for (int i=0;i<9;i++) {
         icon[i] = new ImageIcon(str[i] + ".jpg");
         btn[i]= new JButton(icon[i]);
         btn[i].setFont(myfont);
         btn[i].setBackground(Color.white);
         btn[i].setForeground(Color.blue);
         btn[i].addActionListener(this);
         panel.add(btn[i]);
        // if(btn[0].getIcon().equals(icon[0]) || btn[1].getIcon().equals(icon[1])) {
        //	// JOptionPane.showMessageDialog(this,"큰 판 위에 작은 판을 올리세요 ","Tower Of Hanoi",JOptionPane.ERROR_MESSAGE);
        //	 System.out.println("하이");
         //}

      }
      
    	  
      btn[8].setIcon(null);
      reset = new JButton("Reset");
      reset.setFont(myfont);
      reset.setBackground(Color.BLUE);
      reset.setForeground(Color.WHITE);
      reset.addActionListener(this);

   }
   void display() {
      setLayout(new BorderLayout(5,5));
      add(panel, BorderLayout.CENTER);
      add(reset, BorderLayout.SOUTH);
      add(back1,BorderLayout.EAST);
      setTitle("쉬어가기");
      setSize(680, 440);
      setVisible(true);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   }
   public void actionPerformed(ActionEvent e) {
//      if(e.getSource()==btn[1])
//      {
//         if(btn[0].getIcon() == null)
//         {
//            btn[0].setIcon(btn[1].getIcon());
//            btn[1].setIcon(null);
//         }
//      }
         if(e.getSource()==btn[0]) {
         if(btn[1].getIcon()== null) {
            btn[1].setIcon(btn[0].getIcon());
            btn[0].setIcon(null);
         }
         if(btn[3].getIcon()== null)
         {
            btn[3].setIcon(btn[0].getIcon());
            btn[0].setIcon(null);
         }
      }
         if(e.getSource()==btn[1])
         {
            if(btn[0].getIcon()== null)
            {
               btn[0].setIcon(btn[1].getIcon());
               btn[1].setIcon(null);
            }
            if(btn[2].getIcon()== null)
            {
               btn[2].setIcon(btn[1].getIcon());
               btn[1].setIcon(null);
            }
            if(btn[4].getIcon()== null)
            {
               btn[4].setIcon(btn[1].getIcon());
               btn[1].setIcon(null);
            }
      }
         if(e.getSource()==btn[2])
         {
            if(btn[1].getIcon()== null)
            {
               btn[1].setIcon(btn[2].getIcon());
               btn[2].setIcon(null);
            }
            if(btn[5].getIcon()== null)
            {
               btn[5].setIcon(btn[2].getIcon());
               btn[2].setIcon(null);
            }
         }
         if(e.getSource()==btn[3])
         {
            if(btn[0].getIcon()== null)
            {
               btn[0].setIcon(btn[3].getIcon());
               btn[3].setIcon(null);
            
            }
            if(btn[4].getIcon()== null)
            {
               btn[4].setIcon(btn[3].getIcon());
               btn[3].setIcon(null);
            }
            if(btn[6].getIcon()== null)
            {
               btn[6].setIcon(btn[3].getIcon());
               btn[3].setIcon(null);
            }
            
         }
         if(e.getSource()==btn[4])
         {
            if(btn[3].getIcon()== null)
            {
               btn[3].setIcon(btn[4].getIcon());
               btn[4].setIcon(null);
               
            }
            if(btn[1].getIcon()== null)
            {
               btn[1].setIcon(btn[4].getIcon());
               btn[4].setIcon(null);
            }
            if(btn[5].getIcon()== null)
            {
               btn[5].setIcon(btn[4].getIcon());
               btn[4].setIcon(null);
            }
            if(btn[7].getIcon()== null)
            {
               btn[7].setIcon(btn[4].getIcon());
               btn[4].setIcon(null);
            }
         }
         if(e.getSource()==btn[5]) {
            if(btn[8].getIcon()== null)
            {
               btn[8].setIcon(btn[5].getIcon());
               btn[5].setIcon(null);
            }
            if(btn[2].getIcon()== null)
            {
               btn[2].setIcon(btn[5].getIcon());
               btn[5].setIcon(null);
            }
            if(btn[4].getIcon()== null)
            {
               btn[4].setIcon(btn[5].getIcon());
               btn[5].setIcon(null);
            }
         }
         if(e.getSource()==btn[6]) {
            if(btn[7].getIcon()== null)
            {
               btn[7].setIcon(btn[6].getIcon());
               btn[6].setIcon(null);
            }
            if(btn[3].getIcon()== null)
            {
               btn[3].setIcon(btn[6].getIcon());
               btn[6].setIcon(null);
            }
         }
         if(e.getSource()==btn[7]) {
            if(btn[8].getIcon()== null)
            {
               btn[8].setIcon(btn[7].getIcon());
               btn[7].setIcon(null);
            }
            if(btn[4].getIcon()== null) {
               btn[4].setIcon(btn[7].getIcon());
               btn[7].setIcon(null);
            }
            if(btn[6].getIcon()== null)
            {
               btn[6].setIcon(btn[7].getIcon());
               btn[7].setIcon(null);
            }
         }
         if(e.getSource()==btn[8]) {
            if(btn[5].getIcon()== null) {
               btn[5].setIcon(btn[8].getIcon());
               btn[8].setIcon(null);
            }
            if(btn[7].getIcon()== null)
            {
               btn[7].setIcon(btn[8].getIcon());
               btn[8].setIcon(null);
            }
         }
         if(e.getSource()==reset)
         {
        	 
            int u[]=MyPuzzle1.makeRnum();
            for(int i=0; i<8; i++)
            {
               //u 0~8
               //ImageIcon icon[] 0~8
               btn[i].setIcon(icon[u[i]]);
            }
            btn[8].setIcon(null);
            }
//         while(false) {
//        	 if(btn[0].getIcon().equals(icon[0]) || btn[1].getIcon().equals(icon[1])) {
//        		 JOptionPane.showMessageDialog(this,"큰 판 위에 작은 판을 올리세요 ","Tower Of Hanoi",JOptionPane.ERROR_MESSAGE);
//        	 }
//         }
         
         }
   
   static int [] makeRnum()
   {
      Random r = new Random();
      int result [] = new int[9];
      int x=0;
      for(int i=0; i<8; i++)
      {
         result[i]=r.nextInt(8)+1;
         for(int k=0; k<i; k++)
         {
            if(result[i]==result[k])
            {
               x=r.nextInt(8)+1;
               result[i]=x;
               i--;
               break;
            }
         }
      }
      return result;
   }
}