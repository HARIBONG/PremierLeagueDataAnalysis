package com.epl.vo;

import java.util.List;

import lombok.Data;

@Data
public class MemberBoard {
	private int boardNo;
	private String boardTitle;
	private String boardContent;
	private String boardUser;
	private String boardDate;
	private String boardCategory;
	private String memberNickName;
	private List<MemberBoardfile> memberBoardfile;
}
