package com.gorotech.login.logica;

import com.gorotech.login.logica.User;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-26T01:44:49", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Rol.class)
public class Rol_ { 

    public static volatile ListAttribute<Rol, User> UsersList;
    public static volatile SingularAttribute<Rol, String> description;
    public static volatile SingularAttribute<Rol, Integer> id;
    public static volatile SingularAttribute<Rol, String> rolName;

}