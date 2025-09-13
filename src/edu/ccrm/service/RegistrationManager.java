
package edu.ccrm.service;

import edu.ccrm.domain.*;
import java.util.*;

public class RegistrationManager {
    private List<Registration> registrations = new ArrayList<>();

    public void register(Learner l, Subject s) {
        registrations.add(new Registration(l, s));
        l.addSubject(s);
        System.out.println("Registered " + l.obtainName() + " for " + s.fetchSubjectName());
    }

    public void deregister(Learner l, Subject s) {
        registrations.removeIf(r -> r.fetchLearner().equals(l) && r.fetchSubject().equals(s));
        l.removeSubject(s);
        System.out.println("Deregistered " + l.obtainName() + " from " + s.fetchSubjectName());
    }

    public void displayRegistrations() {
        if (registrations.isEmpty()) System.out.println("No registrations found.");
        else for (Registration r : registrations) System.out.println(r);
    }
}
