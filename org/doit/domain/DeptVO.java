package org.doit.domain;

import java.time.LocalDateTime;

import com.util.DBConn;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeptVO {
	
	

	// DeptVO
	int deptno;
	String dname;
	String loc;
	

	




} // class
