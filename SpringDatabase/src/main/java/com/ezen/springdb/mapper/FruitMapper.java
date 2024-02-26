package com.ezen.springdb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ezen.springdb.dto.FruitDTO;

public interface FruitMapper {

	@Select("SELECT * FROM fruits")
	List<FruitDTO> getAll();

	@Select("SELECT * FROM fruits WHERE fruit_id= #{id}")
	FruitDTO get(@Param("id") int fruit_id);

	@Insert("INSERT INTO fruits(fruit_id, fruit_name, fruit_price, fruit_grade, country_id) "
			+ " VALUES (#{fruit_id_seq.nextval},#{fruit_name},#{fruit_price}," + "#{fruit_grade},#{country_id})")
	int add(FruitDTO dto);

	@Delete("DELETE FROM fruits WHERE fruit_id=#{id}")
	int delete(@Param("id") int fruit_id);

	@Update("UPDATE fruits SET "
			+ "fruit_name=#{fruit_name},fruit_price=#{fruit_price},fruit_grade=#{fruit_grade},country_id=#{country_id} WHERE fruit_id=#{fruit_id}")
	int update(FruitDTO fruit);
}
