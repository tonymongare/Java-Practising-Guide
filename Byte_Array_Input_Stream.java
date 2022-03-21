import java.io.ByteArrayInputStream;

class Main {
    public static void main(String[] args) {
        
        byte[] array = {12,13,14,15};
        
        try {
            
            ByteArrayInputStream input = new ByteArrayInputStream(array);
            
            for (int i = 0; i < array.length; i++) {
                
                int data = input.read();
                System.out.println(data + ", ");
            }
            
            input.close();
        }
        
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
//en
