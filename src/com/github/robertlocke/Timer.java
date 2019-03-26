package com.github.robertlocke;

public class Timer {


    private long start;
    private long stop;
    private long duration;

    public long start() {
        return start = System.currentTimeMillis();
    }

    public long stop() {
        return stop = System.currentTimeMillis();
    }


    public long milliseconds() {
        return duration = stop - start;
    }

    public String duration() {
        if (milliseconds() >= 3600000){
            return "It took " + (milliseconds() / 3600000) + " hours to execute this program.";
        } else if (milliseconds() >= 60000) {
            return "It took " + (milliseconds() / 60000) + " minutes to execute this program.";
        } else if(milliseconds() >= 1000)  {
            return "It took " + (milliseconds() / 1000) + " seconds to execute this program.";
        }else
            return "It took " + milliseconds() + " milliseconds to execute this program.";
    }
}





  /* public static String duration(){
    return "Execution time in Seconds: " + ((getStop()-getStart())/1000);

  } */


