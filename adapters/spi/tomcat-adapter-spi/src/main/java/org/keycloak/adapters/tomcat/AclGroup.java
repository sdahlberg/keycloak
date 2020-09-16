package org.keycloak.adapters.tomcat;

import java.security.Principal;
import java.util.Enumeration;

public interface AclGroup extends Principal {
    boolean addMember(Principal user);

    boolean isMember(Principal member);

    Enumeration<? extends Principal> members();

    boolean removeMember(Principal user);
}
