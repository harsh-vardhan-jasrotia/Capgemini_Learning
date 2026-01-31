class BubbleSortMarks {
    public static void main(String[] args) {
        int[] marks={23,13,44,91,64,43};
        int n=marks.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(marks[j]>marks[j+1]){
                    int temp=marks[j];
                    marks[j]=marks[j+1];
                    marks[j+1]=temp;
                }
            }
        }
            System.out.println("Sorted Student Marks:");
            for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}