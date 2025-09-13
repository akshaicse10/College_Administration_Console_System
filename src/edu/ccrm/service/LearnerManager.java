
package edu.ccrm.service;

import edu.ccrm.domain.Learner;
import java.util.*;

public class LearnerManager {
    private List<Learner> learners = new ArrayList<>();

    public void insertLearner(Learner l) {
        learners.add(l);
        System.out.println("Learner inserted successfully!");
    }

    public void displayLearners() {
        if (learners.isEmpty()) System.out.println("No learners found.");
        else for (Learner l : learners) System.out.println(l);
    }

    public Learner searchByRollNo(String rollNo) {
        for (Learner l : learners) {
            if (l.obtainRollNo().equalsIgnoreCase(rollNo)) return l;
        }
        return null;
    }
}
