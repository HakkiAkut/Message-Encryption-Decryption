import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test public void messageToArrayTest(){
        char[][] messageArray =new char[3][8];
        messageArray[0][0]='T';
        messageArray[1][0]='H';
        messageArray[2][0]='E';
        messageArray[0][1]=' ';
        messageArray[1][1]='B';
        messageArray[2][1]='R';
        messageArray[0][2]='O';
        messageArray[1][2]='W';
        messageArray[2][2]='N';
        messageArray[0][3]=' ';
        messageArray[1][3]='F';
        messageArray[2][3]='O';
        messageArray[0][4]='X';
        messageArray[1][4]=' ';
        messageArray[2][4]='I';
        messageArray[0][5]='S';
        messageArray[1][5]=' ';
        messageArray[2][5]='Q';
        messageArray[0][6]='U';
        messageArray[1][6]='I';
        messageArray[2][6]='C';
        messageArray[0][7]='K';
        messageArray[1][7]=' ';
        messageArray[2][7]=' ';
        String message ="THE BROWN FOX IS QUICK";
        char[][] messageArrayCheck= Main.messageToArray(message);
        for(int i = 0; i < messageArrayCheck.length; i++){
            for(int j = 0; j < messageArrayCheck[i].length; j++){
                assertEquals(messageArray[i][j],messageArrayCheck[i][j]);
                System.out.print(messageArrayCheck[i][j]);
            }
            System.out.println();
        }
    }
    @Test public void patternStringToIntTest() {
        Integer[][] messageArray =new Integer[3][8];
        messageArray[0][0]= 4;
        messageArray[1][0]= 21;
        messageArray[2][0]= 13;
        messageArray[0][1]= 14;
        messageArray[1][1]= 23;
        messageArray[2][1]= 20;
        messageArray[0][2]= 16;
        messageArray[1][2]= 8;
        messageArray[2][2]= 9;
        messageArray[0][3]= 14;
        messageArray[1][3]= 1;
        messageArray[2][3]= 16;
        messageArray[0][4]= 19;
        messageArray[1][4]= 14;
        messageArray[2][4]= 11;
        messageArray[0][5]= 15;
        messageArray[1][5]= 14;
        messageArray[2][5]= 7;
        messageArray[0][6]= 25;
        messageArray[1][6]= 11;
        messageArray[2][6]= 2;
        messageArray[0][7]= 6;
        messageArray[1][7]= 14;
        messageArray[2][7]= 14;
        String message ="THE BROWN FOX IS QUICK";
        char[][] messageArrayCheck= Main.messageToArray(message);
        Integer[][] messageArrayCheck2= Main.pattern(messageArrayCheck);
        for(int i = 0; i < messageArrayCheck.length; i++){
            for(int j = 0; j < messageArrayCheck[i].length; j++){
                assertEquals(messageArray[i][j], messageArrayCheck2[i][j]);
            }
        }
    }
    @Test public void matrixMultiplicationTest() {
        Integer[][] messageArray =new Integer[3][8];
        messageArray[0][0]= 1;
        messageArray[1][0]= 33;
        messageArray[2][0]= 12;
        messageArray[0][1]= 28;
        messageArray[1][1]= 113;
        messageArray[2][1]= -8;
        messageArray[0][2]= 27;
        messageArray[1][2]= 82;
        messageArray[2][2]= -18;
        messageArray[0][3]= 60;
        messageArray[1][3]= 183;
        messageArray[2][3]= -44;
        messageArray[0][4]= 24;
        messageArray[1][4]= 78;
        messageArray[2][4]= -13;
        messageArray[0][5]= 8;
        messageArray[1][5]= 30;
        messageArray[2][5]= -1;
        messageArray[0][6]= 9;
        messageArray[1][6]= 15;
        messageArray[2][6]= -7;
        messageArray[0][7]= 20;
        messageArray[1][7]= 82;
        messageArray[2][7]= -6;
        Integer crypt[][]= new Integer[3][3];
        crypt[0][0]= 1;
        crypt[0][1]= -2;
        crypt[0][2]= 3;
        crypt[1][0]= 2;
        crypt[1][1]= -5;
        crypt[1][2]= 10;
        crypt[2][0]= -1;
        crypt[2][1]= 2;
        crypt[2][2]= -2;
        String message ="THE BROWN FOX IS QUICK";
        char[][] messageArrayCheck= Main.messageToArray(message);
        Integer[][] messageArrayCheck2= Main.pattern(messageArrayCheck);
        messageArrayCheck2= Main.matrixMultiplication(crypt,messageArrayCheck2);
        for(int i = 0; i < messageArrayCheck.length; i++){
            for(int j = 0; j < messageArrayCheck[i].length; j++){
                assertEquals(messageArray[i][j], messageArrayCheck2[i][j]);
            }
        }
    }
    @Test public void takeModTest() {
        Integer[][] messageArray =new Integer[3][8];
        messageArray[0][0]= 1;
        messageArray[1][0]= 6;
        messageArray[2][0]= 12;
        messageArray[0][1]= 1;
        messageArray[1][1]= 5;
        messageArray[2][1]= 19;
        messageArray[0][2]= 0;
        messageArray[1][2]= 1;
        messageArray[2][2]= 9;
        messageArray[0][3]= 6;
        messageArray[1][3]= 21;
        messageArray[2][3]= 10;
        messageArray[0][4]= 24;
        messageArray[1][4]= 24;
        messageArray[2][4]= 14;
        messageArray[0][5]= 8;
        messageArray[1][5]= 3;
        messageArray[2][5]= 26;
        messageArray[0][6]= 9;
        messageArray[1][6]= 15;
        messageArray[2][6]= 20;
        messageArray[0][7]= 20;
        messageArray[1][7]= 1;
        messageArray[2][7]= 21;
        Integer crypt[][]= new Integer[3][3];
        crypt[0][0]= 1;
        crypt[0][1]= -2;
        crypt[0][2]= 3;
        crypt[1][0]= 2;
        crypt[1][1]= -5;
        crypt[1][2]= 10;
        crypt[2][0]= -1;
        crypt[2][1]= 2;
        crypt[2][2]= -2;
        String message ="THE BROWN FOX IS QUICK";
        char[][] messageArrayCheck= Main.messageToArray(message);
        Integer[][] messageArrayCheck2= Main.pattern(messageArrayCheck);
        messageArrayCheck2= Main.matrixMultiplication(crypt,messageArrayCheck2);
        messageArrayCheck2= Main.takeMod(messageArrayCheck2);
        for(int i = 0; i < messageArrayCheck.length; i++){
            for(int j = 0; j < messageArrayCheck[i].length; j++){
                assertEquals(messageArray[i][j], messageArrayCheck2[i][j]);
            }
        }
    }
    @Test public void patternIntToStringTest() {
        char[][] messageArray =new char[3][8];
        messageArray[0][0]= 'F';
        messageArray[1][0]= 'K';
        messageArray[2][0]= 'J';
        messageArray[0][1]= 'F';
        messageArray[1][1]= 'Y';
        messageArray[2][1]= 'X';
        messageArray[0][2]= 'D';
        messageArray[1][2]= 'F';
        messageArray[2][2]= 'N';
        messageArray[0][3]= 'K';
        messageArray[1][3]= 'H';
        messageArray[2][3]= 'A';
        messageArray[0][4]= 'P';
        messageArray[1][4]= 'P';
        messageArray[2][4]= ' ';
        messageArray[0][5]= 'W';
        messageArray[1][5]= 'V';
        messageArray[2][5]= 'L';
        messageArray[0][6]= 'N';
        messageArray[1][6]= 'S';
        messageArray[2][6]= 'R';
        messageArray[0][7]= 'R';
        messageArray[1][7]= 'F';
        messageArray[2][7]= 'H';
        Integer crypt[][]= new Integer[3][3];
        crypt[0][0]= 1;
        crypt[0][1]= -2;
        crypt[0][2]= 3;
        crypt[1][0]= 2;
        crypt[1][1]= -5;
        crypt[1][2]= 10;
        crypt[2][0]= -1;
        crypt[2][1]= 2;
        crypt[2][2]= -2;
        String message ="THE BROWN FOX IS QUICK";
        char[][] messageArrayCheck= Main.messageToArray(message);
        Integer[][] messageArrayCheck2= Main.pattern(messageArrayCheck);
        messageArrayCheck2= Main.matrixMultiplication(crypt,messageArrayCheck2);
        messageArrayCheck2= Main.takeMod(messageArrayCheck2);
        messageArrayCheck= Main.pattern(messageArrayCheck2);
        for(int i = 0; i < messageArrayCheck.length; i++){
            for(int j = 0; j < messageArrayCheck[i].length; j++){
                assertEquals(messageArray[i][j], messageArrayCheck[i][j]);
            }
        }
    }
    @Test public void takeInverseTest() {
        Integer crypt[][]= new Integer[3][3];
        crypt[0][0]= 1;
        crypt[0][1]= -2;
        crypt[0][2]= 3;
        crypt[1][0]= 2;
        crypt[1][1]= -5;
        crypt[1][2]= 10;
        crypt[2][0]= -1;
        crypt[2][1]= 2;
        crypt[2][2]= -2;
        Integer cryptInverse[][]= new Integer[3][3];
        cryptInverse[0][0]= 10;
        cryptInverse[0][1]= -2;
        cryptInverse[0][2]= 5;
        cryptInverse[1][0]= 6;
        cryptInverse[1][1]= -1;
        cryptInverse[1][2]= 4;
        cryptInverse[2][0]= 1;
        cryptInverse[2][1]= 0;
        cryptInverse[2][2]= 1;
        crypt= Main.takeInverse(crypt);
        for(int i = 0; i < cryptInverse.length; i++){
            for(int j = 0; j < cryptInverse[i].length; j++){
                assertEquals(cryptInverse[i][j], crypt[i][j]);
            }
        }
    }
    @Test public void encryptMessageTest() {
        Integer crypt[][]= new Integer[3][3];
        crypt[0][0]= 1;
        crypt[0][1]= -2;
        crypt[0][2]= 3;
        crypt[1][0]= 2;
        crypt[1][1]= -5;
        crypt[1][2]= 10;
        crypt[2][0]= -1;
        crypt[2][1]= 2;
        crypt[2][2]= -2;
        String message ="THE BROWN FOX IS QUICK";
        assertEquals("FKJFYXDFNKHAPP WVLNSRRFH", Main.encryptMessage(crypt, message));
    }
    @Test public void decryptMessageTest() {
        Integer crypt[][]= new Integer[3][3];
        crypt[0][0]= 1;
        crypt[0][1]= -2;
        crypt[0][2]= 3;
        crypt[1][0]= 2;
        crypt[1][1]= -5;
        crypt[1][2]= 10;
        crypt[2][0]= -1;
        crypt[2][1]= 2;
        crypt[2][2]= -2;
        String message ="FKJFYXDFNKHAPP WVLNSRRFH";
        assertEquals("THE BROWN FOX IS QUICK  ",Main.decryptMessage(crypt, message));
    }
}