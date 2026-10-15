public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int minInOven){
        return expectedMinutesInOven() - minInOven;
    }
    public int preparationTimeInMinutes(int nLayers){
        return nLayers*2;
    }
    public int totalTimeInMinutes(int nLayers, int nMinutes){
        return preparationTimeInMinutes(nLayers)+nMinutes;
    }
}
