package org.fasttrackit.service;

import org.fasttrackit.domain.Children;
import org.fasttrackit.persistence.ChildrenRepository;

import java.io.IOException;
import java.sql.SQLException;

public class ChildrenService {
   private ChildrenRepository childrenRepository =new ChildrenRepository();

    public void createChildren(Children children) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Create properties for child:" + children);
        childrenRepository.createChildren(children);

    }

}
