import javax.swing.JOptionPane;
public class Problem6
{

    public static void main(String[] args)
    {
        //Initializing the variables
        double arrayA [][] = new double [3][3];
        double arrayB [][] = new double [3][3];
        double sum[][] = new double[3][3];
        String displayA = "";
        String displayB = "";
        String displaySum = "";
        
        // Loop used for getting the input for Array A
        for(int r =0; r<arrayA.length; r++)
        {
            for(int c =0; c<arrayA.length;c++)
            {
                arrayA[r][c] = Double.parseDouble(JOptionPane.showInputDialog("Enter number for Array A index ["+r+"] ["+c+"]"));
                displayA+=arrayA[r][c]+" ";          
            }
            displayA+="\n";
        }
        // Loop used for getting the input for Array B
        for(int r =0; r<arrayB.length; r++)
        {
            for(int c =0; c<arrayB.length;c++)
            {
                arrayB[r][c] = Double.parseDouble(JOptionPane.showInputDialog("Enter number for Array B index ["+r+"] ["+c+"]"));
                displayB+=arrayB[r][c]+" ";          
            }
            displayB+="\n";
        }
        
        //Loop for getting the sum the same indexes of Array A and Array B
        for(int r =0; r<arrayB.length; r++)
        {
            for(int c =0; c<arrayB.length;c++)
            {
                sum[r][c] = (arrayA[r][c]+arrayB[r][c]);
                displaySum+=sum[r][c]+", ";
            }
            displaySum+="\n";
        }
        
        
        
        
        
        
        JOptionPane.showMessageDialog(null,"Values inside Array A: \n" + displayA
        +"\n Values inside Array B: \n" + displayB);
        JOptionPane.showMessageDialog(null,"Sum numbers of Array A and Array B: \n" + displaySum);
        
    }
    
}
