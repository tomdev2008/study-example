package org.zcgewu.study.soa.doctor.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.zcgewu.study.soa.doctor.mapper.DoctorMapper;

@Component
public class DoctorDao {

	@Autowired
	private DoctorMapper doctorMapper;
}
