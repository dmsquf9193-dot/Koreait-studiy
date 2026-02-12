package kr.co.study.board.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder //setter 대신 사용(setter 하나가 필요하면 따로 하나 사용하면 됨)
public class ResBoardDTO {
	private Long id;
	private String category;
	private String title;
	private String content;
	private String writerName;
	private LocalDateTime createdAt;
	private int viewCount;
	
}
