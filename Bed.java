public class Bed{
    // write code here
    private int pillows, height, sheets, quilt;
    private String style;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.style = style;
        this.quilt = quilt;
    }

    public void make() {
        System.out.println("Bed -> Making | ");
    }

    public String getStyle(){
        return style;
    }

    public int getPillows(){
        return pillows;
    }

    public int getHeight(){
        return height;
    }

    public int getSheets(){
        return sheets;
    }

    public int getQuilt(){
        return quilt;
    }



}