import java.awt.*;
import java.awt.event.*;
class traffic  extends Frame implements ItemListener{
label lbl1,lbl2;
CheckboxGroup cbg;
traffic(){
Font fontL=new font ("verdana", Font.BOLD,70);
lbl1= new label();
lbl1.setBounds(170,30,300,200);
lbl1.setFont(fontL);
add(lbl1);
Font fontR=new font ("verdana", Font.BOLD,20);
lbl2= new label();
lbl2.setBounds(20,250,130,50);
lbl2.setFont(fontR);
add(lbl2);
cbg= new Checkbox();
Checkbox cb1=new Checkbox("red light",cbg,false);
cb1.setBounds(160,250,120,50);
cb1.setBackground(color.RED);
cb1.setFont(fontR);
add(cb1);
cb1.addItemListener(this);
Checkbox cb2=new Checkbox("orange light",cbg,false);
cb2.setBounds(300,250,150,50);
cb2.setBackground(color.orange);
cb2.setFont(fontR);
add(cb2);
cb2.addItemListener(this);
Checkbox cb3=new Checkbox("green light",cbg,false);
cb3.setBounds(300,250,150,50);
cb3.setBackground(color.green);
cb3.setFont(fontR);
add(cb3);
cb3.addItemListener(this);

setTitle("Traffic light simulator");
setsize(650,400);
setlayout(null);
setvisible(true);
}

public void  itemStateChanged(ItemEvent){
check chk=cbg.getSelectedCheckbox();
String str=chk.getlabel();
char choice=str.charAt(0);
switch(choice){
case'R':lbl1.setText("stop");
	lbl1.setForeground(Color.RED);
	break;
case'O':lbl1.setText("orange");
	lbl1.setForeground(Color.ORANGE);
	break;
case'G':lbl1.setText("GO");
	lbl1.setForeground(Color.GREEN);
	break;
}
}
public static  void main(String[]args){
new traffic();
}
}




