public class PowerCommand extends MathCommand{
    
    public double calculate(double x, double y)
    {
        double base = x, power = y;
        double result = 1;

        while(power != 0)
        {
            result = result * base;
            power--;
        }

        return result;
   }
}
