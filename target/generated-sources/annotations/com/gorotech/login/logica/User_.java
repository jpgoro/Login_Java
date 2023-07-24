package com.gorotech.login.logica;

import com.gorotech.login.logica.Rol;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-23T21:51:23", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> nameUser;
    public static volatile SingularAttribute<User, Rol> aRol;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> passwordUser;

}