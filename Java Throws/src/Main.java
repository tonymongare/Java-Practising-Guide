import java.io.*;
class Main {
    public static void findFile() throws IOException {
        // code that may produce IOException
        File newFile=new File("users.json");
        FileInputStream stream=new FileInputStream(newFile);
    }

    public static void main(String[] args) {
        try{
            findFile();
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

//end

