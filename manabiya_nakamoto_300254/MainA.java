
/**
 *
 * @author NAKAMOTO
 */
public class MainA {
    public static void main (String[] args){
    
    int ans = 0;
    int[] resuletA = new int[2];
    int[] resuletB = new int[2];
    Certification ac = new Certification();
        try {
	    ans = Integer.parseInt(args[0]);
            resuletA = ac.CertificationA(ans);
            resuletB = ac.CertificationB(ans);
            System.out.println("‘æˆêˆø”‚ÍA‚É‘®‚·‚éF"+args[0]+"=2*"+resuletA[0]+"3*"+resuletA[1]);
            if (resuletA == null) {
                System.out.println("‘æˆêˆø”‚ÍB‚É‘®‚·‚éF"+args[0]+"=3*"+resuletB[0]+"5*"+resuletB[1]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            String errMessage = "‰½‚©®”‚ğ“ü‚ê‚Ä‚­‚¾‚³‚¢";
            System.out.println(errMessage);
        } catch (NumberFormatException e) {
            String errMessage = "”š‚ğ“ü‚ê‚Ä‚­‚¾‚³‚¢";
            System.out.println(errMessage);
        } catch (Exception e) {
            String errMessage = "A‚É‘®‚µ‚Ä‚¢‚Ü‚¹‚ñ";
            System.out.println(errMessage);
        }
        
            
    }
    
}
