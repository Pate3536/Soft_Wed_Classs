/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentList;

/**
 *
 * @author princ
 */
public class PartTimeStudents extends Student{
    private int numCourse;
public PartTimeStudents(String studentId,String studentName,int numCourse)
{
super(studentId,studentName);
this.numCourse = numCourse;


}
    public int getNumCourse() {
        return numCourse;
    }

    public void setNumCourse(int numCourse) {
        this.numCourse = numCourse;
    }
    
}
