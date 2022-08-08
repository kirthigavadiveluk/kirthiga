package anoudpack;

public class RadionalBean {
	
    private int num,den;
    private int gcd(int m , int n )
    {
       return n > 0 ? gcd(n,m%n) : m;
    }
    public void RationalBean() { num = 0; den = 1; }

    public void setNum(int s ) { num = s; }
    public void setDen(int s ) { den = s; }
    public String getReduced()
    {
        int g = gcd(num,den);
        num /= g;
        den /= g;
        return num+"/"+den;
     }

}
