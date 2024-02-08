package egovframework.com.sec.rmt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import egovframework.com.sec.rmt.service.EgovRoleManageService;
import egovframework.com.sec.rmt.service.RoleManage;
import egovframework.com.sec.rmt.service.RoleManageVO;

/**
 * 롤관리에 관한 ServiceImpl 클래스를 정의한다.
 * 
 * @author 공통서비스 개발팀 이문준
 * @since 2009.06.01
 * @version 1.0
 * @see
 *
 *      <pre>
 * << 개정이력(Modification Information) >>
 *   
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *   2009.03.11  이문준          최초 생성
 *   2024.02.09  이백행          보안약점 조치: 부적절한 예외 처리 (광범위한 예외객체 선언)
 *
 *      </pre>
 */

@Service("egovRoleManageService")
public class EgovRoleManageServiceImpl extends EgovAbstractServiceImpl implements EgovRoleManageService {

	@Resource(name = "roleManageDAO")
	public RoleManageDAO roleManageDAO;

	/**
	 * 등록된 롤 정보 조회
	 * 
	 * @param roleManageVO RoleManageVO
	 * @return RoleManageVO
	 * @exception Exception
	 */
	@Override
	public RoleManageVO selectRole(RoleManageVO roleManageVO) {
		return roleManageDAO.selectRole(roleManageVO);
	}

	/**
	 * 등록된 롤 정보 목록 조회
	 * 
	 * @param roleManageVO RoleManageVO
	 * @return List<RoleManageVO>
	 * @exception Exception
	 */
	@Override
	public List<RoleManageVO> selectRoleList(RoleManageVO roleManageVO) {
		return roleManageDAO.selectRoleList(roleManageVO);
	}

	/**
	 * 불필요한 롤정보를 화면에 조회하여 데이터베이스에서 삭제
	 * 
	 * @param roleManage RoleManage
	 * @exception Exception
	 */
	@Override
	public void deleteRole(RoleManage roleManage) {
		roleManageDAO.deleteRole(roleManage);
	}

	/**
	 * 시스템 메뉴에 따른 접근권한, 데이터 입력, 수정, 삭제의 권한 롤을 수정
	 * 
	 * @param roleManage RoleManage
	 * @exception Exception
	 */
	@Override
	public void updateRole(RoleManage roleManage) {
		roleManageDAO.updateRole(roleManage);
	}

	/**
	 * 시스템 메뉴에 따른 접근권한, 데이터 입력, 수정, 삭제의 권한 롤을 등록
	 * 
	 * @param roleManage   RoleManage
	 * @param roleManageVO RoleManageVO
	 * @return RoleManageVO
	 * @exception Exception
	 */
	@Override
	public RoleManageVO insertRole(RoleManage roleManage, RoleManageVO roleManageVO) {
		roleManageDAO.insertRole(roleManage);
		roleManageVO.setRoleCode(roleManage.getRoleCode());
		return roleManageDAO.selectRole(roleManageVO);
	}

	/**
	 * 목록조회 카운트를 반환한다
	 * 
	 * @param roleManageVO RoleManageVO
	 * @return int
	 * @exception Exception
	 */
	@Override
	public int selectRoleListTotCnt(RoleManageVO roleManageVO) {
		return roleManageDAO.selectRoleListTotCnt(roleManageVO);
	}

	/**
	 * 등록된 모든 롤 정보 목록 조회
	 * 
	 * @param roleManageVO - 등록할 정보가 담긴 RoleManageVO
	 * @return List
	 * @exception Exception
	 */
	@Override
	public List<RoleManageVO> selectRoleAllList(RoleManageVO roleManageVO) {
		return roleManageDAO.selectRoleAllList(roleManageVO);
	}

}