import java.util.Random;
public class Passwordgen {
    public static String generatePassword(int n){
        String characters="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*1234567890";
        StringBuilder password= new StringBuilder();
        Random pass= new Random(); 
        for(int i=0;i<n;i++){
            int index= pass.nextInt(characters.length());
            password.append(characters.charAt(index));
        }
        return password.toString();
    }        
    public static void main(String[] args) {
        int length=8;
        String password= generatePassword(length);
        System.out.println(" The generated Passord is: "+password);
    }
}

