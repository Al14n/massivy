public class Matrit {

    int[][] mass;
    int stroka;
    int stolb;

    public Matrit(int a, int b){

        stroka = a;
        stolb = b;
        mass = new int [a][b];
    }
    public static Matrit Plus (Matrit a, Matrit b){
        Matrit c = new Matrit(a.stroka, a.stolb);
        for (int i = 0; i< a.stroka; i++){
            for (int j = 0; j< a.stolb; j++){
                c.mass[i][j] = a.mass[i][j] + b.mass[i][j];
            }
        }
        return c;
    }
    public static Matrit Umnoj(Matrit a, int b) {
            Matrit c = new Matrit(a.stroka, a.stolb);
        for(int i = 0; i< a.stroka; i++){
            for(int j = 0; j< a.stolb;j++){
                c.mass[i][j] = a.mass[i][j] * b;
            }
        }
        return c;
    }
    public  static Matrit Umnoj2 (Matrit a, Matrit b){
        Matrit c = new Matrit(a.stroka, a.stolb);
        for (int i = 0; i<a.stroka; i++){
            for(int j = 0; j< a.stolb;j++){
                for(int l = 0;l<a.stroka;l++){
                    c.mass[i][j] = c.mass[i][j] + a.mass[i][l] * b.mass[l][j];
                }
            }
        }
        return c;
    }
}
