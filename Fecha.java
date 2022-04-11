public class Fecha implements Comparable<Fecha>{
    public int day;
    public int month;
    public int year;

    //Constructor
    public Fecha (int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
  //ComparableTo
    public int compareTo(Fecha f1) {
    	if(this.year>f1.year) {
    		return 1;
    	}
    	if(this.year<f1.year) {
    		return -1;
    	}
    	return 0;
    }

    //Setters y Getters
    public void setDay(int day){
        this.day=day;
    }

    public int getDay(){
        return day;
    }

    public void setMonth(int month){
        this.month=month;
    }

    public int getMonth(){
        return month;
    }

    public void setYear(int year){
        this.year=year;
    }

    @Override
    public String toString(){
        return this.day + "/" + this.month + "/" + this.year;
    }
}