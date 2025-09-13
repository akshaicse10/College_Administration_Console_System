
package edu.ccrm.domain;

public class Subject {
    private final String subjectId;
    private final String subjectName;
    private final int unitCount;
    private final String mentor;
    private final String faculty;
    private final Term term;

    public Subject(String subjectId, String subjectName, int unitCount, String mentor, String faculty, Term term) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.unitCount = unitCount;
        this.mentor = mentor;
        this.faculty = faculty;
        this.term = term;
    }

    public String fetchSubjectId() { return subjectId; }
    public String fetchSubjectName() { return subjectName; }

    @Override
    public String toString() {
        return subjectId + " | " + subjectName + " | " + unitCount + " units | " + mentor + " | " + faculty + " | " + term;
    }
}
