package day3_04_04_22;

abstract class Pen {
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen
{
    void Nib()
    {
        System.out.println("Changing nib of pen...");
    }

    void write()
    {
        System.out.println("write..");
    }

    void refill()
    {
        System.out.println("refill..");
    }
}


public class Abstract
{
    public static void main(String[] args) {
        // Pen f = new FountainPen();
        // ((FountainPen)f).Nib();;
        // f.Nib();

        FountainPen f = new FountainPen();
        f.Nib();;
        f.write();
        f.refill();
    }
}
