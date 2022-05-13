package JavaEx16Sda;

public enum Runner {
    BEGINNER(10,20), INTERMEDIATE(20,30), ADVANCED(30,40);
    
    private int minTime;
    private int maxTime;
    
    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }
    
    public int getMinTime() {
        return minTime;
    }
    
    public int getMaxTime() {
        return maxTime;
    }

    public static Runner getFitnessLevel(int time) {
        if (time < BEGINNER.getMinTime()) {
            return BEGINNER;
        } else if (time < INTERMEDIATE.getMinTime()) {
            return INTERMEDIATE;
        } else {
            return ADVANCED;
        }
    }

    @Override
    public String toString() {
        return "Runner{" + "minTime=" + minTime + ", maxTime=" + maxTime + '}';
    }
    
}
