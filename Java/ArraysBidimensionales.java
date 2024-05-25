public class ArraysBidimensionales {
    public static void main(String[] args) {
        
        int [][] matriz=new int[4][5];

        matriz[0][0]=13;
        matriz[0][1]=7;
        matriz[0][2]=3;
        matriz[0][3]=28;
        matriz[0][4]=74;

        matriz[1][0]=19;
        matriz[1][1]=36;
        matriz[1][2]=59;
        matriz[1][3]=48;
        matriz[1][4]=1;

        matriz[2][0]=51;
        matriz[2][1]=33;
        matriz[2][2]=66;
        matriz[2][3]=82;
        matriz[2][4]=7;

        matriz[3][0]=5;
        matriz[3][1]=90;
        matriz[3][2]=27;
        matriz[3][3]=29;
        matriz[3][4]=8;

        for(int i=0;i<4;i++){

            System.out.println();

            for(int j=0;j<5;j++){

                System.out.print(matriz[i][j]+" ");

            }

        }

    }

    
    
}
