/**
 * @version 1.0.0 May 28, 2020
 * @author Hakkı Can Akut
 */
public class Main {
    public static void main(String[] args) {

        // example
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
        System.out.println(encryptMessage(crypt,message));
        System.out.println(decryptMessage(crypt,encryptMessage(crypt,message)));
    }


    /**
     * Changes string massage to (3 x n) char array, if length of message is not 3n, method fills array with space.
     * @param message , String
     * @return messageArray , char[][]
     */
    public static char[][] messageToArray(String message){
        int j=0;
        int aLCount= message.length()%3;
        int count=0;
        if (aLCount==0){
            j =message.length()/3;
        }
        else if (aLCount==1){
            j=(message.length()+2)/3;
        }
        else if (aLCount==2){
            j=(message.length()+1)/3;
        }
        char[][] messageArray= new char[3][j];

        for(int k = 0; k < messageArray[0].length; k++){
            for(int i = 0; i < messageArray.length; i++){
                if (count!=message.length()){
                    messageArray[i][k]=message.charAt(count);
                    count++;
                }
            }
        }
        if (aLCount==1){
            messageArray[messageArray.length-2][messageArray[0].length-1]=' ';
            messageArray[messageArray.length-1][messageArray[0].length-1]=' ';
        }
        if (aLCount==2){
            messageArray[messageArray.length-1][messageArray[0].length-1]=' ';
        }

        return messageArray;
    }

    /**
     * Changes integer[][] to char with pattern
     * @param message
     * @return
     */
    public static char[][] pattern(Integer[][] message){
        char[][] cryptMessage= new char[message.length][message[0].length];
        for(int i = 0; i < message.length; i++){
            for(int j = 0; j < message[i].length; j++){
                if (message[i][j] == 10){ cryptMessage[i][j]= 'A';}
                else if (message[i][j] == 23){ cryptMessage[i][j]= 'B';}
                else if (message[i][j] == 2){ cryptMessage[i][j]= 'C';}
                else if (message[i][j] == 0){ cryptMessage[i][j]= 'D';}
                else if (message[i][j] == 13){ cryptMessage[i][j]= 'E';}
                else if (message[i][j] == 1){ cryptMessage[i][j]= 'F';}
                else if (message[i][j] == 22){ cryptMessage[i][j]= 'G';}
                else if (message[i][j] == 21){ cryptMessage[i][j]= 'H';}
                else if (message[i][j] == 11){ cryptMessage[i][j]= 'I';}
                else if (message[i][j] == 12){ cryptMessage[i][j]= 'J';}
                else if (message[i][j] == 6){ cryptMessage[i][j]= 'K';}
                else if (message[i][j] == 26){ cryptMessage[i][j]= 'L';}
                else if (message[i][j] == 18){ cryptMessage[i][j]= 'M';}
                else if (message[i][j] == 9){ cryptMessage[i][j]= 'N';}
                else if (message[i][j] == 16){ cryptMessage[i][j]= 'O';}
                else if (message[i][j] == 24){ cryptMessage[i][j]= 'P';}
                else if (message[i][j] == 7){ cryptMessage[i][j]= 'Q';}
                else if (message[i][j] == 20){ cryptMessage[i][j]= 'R';}
                else if (message[i][j] == 15){ cryptMessage[i][j]= 'S';}
                else if (message[i][j] == 4){ cryptMessage[i][j]= 'T';}
                else if (message[i][j] == 25){ cryptMessage[i][j]= 'U';}
                else if (message[i][j] == 3){ cryptMessage[i][j]= 'V';}
                else if (message[i][j] == 8){ cryptMessage[i][j]= 'W';}
                else if (message[i][j] == 19){ cryptMessage[i][j]= 'X';}
                else if (message[i][j] == 5){ cryptMessage[i][j]= 'Y';}
                else if (message[i][j] == 17){ cryptMessage[i][j]= 'Z';}
                else if (message[i][j] == 14){ cryptMessage[i][j]= ' ';}
                else { cryptMessage[i][j]= ' '; }
            }
        }
        return cryptMessage;
    }

    /**
     * Changes char[][] to integer[][] with certain pattern
     * @param message char[][]
     * @return cryptMessage Integer[][]
     */
    public static Integer[][] pattern(char[][] message){
        Integer[][] cryptMessage= new Integer[message.length][message[0].length];
        for(int i = 0; i < message.length; i++) {
            for (int j = 0; j < message[i].length; j++) {
                if (message[i][j] == 'A'){ cryptMessage[i][j]= 10;}
                else if (message[i][j] == 'B'){ cryptMessage[i][j]= 23;}
                else if (message[i][j] == 'C'){ cryptMessage[i][j]= 2;}
                else if (message[i][j] == 'D'){ cryptMessage[i][j]= 0;}
                else if (message[i][j] == 'E'){ cryptMessage[i][j]= 13;}
                else if (message[i][j] == 'F'){ cryptMessage[i][j]= 1;}
                else if (message[i][j] == 'G'){ cryptMessage[i][j]= 22;}
                else if (message[i][j] == 'H'){ cryptMessage[i][j]= 21;}
                else if (message[i][j] == 'I'){ cryptMessage[i][j]= 11;}
                else if (message[i][j] == 'J'){ cryptMessage[i][j]= 12;}
                else if (message[i][j] == 'K'){ cryptMessage[i][j]= 6;}
                else if (message[i][j] == 'L'){ cryptMessage[i][j]= 26;}
                else if (message[i][j] == 'M'){ cryptMessage[i][j]= 18;}
                else if (message[i][j] == 'N'){ cryptMessage[i][j]= 9;}
                else if (message[i][j] == 'O'){ cryptMessage[i][j]= 16;}
                else if (message[i][j] == 'P'){ cryptMessage[i][j]= 24;}
                else if (message[i][j] == 'Q'){ cryptMessage[i][j]= 7;}
                else if (message[i][j] == 'R'){ cryptMessage[i][j]= 20;}
                else if (message[i][j] == 'S'){ cryptMessage[i][j]= 15;}
                else if (message[i][j] == 'T'){ cryptMessage[i][j]= 4;}
                else if (message[i][j] == 'U'){ cryptMessage[i][j]= 25;}
                else if (message[i][j] == 'V'){ cryptMessage[i][j]= 3;}
                else if (message[i][j] == 'W'){ cryptMessage[i][j]= 8;}
                else if (message[i][j] == 'X'){ cryptMessage[i][j]= 19;}
                else if (message[i][j] == 'Y'){ cryptMessage[i][j]= 5;}
                else if (message[i][j] == 'Z'){ cryptMessage[i][j]= 17;}
                else if (message[i][j] == ' '){ cryptMessage[i][j]= 14;}
            }
        }
        return cryptMessage;
    }

    /**
     * Math operation, matrix multiplication (Integer[][] x Integer[][])
     * @param crypt , Integer[][]
     * @param message , Integer[][]
     * @return cryptMessage , (Integer[][] x Integer[][])
     */
    public static Integer[][] matrixMultiplication(Integer [][] crypt, Integer [][] message) {
        Integer[][] cryptMessage = new Integer[message.length][message[0].length];

        for(int i = 0; i < message.length; i++){
            for(int j = 0; j < message[i].length; j++){
                cryptMessage[i][j]= crypt[i][0]*message[0][j] + crypt[i][1]*message[1][j] + crypt[i][2]*message[2][j];
            }
        }
        return cryptMessage;
    }

    /**
     * Takes Mod 27 (Number of alphabet + space)
     * @param message , Integer[][]
     * @return message , Integer[][]
     */
    public static Integer[][] takeMod(Integer[][] message){
        for(int i = 0; i < message.length; i++){
            for(int j = 0; j < message[i].length; j++){
                if(message[i][j]>=0){
                    message[i][j]= message[i][j]%27;
                }
                else {
                    while (message[i][j]<0){
                        message[i][j]+=27;
                    }
                    message[i][j]= message[i][j];
                }
            }
        }
        return message;
    }

    /**
     * take inverse of matrix
     * @param crypt , Integer[][]
     * @return cryptInverse , Integer[][]
     */
    public static Integer[][] takeInverse(Integer[][] crypt){
        int det = (crypt[0][0]*((crypt[1][1]*crypt[2][2])-(crypt[1][2]*crypt[2][1])))
                -(crypt[0][1]*((crypt[1][0]*crypt[2][2])-(crypt[2][0]*crypt[1][2])))
                +(crypt[0][2]*((crypt[1][0]*crypt[2][1])-(crypt[2][0]*crypt[1][1])));
        Integer[][] cryptInverse= new Integer[3][3];
        cryptInverse[0][0]= ((crypt[1][1]*crypt[2][2])-(crypt[1][2]*crypt[2][1]))/det;
        cryptInverse[0][1]= -((crypt[0][1]*crypt[2][2])-(crypt[0][2]*crypt[2][1]))/det;
        cryptInverse[0][2]= ((crypt[0][1]*crypt[1][2])-(crypt[0][2]*crypt[1][1]))/det;
        cryptInverse[1][0]= -((crypt[1][0]*crypt[2][2])-(crypt[2][0]*crypt[1][2]))/det;
        cryptInverse[1][1]= ((crypt[0][0]*crypt[2][2])-(crypt[0][2]*crypt[2][0]))/det;
        cryptInverse[1][2]= -((crypt[0][0]*crypt[1][2])-(crypt[1][0]*crypt[0][2]))/det;
        cryptInverse[2][0]= ((crypt[1][0]*crypt[2][1])-(crypt[2][0]*crypt[1][1]))/det;
        cryptInverse[2][1]= -((crypt[0][0]*crypt[2][1])-(crypt[0][1]*crypt[2][0]))/det;
        cryptInverse[2][2]= ((crypt[0][0]*crypt[1][1])-(crypt[1][0]*crypt[0][1]))/det;
        return cryptInverse;
    }

    /**
     * encrypts message with crypt matrix
     * @param crypt , Integer[][]
     * @param message , String
     * @return encryptMessage , String
     */
    public static String encryptMessage(Integer [][] crypt, String message){
        char[][] cryptMessage= messageToArray(message);
        if (crypt[0].length !=3 && crypt.length !=3){
            System.out.println("Crypt matrix must be 3 x 3");
            return null;
        }
        else {
            Integer[][] messageArrayCheck= Main.pattern(cryptMessage);
            messageArrayCheck= Main.matrixMultiplication(crypt,messageArrayCheck);
            messageArrayCheck= Main.takeMod(messageArrayCheck);
            cryptMessage= Main.pattern(messageArrayCheck);
            String encryptMessage= String.valueOf(cryptMessage[0][0]);
            for(int k = 0; k < cryptMessage[0].length; k++){
                for(int i = 0; i < cryptMessage.length; i++){
                    if (k==0 && i==0){ }
                    else {
                        encryptMessage += cryptMessage[i][k];
                    }
                }
            }
            return encryptMessage;
        }
    }

    /**
     * decrypts message with crypt matrix
     * @param crypt , Integer[][]
     * @param message , String
     * @return decryptMessage , String
     */
    public static String decryptMessage(Integer[][] crypt, String message){
        char[][] cryptMessage= messageToArray(message);
        if (crypt[0].length !=3 && crypt.length !=3){
            System.out.println("Crypt matrix must be 3 x 3");
            return null;
        }
        else {
            crypt = takeInverse(crypt);
            Integer[][] messageArrayCheck= Main.pattern(cryptMessage);
            messageArrayCheck= Main.matrixMultiplication(crypt,messageArrayCheck);
            messageArrayCheck= Main.takeMod(messageArrayCheck);
            cryptMessage= Main.pattern(messageArrayCheck);
            String decryptMessage= String.valueOf(cryptMessage[0][0]);
            for(int k = 0; k < cryptMessage[0].length; k++){
                for(int i = 0; i < cryptMessage.length; i++){
                    if (k==0 && i==0){ }
                    else {
                        decryptMessage += cryptMessage[i][k];
                    }
                }
            }
            return decryptMessage;
        }
    }
}
