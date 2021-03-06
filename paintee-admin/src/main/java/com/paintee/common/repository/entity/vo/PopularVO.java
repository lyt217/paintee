/**
@file PopularVO.java
@section 파일생성정보
|    항  목       |      내  용       |
| :-------------: | -------------   |
| File name | PopularVO.java |    
| Package | com.paintee.common.repository.entity.vo |    
| Project name | paintee-admin |    
| Type name | PopularVO |    
| Company | Paintee | 
| Create Date | 2016 2016. 3. 5. 오후 12:00:44 |
| Author | Administrator |
| File Version | v1.0 |
*/
package com.paintee.common.repository.entity.vo;

/**
@class PopularSearchVO
com.paintee.common.repository.entity.vo \n
   ㄴ PopularSearchVO.java
 @section 클래스작성정보
    |    항  목       |      내  용       |
    | :-------------: | -------------   |
    | Company | Paintee |
    | Author | Administrator |
    | Date | 2016. 3. 5. 오후 12:00:44 |
    | Class Version | v1.0 |
    | 작업자 | Administrator |
 @section 상세설명
 - 상세설명 은 여기에 기입해 주세요.
 -# 여기는 리스트로 표시됩니다.
*/
public class PopularVO extends PaintingVO {
	private String artistName;
	private String fileId;
	/**
	 * 그림의 로그인한 사용자의 좋아요 카운트
	 */
	private Integer loginLikeCnt;   

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public Integer getLoginLikeCnt() {
		return loginLikeCnt;
	}

	public void setLoginLikeCnt(Integer loginLikeCnt) {
		this.loginLikeCnt = loginLikeCnt;
	}
}
