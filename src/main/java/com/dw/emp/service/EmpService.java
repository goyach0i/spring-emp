package com.dw.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw.emp.mapper.EmpMapper;
import com.dw.emp.vo.EmpVO;

@Service
public class EmpService {
	
	@Autowired
	EmpMapper empMapper;
	
	public List<EmpVO> selectEmp(){
		return empMapper.selectEmp();
	}
	public EmpVO selectEmpfindByEmpno(int empno) {
		return empMapper.selectEmpfindByEmpno(empno);
	}
	public int insertEMP(EmpVO emp) {
		
		return empMapper.insertEMP(emp);
	}
	public int updateEMP(EmpVO emp) {
		return empMapper.updateEMP(emp);
	}
	public int deleteEmp(int empno) {
		return empMapper.deleteEmp(empno);
	}
}
