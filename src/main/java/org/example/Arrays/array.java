class StudentMarksArray
{
    public static void main(String arg[])
    {
        int student_marks[] = new int[5]; 
        student_marks[2] = 25; // LINE A
        System.out.println("Third Element = " + student_marks[2]); // LINE B
        System.out.println("Fourth Element = " + student_marks[3]); // LINE C
        
        // student_marks[-3] = 45; // Won't work // LINE D
        // student_marks[5] = 32; // Won't work // LINE E
    
    }
}