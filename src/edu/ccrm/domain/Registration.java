
package edu.ccrm.domain;

public class Registration {
    private final Learner learner;
    private final Subject subject;

    public Registration(Learner learner, Subject subject) {
        this.learner = learner;
        this.subject = subject;
    }

    public Learner fetchLearner() { return learner; }
    public Subject fetchSubject() { return subject; }

    @Override
    public String toString() {
        return learner.obtainRollNo() + " => " + subject.fetchSubjectId() + " (" + subject.fetchSubjectName() + ")";
    }
}
