public class TestMaximum <T extends Comparable<T>> {
    T x, y, z;
    public TestMaximum(T x, T y, T z) {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public T maximum(){
        return TestMaximum.maximum(x,y,z);
    }

    public static <T extends Comparable<T>> T maximum(T x,T y,T z){
        T max=x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }

        return max;
    }
    public static String maximumTest(String x, String y,String z ){
        String max = x;
        if (y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        return max;

    }



    public static void main(String[] args) {
        Integer xInt =3 ,yInt=5,zInt=7;
        Float xFloat =3.4f , yFloat=5.8f , zFloat=7.6f;
        String xStr ="Apple" ,yStr="Peach",zStr="Banana";


    }
}
