package com.zbw.crm.workbench.dao;

import com.zbw.crm.workbench.domain.Contacts;

import java.util.List;

public interface ContactsDao {

    int save(Contacts con);

    List<Contacts> getContactsList();
}
