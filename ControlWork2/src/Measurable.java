interface Measurable {
    double getMeasure();

    static double getAverage(Measurable[] list) {
        return 0;
    }

    static double getMaximum(Measurable[] list) {
        return 0;
    }

    static double getMinimum(Measurable[] list) {
        return 0;
    }

    default boolean isGreaterThan(Measurable other){
        return false;
    }
}