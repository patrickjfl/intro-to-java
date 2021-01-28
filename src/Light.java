public class Light {
    public static void main(String[] args){
        int lightspeed;
        long days;
        long seconds;
        long distance;

        //approximate speed of light, miles per second
        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = seconds * lightspeed;

        System.out.println("In " + days + " days");
        System.out.println("Light will travel " + distance + " miles");
    }
}