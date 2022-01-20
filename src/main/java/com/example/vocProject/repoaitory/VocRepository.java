package com.example.vocProject.repoaitory;


import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.vocProject.dto.PenaltyVoc;
import com.example.vocProject.dto.Voc;
import com.example.vocProject.dto.VocListView;

@Mapper
public interface VocRepository {
	
	
	@Select(" select @ROWNUM := @ROWNUM+1 AS row_num, v.* "
			+ " from voc v,(select @ROWNUM:=0) temp "
			+ " order by vid desc")
	public List<Voc> findVocList();
	
	
	@Select(" select @ROWNUM := @ROWNUM+1 AS row_num, v.* "
			+ " from voc_list_view v,(select @ROWNUM:=0) temp "
			+ " order by vid desc")
	public List<VocListView> penaltyVocList();
	
	@Select(" select @ROWNUM := @ROWNUM+1 AS row_num, v.* "
			+ " from after_voc_view v,(select @ROWNUM:=0) temp "
			+ " where vid = ${id} "
			+ " order by vid desc ")
	public PenaltyVoc getpenaltyVoc(@Param("id")int id);

	
	@Select(" select @ROWNUM := @ROWNUM+1 AS row_num, v.* "
			+ " from voc v,(select @ROWNUM:=0) temp "
			+ " where vid = ${id} "
			+ " order by vid desc ")
	public Voc getSingleVoc(@Param("id")int id);

	@Select(" select ifnull(p.voc_vid,0) as isTehre "
			+ " from penalty p\r\n"
			+ " right outer join(select '')as m_dual "
			+ " on p.voc_vid=${id}")
	public int isCheckPenalty(@Param("id")int id);
	
	@Insert(" insert into voc values "
			+ " (0,${caid},${clid},${did},'${claimCheck}','${compensationCheck}','${penaltyCost}', "
			+ " '${respTarget}','${respReason}','','${vocWrite}',sysdate())")
	public void setSingleVoc(@Param("caid")int caid
							,@Param("clid")int clid
							,@Param("did")int did
							,@Param("claimCheck")String claim
							,@Param("compensationCheck")String compensation
							,@Param("penaltyCost")String penalty
							,@Param("respTarget")String target
							,@Param("respReason")String resson
							,@Param("vocWrite")String write);
	
	
	
	@Update(" update voc set carrier_cpn_caid=${caid}, client_cpn_clid=${clid}, delivery_did=${did} "
			+ " ,claim_check='${claimCheck}',compensation_check='${compensationCheck}'"
			+ ",penalty_cost='${penaltyCost}',resp_target='${respTarget}',resp_reason='${respReason}' "
			+ " ,voc_state='',voc_write='${vocWrite}',voc_regdate=sysdate() "
			+ " where vid=${id}")
	public void updateSingleVoc(@Param("id")int id
								,@Param("caid")int caid
								,@Param("clid")int clid
								,@Param("did")int did
								,@Param("claimCheck")String claim
								,@Param("compensationCheck")String compensation
								,@Param("penaltyCost")String penalty
								,@Param("respTarget")String target
								,@Param("respReason")String resson
								,@Param("vocWrite")String write);
	
	@Delete("delete from voc where vid = ${id}")
	public void deleteSingleVoc(@Param("id") int id );
	
}
