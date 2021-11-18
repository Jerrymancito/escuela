package mx.com.jerry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import mx.com.jerry.model.Estudiante;

@Service
public class ServiceImpl {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Estudiante> getStudents() {
		return jdbcTemplate.query("SELECT * FROM estudiantes", BeanPropertyRowMapper.newInstance(Estudiante.class));
	}
	public void inicializarTabla() {
		jdbcTemplate.execute("create table estudiantes (id bigint not null, nombre varchar(255), score decimal(4,2), PRIMARY KEY (ID))");
		jdbcTemplate.execute("INSERT INTO ESTUDIANTES VALUES(1, 'BOB',50)");
		jdbcTemplate.execute("INSERT INTO ESTUDIANTES VALUES(2, 'JOHN',65.5)");
		jdbcTemplate.execute("INSERT INTO ESTUDIANTES VALUES(3, 'HARRY',45)");
		jdbcTemplate.execute("INSERT INTO ESTUDIANTES VALUES(4, 'DICK',85)");
		jdbcTemplate.execute("INSERT INTO ESTUDIANTES VALUES(5, 'DEV',25)");
		jdbcTemplate.execute("INSERT INTO ESTUDIANTES VALUES(6, 'SIE',98)");
		jdbcTemplate.execute("INSERT INTO ESTUDIANTES VALUES(7, 'TOM',90)");
		jdbcTemplate.execute("INSERT INTO ESTUDIANTES VALUES(8, 'JULIA',70.5)");
		jdbcTemplate.execute("INSERT INTO ESTUDIANTES VALUES(9, 'ERICA',81)");
		jdbcTemplate.execute("INSERT INTO ESTUDIANTES VALUES(10, 'JERRY',85)");
	}
}
