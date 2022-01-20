package com.example.vocProject.repoaitory;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.vocProject.dto.Penalty;
import com.example.vocProject.dto.Voc;

@Mapper
public interface PenaltyRepository {

	@Select(" select @ROWNUM := @ROWNUM+1 AS row_num, p.* "
			+ " from penalty p,(select @ROWNUM:=0) temp "
			+ " order by pid desc")
	public List<Penalty> findPenaltyList();
	
	
	
	@Select(" select @ROWNUM := @ROWNUM+1 AS row_num, p.* "
			+ " from penalty p,(select@ROWNUM:=0)temp "
			+ " where pid = ${id} ")
	public Penalty getSinglePenalty(@Param("id")int id);
	
	
	
	@Insert(" insert into penalty values(0,${deliveryDid},${vocVid},'${deliveryCheck}','${deliveryAgree}'"
										+ ",'${penaltyWriter}',sysdate())")
	public void setSinglePenalty(@Param("deliveryDid")int did
								,@Param("vocVid")int vid
								,@Param("deliveryCheck")String check
								,@Param("deliveryAgree")String agree
								,@Param("penaltyWriter")String writer);
	

	@Update(" update penalty set delivery_check = '${deliveryCheck}',"
			+ "delivery_agree='${deliveryAgree}',penalty_regdate=sysdate() "
			+ " where pid=${id}")
	public void updateSinglePenalty(@Param("id")int id
								,@Param("deliveryCheck")String check
								,@Param("deliveryAgree")String agree);
	
	@Delete("delete from penalty where pid = ${id}")
	public void deleteSinglePenalty(@Param("id") int id );
	
	
}
