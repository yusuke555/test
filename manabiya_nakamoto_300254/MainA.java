
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
            System.out.println("��������A�ɑ�����F"+args[0]+"=2*"+resuletA[0]+"3*"+resuletA[1]);
            if (resuletA == null) {
                System.out.println("��������B�ɑ�����F"+args[0]+"=3*"+resuletB[0]+"5*"+resuletB[1]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            String errMessage = "�������������Ă�������";
            System.out.println(errMessage);
        } catch (NumberFormatException e) {
            String errMessage = "���������Ă�������";
            System.out.println(errMessage);
        } catch (Exception e) {
            String errMessage = "A�ɑ����Ă��܂���";
            System.out.println(errMessage);
        }
        
            
    }
    
}
