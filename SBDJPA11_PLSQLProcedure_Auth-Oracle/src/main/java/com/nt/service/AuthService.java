package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

/*

CREATE OR REPLACE PROCEDURE P_USER_AUTH 
(
  USERNAME IN VARCHAR2 
, Pass IN VARCHAR2 ,
  result out VARCHAR2
) AS
cnt number;
BEGIN
    select count(*) into cnt from JPA_User_Auth where username=username
    and password=pass;
    if(cnt<>0)then
        result:='Valid user';
    else
        result:= 'Invalid User';
    end if;
END P_USER_AUTH;

 */

@Service
public class AuthService implements IAuthService {
	
	@Autowired
	EntityManager manager;

	@Override
	public String isUserValid(String userName, String password) throws Exception {
		
		//Creating Object for Stored 
		StoredProcedureQuery query=manager.createStoredProcedureQuery("P_USER_AUTH");
		
		//reg parameter
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
		
		//Set Value
		query.setParameter(1, userName);
		query.setParameter(2, password);
		
		//Return Result 
		return (String)query.getOutputParameterValue(3); //Return type is Object
	}

}
