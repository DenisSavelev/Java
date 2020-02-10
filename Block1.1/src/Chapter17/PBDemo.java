package Chapter17;

public class PBDemo {
    public static void main(String[] args) {
        try {
            ProcessBuilder proc = new ProcessBuilder("notepad.exe" , "testfile");
            proc.start();
        }catch (Exception r)
        {System.out.println("Ошибка зпуска Notepad.");}

    }
}
