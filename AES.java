import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.*;
import java.util.Base64;

class AES {
    public static void main(String[] args) throws Exception {
        String message = "This is a confidential message.";
        byte[] myMessage = message.getBytes();

        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128); //size
        SecretKey myAesKey = keyGenerator.generateKey();

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, myAesKey);
        byte[] encryptedBytes = cipher.doFinal(myMessage);
        
        String encryptedData = Base64.getEncoder().encodeToString(encryptedBytes);

        cipher.init(Cipher.DECRYPT_MODE, myAesKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
        String decryptedData = new String(decryptedBytes);

        System.out.println("Message: " + message);
        System.out.println("Encrypted: " + encryptedData);
        System.out.println("Decrypted: " + decryptedData);
    }
}
