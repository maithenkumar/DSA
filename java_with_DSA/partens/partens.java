package partens;
public class partens{
     
    static void partern1(){
        for (int index = 0; index <4; index++) {
            for (int i = 0; i < 4; i++) {
                System.out.print( "* ");
            }
            System.out.println();
        }
    }   static void partern2(){
        for (int index = 0; index <4; index++) {
            for (int i = 0; i <= index; i++) {
                System.out.print( "* ");
            }
            System.out.println();
        }
    }
      static void partern3(){
        for (int index = 0; index <4; index++) {
            for (int i = 1; i <= index; i++) {
                System.out.print( i);
            }
            System.out.println();
        }
    }
  static void partern4(){
        for (int index = 4; index >=0; index--) {
            for (int i = 0; i <=index; i++) {
                System.out.print( "* ");
            }
            System.out.println();
        }
    }
    //same parten 
 static void partern5(){
        for (int index = 1; index <=5; index++) {
            for (int i = 0; i <=4-index+1; i++) {
                System.out.print( "* ");
            }
            System.out.println();
        }
    }
static void partern6(){
        for (int index = 1; index <=5; index++) {
            for (int i = 1; i <=4-index+1; i++) {
                System.out.print( i);
            }
            System.out.println();
        }
    }
    //important
    static void partern7(){
        for (int index = 0; index <5; index++) {
            for (int i = 0; i <5-index+1; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <2*index; i++) {
                System.out.print( "*");
            }
          
           
            System.out.println();
        }

    }
     static void partern8(){
        for (int index = 5; index >=0; index--) {
            for (int i = 1; i <=5-index; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i <index*2-1; i++) {
                System.out.print( "*");
            }
          
           
            System.out.println();
        }

    }
      public static void main(String[] args) {
        partern8();
        
    } 
}
