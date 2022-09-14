public class Main {
    public static void main(String[] args) {
       Matrit a = new Matrit(2,2);
       a.mass = new int[][]{{1, 2}, {3, 4}};
       Matrit b = new Matrit(2,2);
       b.mass = new int[][]{{2,1},{3,4}};

       Matrit result = Matrit.Plus(a,b);
       Matrit result2 = Matrit.Umnoj(a,2);
       Matrit result3 = Matrit.Umnoj2(a,b);

       for(int i = 0; i< result.stroka;i++){
           for(int j = 0; j< result.stolb; j++){
               System.out.print("\t" + result.mass[i][j]);
           }
           System.out.println();
       }
       System.out.println();

        for(int i = 0; i< result2.stroka;i++){
            for(int j = 0; j< result2.stolb; j++){
                System.out.print("\t" + result2.mass[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i< result3.stroka;i++){
            for(int j = 0; j<result.stolb;j++){
                System.out.print("\t"+ result3.mass[i][j]);
            }
            System.out.println();
        }
    }
}

