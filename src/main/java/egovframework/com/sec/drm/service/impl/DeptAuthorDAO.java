package egovframework.com.sec.drm.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;
import egovframework.com.sec.drm.service.DeptAuthor;
import egovframework.com.sec.drm.service.DeptAuthorVO;

/**
 * 부서권한에 대한 DAO 클래스를 정의한다.
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
 *   2024.02.10  이백행          보안약점 조치: 부적절한 예외 처리 (광범위한 예외객체 선언)
 *
 *      </pre>
 */

@Repository("deptAuthorDAO")
public class DeptAuthorDAO extends EgovComAbstractDAO {

	/**
	 * 부서별 할당된 권한목록 조회
	 * 
	 * @param deptAuthorVO DeptAuthorVO
	 * @return List<DeptAuthorVO>
	 * @exception Exception
	 */
	public List<DeptAuthorVO> selectDeptAuthorList(DeptAuthorVO deptAuthorVO) {
		return selectList("deptAuthorDAO.selectDeptAuthorList", deptAuthorVO);
	}

	/**
	 * 부서에 해당하는 사용자에게 시스템 메뉴/접근권한을 일괄 할당
	 * 
	 * @param deptAuthor DeptAuthor
	 * @exception Exception
	 */
	public void insertDeptAuthor(DeptAuthor deptAuthor) {
		insert("deptAuthorDAO.insertDeptAuthor", deptAuthor);
	}

	/**
	 * 부서별 시스템 메뉴 접근권한을 수정하여 항목의 정합성을 체크하고 수정된 데이터를 데이터베이스에 반영
	 * 
	 * @param deptAuthor DeptAuthor
	 * @exception Exception
	 */
	public void updateDeptAuthor(DeptAuthor deptAuthor) {
		update("deptAuthorDAO.updateDeptAuthor", deptAuthor);
	}

	/**
	 * 불필요한 부서권한를 조회하여 데이터베이스에서 삭제
	 * 
	 * @param deptAuthor DeptAuthor
	 * @exception Exception
	 */
	public void deleteDeptAuthor(DeptAuthor deptAuthor) {
		delete("deptAuthorDAO.deleteDeptAuthor", deptAuthor);
	}

	/**
	 * 부서권한 목록조회 카운트를 반환한다
	 * 
	 * @param deptAuthorVO DeptAuthorVO
	 * @return int
	 * @exception Exception
	 */
	public int selectDeptAuthorListTotCnt(DeptAuthorVO deptAuthorVO) {
		return (Integer) selectOne("deptAuthorDAO.selectDeptAuthorListTotCnt", deptAuthorVO);
	}

	/**
	 * 부서목록 조회
	 * 
	 * @param deptAuthorVO DeptAuthorVO
	 * @return List<DeptAuthorVO>
	 * @exception Exception
	 */
	public List<DeptAuthorVO> selectDeptList(DeptAuthorVO deptAuthorVO) {
		return selectList("deptAuthorDAO.selectDeptList", deptAuthorVO);
	}

	/**
	 * 부서목록 조회 카운트를 반환한다
	 * 
	 * @param deptAuthorVO DeptAuthorVO
	 * @return int
	 * @exception Exception
	 */
	public int selectDeptListTotCnt(DeptAuthorVO deptAuthorVO) {
		return (Integer) selectOne("deptAuthorDAO.selectDeptListTotCnt", deptAuthorVO);
	}
}