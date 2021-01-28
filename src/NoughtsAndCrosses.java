class NoughtsAndCrosses{
    public static void main(String args[]){
        //declare and initialise 2d array
            String arr[][]={{"X","O","X"},{"O", "X", "O"},{"O","O", "X"}};
            for (int i=0;i<arr.length; i++){
                for (int j=0; j<arr.length;j++){
                    System.out.print(arr[i][j]+ " ");
                }
                System.out.println();
            }
    }
        }