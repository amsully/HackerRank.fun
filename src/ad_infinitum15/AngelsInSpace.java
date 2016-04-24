package ad_infinitum15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AngelsInSpace {

        static ArrayList<Pt> pts = new ArrayList<Pt>();
        static ArrayList<Double> results = new ArrayList<Double>();
        static Double total;
        
        public static void main(String[] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                
                
                for(int T = Integer.parseInt(br.readLine()),i = 0; i < T; i++){
                        String[] pt = br.readLine().split(" " );
                        
                        pts.add(new Pt(Double.parseDouble(pt[0]),Double.parseDouble(pt[1]),Double.parseDouble(pt[2])) );
                        
                }
                
                for(int i = 0; i < pts.size(); i++){
                        for(int j = i; j < pts.size(); j++){
                                if(j==i) continue;
                                
                                for(int k = j; k < pts.size(); k++){
                                        if(k == j) continue;
                                        
                                        Pt pt1 = pts.get(i);
                                        Pt pt2 = pts.get(j);
                                        Pt pt3 = pts.get(k);
                                        
                                        // pt1 pt2
                                        Vec one = new Vec(pt2, pt1);
                                        // pt2 pt3
                                        Vec two = new Vec(pt2,pt3);
                                        
                                        results.add( Math.acos(one.dot(two) / (one.norm()*two.norm()) ) );
                                        
                                }
                        }
                }
                
                double sum=0;
                for(Double d : results){
                        sum += d;
                }
                System.out.println(sum / results.size());
//                System.out.println(results.toString());
                
        }
        
}

class Pt{
        double x;
        double y;
        double z;
        
        public Pt(double x, double y, double z){
            this.x = x;
            this.y = y;
            this.z = z;
        }
        

        
}

class Vec{
        double[] vals;
        public Vec(Pt one, Pt two){
                vals = new double[3];
                vals[0] = (one.x - two.x);
                vals[1] = (one.y - two.y);
                vals[2] = (one.z - two.z);
        }
        
        public double dot(Vec arg0){
                return (vals[0] * arg0.vals[0])+(vals[1]*arg0.vals[1])+(vals[2]*arg0.vals[2]);
        }
        
        public double norm(){
                return Math.sqrt(Math.pow(vals[0], 2)+ Math.pow(vals[1], 2)+Math.pow(vals[2], 2));
        }
}
