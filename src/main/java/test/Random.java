package test;


public class Random {

    java.util.Random random = new java.util.Random();
    private final String[] colorList = {"red", "green", "yellow", "black", "white", "purple", "orange", "blue"};

    public String getRandomColor(){
        return colorList[random.nextInt(colorList.length)];
    }
    public int getRandomValue(int maxValue, int minValue){
        return random.nextInt(maxValue - minValue + 1) + minValue;
    }
    public int getRandomNextInt(int i){
        return random.nextInt(i);
    }




}
