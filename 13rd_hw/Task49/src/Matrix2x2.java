public class Matrix2x2 {
    private double mx[][];

    public Matrix2x2(){
        mx = new double[2][2];
        for (int i = 0; i <2; i++){
            for (int j = 0; j<2; j++){
                mx[i][j]=0;
            }
        }
    }

    public Matrix2x2(Matrix2x2 mx){
        this.mx = mx.mx;
    }

    public Matrix2x2(double lambda){
        mx = new double[2][2];
        for (int i = 0; i <2; i++){
            for (int j = 0; j<2; j++){
                mx[i][j]=lambda;
            }
        }
    }

    public Matrix2x2(double [][] array){
        if ((array.length != 2)||(array[0].length !=2)){
            System.out.println("Ошибка");
        } else {
            mx = array;
        }
    }

    public Matrix2x2(double a11, double a12, double a21, double a22){
        mx[0][0]=a11;
        mx[0][1]=a12;
        mx[1][0]=a21;
        mx[1][1]=a22;
    }

    public Matrix2x2 add(Matrix2x2 mx){
        return new Matrix2x2(this.mx[0][0]+mx.mx[0][0],
                             this.mx[0][1]+mx.mx[0][1],
                             this.mx[1][0]+mx.mx[1][0],
                             this.mx[1][1]+mx.mx[1][1]);
    }

    public void add2(Matrix2x2 mx){
        this.mx[0][0]+= mx.mx[0][0];
        this.mx[0][1]+= mx.mx[0][1];
        this.mx[1][0]+= mx.mx[1][0];
        this.mx[1][1]+= mx.mx[1][1];
    }

    public Matrix2x2 sub(Matrix2x2 mx){
        return new Matrix2x2(this.mx[0][0]-mx.mx[0][0],
                this.mx[0][1]-mx.mx[0][1],
                this.mx[1][0]-mx.mx[1][0],
                this.mx[1][1]-mx.mx[1][1]);
    }

    public void sub2(Matrix2x2 mx){
        this.mx[0][0]-= mx.mx[0][0];
        this.mx[0][1]-= mx.mx[0][1];
        this.mx[1][0]-= mx.mx[1][0];
        this.mx[1][1]-= mx.mx[1][1];
    }

    public Matrix2x2 multNumber(double lambda){
        return new Matrix2x2(this.mx[0][0]*lambda,
                this.mx[0][1]*lambda,
                this.mx[1][0]*lambda,
                this.mx[1][1]*lambda);
    }

    public void multNumber2(double lambda){
        this.mx[0][0]*=lambda;
        this.mx[0][1]*=lambda;
        this.mx[1][0]*=lambda;
        this.mx[1][1]*=lambda;
    }

    public Matrix2x2 mult(Matrix2x2 mx){
        return new Matrix2x2(this.mx[0][0]*mx.mx[0][0]+this.mx[0][1]*mx.mx[1][0],
                             this.mx[0][0]*mx.mx[0][1]+this.mx[0][1]*mx.mx[1][1],
                             this.mx[1][0]*mx.mx[0][0]+this.mx[1][1]*mx.mx[1][0],
                             this.mx[1][0]*mx.mx[0][1]+this.mx[1][1]*mx.mx[1][1]);
    }

    public void mult2(Matrix2x2 mx){
        this.mx[0][0] = this.mx[0][0]*mx.mx[0][0]+this.mx[0][1]*mx.mx[1][0];
        this.mx[0][1] = this.mx[0][0]*mx.mx[0][1]+this.mx[0][1]*mx.mx[1][1];
        this.mx[1][0] = this.mx[1][0]*mx.mx[0][0]+this.mx[1][1]*mx.mx[1][0];
        this.mx[1][1] = this.mx[1][0]*mx.mx[0][1]+this.mx[1][1]*mx.mx[1][1];
    }

    public double det(){
        return mx[0][0]*mx[1][1]-mx[0][1]*mx[1][0];
    }

    public void transpon(){
        mx[0][1]+=mx[1][0];
        mx[1][0] = mx[0][1]-mx[1][0];
        mx[0][1] = mx[0][1]-mx[1][0];
    }

    public Matrix2x2 inverseMatrix(){
        Matrix2x2 newmx;
        if (this.det()==0){
            System.out.println("Ошибка!");
            Matrix2x2 mx;
            newmx = new Matrix2x2();
            int x = 1;
            while (x > 0){
                x++;
                System.out.println("В следующий раз подумайте перед тем как делать");
            }
        } else {
            newmx = new Matrix2x2(this.mx[1][1]*this.det(),
                                 this.mx[1][0]*-1*this.det(),
                                 this.mx[0][1]*-1*this.det(),
                                 this.mx[0][0]*this.det());
        }
        return newmx;
    }

    public Matrix2x2 equivalentDiagonal(){
        return new Matrix2x2(mx[0][0], 0, 0 ,mx[1][1]);
    }

    public Vector2D multVector(Vector2D v){
        return new Vector2D(v.getX()*mx[0][0]+v.getY()*mx[0][1], v.getX()*mx[1][0]+v.getY()*mx[1][1]);
    }

}
