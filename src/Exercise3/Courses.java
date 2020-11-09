package Exercise3;

import java.util.Date;
import java.time.LocalDate;

public class Courses {

    String course;
    LocalDate startingDate;
    LocalDate endingDate;

    Courses(String course, LocalDate startingDate, LocalDate endingDate) {
        this.course = course;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }

    @Override
    public String toString() {
        return "Courses{" + "course=" + course + ", startingDate=" + startingDate + ", endingDate=" + endingDate + '}';
    }

}
