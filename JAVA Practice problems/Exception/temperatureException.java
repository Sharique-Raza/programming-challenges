package Exception;

public class temperatureException extends Exception{
  private double degrees;

    public temperatureException(double degrees) {
        this.degrees = degrees;
    }
    public String getmessage() {
        if (degrees >= 37) {
            return "The temperature of " + degrees + "C is not in the normal range";
        } else {
            System.out.println("Temperature is in normal range");
        }
        return null;
    }
    public double getDegrees() {
        return degrees;
    }

    public static void main(String[] args) {
        temperatureException temp = new temperatureException(52.54);
        System.out.println(temp.getmessage());
        System.out.println(temp.getDegrees());
    }

    }

