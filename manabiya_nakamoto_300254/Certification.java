
/**
 *
 * @author NAKAMOTO
 */
public class Certification {
   
    private int x;
    private int y;
    
    int[] result = new int[2];
    
    public int[] CertificationA(int ans)throws Exception{
        if (ans < 0) {
            throw new Exception();
        }
        for (int i = 0; i < 10 ; i++ ) {
            for ( int j=0 ; j < 10 ; j++ ) {
                int sum = 2*x + 3*y;
                
                if (ans == sum) {
                    this.result[0] = x;
                    this.result[1] = y;
                }
            }
        }
        return result;
    }
    
        public int[] CertificationB (int ans) throws Exception {
        if (ans < 0) {
            throw new Exception();
        }
        for (int i = 0; i < 10 ; i++ ) {
            for ( int j=0 ; j < 10 ; j++ ) {
                int sum = 3*x + 5*y;
                
                if (ans == sum) {
                    this.result[0] = x;
                    this.result[1] = y;
                }
            }
        }
        return result;
    }
}