public class Grades {
    private int[] grades;
    private  int size;
    private int last;


    public Grades() {
        this.grades = new int[10];
        this.size = 0;
        this.last = 0;
    }
    public void add(int value) {
        if (this.size ==10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public int lastGrade() {
        return this.grades[this.size-1];

    }
    public void average() {
        int suma = 0;
        for (i=0; i<grades.length; i++) {
            suma +=grades[i];
        }
        int av = suma/this.size;
        return;

    }


}



}