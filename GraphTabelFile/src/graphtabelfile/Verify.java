package graphtabelfile;
import javax.swing.JOptionPane;
public class Verify {
  static Double xMin=0.;
  static Double xMax=10.;
  static Integer n=100;
  public static int getVerify(){
    String txt1 = WestPanel.getText1(); 
    String txt2 = WestPanel.getText2();
    String txt3 = WestPanel.getText3();
    try { xMin = Double.valueOf(txt1);}
    catch(NumberFormatException e){
      String str = "X мин не является числом";
      JOptionPane.showMessageDialog(null, str);
      return -1;
    //throw new NumberFormatException (str);
    }
    try{ xMax = Double.valueOf(txt2);}
    catch(NumberFormatException e){
      String str = "X макс не является числом";
      JOptionPane.showMessageDialog(null, str);
      return -1;
     // throw new NumberFormatException (str);
    }
    try{ n = Integer.valueOf(txt3);}
    catch(NumberFormatException e){
      String str = "n не является числом";
      JOptionPane.showMessageDialog(null, str);
      return -1;
    //  throw new NumberFormatException (str); 
    }
    { String str = "допустимые значения n от 2 до 1000";
      if (n<2 || n>1000 ){
        JOptionPane.showMessageDialog(null, str);
        return -1;
     //   throw new IllegalArgumentException  (str);
    }} 
    { String str = "Не допустимые значения: Xmax-Xmin <=0";
      if ( xMax-xMin <=0.){
        JOptionPane.showMessageDialog(null, str);
        return -1;
      //  throw new IllegalArgumentException  (str);
    }}  
      return 0;
}}
