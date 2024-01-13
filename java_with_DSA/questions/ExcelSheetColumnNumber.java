package questions;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        

    }
    public int titleToNumber(String columnTitle) {
     if (columnTitle.isEmpty()) {
        return 0;
     }   
     int sum=0;
     for (char  ch : columnTitle.toUpperCase().toCharArray()) {
         sum*=26;
         sum+=ch-'A'+1;
    }
    return sum;
    }
    
}
