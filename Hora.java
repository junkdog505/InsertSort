public class Hora implements Comparable<Hora>{
    public int hour;
    public int min;

    //Constructor
    public Hora(int hour, int min){
        setHour(hour);
        setMin(min);
    }
    
    //ComparableTo
    public int compareTo(Hora h1) {
    	if(this.hour>h1.hour) {
    		return 1;
    	}
    	if(this.hour<h1.hour) {
    		return -1;
    	}
    	return 0;
    }
    
    //Setters y Getters
    public void setHour(int hour){
        this.hour = 0;
        if(hour > -1 && hour < 24){     //Hour validation
            this.hour=hour;
        }
    }

    public void setMin(int min){
        this.min = 0;
        if(min > -1 && min <60){    //Minute validation
            this.min=min;
        }
    }

    public int getHour(){
        return hour;
    }

    public int getMin(){
        return min;
    }

    //am or pm?
    public String ampm(int h){
        if(h>12){
            return " pm";
        }else if (h<12){
            return " am";
        }else{
            return " ";
        }
    }


    @Override
    public String toString(){
        return this.hour + ":" + this.min + this.ampm(this.hour);
    }
}
