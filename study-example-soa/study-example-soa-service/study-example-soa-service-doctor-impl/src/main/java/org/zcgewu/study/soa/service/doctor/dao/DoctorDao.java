package org.zcgewu.study.soa.service.doctor.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.zcgewu.study.soa.service.doctor.mapper.DoctorMapper;

@Component
public class DoctorDao {

	@Autowired
	private DoctorMapper doctorMapper;
}
