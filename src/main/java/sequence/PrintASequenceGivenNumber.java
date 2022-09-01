package sequence;

import java.util.Scanner;

public class PrintASequenceGivenNumber {

    public void creatingSequence(int n){
        int sequence = 1;

        while (n!=0){
            System.out.print(sequence);
            System.out.print(" ");
            sequence *= 2;
            n-=1;
        }
    }

}
