package Array;

class Findminimumandmaximum{
public static void main(String args[]){

}
class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 
static Pair getMinMax(long a[], long n)  
{
    long max = Long.MIN_VALUE;
    long min = Long.MAX_VALUE;
    
    //Write your code here
    for(int i=0; i<a.length; i++){
        if(min>a[i]){
            min=a[i];
            
        }
        if(max<a[i]){
            max=a[i];

        }
    }
    Pair ans = new Pair(min,max);
    return ans;
}
}