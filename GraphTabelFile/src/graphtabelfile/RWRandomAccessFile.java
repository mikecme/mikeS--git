package graphtabelfile;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
public class RWRandomAccessFile {
  private double xMin, xMax;
  private int n;
  private String file = "rWtest.dat";
  RWRandomAccessFile(double xMin,double xMax, int n){
    this.xMin = xMin;
    this.xMax = xMax;
    this.n = n;  
  } 
  RWRandomAccessFile(){};
  void writeFile() throws FileNotFoundException, IOException{
    RandomAccessFile rf = new RandomAccessFile(file, "rw");
    rf.writeInt(n);    
    rf.writeDouble(xMin); 
    rf.writeDouble(xMax); 
    for(int i = 0; i < n; i++){
      double x=xMin+(xMax-xMin)*i/(n-1);
      rf.writeDouble(MyFunc.getMyFunc(x));}
    rf.close();
  }
  double[] readFile() throws IOException {
    RandomAccessFile rf = new RandomAccessFile(file, "r");
    n =rf.readInt();
    xMin = rf.readDouble(); 
    xMax = rf.readDouble(); 
    double[] y = new double[n];
    for(int i = 0; i < n; i++) y[i]= rf.readDouble();
    rf.close();
    return y;
  }
  int getN(){return n;};
  double getXmin(){ return xMin;};
  double getXmax(){ return xMax;};
}
