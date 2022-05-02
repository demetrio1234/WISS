package encapsulation_excercise;
public class Printer {
    
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    
    public Printer(int tonerLevel, boolean duplex){
        this.tonerLevel = (tonerLevel>1 && tonerLevel<=100) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }    
    
    public int addToner(int tonerAmount){
        if((tonerAmount>0 && tonerAmount<=100)&&(this.tonerLevel+tonerAmount<=100)){
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }else{
                return -1;
            }
    }
    
    public int printPages(int pages){
        pages = this.duplex ? (pages / 2) + (pages % 2) : pages;
        this.pagesPrinted += pages;
        return pages;
    }

    public int getPagesPrinted(){
        return this.pagesPrinted;
    }
    
    public void getTonerLevel() {
    	System.out.println("Toner level is "+ this.tonerLevel +"%");
    }
    
}
