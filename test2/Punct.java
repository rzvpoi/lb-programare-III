package test2;

public class Punct {

    public int X;
    public int Y;


    public Punct(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public void afisare()
    {
        System.out.println("X: " + X + "\n Y: " + Y );
    }

    public int getX() {
        return this.X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return this.Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public Punct X(int X) {
        setX(X);
        return this;
    }

    public Punct Y(int Y) {
        setY(Y);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Punct)) {
            return false;
        }
        Punct punct = (Punct) o;
        return X == punct.X && Y == punct.Y;
    }

    @Override
    public String toString() {
        return "{" +
            " X='" + getX() + "'" +
            ", Y='" + getY() + "'" +
            "}";
    }
    
}
