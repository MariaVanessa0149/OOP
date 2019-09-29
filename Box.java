/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BOX;

/**
 *
 * @author vanessa
 */
public class Box {
    //Main method!
 public static void main(String [] args){
        Boxes box = new Boxes(0,0,0);
        
        box.boxA();
        
        
        System.out.println("Box a: " + box.toString());
        System.out.println("Box a surface area: "+ box.getArea());
        
        
        
        box.boxB();
        System.out.println("Box b: " + box.toString());
        System.out.println("Box b surface area: "+ box.getArea());
        
        System.out.println("Check if Box a and Box b are equal? " + box.equals());
        
        IsoscelesRight test = new IsoscelesRight(3);
        Geometric4Tester tst = new Geometric4Tester();
        
        System.out.println("IsoscelesRight c" + test.toString());
        System.out.println("IsoscelesRight c area: " + test.getArea());
        
        
        System.out.println("IsoscelesRight d" + test.toString());
        System.out.println("IsoscelesRight d area: " + test.getArea());
        
        
        
        System.out.println("Check if IsoscelesRight c and IsoscelesRight d are equal? " + test.equals());
    }
    
    
    
    public static class Rectangle2{
        int area;
        int width, length, height;
        String ans;
        
        public int getArea(){
            area = width*length*height;
            return area;
        }
        
        public String toString(){
            return "[Box: length = " + length + ",width = " + width +", height = " + height + "]";
        }
        
    }
    
    
    
    //box class subclass of rectangle
    public static class Boxes extends Rectangle2{
        private int heightt;
        
        public Boxes(int l, int w, int h){
            Rectangle2 box = new Rectangle2();
        }
        
        public int getHeight(){
            return heightt;
        }
        
        public int getArea(){
            area = (2*width*length) + (2*length*height) + (2*height*width);
            return area;
        }
        
        public int boxA(){
            width = 3;
            length = 2;
            height = 4;
            return width + length + height;
        }
        
        public int boxB(){
            width = 7;
            length = 4;
            height = 4;
            return width + length + height;
        }
        
        public String equals(){
            if (boxA() == boxB()){
                ans = "true";
            }
            else{
                ans = "false";
            }
            
            return ans;
        }
        
    }
    
    
  
    
   
    public static class Triangle{
        double eqSide = 3, area, sideC;
        String ans;
        
        public String equals(){
            if (eqSide == eqSide){
                ans = "true";
            }
            else{
                ans = "false";
            }
            
            return ans;
        }
    
        public double getArea(){
            area = (eqSide*eqSide)/2;
            return area;
        }
        
    } 
    
    public static class IsoscelesRight extends Triangle {
        
        public IsoscelesRight(double equalSize){
            
        }
        
        public double getEqualSide(){
            return eqSide;
        }
        
        public double getNotEqualSide(){
            sideC = eqSide*Math.sqrt(2);
            return sideC;
        }
        
        public String toString(){
            return "[IsoscelesRight: equal_side = " + getEqualSide() + ",not_equal side = " + getNotEqualSide();
        }
    }
 
    
    public static class Geometric4Tester{
        
        public Geometric4Tester(){
            IsoscelesRight tst = new IsoscelesRight(3);
            tst.eqSide = 3.0;
        }
    }
} 
    
   
   

