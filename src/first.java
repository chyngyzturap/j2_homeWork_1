public final class first extends second {
    private int num;
    private spisok spisok;
    private four four;
    private int chislo;

    public four getFour() {
        return four;
    }

    public int getNum() {
        return num;
    }

    public int getChislo(){
        return chislo;
    }

    public first (int num, four four, int chislo){
        super(num, four);
        this.four = four;
        this.num = num;
        this.chislo = chislo;
    }

    public String getInfo (){
        return super.getInfo() + chislo;
    }
}
