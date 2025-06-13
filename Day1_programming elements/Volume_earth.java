public class Volume_earth {
    public static void main(String[] args){
        int Earth_radius = 6378;
        double Earth_volume= (4/3) * Math.PI *Math.pow(Earth_radius,3);
        System.out.println("The volume of the Earth is " + Earth_volume + " cubic kilometers " + " cubic miles = " + 0.62*Earth_volume);
    }
    
}
